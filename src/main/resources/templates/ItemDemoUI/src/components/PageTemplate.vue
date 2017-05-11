<template>

  <div class="template-page">
    <p class="template-total" >页面模板定制总数：12</p>
    <div class="template-center">
    <div class="template-head">
      <div class="head-left">页面模板</div>
      <router-link to="/registerPageTemplate"  class="head-creat">创建页面模板</router-link>
    </div>


      <div class="template-body">
        <div class="one-container" >
          <router-link to="/registerPageTemplate" class="titem-name">页面模板名称：天猫商品发布页面</router-link>
          <div class="template-edit">
            <div class="template-view">
              <img src="" class="template-img">
            </div>
            <div class="bottoms">
              <router-link to="/registerPageTemplate" class="bottom-item">配置</router-link>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <a class="delete" >删除</a>
            </div>
          </div>
        </div>
        <div class="one-container">
          <router-link to="/registerPageTemplate" class="titem-name">页面模板名称：天猫商品发布页面</router-link>
          <div class="template-edit">
            <div class="template-view">
              <img src="" class="template-img">
            </div>
            <div class="bottoms">
              <a href="#" class="bottom-item">配置</a>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <a class="delete" >删除</a>
            </div>
          </div>
        </div>
        <div class="one-container">
          <router-link to="/registerPageTemplate" class="titem-name">页面模板名称：天猫商品发布页面</router-link>
          <div class="template-edit">
            <div class="template-view">
              <img src="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png" class="template-img">
            </div>
            <div class="bottoms">
              <a href="#" class="bottom-item">配置</a>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <a class="delete" >删除</a>
            </div>
          </div>
        </div>
        <div class="one-container">
          <router-link to="/registerPageTemplate" class="titem-name">页面模板名称：天猫商品发布页面</router-link>
          <div class="template-edit">
            <div class="template-view">
              <img src="" class="template-img">
            </div>
            <div class="bottoms">
              <a href="#" class="bottom-item">配置</a>
              <br/>
              <a href="#" class="bottom-item">查看</a>
              <br/>
              <a class="delete" >删除</a>
            </div>
          </div>
        </div>
        <br/>
        <br/>
      </div>


      <ul class="pagination">
        <li><a href="#">?</a></li>
        <li><a href="#" class="active">1</a></li>
        <li><a  href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li><a href="#">6</a></li>
        <li><a href="#">7</a></li>
        <li><a href="#">?</a></li>
      </ul>

      <br/>  <br/>

</div>

  </div>
</template>

<style>
 .template-total{
  margin-bottom: 30px;
 }
  .template-head{
    font: 15px Arial, sans-serif;
    background:#F2F2F2;
    width:100%;
    height: 45px;
    position: relative;
    text-decoration: none;

  }
  .head-left{
    float:left;
    position: relative;
    padding-left: 10%;
   top:8px;
    font-size: 15px;

  }
  .head-creat{
    font-size: 15px;
    text-align: center;
    text-decoration: none;
    color: #ffffff;
    float:right;
    position: relative;
    top:5px;
    right:15%;
    background: #428bca;
    padding: 6px 12px;
    border-radius: 5px;
  }

  .head-creat:hover{
    color: black;
    text-decoration: none;
  }

 .template-body{
   vertical-align:middle; text-align:center;
  width: 90%;
   justify-content: center;

    display: inline-block;
   position: relative;
column-count: 2;


 }

 .one-container{
   display: inline-block;
   position: relative;
   width:280px;
   height:200px;
   border-style:solid;
   border-width:1px;
   border-color: #999999;
   margin: 10px 30px;

 }

 .titem-name{
   position: relative;

   top:5px;
   font-size:15px;
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
   padding: 6px 12px;
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
   padding: 6px 12px;
   border-radius:4px;
 }
 .delete:hover{
   color: black;
 }

 .titem-name{
   color:black;
 }
 .titem-name:hover{
   color: blue;
   text-decoration: none;

 }
 .template-edit{
   width:280px;
   display: -webkit-flex;

 }
 .template-img {
   width: 160px;
   height: 150px;
   margin:15px 15px;
   background: #0186ba;
 }
 .template-center{
   text-align: center;

 }
 ul.pagination {
   display: inline-block;
   padding: 0;
   margin: 0;
 }

 ul.pagination li {display: inline;}

 ul.pagination li a {
   color: black;
   float: left;
   padding: 4px 8px;
   text-decoration: none;
   transition: background-color .3s;
   border: 1px solid #ddd;
 }

 .pagination li:first-child a {
   border-top-left-radius: 5px;
   border-bottom-left-radius: 5px;
 }

 .pagination li:last-child a {
   border-top-right-radius: 5px;
   border-bottom-right-radius: 5px;
 }

 ul.pagination li a.active {
   background-color: #428bca;
   color: white;
   border: 1px solid #428bca;
 }

 ul.pagination li a:hover:not(.active) {background-color: #ddd;}

</style>
