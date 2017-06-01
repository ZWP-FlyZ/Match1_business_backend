<template>
  <div class="regisiterpage">
    <div class="heads">
      业务能力基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
          <label class="nameid">业务能力名称: </label><input type="text" class="inputbox checkView"  placeholder="描述标题" autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="nameid">业务能力描述: </label> <input type="text" class="inputbox checkView"  placeholder="描述标题"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="smallname"> KEY: </label> <input type="text" class="inputbox checkView"  placeholder="xxx"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">应用方: </label> <input type="text" class="inputbox checkView"  placeholder="222"  autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView" value="2017-05-13" autocomplete="on" >
        </div>
      </form>
    </div>
    <div class="heads">
      关联能力
    </div>
    <div class="yellow">
      <div class="item-row">
        <label class="longname">关联的能力:</label>
        <select class="longinput" >
          <option>长度不超过30个汉字</option>
          <option value=''>敏感词过滤</option>
          <option value=''>标题堆砌检测</option>
        </select>
        1,2
      </div>
    </div>
    <div class="heads">
     业务能力剖面
    </div>
    <div class="twocolor">
      <form class="grey">
        <router-link to="/bzprocess"><img src="../../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item">
          <label class="longname">描述标题--采集剖面</label>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="Star"  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
        </div>
        关联的页面模板
        <select class="longinput" >
          <option>天猫一口价填写商品信息页面模板</option>
          <option>淘宝一口价填写商品信息页面模板</option>
          <option value=''></option>
        </select>
        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
      <div class="items2">
        <div class="item">
          <label class="longname">配置项值选项</label>
          <select class="inputbox checkView" >
            <option>多选</option>
            <option value=''></option>
          </select>
        </div>
        <a href="#" class="rightaddbottom">添加值选项</a>
        <div class="items3">
          <form class="grey">
            <router-link to="/bzprocess"><img src="../../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

            <div class="item">

              <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  placeholder="1"  autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  placeholder="长度不超过30个汉字"  autocomplete="on" >
            </div>

          </form>
          <br/>
          <form class="grey">
            <router-link to="/bzprocess"><img src="../../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

            <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  placeholder="2"  autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  placeholder="敏感词汇过滤"  autocomplete="on" >
            </div>

          </form>
          <br/>
        </div>
      </div>
    </div>

    <div class="twocolor">
      <form class="grey">
        <router-link to="/bzprocess"><img src="../../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

        <div class="item">
          <label class="longname">描述标题-呈现剖面：</label>
        </div>
        <div class="item">
          <label class="smallname">KEY: </label><input type="text" class="smallinput checkView"  placeholder="KKY"  autocomplete="on" autofocus="autofocus">
        </div>
        <div class="item">
          <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  placeholder="" autocomplete="on" >
        </div>
        关联的页面模板
        <select class="longinput checkView" >
            <option>关联的页面模板</option>
            <option value=''></option>
          </select>
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
            <router-link to="/bzprocess"><img src="../../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

            <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  placeholder="1" autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  placeholder="字体大小" autocomplete="on" >
            </div>

          </form>
          <br/>
          <form class="grey">
            <router-link to="/bzprocess"><img src="../../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

            <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  placeholder="2"  autocomplete="on" autofocus="autofocus">
            </div>
            <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  placeholder="字体颜色"  autocomplete="on" >
            </div>

          </form>
          <br/>
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
  @import "../../assets/css/edit.css";
</style>
