<template>
  <div class="regisiterpage">
    <div class="heads">
      业务能力基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">能力名称: </label><input type="text" class="inputbox"  placeholder="定价"
                                                       autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">能力描述: </label> <input type="text" class="inputbox"  placeholder="121"
                                                        autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> KEY: </label> <input type="text" class="inputbox"  placeholder="xingfei"
                                                         autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">存储位置: </label> <input type="text" class="inputbox"  placeholder="222"
                                                     autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发者: </label> <input type="text" class="inputbox"  placeholder="222"
                                                     autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox" value="2014-01-13"
                                                     autocomplete="on" >
        </div>
      </form>
    </div>
    <div class="heads">
      关联能力
    </div>
    <div class="yellow">
      <div class="item-row">
        <label class="longname">关联的业务能力:</label>
        <select class="longinput" >
          <option>业务能力1</option>
          <option value=''>能力2</option>
        </select>
        1,2
      </div>
    </div>
    <div class="heads">
      配置项
    </div>
    <div class="twocolor">
      <form class="grey">
        <a href="#" class="close">×</a>
        <div class="item">
          <label class="longname">信用等级大于几颗星：</label>
          <select class="longinput" >
            <option>前置条件库</option>
            <option value=''></option>
          </select>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="Star"
                                                       autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"

                                                       autocomplete="on" >
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
            <a href="#" class="close">×</a>

            <div class="item">

              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="1"
                                                           autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="一颗星"
                                                           autocomplete="on" >
            </div>

          </form>
          <br/>
          <form class="grey">
            <a href="#" class="close">×</a>

            <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                           autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="两颗星"
                                                           autocomplete="on" >
            </div>

          </form>
          <br/>
        </div>
      </div>
    </div>
    <div class="twocolor">
      <form class="grey">
        <a href="#" class="close">×</a>

        <div class="item">
          <label class="longname">是否良心卖家：</label>
          <select class="longinput" >
            <option>前置条件库</option>
            <option value=''></option>
          </select>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="KKY"
                                                       autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder=""
                                                       autocomplete="on" >
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
            <a href="#" class="close">×</a>

            <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="1"
                                                           autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="是"
                                                           autocomplete="on" >
            </div>

          </form>
          <br/>
          <form class="grey">
            <a href="#" class="close">×</a>

            <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                           autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="否"
                                                           autocomplete="on" >
            </div>

          </form>
          <br/>
        </div>
      </div>
      <br/>
      <div class="bottom" >
        <router-link to="/pagetemplate"  class="ok">确定</router-link>
      </div>
      <br/>


    </div>
  </div>
</template>
<style>
  @import "../assets/css/edit.css";
</style>
