
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
        <img src="static/img/tbpublish.png" usemap="#processmap" alt="" />
        <map name="processmap" id="processmap">
        <area shape="circle" coords="102 159 15" href="http://www.baidu.com" />
        <area shape="rect" coords="138 134 194 191" href="http://www.google.com" />
        <area shape="rect" coords="138 134 194 191" href="http://www.google.com" />
        <area shape="rect" coords="237 141 276 182" href="http://www.google.com" />
        <area shape="rect" coords="315 100 399 143" href="http://www.google.com" />
        <area shape="rect" coords="317 171 394 225" href="http://www.google.com" />
        <area shape="rect" coords="434 178 509 221" href="http://www.google.com" />
        <area shape="rect" coords="552 180 591 219" href="http://www.google.com" />
        <area shape="rect" coords="627 168 693 219" href="http://www.google.com" />
        <area shape="rect" coords="711 178 748 218" href="http://www.google.com" />
        <area shape="rect" coords="626 31 702 82" href="http://www.google.com" />
        </map>
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
        <!-- 自定义样式select框开始 -->
      <div class = "condition-select">
        <ul id="myUl" class="condition-in-out inputbox condition-factory">
          <li class="liMenu" id = "liMenu-select-out" @click="change($event)"><div><b class = "normal-b">前置条件库</b><img src="/static/img/glyphicons-368-expand.png" alt=""></div></li>
          <li value="1" class="liHide"><div><input type="checkbox" class="input_check" id="check1"><label for="check1"></label><b class = "normal-b">目标节点时限</b></div></li>
          <li value = "2" class="liHide"><div><input type="checkbox" class="input_check" id="check2"><label for="check2"></label><b class = "normal-b">是否第一次进入该节点</b></div></li>
          <li value="3" class="liHide"><div><input type="checkbox" class="input_check" id="check3"><label for="check3"></label><b class = "normal-b">商家信用等级</b></div></li>
          <li value="4" class="liHide"><div><input type="checkbox" class="input_check" id="check4"><label for="check4"></label><b class = "normal-b">开店时间</b></div></li>
          <li value="5" class="liHide"><div><input type="checkbox" class="input_check" id="check5"><label for="check5"></label><b class = "normal-b">转化率</b></div></li>
          <li value="6" class="liHide"><div><input type="checkbox" class="input_check" id="check6"><label for="check6"></label><b class = "normal-b">违规记录</b></div></li>
          <li value="7" class="liHide"><div><input type="checkbox" class="input_check" id="check7"><label for="check7"></label><b class = "normal-b">销售记录</b></div></li>
          <li value="8" class="liHide"><div><input type="checkbox" class="input_check" id="check8"><label for="check8"></label><b class = "normal-b">是否是良心卖家</b></div></li>
          <li value="9" class="liHide"><div><input type="checkbox" class="input_check" id="check9"><label for="check9"></label><b class = "normal-b">七天无理由退货</b></div></li>
          <li value="10" class="liHide"><div><input type="checkbox" class="input_check" id="check10"><label for="check10"></label><b class = "normal-b">商家信用等级规则</b></div></li>
          <li value="11" class="liHide"><div><input type="checkbox" class="input_check" id="check11"><label for="check11"></label><b class = "normal-b">知名品牌高危质检</b></div></li>
           <li value="12" class="liHide"><div><input type="checkbox" class="input_check" id="check12"><label for="check12"></label><b class = "normal-b">冲突管理规则</b></div></li>
        </ul>
      </div>
      <!-- 自定义样式select框结束 -->
      <router-link to="/bBAddPreCondition" class = "link-btn link-btn-blue">添加前置条件</router-link>

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

    <form class="grey">
      <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
      <div class="item condition-name">
      销售记录
      </div>
      <div class="item">
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
      <router-link to="/bBAddPreCondition" class = "link-btn link-btn-blue">添加前置条件</router-link> 


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
      <form class="grey grey-option">
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
      <router-link to="/BBAddPageTemplate" class = "link-btn link-btn-blue multi-delete">添加模板</router-link>

      </div>
        
    </form>
    <div class="heads">
      配置项<router-link to="/BBAddConfigure" class = "link-btn link-btn-blue multi-delete">添加配置项</router-link>
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
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1"  autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="审核方1" autocomplete="on" >
              </div>
            </form>
            <form class="grey">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="机审1" autocomplete="on" >
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
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="可写"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="/static/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="读写"  autocomplete="on" >
              </div>
            </form>
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
    <br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>

</template>
<script>
    import MutipleSelectDelete from "../AA/MutipleSelectDelete"
    // import Delete from "../Delete"
    // import IMask from "../Mask"
    export default{
      data(){
        return {
          nextState:1,
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
        toggleShow:function(){

        }
      }
    }   
  </script>
<style>
  
  .grey-option{
    margin-bottom: 20px;
  }
  .multi-delete{border:1px solid green;margin-left: 480px;}
</style>


