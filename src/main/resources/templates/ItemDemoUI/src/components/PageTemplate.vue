<template>
  <div class="center">
  <div class="template-page">

    <div class="template-head">
      <div class="head-left">页面模板</div>
      <router-link to="/RegisterPageTemplate.vue"  class="head-creat">创建页面模板</router-link>
    </div>

    <div class="template-body">

      <div class="four-container">
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

      </div>

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

  </div>
</template>

<style>

  .template-head{
    font: 15px/25px Arial, sans-serif;
    background:#dddddd;
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
    text-align: center;
    text-decoration: none;
    color: #fafafa;
    float:right;
    position: relative;
    right: 40px;
    top:5px;
    background: #04acec;
    padding: 2px 10px;
    border-radius: 25px;
  }

  .head-creat:hover{
    color: black;
    text-decoration: none;
  }
  .template-body{



  }
  .four-container{
    height:500px;
    justify-content:center;
    display: flex;
    flex-wrap:wrap;


  }
  .one-container{
    width:250px;
    height:200px;
    border-style:solid;
    border-width:1px;
    border-color: #999999;
    margin: 10px 15px;

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
   text-align: center;
   text-decoration: none;
   color: #fafafa;
   float:right;
   position: relative;
   right: 5px;
   top:20px;
   left:20px;
   background: #04acec;
   margin: 5px;
   padding: 2px 10px;
   border-radius: 25px;
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
