<template>

  <div class="template-page">
  <!-- 没有应用，提示先注册应用 -->
   <div v-if="appsLength == 0">
     <div class="BZProcess-table" style="border:none">
      <p style="color:#ccc">您还未注册过应用，请先注册应用</p>
      <br />
      <i @click="openApp" class="el-icon-upload2" style="color:#448bc7;font-size:30px"></i>
      <p >注册应用</p>
      <br />
    </div>   
   </div>
   <div v-else>
    <p class="template-total" >页面模板定制总数：</p>
    <!-- 显示介绍吧 -->
    <div class="template-center">
    <div class="template-head" v-if="registerPage">
      <div class="head-left">页面模板</div>
      <router-link to="/registerPageTemplate"  class="link-btn link-btn-default head-creat">注册页面模板</router-link>
    </div>
    <div v-if="welcome" style="margin-top:40px">
      <el-carousel :interval="4000" type="card" height="200px">
        <el-carousel-item v-for="item in detail" :key="item">
          <p style="margin-top:60px">{{ item.text }}</p>
        </el-carousel-item>
      </el-carousel>
    </div>

      <div class="template-body" v-if="!welcome">

        <!-- empty -->
        <div class="one-container" v-for="(item,index) in pageList">
          <router-link to="" class="titem-name">页面模板名称：{{item.name}}</router-link>
          <div class="template-edit">
            <div class="template-view">
              <img v-bind:src="item.imgPath" class="template-img">
            </div>
            <div class="bottoms">
              <!-- <router-link to="/registerPageTemplate" class="link-btn link-btn-primary bottom-item">配置</router-link> -->
              <el-button type="default" @click="editPage" style="margin-top:10px;margin-left:0px"><i class="el-icon-edit el-icon--right"></i></el-button>
              <el-button @click="searchPage" type="default" style="margin-top:10px;margin-left:0px"><i class="el-icon-search el-icon--right"></i></el-button>
              <el-button type="default" style="margin-top:10px;margin-left:0px" @click="deleteDialog(item)" ><i class="el-icon-delete el-icon--right"></i></el-button>
              <!-- <a href="#" class="link-btn link-btn-look bottom-item">查看</a>
              <br/>
               <button class="link-btn link-btn-delete delete" @click="deleteDialog(item)">删除</button> -->
            </div>
          </div>
        </div>
        <!-- empty -->
        <br/>
        <br/>
      </div>
      <div class="block" v-if="!welcome">
        <el-pagination
          layout="prev, pager, next"
          :total="1000">
        </el-pagination>
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
  import Tip from '../Tip'
  import {mapState} from 'vuex'
  export default{
    data(){
      return {
        pageList:[],
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true,
        hideTip:true,        
        appisempty:'您还尚未注册过应用，请先注册应用',
        appsLength:'',
        welcome:false,//xiang xi jie shao
        registerPage:true,
        detail:[
          {text:'您可以点击左侧应用，查看应用提供的页面模版服务'},
          {text:'页面模版是一个好东西'},
          {text:'欢迎来到页面模版模块'}
        ]
      }
    },
    components:{Delete,IMask,Tip},
    computed:mapState({apps:state=>state.apps}),
    mounted:function(){
      this.$nextTick(function(){
        setTimeout(()=>{
          this.appsLength = this.apps.apps.length;  //该字段用来判断登陆的用户是否有应用
          //alert(this.appsLength)
          //this.$root.eventHub.$emit("changeModule",this.apps.firstapp);
          //this.init();
        },0);
      })
    },
    created:function(){
      this.init();
      this.invokeGetPages();
    },
    methods:{
      init:function(){
        this.$root.eventHub.$on("changeModule",(data)=>{//当点击了左边的某一个应用的时候，会触发changeModule这个监听器，然后执行invokeGetPages这个方法
          this.invokeGetPages(data);
        })
      },
      invokeGetPages:function(data){//根据data.id判断选择了哪一个应用，
        if(data!=null){
          this.app_id = data.id;
        }
        this.getPages(this.app_id)  //根据应用id去获取应用下对应的页面模版
      },
      getPages:function(app_id){
        if(app_id){
          this.welcome = false;
          this.registerPage = true;
          this.$http.get("/api/app/get_pageList?id="+app_id).then((res)=>{//获取页面模版的http请求
          if(res.body.code == '200'){
            this.pageList = res.body.list;
            this.pageList.forEach((i,index)=>{
              this.$set(i,'imgPath','static/img/page1.png')
            });
          }
          if(res.body.code == 'empty'){
            this.welcome = true;
          }
         })
        }else{
          //还没点某一个按钮应用的时候,应该显示欢迎界面
          this.registerPage = false;
          this.welcome = true;
        }
    },
      deleteDialog:function(i){
        this.hideDialog = !this.hideDialog
        this.hideMask = !this.hideMask
        this.deleteContent.item = i
      },
      closeDialog:function(childData,data,id){
        console.log("删除的id："+id)
        if(!data){//删除框点了取消
          this.hideDialog = childData
          this.hideMask = childData     
        }else{//删除框点了确定
          this.$http.post("/api/app/delete_pagemodel?id="+parseInt(id)).then((res)=>{
            if(res.body.code == '200'){
              this.$message({
                message: '删除成功！',
                type: 'success'
              })
              this.hideDialog = childData
              this.hideMask = childData
              //刷新页面
              this.getPages()
            }else{
              this.$message.error('删除失败，请重新尝试！');
            }
          })
        }
        
      },
      openApp:function(){
        this.$root.eventHub.$emit('openApp',"process");
      },
    }
  }
</script>
<style >
  .template-total{
   margin-bottom: 30px;
  }
  .template-head{
    font: 15px Arial, sans-serif;
    background:#eef1f6;
    width:100%;
    height: 45px;
    position: relative;
    text-decoration: none;
  }
  .head-left{
    float:left;
    position: relative;
    padding-left: 10%;
   top:8px;
    font-size: 15px;
  }
  .head-creat{
    font-size: 15px;
    text-align: center;
    text-decoration: none;
    color: #ffffff;
    float:right;
    position: relative;
    top:5px;
    right:15%;
    background: #428bca;
    padding: 6px 12px;
    border-radius: 5px;
  }
  .head-creat:hover{
    color: black;
    text-decoration: none;
  }
 .template-body{
   display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    width: 100%;
  }
 .one-container{
   display: inline-block;
   position: relative;
   width:28%;
   min-width:270px;
   height:200px;
   border-style:solid;
   border-width:1px;
   border-color: #ddd;
   margin: 10px 1%;
   box-shadow: 0 0 2px #ccc;
   overflow: hidden;
  }
 .titem-name{
   position: relative;
   top:5px;
   font-size:15px;
  }
 .bottoms{
   display: block;
   float: right;
   position: relative;
   right:-8px;
   top:15px;
  }
 .bottom-item{
   float:right;
   position: relative;
   right: 5px;
   top:20px;
   left:20px;
   margin: 5px;
  }
 .delete{
   text-align: center;
   text-decoration: none;
   color: #fafafa;
   float:right;
   position: relative;
   right: 5px;
   left:20px;
   top:20px;
   background: grey;
   margin: 5px;
   padding: 6px 12px;
   border-radius:4px;
  }
 .delete:hover{
   color: black;
  }
 .titem-name{
   color:black;
  }
 .titem-name:hover{
   color: blue;
   text-decoration: none;
  }
 .template-edit{
   width:280px;
   display: -webkit-flex;
 }
 .template-img {
   width: 160px;
   height: 150px;
   margin:15px 15px;
 }
 .template-center{
   text-align: center;
 }
 ul.pagination {
   display: inline-block;
   padding: 0;
   margin: 0;
 }
 ul.pagination li {display: inline;}
 ul.pagination li a {
   color: black;
   float: left;
   padding: 4px 8px;
   text-decoration: none;
   transition: background-color .3s;
   border: 1px solid #ddd;
 }
 .pagination li:first-child a {
   border-top-left-radius: 5px;
   border-bottom-left-radius: 5px;
 }
 .pagination li:last-child a {
   border-top-right-radius: 5px;
   border-bottom-right-radius: 5px;
 }
 ul.pagination li a.active {
   background-color: #428bca;
   color: white;
   border: 1px solid #428bca;
 }
 ul.pagination li a:hover:not(.active) {background-color: #ddd;}
</style>
<style scoped>
  .el-carousel__item h3 {
    color: #fff;
    font-size: 14px;
    opacity: 0.75;
    line-height: 200px;
  }
  
  .el-carousel__item:nth-child(2n) {
    background-color: #E5E9F2;
    text-align: center;
  }
  
  .el-carousel__item:nth-child(2n+1) {
    background-color: #EFF2F7;
    text-align: center;
  }

</style>
