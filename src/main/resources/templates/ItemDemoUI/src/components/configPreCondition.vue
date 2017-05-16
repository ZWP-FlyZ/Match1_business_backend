
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
        <select class="inputbox condition-factory">
          <option >前置条件库</option>
          <option value='' ></option>
        </select>
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
        <select class="inputbox condition-factory">
          <option >前置条件库</option>
          <option value='' ></option>
        </select>
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
</style>


