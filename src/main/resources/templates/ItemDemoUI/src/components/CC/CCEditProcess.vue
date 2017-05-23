
<style>
  @import "../../assets/css/edit.css";

</style>
<template>
  <div class=" regisiterpage">
    <div class="heads">
      流程基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">流程名称: </label><input type="text" class="inputbox checkView"  value="弱管控商品发布" autocomplete="on" autofocus="autofocus">
        </div>
         <div class="item">
          <label class="nameid">流程KEY: </label> <input type="text" class="inputbox checkView"  value="121" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程节点数: </label> <input type="text" class="inputbox checkView"  value="2"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程描述: </label><input type="text" class="inputbox checkView"  value ="发布商品"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> 流程分类: </label>

          <select class="inputbox checkView SelectList" >
            <option >二级流程</option>
            <option value='' >商品发布</option>
          </select>
        </div>

        <div class="item">
          <label class="nameid">开发人员: </label> <input type="text" class="inputbox checkView"  value="xxx"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label> <input type="date" class="inputbox checkView"  value="2017-05-13"  autocomplete="on" >
        </div>
      </form>
    </div>
    <div class="heads">
      流程图形化表达
    </div>
    <div class="items">
      <div class="grey-block xf-process-style" >
        <img @click="showActiviti" src="static/img/tbpublish.png" usemap="#processmap" alt="" />
        <map name="processmap" id="processmap">
        <area shape="rect" coords="154 150 216 196" href="#1" />

        <area shape="rect" coords="262 156 307 198" href="#2" />
        <div style="width: 70px;height: 54px;border: 1px solid transparent;position: absolute;top: 150px;left: 155px;" @click="showContent(2)"></div>

        <area shape="rect" coords="352 106 447 159" href="#3" />
        <div style="width: 74px;height: 57px;border: 1px solid transparent;position: absolute;top: 114px;left: 370px;" @click="showContent(3)"></div>

        <area shape="rect" coords="484 195 571 243" href="#4" />
        <div style="width: 74px;height: 57px;border: 1px solid transparent;position: absolute;top: 200px;left: 500px;" @click="showContent(4)"></div>

        <area shape="rect" coords="618 195 663 241" id="showActivitiid" /> 
        <div style="width: 45px;height: 45px;border: 1px solid transparent;position: absolute;top: 205px;left: 630px;" @click="showContent(5)"></div>

        <area shape="rect" coords="700 27 787 89" href="#6" />
        <div style="width: 74px;height: 57px;border: 1px solid transparent;position: absolute;top: 39px;left: 719px;" @click="showContent(6)"></div>

        <area shape="rect" coords="702 180 775 238" href="#7" />
        <div style="width: 74px;height: 57px;border: 1px solid transparent;position: absolute;top: 192px;left: 710px;" @click="showContent(7)"></div>
        </map>
      </div>
    </div>
     <div v-if="isshowActiviti">
      <div class="heads">
        节点基本信息
      </div>
      <div class="items">
        <form  class="itemsform">
          <div class="item">
            <label class="nameid">节点名称: </label><input type="text" class="inputbox checkView"  value="审核" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="nameid">节点功能描述: </label><input type="text" class="inputbox checkView"  placeholder="审核"  autocomplete="on" >
          </div>

          <div class="item">
            <label class="nameid">KEY: </label> <input type="text" class="inputbox checkView"  placeholder="121"  autocomplete="on" >
          </div>
        </form>
      </div>

    <div class = "heads">
      <div class = "condition">外部前置条件</div>
        <!-- 自定义样式select框开始 -->

      <select class="longinput"  v-if="showwhat==5">
          <option>商品类型</option>
          <option>目标时限节点</option>
          <option>是否第一次进入该节点</option>
      </select>
      <!-- 自定义样式select框结束 -->
    </div>
    <div class="twocolor" v-if="showwhat==5">
    <form class="grey grey-option">
      <div class="item ">
        商品类型 若等于
        <select class="longinput" >
          <option>达尔文</option>
          <option>商品类型1</option>
        </select>
        则执行 <b>机器审核</b> 活动; 
        若等于
        <select class="longinput" >
          <option>达尔文</option>
          <option>商品类型1</option>
        </select>
        则执行 <b>人工审核</b> 活动
      </div>
    </form>
    </div>
    <div class="heads">
      关联页面模板
    </div>
    <form  class="yellow" v-if="showwhat==7">
      <div class="item">
        <label class="smallname">审核</label>
      </div>
      <div class="item">
        <label class="longname">关联的页面模板：</label>
       <MutipleSelectDelete class="xf-mutipleselect-top-fix" v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata="multiple.selectedList" v-on:selected="multipleCallback"></MutipleSelectDelete>
      </div>
    </form>
    <div class = "heads">
      <div class = "condition">内部前置条件</div>
     <select class="longinput" v-if="showwhat==7">
          <option>商家信用等级</option>
          <option>开店时间</option>
          <option>转化率</option>
      </select>
    </div>
     <div class="twocolor" v-if="showwhat==7">
     <div class="grey grey-option">
      <div class="item ">
        商家信用等级 若
        <select class="longinput" >
          <option>大于</option>
          <option>小于</option>
          <option>等于</option>
        </select>
        <input type="text" value="1" class="longinput">颗星
        则呈现 <b>页面模板1</b> ; 
        否则，呈现<b>页面模板1</b> ;
      </div>
     </div>
    </div>
    
    <div class="heads">
      配置项
    </div>
    </div>
    <br/>
    <div class="bottom" >
      <router-link to="/publishIdentity"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>
</template>
<script>
    import MutipleSelectDelete from "../AA/MutipleSelectDelete"
    export default{
      data(){
        return {
          nextState:1,
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
          ]
        }
      },
      components:{'MutipleSelectDelete':MutipleSelectDelete},
      mounted:function(){
        this.$nextTick(function(){
          this.queryData();
        })
      },
      methods:{
        change:function(obj){
          var liArray=document.getElementById(obj.currentTarget.parentNode.id);
          var arr = liArray.getElementsByTagName("li")
          var i=1;
          var length=liArray.length;
          switch(this.nextState){
            case 1:
              document.getElementById(obj.currentTarget.id).innerHTML="当前选择↑";
              for(;i<arr.length;i++){
              arr[i].className="liShow";
              }
              this.nextState=0;
            break;
            case 0:
              document.getElementById(obj.currentTarget.id).innerHTML="当前选择↓";
              for(;i<arr.length;i++){
              arr[i].className="liHide";
              }
              this.nextState=1;
          }
        },
        queryData:function(){
          var mySelf = this
          this.$http.get("/api/getList").then(res=>{
            console.log(JSON.parse(res.body.data).result.pageList.length)
            mySelf.multiple.originOptions = JSON.parse(res.body.data).result.pageList
          })
          mySelf.multiple.selectedList = [{"id":"1","name":"天猫商品发布"}]
        },
        multipleCallback: function(data){
          this.multiple.selectedList = data;
        },
        showActiviti:function(){
          this.isshowActiviti = !this.isshowActiviti
        },
        showContent:function(i){
          this.showwhat=i
        }
      }
    }   
  </script>
<style>
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
.fa-node1{top: -60px;left: 10px;background: url(/static/img/node1.png);}
.fa-node2{top: -60px;left: 10px;background: url(/static/img/node2.png);}
.fa-node3{top: -60px;left: 10px;background: url(/static/img/node3.png);}
.fa-node4{top: -60px;left: -15px;background: url(/static/img/node4.png);}
.fa-node5{width:300px;top: -60px;left: -30px;background: url(/static/img/node5.png);}
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
</style>


