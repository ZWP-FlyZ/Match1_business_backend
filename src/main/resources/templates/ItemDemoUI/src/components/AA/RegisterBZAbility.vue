<template>
  <div class="regisiterpage">
     <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 业务能力基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">业务能力名称: </label><input type="text" class="inputbox checkView gm-input"  placeholder="描述标题" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">业务能力描述: </label> <input type="text" class="inputbox checkView gm-input"  placeholder="描述标题"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> KEY: </label> <input type="text" class="inputbox checkView gm-input"  placeholder="xxx"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">应用方: </label> <input type="text" class="inputbox checkView gm-input"  placeholder="222"  autocomplete="on" >
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
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1">
          <div class="xf-predition-label"><label>UI类型：</label>
          </div>
          <div>
              <SingleSelect class="xf-single-fix xf-poumian-single-fix" v-bind:optionsdata="single.UIoptions" v-bind:selecteddata="single.UIoptionsselected" v-on:selected="singleCallback">
              </SingleSelect>
          </div>
        </div>
        


      </div>
    </div>
    <br/> <br/>
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
          ability: [],
          pages:[]
        },
        single:{
          UIoptions:[],
          UIoptionsselected:[]

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
          }],
          mySelf.single.UIoptions=[{"id":"ui1","name":"单选框"},
                     {"id":"ui2","name":"复选框"},
                     {"id":"ui3","name":"下拉框"},
                     {"id":"ui4","name":"按钮"}]
        },
        multipleCallback: function(data){
            this.multiple.selectedList = data;
        },
        singleCallback:function(data){}
      }
    }   
  </script>
<style>
  @import "../../assets/css/edit.scss";
</style>
<style>
  .xf-poumian-single-fix .display-container .single-selected{margin-top:4px !important;}
</style>
<style scoped>
  .xf-single-fix{width:590%;}
  
</style>
