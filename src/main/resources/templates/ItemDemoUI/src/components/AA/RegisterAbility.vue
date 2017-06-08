<template>
  <div class="regisiterpage">
    <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 
      能力基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">能力名称: </label><input type="text" class="inputbox checkView gm-input"   value="定价" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">能力描述: </label> <input type="text" class="inputbox checkView gm-input "   value="121" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> KEY: </label> <input type="text" class="inputbox checkView gm-input"   value="23232 "  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">存储位置: </label> <input type="text" class="inputbox checkView gm-input"   value="222" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发者: </label> <input type="text" class="inputbox checkView gm-input"   value="222" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView" value="2017-05-13"  autocomplete="on" style="width:160px;">
        </div>
      </form>
    </div>
    <div class="heads xf-heads">
      <i class="el-icon-menu xf-edit-icon"></i> 
      关联业务能力
    </div>
    <div class="items xf-items-addBottom">
      <div class="item xf-item">
        <div class="xf-precondition-box xf-precondition-box-fix" v-for="i in 1">
          <MutipleSelectDelete v-bind:optionsdata="multiple.bzabilityList" v-on:selected="multipleCallback" ></MutipleSelectDelete>
        </div>
      </div>
    </div>
    <div class="heads xf-heads">
      <i class="el-icon-date xf-edit-icon"></i> 配置项
    </div>
    <div class="items xf-items-addBottom">
        <div class="item xf-item">

          <div class="xf-precondition-box" v-for="i in 1">
           <div class="xf-predition-label"><label>配置项1</label></div>
           <div class="xf-predition-label"><label>可配置的值：</label></div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.configure" v-bind:selecteddata="multiple.configureSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
          </div>

        </div>
      </div>
    <br/><br/>
    <div class="bottom" >
      <button class="link-btn link-btn-default f-fr">确定</button>
    </div>
    <br/><br/>
  </div>
</template>
<script>
  import MutipleSelectDelete from './mutipleSelectDelete'
  import SingleSelect from '../CC/SingleSelect'
    export default{
      data:function(){
      return {
        multiple:{
          configure: [],
          bzabilityList:[]
        }
     }
    },
    components:{'MutipleSelectDelete':MutipleSelectDelete,'SingleSelect':SingleSelect},
    mounted:function(){
      this.$nextTick(function(){
        this.queryData();
      })
    },
    methods:{
        queryData:function(){
          var mySelf = this
          mySelf.multiple.configure = [{"id":"331","name":"良好"},{"id":"332","name":"类型1"},{"id":"333","name":"类型3"}];
            /*mySelf.multiple.bzabilityList = JSON.parse(res.body.data).result.bzabilityList*/
            mySelf.multiple.bzabilityList = [
              {
        "id":"10101",
        "name":"宝贝属性"
      },
      {
        "id":"10102",
        "name":"宝贝类型"
      },
      {
        "id":"10103",
        "name":"宝贝标题"
      },
      {
        "id":"10104",
        "name":"宝贝卖点"
      },
      {
        "id":"10002",
        "name":"宝贝图片"
      },
      {
        "id":"10105",
        "name":"描述"
      },
      {
        "id":"10106",
        "name":"商家编码"
      },
      {
        "id":"10107",
        "name":"条形码"
      }
            ]
          /*this.$http.get("/api/getList").then(res=>{
            mySelf.multiple.configure = [{"id":"331","name":"良好"},{"id":"332","name":"类型1"},{"id":"333","name":"类型3"}];
            /*mySelf.multiple.bzabilityList = JSON.parse(res.body.data).result.bzabilityList*/
            mySelf.multiple.bzabilityList = [
              {
        "id":"10101",
        "name":"宝贝属性"
      },
      {
        "id":"10102",
        "name":"宝贝类型"
      },
      {
        "id":"10103",
        "name":"宝贝标题"
      },
      {
        "id":"10104",
        "name":"宝贝卖点"
      },
      {
        "id":"10002",
        "name":"宝贝图片"
      },
      {
        "id":"10105",
        "name":"描述"
      },
      {
        "id":"10106",
        "name":"商家编码"
      },
      {
        "id":"10107",
        "name":"条形码"
      }
            ]
          //})
        },
        multipleCallback: function(data){
            this.multiple.selectedList = data;
        }
      }
    }   
  </script>
<style>
  @import ".././../assets/css/edit.css";
</style>
