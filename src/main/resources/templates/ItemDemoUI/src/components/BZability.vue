<template>
  <!-- <h1 class="text-center">bzability</h1> -->
  <div class = "BZability">
    <div>业务能力定制总数：12</div>
    <div class="BZability-register">
      <ul>
          <li class = "BZability-reg">业务能力</li>
          <li class = "BAability-create"><router-link to="/registerBZAbility" class = "link-btn link-btn-primary">注册业务能力</router-link></li>
      </ul>
    </div>
    <div class = "BZability-list">
      <div class = "BZability-list-one" v-for="(item,index) in bzabilityList">
        <ul>
          <li class = "BZability-name">{{item.name}}</li>
          <li><router-link to="/registerBZAbility" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerBZAbility" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteBZability" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
  export default{
    data(){
      return {
        bzabilityList:[]
      }
    },
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