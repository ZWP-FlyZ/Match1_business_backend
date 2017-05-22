
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
        <area shape="rect" coords="352 106 447 159" href="#3" />
        <area shape="rect" coords="484 195 571 243" href="#4" />
        <!-- <area shape="rect" coords="618 195 663 241" id="showActivitiid" /> --><!-- 审核 -->
        <area shape="rect" coords="700 27 787 89" href="#6" />
        <area shape="rect" coords="702 180 775 238" href="#7" />
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
      <div class = "condition-select">
        <ul id="myUl" class="condition-in-out inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select-out" @click="change($event)"><div><b class = "normal-b">前置条件库</b><img src="/static/img/glyphicons-368-expand.png" alt=""></div></li>
          <li value="1" class="liHide"><div><input type="checkbox" class="input_check" id="check0"><label for="check0"></label><b class = "normal-b">商品类型</b></div></li>
        </ul>
      </div>
      <!-- 自定义样式select框结束 -->
    </div>
    <div class="twocolor">
    <form class="grey grey-option">
      <div class="item ">
        商品类型 若等于<input type="text" class="inputbox checkView" value ="达尔文类型">
        则执行 <b>机器审核</b> 活动; 
        若等于<input type="text" class="inputbox checkView" value ="其他类型">
        则执行 <b>人工审核</b> 活动
      </div>
    </form>
    </div>
    
    <div class = "heads">
      <div class = "condition">内部前置条件</div>
      <div class = "condition-select">
        <ul id="myUl1" class="condition-in-out inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select-in" @click="change($event)"><div><b class = "normal-b">前置条件库</b><img src="/static/img/glyphicons-368-expand.png" alt=""></div></li>
          <li value="221" class="liHide"><div><input type="checkbox" class="input_check" id="check221"><label for="check221"></label><b class = "normal-b">商家信用等级规则</b></div></li>
          <li value = "222" class="liHide"><div><input type="checkbox" class="input_check" id="check222"><label for="check222"></label><b class = "normal-b">开店时间</b></div></li>
        </ul>
      </div> 
    </div>
    <div class="twocolor">
      <form class="grey">
        <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">审查批准文号</div>
        <div class="item">
          <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称：</label> <input type="text"  class="inputbox checkView"   value="" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
    </div>
    <div class="heads">
      关联页面模板
    </div>
    <form  class="yellow">
      <div class="item">
        <label class="smallname">节点1</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value=""
         autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="121"  autocomplete="on" >
      </div>
      <div class="item">
        <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput checkView"  value="121" autocomplete="on" >
        <label class="longname">关联的页面模板：</label>
       
       <MutipleSelectDelete v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata="multiple.selectedList" v-on:selected="multipleCallback"></MutipleSelectDelete>

      </div>
        
    </form>
    <div class="heads">
      配置项
    </div>
    <div class="items">
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
          <div class="item">
            <label class="longname">参与角色：</label>
            <select class="longinput" >
              <option>人工1</option>
              <option value=''>审核方1</option>
              <option value=''>审核方2</option>
              <option value=''>机审1</option>
              <option value=''>机审2</option>
              <option value=''>人工2</option>
            </select>
          </div>
          <div class="item">
            <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value="Star" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="121" autocomplete="on" >
          </div>

          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <div class="item">
            <label class="longname">配置项值选项</label>
            <select class="inputbox" >
              <option>多选</option>
              <option value=''>单选</option>
            </select>
          </div>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1"  autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="人工1" autocomplete="on" >
              </div>
            </form>
            <br/>
          </div>
        </div>
      </div>
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
          <div class="item">
            <label class="longname">角色的权限：</label>
            <select class="longinput" >
              <option value=''>可写</option>
              <option value=''>读写</option>
              <option value=''>限制性读</option>
            </select>
          </div>
          <div class="item">
            <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value="KKY" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="" autocomplete="on" >
          </div>
          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <div class="item">
            <label class="longname">配置项值选项</label>
            <select class="inputbox" >
              <option>单选</option>
              <option value=''>多选</option>
            </select>
          </div>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="限制性读"  autocomplete="on" >
              </div>

            </form>
            <br/>
          </div>
        </div>
      </div>
       <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
            <label class="longname">角色的期限：</label>
            <select class="longinput" >
              <option value=''>1天</option>
              <option value=''>2天</option>
              <option value=''>3天</option>
              <option value=''>4天</option>
            </select>
          </div>
          <div class="item">
            <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value="KKY" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="" autocomplete="on" >
          </div>

          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <div class="item">
            <label class="longname">配置项值选项</label>
            <select class="inputbox" >
              <option>单选</option>
              <option value=''>多选</option>
            </select>
          </div>

          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="1天"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="2天"  autocomplete="on" >
              </div>
            </form>
            <form class="grey">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="3天"  autocomplete="on" >
              </div>
            </form>
            <br/>
          </div>
        </div>
      </div>
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
            <label class="longname">节点状态：</label>
            <select class="longinput" >
              <option>已提交</option>
              <option value=''>等待</option>
              <option value=''>已完成</option>
            </select>
          </div>
          <div class="item">
            <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value="KKY" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="" autocomplete="on" >
          </div>

          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <div class="item">
            <label class="longname">配置项值选项</label>
            <select class="inputbox" >
              <option>单选</option>
              <option value=''>多选</option>
            </select>
          </div>

          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="等待"  autocomplete="on" >
              </div>
            </form>
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="已完成"  autocomplete="on" >
              </div>
            </form>
            
            <br/>
          </div>
        </div>
      </div>
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
            <label class="longname">是否可以撤回：</label>
            <select class="longinput" >
              <option>是</option>
              <option value=''>否</option>
            </select>
          </div>
          <div class="item">
            <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value="KKY" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="" autocomplete="on" >
          </div>

          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <div class="item">
            <label class="longname">配置项值选项</label>
            <select class="inputbox" >
              <option>单选</option>
              <option value=''>多选</option>
            </select>
          </div>

          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="是"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="否"  autocomplete="on" >
              </div>
            </form>
            
            <br/>
          </div>
        </div>
      </div>
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
            <label class="longname">关联的数据来源：</label>
            <select class="longinput" >
              <option>节点</option>
              <option value=''>数据库</option>
            </select>
          </div>
          <div class="item">
            <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  value="KKY" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="" autocomplete="on" >
          </div>

          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <div class="item">
            <label class="longname">配置项值选项</label>
            <select class="inputbox" >
              <option>单选</option>
              <option value=''>多选</option>
            </select>
          </div>

          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="节点"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="数据库"  autocomplete="on" >
              </div>
            </form>
            <br/>
          </div>
        </div>
      </div>
    </div>
    </div>
    <br/>
    <div class="bottom" >
      <router-link to="/bzprocess"  class="ok">确定</router-link>
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
            mySelf.multiple.originOptions = JSON.parse(res.body.data).result.pageList
          })
          mySelf.multiple.selectedList = [{"id":"1","name":"天猫商品发布"}]
        },
        multipleCallback: function(data){
          this.multiple.selectedList = data;
        },
        showActiviti:function(){
          this.isshowActiviti = !this.isshowActiviti
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
</style>


