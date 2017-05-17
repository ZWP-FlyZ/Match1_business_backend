
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
          <label class="nameid">开发日期: </label> <input type="date" class="inputbox checkView"  value="2017-05-13"  autocomplete="on" >
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
        <div class="item">
          <!-- <label class="longname">参与角色：</label> -->
          <select class="longinput" >
            <option>目标节点时限</option>
            <option value=''>是否第一次进入该节点</option>
            <option value=''>商家信用等级</option>
            <option value=''>开店时间 </option>
            <option value=''>转化率</option>
            <option value=''>违规记录</option>
            <option value=''>销售记录</option>
            <option value=''>是否是良心卖家</option>
            <option value=''>七天无理由退货</option>
            <option value=''>商家信用等级规则</option>
            <option value=''>知名品牌高危质检</option>
            <option value=''>活动时间类型</option>
            <option value=''>冲突管理规则</option>
          </select>
        </div>
    </div>
    <div class="twocolor">
      <form class="grey grey-option">
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
      <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
        <div class="item">
            <select class="longinput" >
              <option>商家信用等级规则</option>
              <option value=''>开店时间</option>
              <option value=''>转化率</option>
              <option value=''>违规记录</option>
              <option value=''>销售记录</option>
              <option value=''>是否是良心卖家</option>
              <option value=''>七天无理由退货</option>
              <option value=''>消保协议</option>
              <option value=''>退货率</option>
              <option value=''>评论数</option>
              <option value=''>发货速度</option>
              <option value=''>特定类目规则</option>
              <option value=''>产品信息</option>
              <option value=''>详细描述</option>
            </select>
          </div>
    </div>
    <div class="twocolor">
      <form class="grey grey-option">
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1"  autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="人工1" autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1"  autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="审核方1" autocomplete="on" >
              </div>
            </form>
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
          <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="可写"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="读写"  autocomplete="on" >
              </div>
            </form>
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
          <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="1天"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="2" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="2天"  autocomplete="on" >
              </div>
            </form>
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
          <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="等待"  autocomplete="on" >
              </div>
            </form>
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
          <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="是"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
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
      <div class="twocolor">
        <form class="grey">
          <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

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
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
              <div class="item">
                <label class="smallname">KEY: </label><input type="text" class="inputbox checkView"  value="1" autocomplete="on" autofocus="autofocus">
              </div>
              <div class="item">
                <label class="smallname">名称: </label> <input type="text" class="inputbox checkView"  value="节点"  autocomplete="on" >
              </div>
            </form>
            <!-- <br/> -->
            <form class="grey grey-option">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
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
<style>
  .SelectList{
    border-style:none;
    appearance:none;
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

