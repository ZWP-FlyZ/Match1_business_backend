
<template>
  <div class = "Ability">
    <div class = "Ability-total">能力定制总数：12</div>
    <div class="Ability-register">
      <ul>
          <li class = "ability-reg">能力</li>
          <li class = "ability-create"><router-link to="/registerAbility" class = "link-btn link-btn-default">注册能力</router-link></li>
      </ul>
    </div>
    <div class = "Ability-list">
      <div class = "Ability-list-one" v-for="(item,index) in abilityList">
        <ul>
          <li class = "Ability-name">{{item.name}}</li>
          <li><router-link to="/registerAbility" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerAbility" class = "link-btn link-btn-look">查看</router-link></li>
          <li><button class = "link-btn link-btn-delete" @click="deleteDialog(item)">删除</button></li>
        </ul>
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
        abilityList:[],
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
          this.abilityList = JSON.parse(res.body.data).result.abilityList

        })*/
        this.abilityList = [
          {
        "id":"10001",
        "name":"字体颜色"
      },
      {
        "id":"10002",
        "name":"字体大小"
      },
      {
        "id":"10003",
        "name":"字体样式"
      },
      {
        "id":"10004",
        "name":"长度不超过30个汉字"
      },
      {
        "id":"10005",
        "name":"过滤敏感词汇"
      },
      {
        "id":"10006",
        "name":"盗图盗链检测"
      },
      {
        "id":"10007",
        "name":"原创保护"
      },
      {
        "id":"10009",
        "name":"数字纽扣"
      },
      {
        "id":"10008",
        "name":"库存扣减"
      },
      {
        "id":"100010",
        "name":"总大小限制"
      },
      {
        "id":"100011",
        "name":"匹配条码库"
      },
      {
        "id":"100012",
        "name":"要求开店"
      },
      {
        "id":"100013",
        "name":"要求保证金"
      },
      {
        "id":"100014",
        "name":"要求经营凭证"
      },
      {
        "id":"100015",
        "name":"账号安全验证"
      },
      {
        "id":"100016",
        "name":"炒信效率规则"
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
      }
    }
  }
</script>
<style>
  .Ability-total{
    margin-top: 0;
  }
    .Ability-register{
      background: #eef1f6;
      height: 45px;
      margin-top: 30px;
    }
    .ability-reg{
      top:8px;
      float: left;
      padding-left: 10%;
      position: relative;
    }
    .ability-create{
      position: relative;
      float: right;
      right: 15%;
      padding:6px 12px;

    }
    .Ability-list-one{
      border: 1px solid #F2F2F2;
      height: 50px;
      margin-top: 13px;
    }
    .Ability-list-one li{
      float: left;
    }
    .Ability-name{
      margin-left: 3%;
      margin-top: 8px;
      margin-right: 50%;
      width: 20%;
      position: relative;
    }
    .Ability-list-one li .link-btn{
      margin-top: 5px;
      margin-left: 10px;
      position: relative;
    }
    body{
    font:15px/1.62 Helvetica,Arial,sans-serif;
    background-color:#fff;
  }

  </style>

