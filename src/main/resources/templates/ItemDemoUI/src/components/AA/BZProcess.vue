<template>
  <div class = "BZProcess">
    <div v-if="!appisEmpty">
    <div class = "BZProcess-total">流程定制总数：12</div>
    <div class="BZProcess-register" >
      <ul>
          <li class = "BZProcess-classify"></li>
          <li class = "BZProcess-create"><router-link :to="{path:'/registerProcess',query:{method:'new'}}"class = "link-btn link-btn-default">注册流程</router-link></li>
      </ul>
    </div>
    <div class = "classfy-table" >
      <div v-for="(item,index) in processList">
      <div class="BZProcess-des">
        <img src="" alt="">
        <a href="" ><router-link to="" class = "L1-name">流程分类：{{index}}（{{item.length}}）</router-link></a>
        <a href="" ><router-link to="/configPreCondition" class = "L1-edit">配置前置条件</router-link></a>
        <a href="" ><router-link to="/configPreCondition" class = "L1-edit">查看前置条件</router-link></a>
      </div> 
      <ul class="xf-process-ul">
      <li class="xf-process-li" v-for="i in item">
        <img src="/static/img/tbpublish.png" alt="" ><a class="xf-el-upload-list__item-name">
          <i class="el-icon-document"></i>
          流程名称：{{i.name}}
        </a>
        <div class = "process-button">
            <router-link :to="{path:'/registerProcess',query:{method:'edit'}}" class = "link-btn link-btn-primary" @click.native="getaProcess(i.id)">编辑</router-link>
            <router-link :to="{path:'/registerProcess',query:{method:'look'}}" @click.native="getaProcess(i.id)" class = "link-btn link-btn-look">查看</router-link>
            <button class = "link-btn link-btn-delete" @click="deleteDialog(item)" >删除</button>
          </div>
        <label class="xf-process-label" >
          <i class="xf-el-icon-upload-success el-icon-check" style="color:#fff"></i>
        </label>
      </li>
    </ul>
      </div>

    </div>
    </div>
    <div class="BZProcess-table" style="border:none" v-else>
      <p style="color:#ccc">您还未注册过应用，请先注册应用</p>
      <br />
      <i @click="openApp" class="el-icon-upload2" style="color:#448bc7;font-size:30px"></i>
      <p >注册应用</p>
      <br />
    </div>
    <IMask :hide-mask.sync="hideMask"></IMask>
    <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
    <Loading v-if="hideLoading"></Loading>
  </div>       
</template>

<script>
import Delete from "../Delete"
import IMask from "../Mask"
import Loading from '../Loading'
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
        hideMask:true,
        hideLoading:false,
        appisEmpty:false
      }
    },
    components:{Delete,IMask,Loading},
    mounted:function(){
      this.$nextTick(()=>{
        
      })
    },
    created(){
      this.$root.eventHub.$on("appisEmpty",(data)=>{
        if(data == 'empty'){
          this.appisEmpty = data;
        }else{
          this.fetchProcess(data);
        }
      })
    },
    watch:{
      '$route':'fetchProcess'
    },
    methods: {
      //from server ,会抛弃下面那个getProcess
      fetchProcess(data){
        this.hideLoading = !this.hideLoading;
        //console.log("id:"+this.$route.query.id);//1,2,3
        if(typeof(data) == "number"){
          this.$route.query.id = data;
        }
        console.log(typeof(data))
        this.$http.get("api/app/get_processList?id="+this.$route.query.id).then(res=>{
            this.hideLoading = !this.hideLoading;
            if(res.body.code == 200){
              if(res.body.list!=null){
                this.processList = res.body.map;

                console.log("success")
              }
              //
            }
            if(res.body.code=='401'){
              
              console.log("失败")
            }
            if(res.body.code=='empty'){
              
              console.log("是空的")//此处的空不需要做处理
            }
            if(res.body.code == 401){
              this.$router.push("/login")
            }
        })
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
      openApp:function(){
        this.$root.eventHub.$emit('openApp',"process");
      },
      //查看时或者编辑时调用的方法
      getaProcess:function(id){
        this.$http.get("/api/app/get_process?id="+id).then(function(res){
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
  .process-button{
    float: right;
    margin-right: 41px;
    line-height: 70px
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
  .xf-process-ul{margin:0;padding:0;list-style: none}
    .xf-process-li{overflow: hidden;background-color:#fff;border:1px solid #c0ccda; 
        border-radius: 6px;
        box-sizing: border-box;
        padding: 10px 10px 10px 90px;
        height: 92px;transition: all .5s cubic-bezier(.55,0,.1,1);
        font-size: 14px;
        color: #48576a;
        line-height: 1.8;
        margin:10px 20px;
        box-sizing: border-box;
        border-radius: 4px;
        width: 95%;
        position: relative;cursor:pointer;}
    .xf-process-li img{
        vertical-align: middle;
        display: inline-block;
        width: 200px;
        height: 70px;
        float: left;
        position: relative;
        z-index: 1;
        margin-left: -80px;
        }
    .xf-process-label{display: none;
      background-color: #448bc7;
      width: 45px;
      height: 30px;
      position: absolute;
      top: -10px;
      right: -18px;
      transform: rotate(45deg);}
      .xf-process-li:hover .xf-process-label{display: block}
      .xf-process-li:hover .xf-el-upload-list__item-name{color:#448bc7;}
      .xf-el-upload-list__item-name{line-height: 70px;color:#48576a;margin-left:3%;}
      .xf-el-icon-upload-success{position: absolute;
    top: 15px;
    -webkit-transform: rotate(-60deg);
    transform: rotate(-46deg);
    left: 12px;}
</style>

