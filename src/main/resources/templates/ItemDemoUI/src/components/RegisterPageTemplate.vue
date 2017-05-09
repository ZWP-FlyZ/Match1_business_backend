<template>

  <div class="regisitertemplate">
    <div class="heads">
      页面模板基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <label class="nameid">模板名称: </label><input type="text" class="inputbox"  placeholder="商品发布"
                     autocomplete="on" autofocus="autofocus">
        <label class="nameid">模板描述: </label> <input type="text" class="inputbox"  placeholder="121"
                           autocomplete="on" >
        <label class="nameid"> KEY: </label> <input type="text" class="inputbox"  placeholder="121"
                      autocomplete="on" >
        <br/>
        <label class="nameid">开发日期: </label><input type="text" class="inputbox"  placeholder="121"
                      autocomplete="on" >
        <label class="nameid">开发者: </label> </label><input type="text" class="inputbox"  placeholder="121"
                      autocomplete="on" >
      </form>
    </div>

    <div class="heads">
      页面流程结点
    </div>
    <div class="yellow">
      关联的流程结点：1，2
        <select class="inputbox" >
      <option>一级流程（多选）</option>
      <option value='acura'>商品发布</option>
      </select>
      <select class="inputbox" >
        <option>二级流程（多选）</option>
        <option value='acura'>商品发布</option>
      </select>
      <select class="inputbox" >
        <option>二级流程结点（多选）</option>
        <option value='acura'>商品发布</option>
      </select>
        <select class="inputbox" >
          <option>角色列表（多选）</option>
          <option value='acura'>ID</option>
        </select>
    </div>
    <div class="heads">
      关联的业务能力剖面
    </div>

  </div>

</template>

<style>

  .regisitertemplate{
    position: relative;
    top:20px;
    font-size: 14px;
    padding:0;
    margin:0;
    height: 900px;
    width: 90%;
  }
  .heads{
    text-align: left;
    font: 14px/30px Arial, sans-serif;
    background:#F2F2F2;
    position: relative;
    text-decoration: none;
    width:100%;
    height: 30px;
    padding:  0px 20px ;

    margin-bottom: 10px;
  }
  .items{
    margin-bottom: 20px;
    display: flex;
    flex-direction:row;
    flex-wrap:wrap;
   left:30px;
  }
  .itemsform{
    position: relative;
    left:30px;
  }
  .nameid{
    display: inline-block;
    width:70px;
  }
  .inputbox{
    border: 1px solid #999999;
    width:100px;
    height: 20px;
    margin-right: 20px;
    margin-bottom: 10px;
  }
  .yellow{
    position: relative;
    left:30px;
    padding-top:10px;
    background: lightgoldenrodyellow;
    margin-bottom: 20px;
  }


</style>
