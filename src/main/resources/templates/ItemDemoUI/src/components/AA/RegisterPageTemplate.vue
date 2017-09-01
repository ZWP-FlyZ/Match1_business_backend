<template>

  <div class="regisiterpage">
    <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 页面模板基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
        <label class="nameid">模板名称: </label><input type="text" class="inputbox checkView gm-input"  value="淘宝选择类目页面模板" v-model="pagemodel.name" autocomplete="on" autofocus="autofocus">
        </div>

        <div class="item">
        <label class="nameid">模板描述: </label> <input type="text" class="inputbox checkView gm-input"  v-model="pagemodel.description" value="淘宝选择类目页面模板" autocomplete="on" >
        </div>
        <!-- <div class="item">
          <label class="nameid"> 模板KEY: </label> <input type="text" class="inputbox checkView gm-input"  value="TBPUBLISH" autocomplete="on" >
        </div> -->

        <div class="item">
        <label class="nameid">应用方: </label> <input type="text" class="inputbox checkView gm-input" v-model="pagemodel.devauthor" value="淘宝" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView " v-model="pagemodel.devdate" style="width:160px;" value="2017-05-19"  autocomplete="on" >
        </div>
      </form>
    </div>

    <div class="heads xf-heads">
      <i class="el-icon-picture xf-edit-icon"></i> 关联流程节点{{initProcessNode}}
    </div>
    <div class="items xf-items-addBottom">
      <div class="item xf-item">
        <div class="xf-precondition-box xf-precondition-box-fix" v-for="i in 1">
          <el-cascader placeholder="试试搜索：商品发布" :show-all-levels="false" :options="processNode" filterable style="width:70%" v-model="initProcessNode">
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
        <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="(i,index) in pagemodel.pageModelTypes">
          <div class="xf-page-pm-label"><label>名称</label></div>
           <div class=""><el-input placeholder="宝贝基本信息" v-model="pagemodel.pageModelTypes[index].modulename"></el-input></div>
           <div class="xf-page-pm-label"><label>描述</label></div>
           <div class=""><el-input placeholder="描述" v-model="pagemodel.pageModelTypes[index].moduledesc"></el-input></div>
           <div class="xf-page-pm-label"><label>剖面{{pagemodel.pageModelTypes[index].bussinessabilitypou}}</label></div>
           <div>
              <el-select size="mini"class="xf-el-select" filterable v-model="pagemodel.pageModelTypes[index].bussinessabilitypou" multiple placeholder="请选择">
                <el-option
                  v-for="item in multiple.bbjbxx"
                  :key="item.name"
                  :label="item.name"
                  :value="item.id">
                </el-option>
              </el-select>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div>
        <!-- <div class="xf-precondition-box xf-page-pm xf-precondition-box-fix1" v-for="i in 1">
           <div class="xf-page-pm-label">名称</div>
           <div class=""><el-input placeholder="支付信息" v-model="pagemodel.bzabilitypouList.modulename"></el-input></div>
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
           <div class=""><el-input placeholder="物流信息" ></el-input></div>
           <div class="xf-page-pm-label">描述</div>
           <div class=""><el-input placeholder="描述" ></el-input></div>
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
           <div class=""><el-input placeholder="售后信息" ></el-input></div>
           <div class="xf-page-pm-label">描述</div>
           <div class=""><el-input placeholder="描述"></el-input></div>
           <div class="xf-page-pm-label">剖面</div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.shxx" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
        </div> -->
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

          <div class="xf-precondition-box xf-precondition-box-fix1" v-for="(i,index) in pagemodel.pagePreConditions">
           <div class="xf-predition-label"><label>{{i.name}}</label></div>
           <div class="xf-predition-label"><label>可配置的值：</label></div>
           <div>
              <!-- <MutipleSelectDelete v-bind:optionsdata="multiple.inPreEdit" v-bind:selecteddata="multiple.inPreEditSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete> -->
              <el-select size="mini"class="xf-el-select" v-model="initpre[index]" filterable multiple placeholder="请选择">
                <el-option
                  v-for="item in multiple.inPreEdit"
                  :key="item.name"
                  :label="item.name"
                  :value="item.name">
                </el-option>
              </el-select>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"></i>
           </div>
          </div>
        </div>
    </div>
    <br/><br/><br/>
    <div class="bottom" >
      <button class="link-btn link-btn-default f-fr" @click="submit">确定</button>
    </div>
    <br/>
  </div>
</template>
  <script>
  import MutipleSelectDelete from './mutipleSelectDelete'
  import SingleSelect from '../CC/SingleSelect'
  import Tip from '../Tip'
  import {mapState} from 'vuex'
    export default{
      data:function(){
      return {
        initpre:[],
        multiple:{
          originOptions: [],
          selectedList: []
        },
        single:{
          outPreOptions:[]
        },
        processNode:[
          {
            value:'11001',
            label:'买家卖家注册',
            children:[
              {value:'12001',label:'淘宝-买家卖家注册',children:[
                  {value:'13001',label:'身份认证'},
                  {value:'13002',label:'填写信息'}
                ]},
              {value:'12002',label:'天猫-买家卖家注册'}
            ]
          },
          {
            value:'11002',
            label:'商品发布',
            children:[
              {value:'12001',label:'淘宝-一口价商品发布',children:[
                  {value:'13002',label:'选择类目'},
                  {value:'13003',label:'选择货品模板'},
                  {value:'13004',label:'填写商品信息'},
                  {value:'13005',label:'机器审核'},
                  {value:'13006',label:'人工审核'}
                ]},
              {value:'12002',label:'淘宝-拍买流程'}
            ]
          },
        ],
        initProcessNode:[],
        pagemodel:{
          name:'',//页面模板名称
          description:'',//页面模板描述
          devauthor:'',//页面模板开发者
          devdate:'',//页面模板开发日期
          processNodes:[],//关联的流程节点
          //页面模板上的业务能力剖面
          pageModelTypes:[],
          pagePreConditions:[],
          application:''
        }
     }
    },
    components:{MutipleSelectDelete,SingleSelect,Tip},
    computed:mapState({apps:state=>state.apps}),
    mounted:function(){
      this.$nextTick(function(){
        this.queryData();
      })
    },
    watch:{
      /*initpre:function(newValue,oldValue){
        if(oldValue!=newValue){
        }
      }*/
    },
    created:function(){

      //生成页面模板上的四个模块--开始
      var len = 3;
      for(var i=0;i<len;i++){
        var item = {
          modulename:'',//模块名称，比如商品发布页面的宝贝基本信息、支付信息
          moduledesc:'',//模块描述
          bussinessabilitypou:''//剖面列表
        };
      this.pagemodel.pageModelTypes.push(item);
      }
      //生成页面模板上的四个模块--结束
    },
    methods:{
        queryData:function(){
          var mySelf = this
          //this.$http.get("/api/getList").then(res=>{
            /*mySelf.multiple.originOptions = JSON.parse(res.body.data).result.pageList
            mySelf.single.outPreOptions = JSON.parse(res.body.data).result.outPreCondition;*/
            mySelf.multiple.originOptions = [{
              "id":"10001",
              "name":"淘宝一口价商品发布页面模板",
              "imgPath":"static/img/page1.png"
            }]
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
            mySelf.multiple.inPreEdit = [{"id":21,"name":"良好"},{"id":22,"name":"类型1"},{"id":23,"name":"类型3"}];
            mySelf.multiple.bbjbxx = [{"id":100,"name":"描述标题-采集"},{"id":200,"name":"宝贝卖点-采集"}];
            mySelf.multiple.zfxx = [{"id":"zf001","name":"支付方式-采集"},{"id":"zf002","name":"电子凭证-采集"}];
            mySelf.multiple.wlxx = [{"id":"wl001","name":"提货方式-采集"},{"id":"wl002","name":"运费模板-采集"}];
            mySelf.multiple.shxx = [{"id":"sh001","name":"无理由退货-采集"},{"id":"sh002","name":"售后信息-采集"}];
          //})
          mySelf.multiple.selectedList = [{"id":"1","name":"天猫商品发布"}]
        },
        multipleCallback: function(data){
            /*this.multiple.selectedList = data;
            if(data!="" && data!=null){
              data.forEach((i,index)=>{
                console.log(this.pagemodel.pageModelTypes[index].modulename)
                this.pagemodel.pageModelTypes[index].bussinessabilitypou.push(i.id);
                console.log("我看不懂")
              })
            }*/
        },
        singleCallback:function(data){
          var flag = true;
          if(this.pagemodel.pagePreConditions!=""){
            this.pagemodel.pagePreConditions.forEach((i)=>{
              if(i.id==data.id)//代表存在
              {
                flag = false;
              }
            })
           }
           if(flag == true){
              this.pagemodel.pagePreConditions.push({
                id:data.id,//前置条件id
                name:data.name,//前置条件key
                //还有一个value在submit的时候处理，真是难
                value:[]
              })
           }
        },
        submit:function(){
          //处理一下processNodes，将数组弄成一个节点的id--开始
          var len = this.initProcessNode.length;
          if(len>0){
            this.pagemodel.processNodes = [];
            this.pagemodel.processNodes.push(parseInt(this.initProcessNode[len-1]));
          }
          //处理一下processNodes，将数组弄成一个节点的id--结束
          //处理一下pagePreConditions，将数组弄成一个节点的id--开始
          this.pagemodel.pagePreConditions.forEach((i,index)=>{
            i.value = JSON.stringify(this.initpre[index])
          })
          //处理一下pagePreConditions，将数组弄成一个节点的id--结束
          //处理一下application，将数组弄成一个节点的id--开始
          console.log(this.apps.firstapp);

          this.pagemodel.application = parseInt(this.apps.firstapp.id);
          //处理一下application，将数组弄成一个节点的id--结束
          console.log(this.pagemodel)
          this.$http.post("/api/app/register_pageModel",JSON.stringify(this.pagemodel)).then(function(res){
            if(res.body.code == 200){
              this.successTip('success');
              setTimeout(()=>{
                //简直是一个天才
                this.$root.eventHub.$emit("changeModule",this.apps.firstapp);
                this.$router.push("/pagetemplate");
              },3000);
            }
            if(res.body.code == 'error'){
              this.successTip('error');
            }
            if(res.body.code == '401'){
              this.$router.push('/login');
            }
          })
        },
        successTip:function(type){
          if(type == 'success'){
            this.$message({
              message: '恭喜你，保存成功',
              type: 'success'
            })

          }else{
            this.$message.error('错了哦，请重新尝试！');
          }
        }
     }
    }   
  </script>
<style>
@import "../../assets/css/edit.scss";
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
   /*.gm-input{width: 220px;}*/
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
  .xf-el-select{position: absolute;width:43%;}
  .xf-el-select input{height:30px !important;}
</style>


