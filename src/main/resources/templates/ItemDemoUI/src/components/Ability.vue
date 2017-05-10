<template>
  <!-- <h1 class="text-center">bzability</h1> -->
  <div class = "Ability">
    <div class = "Ability-total">能力定制总数：12</div>
    <div class="Ability-register">
      <ul>
          <li class = "ability-reg">能力</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">创建能力</router-link></li>
      </ul>
    </div>
    <div class = "Ability-list">
      <div class = "Ability-list-one">
        <ul>
          <li class = "Ability-name">颜色</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteAbility" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
      <div class = "Ability-list-one">
        <ul>
          <li class = "Ability-name">尺寸</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteAbility" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
      <div class = "Ability-list-one">
        <ul>
          <li class = "Ability-name">无理由退货</li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteAbility" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
    </div>
  </div>

</template>
<style>
  .Ability-total{
    margin-top: 0;
  }
    .Ability-register{
      background: #F2F2F2;
      height: 45px;
      margin-top: 30px;
    }
    .Ability-register li{
      float: left;
    }
    .ability-reg{
      width: 20%;
      text-align: center;
      margin-top: 8px;
      /*border:1px solid red;*/
    }
    .Ability-register li .link-btn{
      margin-left: 88.3%;
      margin-top: 7px;
    }

    .Ability-list-one{
      border: 1px solid #F2F2F2;
      height: 50px;
      margin-top: 13px;
    }
    .Ability-list-one li{
      float: left;
    }
    .Ability-name{
      margin-left: 3%;
      margin-top: 8px;
      margin-right: 50%;
      width: 20%;
    }
    .Ability-list-one li .link-btn{
      margin-top: 5px;
      margin-right: 30px;
    }
    body{
    font:15px/1.62 Helvetica,Arial,sans-serif;
    background-color:#fff;
  }

  </style>