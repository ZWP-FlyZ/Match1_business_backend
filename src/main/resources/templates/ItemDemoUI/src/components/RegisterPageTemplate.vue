<template>

  <div class="regisiterpage">
    <div class="heads">
      页面模板基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <label class="nameid">模板名称: </label><input type="text" class="inputbox"  placeholder="商品发布"
                     autocomplete="on" autofocus="autofocus">
        <label class="nameid">模板描述: </label> <input type="text" class="inputbox"  placeholder="121"
                           autocomplete="on" >
        <label class="nameid"> KEY: </label> <input type="text" class="inputbox"  placeholder="xingfei"
                      autocomplete="on" >
        <br/>
        <label class="nameid">开发日期: </label><input type="text" class="inputbox"  placeholder="2017-11-23"
                      autocomplete="on" >
        <label class="nameid">开发者: </label> <input type="text" class="inputbox"  placeholder="222"
                      autocomplete="on" >
      </form>
    </div>

    <div class="heads">
      页面流程结点
    </div>
    <div class="yellow">
      <label class="longname">关联的流程结点：1，2</label>
        <select class="inputbox" >
      <option>一级流程（多选）</option>
      <option value=''>商品发布</option>
      </select>
      <select class="inputbox" >
        <option>二级流程（多选）</option>
        <option value=''>商品发布</option>
      </select>
      <select class="inputbox" >
        <option>二级流程结点（多选）</option>
        <option value=''>商品发布</option>
      </select>
        <select class="inputbox" >
          <option>角色列表（多选）</option>
          <option value=''>ID</option>
        </select>
    </div>
    <div class="heads">
      关联的业务能力剖面
    </div>
    <div class="items">
      <form  class="yellow">
        <label class="nameid">模块1</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder=""
                                                   autocomplete="on" autofocus="autofocus">

        <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"
                                                    autocomplete="on" >

        <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"
                                                    autocomplete="on" >
        <label class="longname">关联的业务模板剖面：</label>
        <select class="inputbox" >

          <option></option>
          <option value='acura'></option>
        </select>
        1. 2.
        <br/>
        <label class="nameid">模块2</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder=""
                                                     autocomplete="on" autofocus="autofocus">

        <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"
                                                     autocomplete="on" >

        <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"
                                                       autocomplete="on" >
        <label class="longname">关联的业务模板剖面：</label>
        <select class="inputbox" >

          <option></option>
          <option value=''></option>
        </select>
        1. 2.
        <br/>
        <label class="nameid">模块3</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder=""
                                                     autocomplete="on" autofocus="autofocus">

        <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"
                                                     autocomplete="on" >

        <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"
                                                       autocomplete="on" >
        <label class="longname">关联的业务模板剖面：</label>
        <select class="inputbox" >

          <option></option>
          <option value=''></option>
        </select>
        1. 2.
        <br/>
      </form>
    </div>
    <div class="heads">
      前置条件
    </div>
    <div class="items">
      <div class="twocolor">
      <form class="grey">
        <a href="#" class="close">×</a>
        <label class="longname">信用等级大于几颗星：</label>
        <select class="inputbox" >
          <option>前置条件库</option>
          <option value=''></option>
        </select>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="Star"
                                                     autocomplete="on" autofocus="autofocus">
        <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"
                                                     autocomplete="on" >
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
        <div class="items2">
          <label class="longname">配置项值选项</label>
          <select class="inputbox" >
            <option>多选</option>
            <option value=''></option>
          </select>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
          <form class="grey">
            <a href="#" class="close">×</a>

            <label class="nameid">KEY: </label><input type="text" class="inputbox"  placeholder="1"
                                                      autocomplete="on" autofocus="autofocus">
            <label class="nameid">名称: </label> <input type="text" class="inputbox"  placeholder="一颗星"
                                                      autocomplete="on" >
          </form>
            <br/>
            <form class="grey">
              <a href="#" class="close">×</a>

              <label class="nameid">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                        autocomplete="on" autofocus="autofocus">
              <label class="nameid">名称: </label> <input type="text" class="inputbox"  placeholder="两颗星"
                                                        autocomplete="on" >
            </form>
            <br/>
          </div>
        </div>
      </div>
      <div class="twocolor">
        <form class="grey">
          <a href="#" class="close">×</a>
          <label class="longname">是否良心卖家：</label>
          <select class="inputbox" >
            <option>前置条件库</option>
            <option value=''></option>
          </select>
          <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="KKY"
                                                       autocomplete="on" autofocus="autofocus">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder=""
                                                       autocomplete="on" >
          <a href="#" class="addbottom">添加同类型配置项</a>
        </form>
        <div class="items2">
          <label class="longname">配置项值选项</label>
          <select class="inputbox" >
            <option>单选</option>
            <option value=''></option>
          </select>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey">
              <a href="#" class="close">×</a>

              <label class="nameid">KEY: </label><input type="text" class="inputbox"  placeholder="1"
                                                        autocomplete="on" autofocus="autofocus">
              <label class="nameid">名称: </label> <input type="text" class="inputbox"  placeholder="是"
                                                        autocomplete="on" >
            </form>
            <br/>
            <form class="grey">
              <a href="#" class="close">×</a>

              <label class="nameid">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                        autocomplete="on" autofocus="autofocus">
              <label class="nameid">名称: </label> <input type="text" class="inputbox"  placeholder="否"
                                                        autocomplete="on" >
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
</style>
