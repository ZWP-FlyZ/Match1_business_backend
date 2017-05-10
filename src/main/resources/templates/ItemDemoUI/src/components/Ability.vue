<template>
  <!-- <h1 class="text-center">bzability</h1> -->
  <div class = "BZability">
    <div class = "BZability-total">能力定制总数：12</div>
    <div class="BZability-register">
      <ul>
          <li class = "ability-reg">能力</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">创建能力</router-link></li>
      </ul>
    </div>
    <div class = "BZability-list">
      <div class = "BZability-list-one">
        <ul>
          <li class = "BZability-name">颜色</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
      <div class = "BZability-list-one">
        <ul>
          <li class = "BZability-name">尺寸</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
      <div class = "BZability-list-one">
        <ul>
          <li class = "BZability-name">无理由退货</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
    </div>
  </div>

</template>
<style>
  .BZability-total{
    margin-top: 0;
  }
    .BZability-register{
      background: #F2F2F2;
      height: 45px;
      margin-top: 30px;
    }
    .BZability-register li{
      float: left;
    }
    .ability-reg{
      width: 20%;
      text-align: center;
      margin-top: 8px;
      /*border:1px solid red;*/
    }
    .BZability-register li .link-btn{
      margin-left: 88.3%;
      margin-top: 7px;
    }

    .BZability-list-one{
      border: 1px solid #F2F2F2;
      height: 50px;
      margin-top: 13px;
    }
    .BZability-list-one li{
      float: left;
    }
    .BZability-name{
      margin-left: 3%;
      margin-top: 8px;
      margin-right: 50%;
      width: 20%;
    }
    .BZability-list-one li.btn{
      margin-top: 5px;
      margin-right: 30px;
    }
    body{
    font:15px/1.62 Helvetica,Arial,sans-serif;
    background-color:#fff;
  }

  </style>