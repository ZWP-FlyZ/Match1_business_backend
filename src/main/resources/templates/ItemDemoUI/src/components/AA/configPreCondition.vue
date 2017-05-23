
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
          <label class="nameid">流程名称：</label><input type="text" class="inputbox checkView"  value ="弱管控商品发布"  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">流程KEY： </label> <input type="text" class="inputbox checkView"  placeholder="121" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程节点数：</label> <input type="text" class="inputbox checkView"  placeholder="2" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">流程描述： </label><input type="text" class="inputbox checkView"  value = "发布商品" autocomplete="on" >
        </div>
       
        <div class="item">
          <label class="nameid"> 流程分类： </label>

          <select class="inputbox SelectList" disabled="disabled">
            <option >二级流程</option>
            <option value='' >商品发布</option>
          </select>
        </div>
        <div class="item">
          <label class="nameid">开发人员： </label> <input type="text" class="inputbox checkView"  value="xxx" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期： </label> <input type="date" class="inputbox checkView"  value="2017-05-13" autocomplete="on" >
        </div>
      </form>
    </div>
   
    <div class = "heads">
      <div class = "condition">外部前置条件</div>
      <!-- 自定义样式select框开始 -->
      <div class = "condition-select">
        <ul id="myUl" class="condition-in-out inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select-out" @click="change($event)"><div><b class = "normal-b">前置条件库</b><img src="/static/img/glyphicons-368-expand.png" alt=""></div></li>
          <li value="1" class="liHide"><div><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b class = "normal-b">目标节点时限</b></div></li>
          <li value = "2" class="liHide"><div><input type="checkbox" class="input_check" id="check2"><label for="check2"></label><b class = "normal-b">商家信用等级</b></div></li>
          <li value="3" class="liHide"><div><input type="checkbox" class="input_check" id="check3"><label for="check3"></label><b class = "normal-b">开店时间</b></div></li>
          <li value="4" class="liHide"><div><input type="checkbox" class="input_check" id="check4"><label for="check4"></label><b class = "normal-b">转化率</b></div></li>
          <li value="5" class="liHide"><div><input type="checkbox" class="input_check" id="check5"><label for="check5"></label><b class = "normal-b">违规记录</b></div></li>
          <li value="6" class="liHide"><div><input type="checkbox" class="input_check" id="check6"><label for="check6"></label><b class = "normal-b">销售记录</b></div></li>
          <li value="7" class="liHide"><div><input type="checkbox" class="input_check" id="check7"><label for="check7"></label><b class = "normal-b">是否是良心卖家</b></div></li>
          <li value="8" class="liHide"><div><input type="checkbox" class="input_check" id="check8"><label for="check8"></label><b class = "normal-b">七天无理由退货</b></div></li>
          <li value="9" class="liHide"><div><input type="checkbox" class="input_check" id="check9"><label for="check9"></label><b class = "normal-b">商家信用等级规则</b></div></li>
          <li value="10" class="liHide"><div><input type="checkbox" class="input_check" id="check10"><label for="check10"></label><b class = "normal-b">知名品牌高危质检</b></div></li>
          <li value="11" class="liHide"><div><input type="checkbox" class="input_check" id="check11"><label for="check11"></label><b class = "normal-b">活动时间类型</b></div></li>
           <li value="12" class="liHide"><div><input type="checkbox" class="input_check" id="check12"><label for="check12"></label><b class = "normal-b">冲突管理规则</b></div></li>
        </ul>
      </div>
      <!-- 自定义样式select框结束 -->
    </div>
    <div class="twocolor">
    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        目标节点时限
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        是否第一次进入该节点
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = "" autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        商家信用等级
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        开店时间
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        转化率
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        违规记录
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
      销售记录
      </div>
      <div class="item ">
        <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"    value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"    value = "" autocomplete="on" autofocus="autofocus">
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        是否是良心卖家
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>
    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        七天无理由退货
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>
    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        置顶入选规则
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = " " autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>
    </form>

  </div>

    <br/>
    <br/>
    <div class = "heads">
      <div class = "condition">内部前置条件</div>
      <div class = "condition-select">
        <ul id="myUl1" class="condition-in-out inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select-in" @click="change($event)"><div><b class = "normal-b">前置条件库</b><img src="/static/img/glyphicons-368-expand.png" alt=""></div></li>
          <li value="221" class="liHide"><div><input type="checkbox" class="input_check" id="check221"><label for="check221"></label><b class = "normal-b">商家信用等级规则</b></div></li>
          <li value = "222" class="liHide"><div><input type="checkbox" class="input_check" id="check222"><label for="check222"></label><b class = "normal-b">开店时间</b></div></li>
          <li value="223" class="liHide"><div><input type="checkbox" class="input_check" id="check223"><label for="check223"></label><b class = "normal-b">转化率</b></div></li>
          <li value="224" class="liHide"><div><input type="checkbox" class="input_check" id="check224"><label for="check224"></label><b class = "normal-b">消保协议</b></div></li>
          <li value="225" class="liHide"><div><input type="checkbox" class="input_check" id="check225"><label for="check225"></label><b class = "normal-b">违规记录</b></div></li>
          <li value="226" class="liHide"><div><input type="checkbox" class="input_check" id="check226"><label for="check226"></label><b class = "normal-b">销售记录</b></div></li>
          <li value="227" class="liHide"><div><input type="checkbox" class="input_check" id="check227"><label for="check227"></label><b class = "normal-b">是否是良心卖家</b></div></li>
          <li value="228" class="liHide"><div><input type="checkbox" class="input_check" id="check228"><label for="check228"></label><b class = "normal-b">七天无理由退货</b></div></li>
          <li value="229" class="liHide"><div><input type="checkbox" class="input_check" id="check229"><label for="check229"></label><b class = "normal-b">退货率</b></div></li>
          <li value="2210" class="liHide"><div><input type="checkbox" class="input_check" id="check2210"><label for="check2210"></label><b class = "normal-b">评论数</b></div></li>
          <li value="2211" class="liHide"><div><input type="checkbox" class="input_check" id="check2211"><label for="check2211"></label><b class = "normal-b">发货速度</b></div></li>
          <li value="2212" class="liHide"><div><input type="checkbox" class="input_check" id="check2212"><label for="check2212"></label><b class = "normal-b">特定类目规则</b></div></li>
          <li value="2212" class="liHide"><div><input type="checkbox" class="input_check" id="check2212"><label for="check2212"></label><b class = "normal-b">产品信息</b></div></li>
          <li value="2212" class="liHide"><div><input type="checkbox" class="input_check" id="check2212"><label for="check2212"></label><b class = "normal-b">详细描述</b></div></li>
        </ul>
      </div> 
    </div>
    <div class="twocolor">
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          商家信用等级规则
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"   value = " "  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"   value="" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          销售记录
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"   value = " "  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"   value="" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          产品信息
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"   value = " "  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"   value="" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          价格库存物流
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"   value = " "  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"   value="" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          特定类目规则
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"   value = " "  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"   value="" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
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
    <br/><br/><br/>
    <div class="bottom" >
      <router-link to="/bzprocess"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>
</template>
<style>
  .checkView{
    border-style:none;
    color: #878787;
  }
  .SelectList{
    border-style:none;
    appearance:none;
  }
  .condition{
    width:13%;
    float: left;
  }
  .condition-factory{/*下拉框所在ul的样式和宽度*/
    float: left;
    margin-top: 2px;
    width: 30%;
  }
  .condition-name{ width: 10%;}
  .condition-in-out {list-style-type:none;}
  .condition-in-out li{width:60%;position: relative;z-index: 100;}
  .liMenu img{float:right;margin-right: 16px;margin-top:10px;}/*下拉框图标png*/
  .condition-select .inputbox{border:0px;}
  #liMenu-select-in,#liMenu-select-out{/*select外边框*/
   position: relative;
    top:-6px;
    height: 30px;
    background: #fff;
  }
 
  .normal-b{font-weight:normal;margin-left: 20px;position:relative;top:-1px;}/*下拉框选项文字*/
  .liShow{display:block;background:#fff;z-index: 100;position: relative;top:-6px;}/*下拉列表背景色*/
  .liHide{display:none;background:blue;}/*#myUl{margin: 20px auto;}*/
  .condition-in-out .input_check {position: absolute;visibility: hidden;}
  .condition-in-out .input_check+label {/*复选框按钮样式*/
    display: inline-block;
    width: 13px;
    height: 13px;
    border: 2px solid #b6d7a8;
    border-radius: 3px;
    position: relative;
    top:3px;
    left: 10px;
    z-index: 101;
  }
  .condition-in-out  .input_check:checked+label:after {/*选中后的对勾样式*/
    content: "";
    position: absolute;
    left: 1px;
    bottom: 3px;
    width: 9px;
    height: 4px;
    border: 3px solid #b6d7a8;
    border-top-color: transparent;
    border-right-color: transparent;
    -ms-transform: rotate(-60deg); 
    -moz-transform: rotate(-60deg); 
    -webkit-transform: rotate(-60deg); 
    transform: rotate(-45deg);
  } 
</style>
<script>
    export default{
      data(){
        return {
          nextState:1
        }
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
        }
      }
    }   
  </script>


