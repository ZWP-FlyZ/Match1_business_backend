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
                      autocomplete="on" ><br/>
        <label class="nameid">开发日期: </label> <input type="text" class="inputbox"  placeholder="121"
                      autocomplete="on" >
        <label class="nameid">开发者: </label> </label><input type="text" class="inputbox"  placeholder="121"
                      autocomplete="on" >
      </form>
    </div>

    <div class="heads">
      页面流程结点
    </div>
    <div class="drawb">
      关联的流程结点：1，2
      <div class="s">
        <select name='make'>

          <option>Make</option>
          <option value='acura'>Acura</option>
          <option value='chrysler' selected>Chrysler</option>
          <option value='dodge'>Dodge</option>
          <option value='ford'>Ford</option>
          <option value='toyota'>Toyota</option>
          <option value='derp'>A really long name for testing</option>
        </select>
      </div>

    </div>

  </div>

</template>

<style>

  .regisitertemplate{
    position: absolute;
    top:200px;
    font-size: 14px;
    padding:0;
    margin:0;
  }
  .heads{
    text-align: left;
    font: 15px/25px Arial, sans-serif;
    background:#F2F2F2;
    position: relative;
    text-decoration: none;
    width:100%;
    height: 30px;
    padding: 8px 20px;
    margin-bottom: 20px;
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
    left:10px;
  }
  .nameid{
    display: inline-block;
    width:70px;
  }
  .inputbox{
    border: 1px solid #f0f0f0;
    width:100px;
    height: 30px;
    margin-right: 30px;
    margin-bottom: 10px;
  }


</style>
