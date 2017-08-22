
<style>
  @import "../../assets/css/edit.scss";

</style>
<template>
  <div class=" regisiterpage">
    <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 流程基本信息
    </div>
    <div name="processValidator" class="items">
      <div class="itemsform xf-form-fix">
        <div class="item">
          <label class="nameid">流程名称：</label><input type="text" class="xf-input" v-model="process.name" placeholder="输入流程名称"  autocomplete="on" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">流程节点数：</label> <input type="text" class="xf-input"  v-model="process.nodeNum" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" placeholder="输入流程节点数" value="2"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程描述：</label><input type="text" class="xf-input"  v-model="process.pdesc" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" placeholder="输入流程描述" value ="发布商品"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程分类：</label>
          <select class="xf-input" v-model="process.type" v-bind:disabled="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}">
            <option value='' disabled="disabled" selected = "selected">--请选择--</option>
            <option >买\卖家入住</option>
            <option>货品选品</option>
            <option>货品发布</option>
            <option>商品选品</option>
            <option>商品发布</option>
            <option >投放</option>
            <option>加购\收藏</option>
            <option>合同订立</option>
            <option>合同履约</option>
            <option>下单</option>
            <option>售后</option>
            <option>评价</option>
          </select>
        </div>

        <div class="item">
          <label class="nameid">开发人员： </label> <input type="text" class="xf-input"  v-model="process.devauthor" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" placeholder="输入流程开发者" value="xxx"  autocomplete="on">
        </div>
        <div class="item">
          <label class="nameid">开发日期：</label> <input type="date" class="xf-input" v-model="process.devdate" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" placeholder="选择流程开发日期" value="2017-05-13"  autocomplete="on" >
        </div>
      </div>
    </div>
    <div class="heads xf-heads">
      <i class="el-icon-picture xf-edit-icon"></i> 流程图形化表达{{editableTabs2.length}}
    </div>
    <div class="items">
      <div class="yellow-block xf-node-style" >
        <ul class="xf-node-ul">
          <li v-for="(item,index) in nodeList">
            <a href="javascript:void(0)" class="xf-tooltip xf-tooltip-effect-1">
              <img v-bind:src="item.imgUrl " class="node-style" v-bind:class="{'node-style-fix':index==4}">
              <span class="xf-tooltip-content" v-bind:class="{'node-top-fix':index==4}">
                <i class="fa" v-bind:class="item.className"> <font class="xf-node-text">{{item.nodeText}}</font></i>
              </span>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="items">
      <div class=" xf-process-style" >
        <ProcessImg class="xf-process-img" v-on:show="showContent"></ProcessImg>
         <el-tabs v-model="editableTabsValue2" type="card" closable @tab-remove="removeTab">
         <el-tab-pane class="xf-content-height" v-for="(item, index) in editableTabs2" :key="item.name" :label="item.title" :name="item.name" >
    <div >
      <div class="heads xf-heads">
        <i class="el-icon-share xf-edit-icon"></i> 节点基本信息
      </div>
      <div class="items">
        <div  class="xf-yellow">
          <div class="item xf-item-fix-margin">
          <label class="nameid">节点名称：</label><input type="text" class="xf-input" v-model="process.processNodes[index].name" placeholder="输入节点名称"  autocomplete="on" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" autofocus="autofocus">
        </div>
        <div class="item xf-item-fix-margin">
          <label class="nameid">节点类型：</label><input type="text" class="xf-input" v-model="process.processNodes[index].type" placeholder="输入节点类型"  autocomplete="on" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" autofocus="autofocus">
        </div>
        <div class="item xf-item-fix-margin">
          <label class="nameid">节点描述：</label><input type="text" class="xf-input" v-model="process.processNodes[index].description" placeholder="输入节点描述"  autocomplete="on" v-bind:readOnly="$route.query.method =='look'" v-bind:class="{'xf-noborder':$route.query.method =='look'}" autofocus="autofocus">
        </div>
        </div>
      </div>

    <div class = "heads xf-heads">
        <i class="el-icon-d-arrow-left xf-edit-icon"></i> 节点前置条件
        <div class="xf-singleSelect-box">
          <SingleSelect class="xf-single-fix" v-bind:optionsdata="single.outPreOptions" v-bind:selecteddata="single.outPreselected" v-on:selected="singleCallback">
          </SingleSelect>
        </div>
    </div>
    <div class="items xf-items-addBottom">
        <div class="item xf-item">

          <div class="xf-precondition-box" v-for="i in nodeCount">
           <div class="xf-predition-label"><label>商品类型</label></div>
           <div class="xf-predition-label"><label>可配置的值：</label></div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.outPreEdit" v-bind:selecteddata="multiple.outPreEditSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon" @click="deleteItem('nodeCount')"></i>
           </div>
          </div>

        </div>
    </div>
    <br /><br />
    <div class = "heads xf-heads">
        <i class="el-icon-d-arrow-right xf-edit-icon"></i> 页面模板前置条件
        <div class="xf-singleSelect-box">
          <SingleSelect class="xf-single-fix" v-bind:optionsdata="single.inPreOptions" v-bind:selecteddata="single.inPreSelected" v-on:selected="singleCallback">
          </SingleSelect>
        </div>
    </div>
    <div class="items xf-items-addBottom">
        <div class="item xf-item">

          <div class="xf-precondition-box" v-for="i in pageCount">
           <div class="xf-predition-label"><label>ssssss</label></div>
           <div class="xf-predition-label"><label>可配置的值：</label></div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.inPreEdit" v-bind:selecteddata="multiple.inPreEditSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
           <div class="xf-predition-delete">
             <i class="el-icon-circle-cross xf-edit-icon"@click="deleteItem('pageCount')"></i>
           </div>
          </div>
        </div>
    </div>
    <br /><br />
    <div class="heads xf-heads">
      <i class="el-icon-document xf-edit-icon"></i> 关联页面模板
    </div>
    <div class="items xf-items-addBottom">
        <div class="item xf-item">
          <div class="xf-precondition-box">
           <div class="xf-predition-label">
              <label v-if="item.id==0">选择类目</label>
              <label v-if="item.id==1">是否选择货品模板</label>
              <label v-if="item.id==2">获取货品模板</label>
              <label v-if="item.id==3">填写商品信息</label>
              <label v-if="item.id==4">审核</label>
              <label v-if="item.id==5">机器审核</label>
              <label v-if="item.id==6">人工审核</label>
           </div>
           <div class="xf-predition-label"><label>关联的页面模板：</label></div>
           <div>
              <MutipleSelectDelete v-bind:optionsdata="multiple.pages" v-bind:selecteddata="multiple.pageSelected" v-on:selected="multipleCallback" ></MutipleSelectDelete>
           </div>
          </div>
        </div>
    </div>
    <!-- <div class="heads xf-heads">
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
      </div> -->

    </div>
   </el-tab-pane>
  </el-tabs>
  </div>
</div>
    <div class="bottom" >
      <button @click="openClick" v-if="$route.query.method!='look'" class="link-btn link-btn-default f-fr">确定</button>
    </div>
    <br/>
    <IMask :hide-mask.sync="hideMask"></IMask>
    <Tip :message="tipText" :hide-tip.sync="hideTip" :hide-mask.sync="hideMask" v-on:increment="closeTip"></Tip>
  </div>

</template>
<script>
    import MutipleSelectDelete from "./MutipleSelectDelete"
    import ProcessImg from '../CC/ProcessImg'
    import SingleSelect from '../CC/SingleSelect'
    import Tip from "../Tip"
    import IMask from '../Mask'
    export default{
      data(){
        return {
          isshowActiviti:false,
          showwhat :'5',
          multiple: {
            originOptions: [],
            selectedList: []
          },
          nodeList:[
            {"imgUrl":"static/img/node1.png","nodeText":"互斥网关","className":"fa-node1"},
            {"imgUrl":"static/img/node2.png","nodeText":"并行网关","className":"fa-node2"},
            {"imgUrl":"static/img/node3.png","nodeText":"网关","className":"fa-node3"},
            {"imgUrl":"static/img/node4.png","nodeText":"子活动","className":"fa-node4"},
            {"imgUrl":"static/img/node5.png","nodeText":"连接线","className":"fa-node5"}
          ],
          editableTabsValue2: '0',
          editableTabs2: [],
          tabIndex: 0,
          single:{
            originOptions:[],
            outPreOptions:[],
            outPreselected: []
          },
          hideTip:true,
          hideMask:true,
          tipText:'',
          nodeCount:2,
          pageCount:2,
          process:{
            name:'',
            nodeNum:'',
            pdesc:'',
            type:'',
            devauthor:'',
            devdate:'',
            application:'',//该流程所属的应用
            processNodes:[]//流程节点，里面的信息在add tab的时候动态添加
          }
        }
      },
      components:{MutipleSelectDelete,SingleSelect,ProcessImg,Tip,IMask},
      mounted:function(){
        this.$nextTick(function(){
          if(this.$route.query.method=='new'){//如果是注册页面
          }else{
            this.process = JSON.parse(sessionStorage.getItem("aProcess"))
          }
          this.queryData();
        })
      },
      created:function(){
        //生成对象属性
        for(let i=0;i<this.process.nodeNum;i++){
          var item = {
            name:'',
            type:'',
            description:'',
            nodePreConditions:[],
            pagePreConditions:[],
            pagemodels:[]
          }
        }
      },      
      methods:{
        queryData:function(){
          var mySelf = this
          /*this.$http.get("/api/getList").then(res=>{
            mySelf.multiple.pages = JSON.parse(res.body.data).result.pageList 

            mySelf.single.outPreOptions = JSON.parse(res.body.data).result.outPreCondition;
            mySelf.single.inPreOptions = JSON.parse(res.body.data).result.inPreCondition;
          })*/
          mySelf.multiple.pages = [{
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
            mySelf.single.inPreOptions = [{"id":"in11","name":"销售记录"},
      {"id":"in12","name":"价格库存物流"},
      {"id":"in13","name":"产品信息"},
      {"id":"in14","name":"特定类目规则"},
      {"id":"in15","name":"开店时间"},
      {"id":"in16","name":"转化率"},
      {"id":"in17","name":"违规记录"},
      {"id":"in18","name":"销售记录"},
      {"id":"in19","name":"是否是良心卖家"},
      {"id":"in20","name":"知名品牌高危质检"},
      {"id":"in21","name":"冲突管理规则"}]
          mySelf.multiple.outPreEdit = [{"id":"11","name":"达尔文"},{"id":"12","name":"类型1"},{"id":"13","name":"类型3"}];
          mySelf.multiple.inPreEdit = [{"id":"21","name":"良好"},{"id":"22","name":"类型1"},{"id":"23","name":"类型3"}];
          mySelf.multiple.configure = [{"id":"331","name":"良好"},{"id":"332","name":"类型1"},{"id":"333","name":"类型3"}];


          /*mySelf.multiple.selectedList = [{"id":"1","name":"天猫商品发布"}];
          mySelf.single.outPreselected = {"id":"1","name":"商品类型"}
          mySelf.single.inPreselected = {"id":"1","name":"销售记录"}*/
        },
        showContent:function(i,name){
          this.editableTabsValue2 = i
          this.isshowActiviti=true
          this.showwhat=i
          this.addTab(i,name);
          this.$nextTick(function(){
            this.queryData();
          })
        },
        removeTab:function(targetName) {
          let tabs = this.editableTabs2;
          let activeName = this.editableTabsValue2;
          if (activeName === targetName) {
            tabs.forEach((tab, index) => {
              if (tab.name === targetName) {
                let nextTab = tabs[index + 1] || tabs[index - 1];
                  if (nextTab) {
                    activeName = nextTab.name;
                  }
              }
            });
          }
          this.process.processNodes.pop()//删除item
          this.editableTabsValue2 = activeName;
          this.editableTabs2 = tabs.filter(tab => tab.name !== targetName);
        },
        addTab:function(targetName,name) {
          let newTabName = ++this.tabIndex + '';
          let tabs = this.editableTabs2;
          var isAdd = true;
          if(tabs.length>0){
            tabs.forEach((tab, index) =>{
            if(tab.id == targetName){
              this.editableTabsValue2 = targetName;
              isAdd = false;
              this.editableTabsValue2 = tab.name;
             }
           })
          }          
          if(isAdd){            
            console.log("0")
            //console.log(this.editableTabs2)
            console.log("2")
            this.editableTabs2.push({
               id: targetName,
               title: name,
               name: name,
               content: 'New'
            });
            this.editableTabsValue2 = name;          
          }
          console.log(this.editableTabs2)
        },
        multipleCallback: function(data){
          this.multiple.selectedList = data;
        },
        singleCallback:function(data){

        },
        openClick:function(){
          this.$http.post("/api/app/register_process",JSON.stringify(this.process)).then(function(res){
            if(res.body.code == 200){
              this.hideTip = !this.hideTip
              this.hideMask = !this.hideMask
              this.tipText = "保存成功！"
              //
            }
            if(res.body.code=='error'){
              this.hideTip = !this.hideTip
              this.hideMask = !this.hideMask
              this.tipText = "保存失败！"
              console.log("保存失败")
            }
            if(res.body.code == 401){
              this.$router.push("/login")
            }
          })
        },
        closeTip:function(data){
          this.hideTip = data
          this.hideMask = data
          this.$router.push("/bzprocess")
        },
        //里面前置条件等的删除
        deleteItem:function(type){
          if(type='nodeCount'){
            if(this.nodeCount!=0){
              this.nodeCount--;
            }
          }
          if(type='pageCount'){
            if(this.pageCount!=0){
              this.pageCount--;
            }
          }
        }
      }
    }   
  </script>
<style scoped>
  .xf-node-style{text-align:center;}
  .xf-node-ul li {
  float:left;
  width:14%;
  display: inline-block;
  position: relative;
  margin: 0 1em;
  font-size: 1.5em;
}
  .node-style{width:60%;}
  .node-style-fix{position: relative;top:20px}
  .xf-detailNode{display: inline-block;}
  .xf-tooltip {display: inline;position: relative;z-index: 999;}
  .xf-tooltip-content {
  position: absolute;
  z-index: 9999;
  width: 220px;
  height: 110px;
  padding-top: 25px;
  left: 70%;
  top:-150px;
  margin-left: -40px;
  bottom: 100%;
  border-radius: 2%;
  text-align: center;
  background: #fff;
  color: #47c9af;
  opacity: 0;
  margin-bottom: 20px;
  cursor: default;
  pointer-events: none;
  border-radius: 4px;
  box-shadow: 3px 3px 3px #eee;
  border:1px solid #eee;
}
.xf-tooltip-content i {
  opacity: 0;
}

.xf-tooltip:hover .xf-tooltip-content,
.xf-tooltip:hover .xf-tooltip-content i {
  opacity: 1;
}
.xf-tooltip-effect-1 .xf-tooltip-content {
  -webkit-transform: translate3d(0,10px,0) rotate3d(1,1,1,0);
  transform: translate3d(0,10px,0) rotate3d(1,1,1,0);
  -webkit-transform-origin: 70% 100%;
  transform-origin: 70% 100%;
  -webkit-transition: opacity 0.3s, -webkit-transform 0.3s;
  transition: opacity 0.3s, transform 0.3s;
}

.xf-tooltip-effect-1 .xf-tooltip-content i {
  -webkit-transform: scale3d(0,0,1);
  transform: scale3d(0,0,1);
  -webkit-transition: opacity 0.3s, -webkit-transform 0.3s;
  transition: opacity 0.3s, transform 0.3s;
}
.xf-tooltip:hover .xf-tooltip-content,
.xf-tooltip:hover .xf-tooltip-content i {
  pointer-events: auto;
  -webkit-transform: translate3d(0,0,0) scale3d(1,1,1);
  transform: translate3d(0,0,0) scale3d(1,1,1);
}

.xf-tooltip-effect-1:hover .xf-tooltip-content i {
  -webkit-transform: rotate3d(1,1,1,0);
  transform: rotate3d(1,1,1,0);
}
.xf-node-text{position: relative;top:113px;color:#ccc;font-style: normal;font-size:14px;}
/* Arrow */

.xf-tooltip-content::after {
  content: '';
  position: absolute;
  top: 100%;
  left: 50%;
  margin: -7px 0 0 -15px;
  width: 30px;
  height: 20px;
  background-size: 100%;
}
.fa{
    width: 160px;
    height: 120px;
    display: inline-block;
    position: relative
    
}
.fa-node1{top: -60px;left: 10px;background: url(../../assets/img/node1.png);}
.fa-node1 .xf-node-text{left:-10px;}
.fa-node2{top: -60px;left: 10px;background: url(../../assets/img/node2.png);}
.fa-node2 .xf-node-text{left:-5px;}
.fa-node3{top: -60px;left: 10px;background: url(../../assets/img/node3.png);}
.fa-node3 .xf-node-text{left:-8px;}
.fa-node4{top: -60px;left: -15px;background: url(../../assets/img/node4.png);}
.fa-node4 .xf-node-text{left:12px;}
.fa-node5{width:300px;top: -60px;left: -30px;background: url(../../assets/img/node5.png);}

.node-top-fix{top:-100px;}
.xf-process-style{text-align: center}
  .SelectList{
    border-style:none;
    appearance:none;
  }
  /*::-webkit-datetime-edit-fields-wrapper { background-color: red; }*/
  ::-webkit-datetime-edit-text { color: #878787; padding: 0 .3em; }/*/的颜色*/
  ::-webkit-datetime-edit-year-field { color: #878787;font: 15px/1.62 Helvetica,Arial,sans-serif; }
  ::-webkit-datetime-edit-month-field { color: #878787; }
  ::-webkit-datetime-edit-day-field { color: #878787; }
  .grey-option{
    margin-bottom: 20px;
  }
  .xf-process-img{width:95%;}
  .items,.grey-option,.yellow{text-align: left;width:94%;}
  .xf-multiple-fix-width{width:30% !important;}
  .twocolor{left:0px;}
  .xf-heads .xf-singleSelect-box{position: relative;top: -36px;left: 20%;}
  .xf-precondition-box {display:flex;justify-content:flex-start;align-items:flex-start;border:1px solid #f0f0f0;padding-left:2%;text-align: left;height:50px;padding-top:7px;margin-bottom:10px;}
  .xf-precondition-box div{margin-right:3%;}
  .xf-precondition-box .xf-predition-label{margin-top:5px;width:15%;}
  .xf-precondition-box .xf-predition-delete{margin-left:58%;margin-top: 5px}
  .xf-form-fix .item{width:28%;margin-bottom:10px;margin-right:3%;}
  .xf-noborder{border:none;}
  .xf-item-fix-margin{margin-right:-15px;margin-bottom:10px;}
  .xf-item-fix-margin .xf-input{width:85%;}
</style>


