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
          <label class="nameid">流程名称: </label><input type="text" class="inputbox"  placeholder="弱管控商品发布"
                                                     autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">流程描述: </label><input type="text" class="inputbox"  placeholder=""
                                                     autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">KEY: </label> <input type="text" class="inputbox"  placeholder="121"
                                                     autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> 流程分类: </label>

          <select class="inputbox" >
            <option >二级流程</option>
            <option value='' >商品发布</option>
          </select>
        </div>
        <div class="item">
          <label class="nameid">流程节点数: </label> <input type="text" class="inputbox"  placeholder="2"
                                                     autocomplete="on" >
        </div>

        <div class="item">
          <label class="nameid">开发者: </label> <input type="text" class="inputbox"  placeholder="121"
                                                      autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label> <input type="date" class="inputbox"  value="2014-01-13"
                                                      autocomplete="on" >
        </div>
      </form>
    </div>
    <div class="heads">
      流程图形化表达
    </div>
    <div class="items">
    <div class="yellow-block" >
        <br/><br/><br/><br/>
      </div>
    </div>
    <div class="items">
      <div class="grey-block" >
        <br/><br/><br/><br/>
      </div>
    </div>

      <div class="heads">
        节点基本信息
      </div>
      <div class="items">
        <form  class="itemsform">
          <div class="item">
            <label class="nameid">节点名称: </label><input type="text" class="inputbox"  placeholder="审核"
                                                       autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item">
            <label class="nameid">节点功能描述: </label><input type="text" class="inputbox"  placeholder="审核"
                                                       autocomplete="on" >
          </div>

          <div class="item">
            <label class="nameid">KEY: </label> <input type="text" class="inputbox"  placeholder="121"
                                                       autocomplete="on" >
          </div>
        </form>
      </div>


    <div class="heads">
      流程分支节点前置条件
    </div>
    <div class="twocolor">
    <form class="grey">
      <a href="#" class="close">×</a>
      <div class="item">
        <label class="nameid"> 前置条件: </label>

        <select class="inputbox" >
          <option >前置条件库</option>
          <option value='' ></option>
        </select>
      </div>
      <div class="item">
        <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                     autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="两颗星"
                                                     autocomplete="on" >
      </div>
      <a href="#" class="addbottom">添加同类型配置项</a>

    </form>
      <form class="grey">
        <a href="#" class="close">×</a>
        <div class="item">
          <label class="nameid"> 前置条件: </label>

          <select class="inputbox" >
            <option >前置条件库</option>
            <option value='' ></option>
          </select>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                       autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder=""
                                                       autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
    </div>

    <br/>
    <br/>
    <div class="heads">
      页面模板前置条件
    </div>
    <div class="twocolor">
      <form class="grey">
        <a href="#" class="close">×</a>
        <div class="item">
          <label class="nameid"> 前置条件: </label>

          <select class="inputbox" >
            <option >前置条件库</option>
            <option value='' ></option>
          </select>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                       autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder=""
                                                       autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>

      </form>
      <form class="grey">
        <a href="#" class="close">×</a>
        <div class="item">
          <label class="nameid"> 前置条件: </label>

          <select class="inputbox" >
            <option >前置条件库</option>
            <option value='' ></option>
          </select>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"
                                                       autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder=""
                                                       autocomplete="on" >
        </div>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
    </div>
    <br/> <br/>
    <div class="heads">
      关联页面模板
    </div>
    <form  class="yellow">
      <div class="item">
        <label class="smallname">节点1</label>
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder=""
                                                     autocomplete="on" autofocus="autofocus">
      </div>
      <div class="item">
        <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"
                                                     autocomplete="on" >
      </div>
      <div class="item">
        <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"
                                                       autocomplete="on" >

        <label class="longname">关联的页面模板：</label>
        1，2，3
      </div>
    </form>
    <div class="heads">
      配置项
    </div>
    <div class="items">
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

      </div>
    </div>
    <br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>

</template>
