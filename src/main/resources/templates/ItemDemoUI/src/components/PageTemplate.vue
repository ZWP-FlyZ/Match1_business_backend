<template>
  <div class="center">
  <div class="template-page">

    <div class="template-head">
      <div class="head-left">页面模板</div>
      <router-link to="/registerPageTemplate"  class="head-creat">创建页面模板</router-link>
    </div>

    <table class="template-body" cellspacing=20>
      <tr>
        <td>

        <div class="one-container" >
          <a href="#" class="titem-name">页面模板名称：天猫商品发布页面</a>
          <div class="template-edit">
            <div class="template-view">
              <img src="" class="template-img">
            </div>
            <div class="bottoms">
              <router-link to="/registerPageTemplate" class="bottom-item">配置</router-link>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <bottom class="delete" >删除</bottom>
            </div>
          </div>
        </div>

        </td>
          <td>
        <div class="one-container">
          <a href="#" class="titem-name">页面模板名称：天猫商品发布页面</a>
          <div class="template-edit">
            <div class="template-view">
              <img src="" class="template-img">
            </div>
            <div class="bottoms">
              <a href="#" class="bottom-item">配置</a>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <bottom class="delete" >删除</bottom>
            </div>
          </div>
        </div>
    </td>

      </tr>
    <tr>
<td>
        <div class="one-container">
          <a href="#" class="titem-name">页面模板名称：天猫商品发布页面</a>
          <div class="template-edit">
            <div class="template-view">
              <img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" class="template-img">
            </div>
            <div class="bottoms">
              <a href="#" class="bottom-item">配置</a>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <bottom class="delete" >删除</bottom>
            </div>
          </div>
        </div>
</td>
      <td>
        <div class="one-container">
          <a href="#" class="titem-name">页面模板名称：天猫商品发布页面</a>
          <div class="template-edit">
            <div class="template-view">
              <img src="" class="template-img">
            </div>
            <div class="bottoms">
              <a href="#" class="bottom-item">配置</a>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <bottom class="delete" >删除</bottom>
            </div>
          </div>
        </div>

      </td>
    </tr>
    </table>


      <ul class="pagination">
        <li><a href="#">«</a></li>
        <li><a href="#">1</a></li>
        <li><a class="active" href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li><a href="#">6</a></li>
        <li><a href="#">7</a></li>
        <li><a href="#">»</a></li>
      </ul>


    </div>

  </div>
</template>

<style>

  .template-head{
    padding:0;
    margin:0;
    font: 15px/25px Arial, sans-serif;
    background:#F2F2F2;
    width:90%;
    height: 40px;
    display: inline-block;
    position: relative;
    text-decoration: none;
  }
  .head-left{
    float:left;

    position: relative;
    left: 40px;
    top:7px;
  }
  .head-creat{
    font-size: 14px;
    text-align: center;
    text-decoration: none;
    color: #ffffff;
    float:right;
    position: relative;
    top:5px;
    right: 40px;

    background: #357ebd;
    padding: 2px 10px;
    border-radius: 4px;
  }

  .head-creat:hover{
    color: black;
    text-decoration: none;
  }
  .template-body{
    display: inline-block;
    width: 90%;


  }

  .one-container{
    position: relative;
    width:250px;
    height:200px;
    border-style:solid;
    border-width:1px;
    border-color: #999999;
    margin: 10px 30px;

  }
  .one-container:hover{

    opacity: 1;
  }
  .titem-name{
    position: relative;

    top:5px;
    font-size:14px;
  }
  .bottoms{
    display: block;
    float: right;
    position: relative;
    right:10px;

  }
 .bottom-item{
   color: #ffffff;
   background-color: #428bca;
   border-color: #357ebd;
   text-align: center;
   text-decoration: none;

   float:right;
   position: relative;
   right: 5px;
   top:20px;
   left:20px;

   margin: 5px;
   padding: 2px 10px;
   border-radius: 4px;
 }
  .bottom-item:hover {
    text-decoration: none;
    color:black;
  }
  .delete{
    text-align: center;
    text-decoration: none;
    color: #fafafa;
    float:right;
    position: relative;
    right: 5px;
    left:20px;
    top:20px;
    background: grey;
    margin: 5px;
    padding: 2px 10px;
    border-radius: 25px;
  }
  .titem-name{
    color:black;
  }
  .titem-name:hover{
    color: blue;
    text-decoration: none;

  }
  .template-edit{
    width:250px;
    display: -webkit-flex;

  }
  .template-img {
    width: 140px;
    height: 150px;
    margin:15px 15px;
    background: #0186ba;
  }
  .center{
    text-align: center;

  }
  ul.pagination li {
    display: inline;}
  ul.pagination li a {
    border-radius: 5px;
    transition: background-color .3s;
  }

  ul.pagination li a.active {
    border-radius: 5px;
  }
</style>
