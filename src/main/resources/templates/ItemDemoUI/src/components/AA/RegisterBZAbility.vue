<template>
  <div class="regisiterpage">
     <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 业务能力基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">业务能力名称: </label><input type="text" class="inputbox checkView AA-inputbox"  placeholder="描述标题" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">业务能力描述: </label> <input type="text" class="inputbox checkView AA-inputbox"  placeholder="描述标题"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="smallname"> KEY: </label> <input type="text" class="inputbox checkView AA-inputbox"  placeholder="xxx"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">应用方: </label> <input type="text" class="inputbox checkView AA-inputbox"  placeholder="222"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView " value="2017-05-13" autocomplete="on" style="width:160px;">
        </div>
      </form>
    </div>
    <div class="heads xf-heads">
      <i class="el-icon-picture xf-edit-icon"></i> 
     业务能力剖面
    </div>
    <div class="items xf-items-addBottom">
      <div class="item xf-item">
        <!-- <div class="xf-precondition-box xf-precondition-box-fix1">
          <div class=""><el-input placeholder="剖面名称"></el-input></div>
          <div class=""><el-input placeholder="描述"></el-input></div>
          <div class="xf-predition-label" style="width:10%"><label>能力：</label></div>
          <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.bbjbxx" v-on:selected="multipleCallback" ></MutipleSelectDelete>
          </div>
          <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
          </div>
        </div> -->
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="i in 1">
           <div class="xf-page-pm-label">名称</div>
           <div class=""><el-input placeholder="剖面名称"></el-input></div>
           <div class="xf-page-pm-label">描述</div>
           <div class=""><el-input placeholder="描述"></el-input></div>
           <div class="xf-page-pm-label">能力</div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.ability" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div>
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1">
          <div class="xf-predition-label"><label>关联的页面模板：</label>
          </div>
          <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.pages" v-bind:selecteddata="multiple.pageSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete>
          </div>
        </div>


      </div>
    </div>
    <br/> <br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
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
          ability: [],
          pages:[]
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
          /*this.$http.get("/api/getList").then(res=>{
            mySelf.multiple.ability = JSON.parse(res.body.data).result.abilityList
            mySelf.multiple.pages = JSON.parse(res.body.data).result.pageList
          })*/
          mySelf.multiple.ability = [{
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
      }]
          mySelf.multiple.pages = [{
        "id":"10001",
        "name":"淘宝一口价商品发布页面模板",
        "imgPath":"static/img/page1.png"
      }]
        },
        multipleCallback: function(data){
            this.multiple.selectedList = data;
        }
      }
    }   
  </script>
<style>
  @import "../../assets/css/edit.css";
</style>
