<template>

  <div class="regisiterpage">
    <div class="heads">
      页面模板基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
        <label class="nameid">模板名称: </label><input type="text" class="inputbox checkView"  value="商品发布" autocomplete="on" autofocus="autofocus">
        </div>

        <div class="item">
        <label class="nameid">模板描述: </label> <input type="text" class="inputbox checkView"  value="发布商品" autocomplete="on" >
        </div>
        <div class="item">
          <label class="smallname"> 模板KEY: </label> <input type="text" class="inputbox checkView"  value="13241" autocomplete="on" >
        </div>

        <div class="item">
        <label class="nameid">开发人员: </label> <input type="text" class="inputbox checkView"  value="xxx" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView"  value="2017-05-13"  autocomplete="on" >
        </div>


      </form>
    </div>

    <div class="heads">
      页面流程结点
    </div>
    <div class="yellow">
    <div class="items">
      <label class="longname">关联的流程结点:1，2</label>
        <select class="longinput checkView page-SelectList" >
      <option>一级流程（多选）</option>
      <option value=''>商品发布</option>
      </select>
      <select class="longinput checkView page-SelectList" >
        <option>二级流程（多选）</option>
        <option value=''>商品发布</option>
      </select>
      <select class="longinput checkView page-SelectList" >
        <option>二级流程结点（多选）</option>
        <option value=''>商品发布</option>
      </select>
        <select class="longinput checkView page-SelectList" >
          <option>角色列表（多选）</option>
          <option value=''>ID</option>
        </select>
    </div>
    </div>
    <div class="heads">
      关联的业务能力剖面
    </div>

      <form  class="yellow">
<div class="item-row">
  <div class="item">
        <label class="smallname">模块1</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
  </div>
        <div class="item">
        <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121" autocomplete="on" >
        </div>
        <div class="item">
        <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121" autocomplete="on" >
        </div>
        <div class="item">
        <label class="longname">关联的业务模板剖面：</label>
        <select class="inputbox checkView" >
          <option></option>
          <option value='acura'></option>
        </select>
        </div>
        1. 2.
        <br/>
        </div>
        <div class="item-row">
        <div class="item">
          <label class="smallname">模块1</label>
          <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="longname">关联的业务模板剖面：</label>
          <select class="inputbox checkView" >
            <option></option>
            <option value='acura'></option>
          </select>
        </div>
        1. 2.<br/>
        </div>
        <div class="item-row">
        <div class="item">
        <label class="smallname">模块1</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
      </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121" autocomplete="on" >
        </div>
        <div class="item">
          <label class="longname">关联的业务模板剖面：</label>

          <select class="inputbox checkView" >
            <option></option>
            <option value='acura'></option>
          </select>
        </div>
        1. 2.
        <br/>
        </div>
      </form>

    <div class="heads">
      前置条件
    </div>
    <div class="items">
      <div class="twocolor">
      <form class="grey">
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item">
        <label class="longname">信用等级大于几颗星：</label>
        <select class="longinput" >
          <option>前置条件库</option>
          <option value=''></option>
        </select>
        </div>
      <div class="item">
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="Star" autocomplete="on" autofocus="autofocus">
      </div>
        <div class="item">
        <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="121"  autocomplete="on" >
        </div>

        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
        <div class="items2">
          <div class="item">
          <label class="longname">配置项值选项</label>
          <select class="inputbox" >
            <option>多选</option>
            <option value=''></option>
          </select>
          </div>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
          <form class="grey">
            <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">

            <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="1" autocomplete="on" autofocus="autofocus">
          </div>
            <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="一颗星" autocomplete="on" >
            </div>

          </form>
            <br/>
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"  autocomplete="on" autofocus="autofocus">
          </div>
              <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="两颗星" autocomplete="on" >
              </div>

            </form>
            <br/>
          </div>
        </div>
      </div>
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

      <div class="item">
          <label class="longname">是否良心卖家：</label>
          <select class="longinput" >
            <option>前置条件库</option>
            <option value=''></option>
          </select>
      </div>
          <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="KKY" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder=""  autocomplete="on" >
          </div>

          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">

        <div class="item">
          <label class="longname">配置项值选项</label>
          <select class="inputbox" >
            <option>单选</option>
            <option value=''></option>
          </select>
        </div>


          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="1"  autocomplete="on" autofocus="autofocus">
          </div>
              <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="是" autocomplete="on" >
              </div>

            </form>
            <br/>
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2" autocomplete="on" autofocus="autofocus">
          </div>
              <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="否"  autocomplete="on" >
              </div>

            </form>
            <br/>
          </div>
        </div>

      </div>
    </div>
  <br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>

</template>

<style>
@import "../assets/css/edit.css";
.page-SelectList{
  border-style:none;
    appearance:none;
    display: inline-block;
}
</style>
