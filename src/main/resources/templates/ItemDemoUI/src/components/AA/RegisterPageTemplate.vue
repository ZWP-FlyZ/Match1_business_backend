<template>

  <div class="regisiterpage">
    <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 页面模板基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
        <label class="nameid">模板名称: </label><input type="text" class="inputbox checkView AA-inputbox"  value="淘宝选择类目页面模板" autocomplete="on" autofocus="autofocus">
        </div>

        <div class="item">
        <label class="nameid">模板描述: </label> <input type="text" class="inputbox checkView AA-inputbox"  value="淘宝选择类目页面模板" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> 模板KEY: </label> <input type="text" class="inputbox checkView AA-inputbox"  value="TBPUBLISH" autocomplete="on" >
        </div>

        <div class="item">
        <label class="nameid">应用方: </label> <input type="text" class="inputbox checkView AA-inputbox"  value="淘宝" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView " style="width:180px;" value="2017-05-19"  autocomplete="on" >
        </div>
      </form>
    </div>

    <div class="heads xf-heads">
      <i class="el-icon-picture xf-edit-icon"></i> 关联流程节点
    </div>
    <div class="items xf-items-addBottom">
      <div class="item xf-item">
        <div class="xf-precondition-box xf-precondition-box-fix" v-for="i in 1">
          <el-cascader placeholder="试试搜索：商品发布" :options="processNode" filterable style="width:70%">
          </el-cascader>
        </div>
      </div>
    </div>

    <div class="heads xf-heads">
      <i class="el-icon-menu xf-edit-icon"></i>  
      关联业务能力剖面
    </div>
    <div class="items xf-items-addBottom">
      <div class="item xf-item">
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="i in 1">
          <div class="xf-page-pm-label"><label>名称</label></div>
           <div class=""><el-input placeholder="宝贝基本信息"></el-input></div>
           <div class="xf-page-pm-label"><label>描述</label></div>
           <div class=""><el-input placeholder="描述"></el-input></div>
           <div class="xf-page-pm-label"><label>剖面</label></div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.bbjbxx" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div>
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="i in 1">
           <div class="xf-page-pm-label">名称</div>
           <div class=""><el-input placeholder="支付信息"></el-input></div>
           <div class="xf-page-pm-label">描述</div>
           <div class=""><el-input placeholder="描述"></el-input></div>
           <div class="xf-page-pm-label">剖面</div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.zfxx" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div>
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="i in 1">
          <div class="xf-page-pm-label">名称</div>
           <div class=""><el-input placeholder="物流信息"></el-input></div>
           <div class="xf-page-pm-label">描述</div>
           <div class=""><el-input placeholder="描述"></el-input></div>
           <div class="xf-page-pm-label">剖面</div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.wlxx"  v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div>
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="i in 1">
           <div class="xf-page-pm-label">名称</div>
           <div class=""><el-input placeholder="售后信息"></el-input></div>
           <div class="xf-page-pm-label">描述</div>
           <div class=""><el-input placeholder="描述"></el-input></div>
           <div class="xf-page-pm-label">剖面</div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.shxx" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div>
      </div>
    </div>
    <br /><br />
    <div class = "heads xf-heads">
        <i class="el-icon-d-arrow-left xf-edit-icon"></i> 前置条件
        <div class="xf-singleSelect-box">
          <SingleSelect class="xf-single-fix" v-bind:optionsdata="single.outPreOptions" v-bind:selecteddata="single.outPreselected" v-on:selected="singleCallback">
          </SingleSelect>
        </div>
    </div>
    <div class="items xf-items-addBottom">
        <div class="item xf-item">

          <div class="xf-precondition-box xf-precondition-box-fix1" v-for="i in 4">
           <div class="xf-predition-label"><label>ssssss</label></div>
           <div class="xf-predition-label"><label>可配置的值：</label></div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.inPreEdit" v-bind:selecteddata="multiple.inPreEditSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
          </div>
        </div>
    </div>
    <br/><br/><br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>

</template>
  <script>
  import MutipleSelectDelete from './mutipleSelectDelete'
  import SingleSelect from '../CC/SingleSelect'
    export default{
      
      data:function(){
      return {
        nextState:1,
        multiple:{
          originOptions: [],
          selectedList: []
        },
        single:{
          outPreOptions:[]
        },
        processNode:[
          {
            value:'买家卖家注册',
            label:'买家卖家注册',
            children:[
              {value:'淘宝-买家卖家注册',label:'淘宝-买家卖家注册',children:[
                  {value:'身份认证',label:'身份认证'},
                  {value:'填写信息',label:'填写信息'}
                ]},
              {value:'天猫-买家卖家注册',label:'天猫-买家卖家注册'}
            ]
          },
          {
            value:'商品发布',
            label:'商品发布',
            children:[
              {value:'淘宝-一口价商品发布',label:'淘宝-一口价商品发布',children:[
                  {value:'选择类目',label:'选择类目'},
                  {value:'选择货品模板',label:'选择货品模板'},
                  {value:'填写商品信息',label:'填写商品信息'},
                  {value:'机器审核',label:'机器审核'},
                  {value:'人工审核',label:'人工审核'}
                ]},
              {value:'淘宝-拍卖流程',label:'淘宝-拍买流程'}
            ]
          },
        ]
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
          this.$http.get("/api/getList").then(res=>{
            mySelf.multiple.originOptions = JSON.parse(res.body.data).result.pageList
            mySelf.single.outPreOptions = JSON.parse(res.body.data).result.outPreCondition;
            mySelf.multiple.inPreEdit = [{"id":"21","name":"良好"},{"id":"22","name":"类型1"},{"id":"23","name":"类型3"}];
            mySelf.multiple.bbjbxx = [{"id":"bb001","name":"描述标题"},{"id":"bb002","name":"宝贝卖点"}];
            mySelf.multiple.zfxx = [{"id":"zf001","name":"支付方式"},{"id":"zf002","name":"电子凭证"}];
            mySelf.multiple.wlxx = [{"id":"wl001","name":"提货方式"},{"id":"wl002","name":"运费模板"}];
            mySelf.multiple.shxx = [{"id":"sh001","name":"无理由退货"},{"id":"sh002","name":"售后信息"}];
          })
          mySelf.multiple.selectedList = [{"id":"1","name":"天猫商品发布"}]
        },
        multipleCallback: function(data){
            this.multiple.selectedList = data;
        },
        singleCallback:function(){}
      }
    }   
  </script>
<style>
@import "../../assets/css/edit.css";
.page-SelectList{
  border-style:none;
    appearance:none;
    display: inline-block;
    float: left;
}
.back-color{
  display: inline-block;
  padding: 6px 12px;
  margin-bottom: 0;
  font-size: 14px;
  font-weight: normal;
  line-height: 1.428571429;
  text-align: center;
  white-space: nowrap;
  vertical-align: middle;
  cursor: pointer;
  background-image: none;
  border: 1px solid transparent;
  border-radius: 4px;
  background:#4FD2C2;
  color: #ffffff;
  width: 100px;
  /*background-color: #428bca;*/
  border-color: #357ebd;
  /*float: left;*/
}
    .relate-choose-button{
      float: left;
      width: 60%;
    }
    .relate-choose-delete{
      margin-left: 20%;
      float: right;
      position: relative;
      top: -6px;
    }
    .relate-choose-delete:hover{
      transform: scale(1.2,1.2);
    }
    .item-relate-list{
      float: left;
      /*border:1px solid red;*/
    }
    .item-select-relate{
      float:left;
    }
    .relate-choose-list{
      float: left;
      display: inline-block;
      margin-right: 10px;
    }
    
   .smallname-label{width: 89px;text-align: right;}
   .smallnamed-key{margin-left: 24px;}
   .AA-inputbox{width: 220px;}
   .xf-heads .xf-singleSelect-box{position: relative;top: -36px;left: 15%;}
  .xf-precondition-box {display:flex;justify-content:flex-start;align-items:flex-start;border:1px solid #f0f0f0;padding-left:2%;text-align: left;height:50px;padding-top:7px;margin-bottom:10px;}
  .xf-precondition-box div{margin-right:1%;}
  .xf-precondition-box .xf-predition-label{margin-top:5px;width:21%;}
  .xf-precondition-box .xf-predition-delete{margin-left:58%;margin-top: 5px}
  .xf-precondition-box-fix{margin-left:20px;border:none;}
  .xf-precondition-box-fix1{margin-left:20px;}
  .el-input__inner{height:30px;color: #555;background-color: #FFF;border: 1px solid #CCC;border-radius: 4px;}
</style>
<style>
  .xf-page-pm .xf-predition-delete{margin-left: 48%}
  .xf-page-pm-label{width:5%;margin-top: 5px}
</style>


