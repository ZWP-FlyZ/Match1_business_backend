
<style>
  @import "../assets/css/edit.css";

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
      <div>
        <!-- <select class="inputbox condition-factory">
          <option >前置条件库</option>
          <option value='' ></option>
        </select> -->
        <ul id="myUl" class="inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select" onclick="change(this);">前置条件库<img src="../assets/img/368-expand.png" alt=""></li>
          <li value="1" class="liHide"><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b>前置条件库</b></li>
          <!-- <li value="2" class="liHide"><input type="checkbox">2</li>
          <li value="3" class="liHide"><input type="checkbox">3</li> -->
          <li value="2" class="liHide"><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b>2</b></li>
          <li value="3" class="liHide"><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b>3</b></li>
        </ul>

      </div>
    </div>











    <div class="twocolor">
    <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
        卖家信用等级
      </div>
      <div class="item">
        <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value = "1" autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称：</label> <input type="text" class="inputbox checkView"   value ="两颗星" autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>

    </form>
      <form class="grey">
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
        产品认证
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"    value = "3" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"    value = "产品已认证" autocomplete="on" autofocus="autofocus">
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
    </div>

    <br/>
    <br/>
    <div class = "heads">
      <div class = "condition">内部前置条件</div>
      <div>
        <!-- <select class="inputbox condition-factory">
          <option >前置条件库</option>
          <option value='' ></option>
        </select> -->
        <ul id="myUl" class="inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select" onclick="change(this);">前置条件库<img src="../assets/img/368-expand.png" alt=""></li>
          <li value="1" class="liHide"><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b>前置条件库</b></li>
          <!-- <li value="2" class="liHide"><input type="checkbox">2</li>
          <li value="3" class="liHide"><input type="checkbox">3</li> -->
          <li value="2" class="liHide"><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b>2</b></li>
          <li value="3" class="liHide"><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b>3</b></li>
        </ul>
      </div>
     
    </div>
    <div class="twocolor">
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          审核方式
        </div>
        <div class="item">
          <label class="smallname">KEY： </label><input type="text" class="inputbox checkView"   value="2"  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称： </label> <input type="text" class="inputbox checkView"   value="审核方式" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>

      </form>
      <form class="grey">
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item condition-name">
          前置条件2
        </div>
        <div class="item">
          <label class="smallname">KEY：</label><input type="text" class="inputbox checkView"   value="4" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称：</label> <input type="text"  class="inputbox checkView"   value="类目" autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
    </div>
    <br/> <br/>
    
    <br/>
    <div class="bottom" >
      <router-link to="/bzprocess"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>

</template>
<style>
  .checkView{
    border-style:none;
    /*color: #7692C2;*/
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
  .condition-factory{
    float: left;
    margin-top: 2px;
  }
  .condition-name{
    width: 10%;
  }

  #myUl{list-style-type:none;}
  #myUl li{width:100px;position: relative;}
  .liMenu{border:solid #fd8845 1px;}/*select外边框*/
  .liMenu img{margin-left: 4px;margin-top: 4px;margin-left: 6px;}/*下拉框图标*/
  #liMenu-select{position: relative;top:-12px;}
  .liShow{display:block;background:while;}/*下拉列表背景色*/

  .liHide{display:none;background:blue;}
  /*#myUl{margin: 20px auto;}*/
  
  #myUl .input_check {position: absolute;visibility: hidden;}
  #myUl .input_check+label {display: inline-block;width: 16px;height: 16px;border: 1px solid #fd8845;border-radius: 3px;margin-top: 5px;}
  #myUl .input_check:checked+label:after {content: "";position: absolute;left: 2px;bottom: 12px;width: 9px;height: 4px;
  border: 2px solid #fd8845;border-top-color: transparent;border-right-color: transparent;
  -ms-transform: rotate(-60deg); 
  -moz-transform: rotate(-60deg); 
  -webkit-transform: rotate(-60deg); 
  transform: rotate(-45deg);} 
  #myul b{font-weight:normal;margin-left: 10px;position:relative;top:-4px;}

</style>
<script>

    var nextState=1;

    function change(obj){

    var liArray=document.getElementsByTagName("LI");

    var i=1;

    var length=liArray.length;

    switch(nextState){

    case 1:

       // obj.innerHTML="当前选择↑";
      document.getElementById("liMenu-select").innerHTML="当前选择" + '<img src="../assets/img/370-collapse-top.png" alt="">';

      for(;i<length;i++){

      liArray[i].className="liShow";

      }

      nextState=0;

    break;

    case 0:

      document.getElementById("liMenu-select").innerHTML="当前选择" + '<img src="../assets/img/368-expand.png" alt="">';

      for(;i<length;i++){

      liArray[i].className="liHide";

      }

      nextState=1;

      }

      }
  </script>


