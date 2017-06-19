<template>
  <div class = "BZProcess">
    <div class = "BZProcess-total">流程定制总数：12</div>
    <!-- 流程模板 -->
    <!-- <div class="BZProcess-register">
      <ul>
          <li class = "BZProcess-classify">流程模板</li>
      </ul>
    </div>
    <div class = "classfy-table">
     <div v-for="(item,index) in tempList">
      <div class="BZProcess-table">
        <div class="BZ-edit">
          <div class="BZ-num">{{item.name}}</div>
          <div class="process"><img v-bind:src="item.imgPath" /></div>
          <div class = "process-button">
            <router-link to="/registerProcess" class = "link-btn link-btn-primary">编辑</router-link>
            <br /><br />
            <router-link to="/registerProcess" class = "link-btn link-btn-look">查看</router-link>
             <li><button class = "link-btn link-btn-delete" @click="deleteDialog(item)" >删除</button></li>
          </div>
        </div>
      </div>
      </div>
    </div> -->
    <!-- 流程模板 -->
    <div class="BZProcess-register">
      <ul>
          <li class = "BZProcess-classify"></li>
          <li class = "BZProcess-create"><router-link :to="{path:'/registerProcess',query:{method:'new'}}"class = "link-btn link-btn-default">注册流程</router-link></li>
      </ul>
    </div>
    <div class = "classfy-table">
     <div v-for="(item,index) in processList">
      <div class="BZProcess-des">
        <img src="" alt="">
        <a href="" ><router-link to="" class = "L1-name">流程分类：{{item.name}}（{{item.count}}）</router-link></a>
        <a href="" ><router-link to="/configPreCondition" class = "L1-edit">配置前置条件</router-link></a>
        <a href="" ><router-link to="/configPreCondition" class = "L1-edit">查看前置条件</router-link></a>
      </div> 
      <div class="BZProcess-table">
        <div class="BZ-edit" v-for="i in item.pList">
          <div class="BZ-num">流程名称：{{i.name}}</div>
          <div class="process"><img v-bind:src="i.imgPath" /></div>
          <div class = "process-button">
            <router-link :to="{path:'/registerProcess',query:{method:'edit'}}" class = "link-btn link-btn-primary" @click.native="getaProcess(i.id)">编辑</router-link>
            <router-link :to="{path:'/registerProcess',query:{method:'look'}}" @click.native="getaProcess(i.id)" class = "link-btn link-btn-look">查看</router-link>
            <li><button class = "link-btn link-btn-delete" @click="deleteDialog(item)" >删除</button></li>
          </div>
        </div>
      </div>
      </div>
    </div>
    <IMask :hide-mask.sync="hideMask"></IMask>
    <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
  </div>       
</template>

<script>
import Delete from "../Delete"
import IMask from "../Mask"
  export default{
    data(){
      return {
        processList:[],
        tempList:[],
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true
      }
    },
    components:{"Delete":Delete,"IMask":IMask},
    mounted:function(){
      this.$nextTick(function(){
        this.getProcess();
      })
    },
    methods: {
      getProcess:function(){
        /*this.$http.get("/api/getList").then(res=>{
          this.processList = JSON.parse(res.body.data).result.processList
          this.tempList = JSON.parse(res.body.data).result.processTemp
        })*/
        this.processList = [
          {
        "name":"商品发布流程",
        "count":"3",
        "preList":[
          {
            "id":"10001",
            "name":"账号从属于天猫还是淘宝"
          },
          {
            "id":"10001",
            "name":"登陆地在中国还是外国"
          }
        ],
        "pList":[
          {
            "id":"10001",
            "name":"淘宝一口价商品发布流程",
            "imgPath":"static/img/tbpublish.png"
          },
          {
            "id":"10002",
            "name":"天猫一口价商品发布流程",
            "imgPath":"static/img/tmpublish.png"
          }
        ]
      },
      {
        "name":"交易流程",
        "count":"1",
        "preList":[
          {
            "id":"10001",
            "name":"虚拟还是实物"
          },
          {
            "id":"10001",
            "name":"担保还是电子凭证"
          }
        ],
        "pList":[
          {
            "id":"10001",
            "name":"淘宝交易流程",
            "imgPath":"static/img/process1.png"
          }
        ]
      }
        ],
        this.tempList = [
        {
        "name":"商品发布流程模板",
        "imgPath":"static/img/publish.png"
      }
        ]
      },
      deleteDialog:function(i){
        this.hideDialog = !this.hideDialog
        this.hideMask = !this.hideMask
        this.deleteContent.item = i

      },
      closeDialog:function(childData){
        this.hideDialog = childData
        this.hideMask = childData
      },
      //查看时或者编辑时调用的方法
      getaProcess:function(id){
        console.log(id)
        this.$http.get("/api/app/get_process?id="+id).then(function(res){
          console.log(res.body);
          console.log("get a process success");
          console.log(res.body.list[0])
          sessionStorage.setItem("aProcess",JSON.stringify(res.body.list[0]));
        })
      }
    }
  }
</script>
<style>
  .BZProcess-total{
    margin-top: 0;
  }
  .BZProcess-register{
    background: #F2F2F2;
    height: 45px;
    margin-top: 30px;
  }
  .BZProcess-classify{
    top:8px;
    float: left;
    padding-left: 10%;
    position: relative;
  }
  .BZProcess-create{
      position: relative;
      float: right;
      right: 16%;
      padding:6px 12px;
    }
  .BZProcess-des{
    margin-top: 20px;
  }
  .L1-name{
    color:#169BD5;
    display: inline-block;
    width: 20%;
    margin-left: 20px;
  }
  .L1-edit{
    display: inline-block;
    width: 30%;
    text-align: center;
    color:#169BD5;
  }
  .BZProcess-table{
    border:1px solid #f2f2f2;
    margin-top: 20px;
    display: inline-block;
    width: 100%;
    text-align: center;
    padding-bottom: 5px;
  }
  .BZ-edit{
    width:90%;
  }
  .BZProcess-table div{
    float: left;
    text-align: center;
    margin-top: 9px;
  }
  .BZProcess-table .BZ-num{
    width: 30%;
    position: relative;
  }
  .BZProcess-table .process{
    width: 46%;
    margin-right: 5%;
    position: relative;
  }
  .BZProcess-table .process-button{
    margin-left: 50px;

  }
  .BZProcess-table .process-button .link-btn{
    display: block;
  }
  .BZProcess-table .process img{
    width: 430px;
    height: 150px;
  }
  .BZProcess-table .link-btn{
    margin-left: 10px;
    margin-right: 15px;
    margin-top: 5px;
    position: relative;
  }
   hr.BZProcess-table-hr{
    width: 95%;
    margin:0 auto;
    margin-left: 20px;
    float: left;
    background-color: #f2f2f2;
    height: 1px;
    border: none;
    margin-top: 5px;
  }
  .BZProcess-table{
    margin-bottom: 20px;
  }
</style>

