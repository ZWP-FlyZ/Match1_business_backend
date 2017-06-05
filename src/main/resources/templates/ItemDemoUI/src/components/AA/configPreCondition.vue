<template>

  <div class="regisiterpage">
    <div class = "heads xf-heads">
        <i class="el-icon-d-arrow-left xf-edit-icon"></i> 前置条件
        <div class="xf-singleSelect-box">
          <SingleSelect class="xf-single-fix" v-bind:optionsdata="single.outPreOptions" v-bind:selecteddata="single.outPreselected" v-on:selected="singleCallback">
          </SingleSelect>
        </div>
    </div>
    <div class="items xf-items-addBottom">
        <div class="item xf-item">

          <div class="xf-precondition-box xf-precondition-box-fix1" v-for="i in 1">
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
        multiple:{
          selectedList: []
        },
        single:{
          outPreOptions:[]
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
          this.$http.get("/api/getList").then(res=>{
            /*mySelf.single.outPreOptions = JSON.parse(res.body.data).result.outPreCondition;*/
            mySelf.single.outPreOptions = [{"id":"1","name":"商品类型"},
      {"id":"2","name":"目标节点时限"},
      {"id":"3","name":"是否首次进入该节点"},
      {"id":"4","name":"商家信用等级"},
      {"id":"5","name":"开店时间"},
      {"id":"6","name":"转化率"},
      {"id":"7","name":"违规记录"},
      {"id":"8","name":"销售记录"},
      {"id":"9","name":"是否是良心卖家"},
      {"id":"10","name":"知名品牌高危质检"},
      {"id":"11","name":"冲突管理规则"}]
            mySelf.multiple.inPreEdit = [{"id":"21","name":"良好"},{"id":"22","name":"类型1"},{"id":"23","name":"类型3"}];
          })
        },
        multipleCallback: function(data){
            this.multiple.selectedList = data;
        },
        singleCallback:function(){}
      }
    }   
  </script>
<style scoped>
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


