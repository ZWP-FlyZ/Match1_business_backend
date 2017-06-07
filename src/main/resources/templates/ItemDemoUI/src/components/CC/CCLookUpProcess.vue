
<style>
  @import "../../assets/css/edit.css";

</style>
<template>
  <div class=" regisiterpage">
    <HistoryPath :historyPathTitle="historyPathTitle"></HistoryPath>
    <div class="heads xf-heads">
      <i class="el-icon-share xf-edit-icon"></i> 流程基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">流程名称: </label><input type="text" class="inputbox checkView basic-inputbox lookUp-input gm-input" disabled="disabled" value="淘宝女装T-shirt商品发布">
        </div>
         <div class="item">
          <label class="nameid">流程KEY: </label> <input type="text" class="inputbox checkView lookUp-input basic-inputbox gm-input" disabled="disabled" value="121" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程节点数: </label> <input type="text" class="inputbox checkView lookUp-input basic-inputbox gm-input" disabled="disabled" value="10"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程描述: </label><input type="text" class="inputbox checkView lookUp-input basic-inputbox gm-input" disabled="disabled" value ="发布商品"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> 流程分类: </label>

          <select class="inputbox checkView SelectList  lookUp-input basic-inputbox gm-input" disabled="disabled">
            <option >商品发布</option>
            <option value='' >一级流程</option>
          </select>
        </div>

        <div class="item">
          <label class="nameid">开发人员: </label> <input type="text" class="inputbox checkView  lookUp-input basic-inputbox gm-input" disabled="disabled" value="xxx">
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label> <input type="date" class="inputbox checkView  lookUp-input basic-inputbox gm-input" disabled="disabled" value="2017-05-13" style="width:180px;">
        </div>
      </form>
    </div>
    <div class="heads xf-heads">
      <i class="el-icon-picture xf-edit-icon"></i> 流程节点基本信息
    </div>
    <div class="items">
      <div class="xf-process-style" >
       <ProcessImg class="xf-process-img" v-on:show="showContent"></ProcessImg>
       <el-tabs v-model="editableTabsValue2" type="card" closable @tab-remove="removeTab">
         <el-tab-pane class="xf-content-height" v-for="(item, index) in editableTabs2" :key="item.name" :label="item.title" :name="item.name" >
          <div v-if="isshowActiviti">
            <div class="heads xf-heads-half">
              <i class="el-icon-share xf-edit-icon"></i> 节点基本信息
            </div>
            <div class="items">
              <div  class="xf-yellow">
                <div class="item">
                  <label class="nameid">节点名称: </label>
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled" value="选择类目"  v-if="item.id==0">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="是否选择货品模板"  v-if="item.id==1">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled" value="获取货品模板"  v-if="item.id==2">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled" value="填写商品信息"  v-if="item.id==3">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="审核"  v-if="item.id==4">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="人工审核" v-if="item.id==6">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="机器审核" v-if="item.id==5">

                  <label class="nameid">节点类型: </label>
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="子活动"  autocomplete="on" v-if="item.id==0||item.id==2||item.id==3||item.id==5||item.id==6">
                  <input type="text" class="inputbox checkView"  placeholder="网关"  autocomplete="on" v-if="item.id==1||item.id==4">
                  
                  <label class="nameid">节点描述: </label> 
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="选择类目" autocomplete="on" autofocus="autofocus" v-if="item.id==0">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="是否选择货品模板" autocomplete="on" autofocus="autofocus" v-if="item.id==1">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled" value="获取货品模板" autocomplete="on" autofocus="autofocus" v-if="item.id==2">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="填写商品信息" autocomplete="on" autofocus="autofocus" v-if="item.id==3">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="审核" autocomplete="on" autofocus="autofocus" v-if="item.id==4">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="人工审核" autocomplete="on" autofocus="autofocus" v-if="item.id==6">
                  <input type="text" class="inputbox checkView lookUp-input gm-edt-input" disabled="disabled"  value="机器审核" autocomplete="on" autofocus="autofocus" v-if="item.id==5">
                </div> 
              </div>
            </div>

          <div class = "heads xf-heads-half">
            <i class="el-icon-d-arrow-left xf-edit-icon"></i> 外部前置条件
          </div>
          <div class="items xf-items-addBottom" v-if="item.id==4">
          <form class="xf-yellow">
            <div class="item xf-item">
              <span class="xf-span-fix">
              <input type="text" value="商品类型" class = "inputbox checkView  lookUp-input" disabled="disabled">
               <!--  <select class="longinput inputbox checkView  basic-select  lookUp-input" disabled="disabled">
                  <option>商品类型</option>
                  <option>目标时限节点</option>
                  <option>是否第一次进入该节点</option>
                </select> -->
               若等于</span>
              <SingleSelect class="xf-single-fix" v-bind:optionsdata="single.originOptions" v-bind:selecteddata="single.selected" v-on:selected="singleCallback"></SingleSelect>
              <span class="xf-span-fix">则执行 <b>机器审核</b> 活动; 
              否则执行 <b>人工审核</b> 活动</span>
            </div>
            <div v-bind:class="{'showAdvance':showadvance}">
            <select class="smallinput">
                  <option>与</option>
                  <option>或</option>
                  <option>非</option>
            </select>
            <div class="item xf-item">
              <span class="xf-span-fix">
                <select class="longinput inputbox checkView SelectList basic-select  lookUp-input" disabled="disabled">
                  <option>商品类型</option>
                  <option>目标时限节点</option>
                  <option>是否第一次进入该节点</option>
                </select>
               若等于</span>
              <SingleSelect class="xf-single-fix" v-bind:optionsdata="single.originOptions" v-bind:selecteddata="single.selected" v-on:selected="singleCallback"></SingleSelect>
              <span class="xf-span-fix">则执行 <b>机器审核</b> 活动; 
              否则执行 <b>人工审核</b> 活动</span>
              <i class="el-icon-plus xf-edit-icon xf-el-icon-plus"></i>
              <i class="el-icon-minus xf-edit-icon xf-el-icon-plus" @click="hideAdvance"></i>
            </div>
            </div>
          </form>
          </div>
          <div class="heads xf-heads-half">
            <i class="el-icon-document xf-edit-icon"></i> 关联页面模板
            <!-- <router-link to="/cCEditPage" class = "xf-go-edit-bzability" v-if="item.id==0||item.id==2||item.id==3||item.id==6">去编辑业务能力</router-link> -->
          </div>
          <div class="items" v-if="item.id==0||item.id==2||item.id==3||item.id==6">
          <form  class="xf-yellow">
            <span class="item">
              <label class="xf-name-fix" v-if="item.id==6">人工审核</label>
              <label class="xf-name-fix" v-if="item.id==0">选择类目</label>
              <label class="xf-name-fix" v-if="item.id==2">选择货品模板</label>
              <label class="xf-name-fix" v-if="item.id==3">填写商品信息</label>
            </span>
            <span class="item xf-mutiple-position" v-if="item.id==0||item.id==2||item.id==3||item.id==6">
              <label class="xf-name-fix" >关联的页面模板：</label>
             <MutipleSelectDelete class="xf-mutipleselect-top-fix xf-mutiple-width" v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata="multiple.selectedList" v-on:selected="multipleCallback" checked = "checked" disabled = "disabled"></MutipleSelectDelete>
            </span>
          </form>
          </div>
          <div class = "heads xf-heads-half">
            <i class="el-icon-d-arrow-right xf-edit-icon"></i> 内部前置条件
          </div>
           <div class="items xf-items-addBottom" v-if="item.id==6">
           <div class="xf-yellow">
           	<input type="text" value="商家信用等级" class = "inputbox checkView  lookUp-input" disabled="disabled">
            <div class="item " >
             若
            <input type="text" value="大于" class = "inputbox checkView  lookUp-input" disabled="disabled">
              <input type="text" value="1" class = "inputbox checkView  lookUp-input" disabled="disabled">颗星
              则呈现 <b>页面模板1</b> ; 
              否则，呈现<b>页面模板1</b> ;
            </div>
           </div>
          </div>
          
          <div class="heads xf-heads-half">
            <i class="el-icon-date xf-edit-icon"></i> 配置项
          </div>

          </div>
         </el-tab-pane>
       </el-tabs>
        </map>
      </div>
    </div>
    <br/>
    <!-- <div class="bottom" >
      <router-link to="/CCprocess"  class="ok link-btn link-btn-default">关闭</router-link>
    </div> -->
     <div class="bottom" >
      <div class="BZProcess-table" style="border:0;">
          <div class="BZ-edit">
            <router-link to="/cCprocess"  class="link-btn link-btn-blue">关闭</router-link>
          </div>
      </div>
    </div>
    <br/>
  </div>
</template>
<script>
    import MutipleSelectDelete from "../AA/MutipleSelectDelete"
    import SingleSelect from '../CC/SingleSelect'
    import ProcessImg from './ProcessImg'
    import HistoryPath from '../HistoryPath'
    export default{
      data(){
        return {
          historyPathTitle:'业务方：选择业务身份 / 选择流程 / 配置流程',
          isshowActiviti:false,
          showwhat :'5',
          multiple: {
            originOptions: [],
            selectedList: []
          },
          single:{
            originOptions:[],
            selected: {}
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
          showadvance:true
        }
      },
      components:{'MutipleSelectDelete':MutipleSelectDelete,'SingleSelect':SingleSelect,'ProcessImg':ProcessImg,'HistoryPath':HistoryPath},
      mounted:function(){
        this.$nextTick(function(){
          this.queryData();
        })
      },
      methods:{
        queryData:function(){
          var mySelf = this
          /*单选的*/
          mySelf.single.originOptions = [{"id":"1","name":"达尔文"},{"id":"2","name":"类型1"},{"id":"3","name":"类型2"},{"id":"4","name":"类型3"},{"id":"5","name":"类型4"},{"id":"6","name":"类型5"}];
          mySelf.single.selected = {"id":"1","name":"达尔文"}
          /*多选的*/
          this.$http.get("/api/getList").then(res=>{
            console.log(JSON.parse(res.body.data).result.pageList.length)
            mySelf.multiple.originOptions = [{"id":"1","name":"人工审核页面1"},{"id":"2","name":"人工审核页面2"}]
            /*JSON.parse(res.body.data).result.pageList*/
          })
          mySelf.multiple.selectedList = [{"id":"1","name":"人工审核页面1"}]
        },
        singleCallback: function(data){
            this.single.selected = data;
            // console.log('父级元素调用singleCallback 选中的是' + JSON.stringify(data))
        },
        multipleCallback: function(data){
          this.multiple.selectedList = data;
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
          this.editableTabsValue2 = activeName;
          this.editableTabs2 = tabs.filter(tab => tab.name !== targetName);
        },
        addTab:function(targetName,name) {
          let newTabName = ++this.tabIndex + '';
          let tabs = this.editableTabs2;
          var isAdd = true;
          tabs.forEach((tab, index) =>{
            if(tab.id == targetName){
              this.editableTabsValue2 = targetName;
              isAdd = false;
            }
          })
          if(isAdd){
             this.editableTabs2.push({
               id: targetName,
               title: name,
               name: name,
               content: 'New'
            });
            this.editableTabsValue2 = name;
          }
        },
        showAdvance:function(){
          this.showadvance = false;
        },
        hideAdvance:function(){
          this.showadvance = true;
        }
      }
    }   
  </script>
<style scoped> 
  .xf-item{width:100%;}
  .xf-edit-icon{color:#448bc7;cursor: pointer;}
  .xf-item span.xf-span-fix{position: relative;top: -19px;}
  .xf-single-fix{display: inline-block;height:30px;}
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
.xf-node-text{position: relative;top:110px;color:#ccc;font-style: normal;font-size:14px;}
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
.fa-node2{top: -60px;left: 10px;background: url(../../assets/img/node2.png);}
.fa-node3{top: -60px;left: 10px;background: url(../../assets/img/node3.png);}
.fa-node4{top: -60px;left: -15px;background: url(../../assets/img/node4.png);}
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
  .cc-precondition-pre-des{float: left;}
  .cc-precondition-search{float: left;}
  .longname-cc{top:0;}
  .xf-mutipleselect-top-fix{top:3px;z-index:101px;}
  .xf-go-edit-bzability{font-size:12px;color:#f7ba2a;}
  .xf-process-img{width:95%;}
  /*wxfei*/
  .xf-mutiple-position{position: relative;}
  .xf-mutiple-width{width:500% !important;left: 131px;}
  .xf-heads{background:#fff;border:1px dashed #448bc7;border-radius: 0px}
  .xf-heads-half{background:#fff;border:1px dashed #448bc7;border-radius: 0px;border-top:0px;border-right:0px;}
  .xf-yellow{background: #fff;text-align: left;margin-left:2%;}
  /*.xf-yellow div{margin:0px;padding:0px;}*/
  .xf-items-addBottom{margin-bottom: 0px}
  .item .xf-name-fix{position: relative;top:6px;}
  .xf-content-height{margin-bottom: 100px;padding:20px;}
  .xf-el-icon-plus{position: relative;top:-15px;left:5%;margin-right:4px;}
  .showAdvance{display: none}
  .basic-inputbox{width: 220px;}
  .basic-select{padding:7px 4px 2px;}
  .lookUp-input{background-color: #fff;}
</style>