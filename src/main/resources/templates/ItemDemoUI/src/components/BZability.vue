<template>
  <div class = "BZability">
    <div>业务能力定制总数：12</div>
    <div class="BZability-register">
      <ul>
          <li class = "BZability-reg">业务能力</li>
          <li class = "BAability-create"><router-link to="/registerBZAbility" class = "link-btn link-btn-default">注册业务能力</router-link></li>
      </ul>
    </div>
    <div class = "BZability-list">
      <div class = "BZability-list-one" v-for="(item,index) in bzabilityList">
        <ul>
          <li class = "BZability-name">{{item.name}}</li>
          <li><router-link to="/registerBZAbility" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerBZAbility" class = "link-btn link-btn-look">查看</router-link></li>
          <li><button class = "link-btn link-btn-delete" @click="deleteDialog(item)">删除</button></li>
        </ul>
      </div>
    </div>
    <IMask :hide-mask.sync="hideMask"></IMask>
    <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
  </div>
</template>

<script>
import Delete from "./Delete"
import IMask from "./Mask"
  export default{
    data(){
      return {
        bzabilityList:[],
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
        this.$http.get("/api/getList").then(res=>{
          console.log(JSON.parse(res.body.data).result.bzabilityList)
          this.bzabilityList = JSON.parse(res.body.data).result.bzabilityList

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
      }
    }
  }
</script>
<style>
    .BZability-register{
      background: #F2F2F2;
      height: 45px;
      margin-top: 30px;
    }
    .BZability-reg{
      top:8px;
      float: left;
      padding-left: 10%;
      position: relative;
    }
    .BAability-create{
      position: relative;
      float: right;
      right: 14%;
      padding:6px 12px;
    }
    .BZability-list-one{
      border: 1px solid #F2F2F2;
      height: 50px;
      margin-top: 13px;
    }
    .BZability-list-one li{
      float: left;
    }
    .BZability-name{
      margin-left: 3%;
      margin-top: 8px;
      margin-right: 50%;
      width: 20%;
      position: relative;
    }
    .BZability-list-one .link-btn{
      margin-left: 10px;
      margin-top: 5px;
      position: relative;
    }
    body{
    font:15px/1.62 Helvetica,Arial,sans-serif;
    background-color:#fff;
  }

  </style>