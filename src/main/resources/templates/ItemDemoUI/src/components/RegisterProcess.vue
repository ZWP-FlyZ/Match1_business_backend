
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
          <label class="nameid">开发日期: </label> <input type="date" class="inputbox checkView develop-date"  value="2017-05-13"  autocomplete="on" >
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
      <div>
        <ul id="myUl" class="inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select" onclick="change(this);">前置条件库<img src="../assets/img/glyphicons-368-expand.png" alt=""></li>
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
      <form class="grey grey-option">
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

  <!--   <br/>
    <br/> -->
    <div class = "heads">
      <div class = "condition">内部前置条件</div>
      <div>
        <ul id="myUl" class="inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select" onclick="change(this);">前置条件库<img src="../assets/img/glyphicons-368-expand.png" alt=""></li>
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
      <form class="grey grey-option">
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
        1，2，3
      </div>
    </form>
    <div class="heads">
      配置项
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
              <option value=''></option>
            </select>
          </div>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

              <div class="item">

                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1"  autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="一颗星" autocomplete="on" >
              </div>

            </form>
            <!-- <br/> -->
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="两颗星" autocomplete="on" >
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
              <option value=''></option>
            </select>
          </div>


          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="是"  autocomplete="on" >
              </div>

            </form>
            <!-- <br/> -->
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
    </div>
    <br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
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
  .develop-date{
    /*style:none;*/
    /*border:1px solid red;*/
    color:red;
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

