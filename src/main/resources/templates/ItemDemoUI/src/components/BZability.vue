<template>
  <!-- <h1 class="text-center">bzability</h1> -->
  <div class = "BZability">
    <div>模板定制总数：12</div>
    <div class="BZability-register">
      <ul>
          <li class = "ability-reg">业务能力</li>
          <li class = "btn btn-primary">注册业务能力</li>
      </ul>
    </div>
    <div class = "BZability-list">
      <div class = "BZability-list-one">
        <ul>
          <li class = "BZability-name">描述标题</li>
          <li class = "btn btn-primary">编辑</li>
          <li class = "btn btn-primary">查看</li>
          <li class = "btn btn-primary">删除</li>
        </ul>
      </div>
      <div class = "BZability-list-one">
        <ul>
          <li class = "BZability-name">业务能力1</li>
          <li class = "btn btn-primary">编辑</li>
          <li class = "btn btn-primary">查看</li>
          <li class = "btn btn-primary">删除</li>
        </ul>
      </div>
      <div class = "BZability-list-one">
        <ul>
          <li class = "BZability-name">业务能力2</li>
          <li class = "btn btn-primary">编辑</li>
          <li class = "btn btn-primary">查看</li>
          <li class = "btn btn-primary">删除</li>
        </ul>
      </div>
    </div>
  </div>

</template>
<style>
    .BZability-register{
      background: #F2F2F2;
      height: 45px;
      margin-top: 30px;
    }
    .BZability-register li{
      float: left;
    }
    .ability-reg{
      margin-left: 10%;
      margin-top:8px;
    }
    .BZability-register li.btn{
      margin-left: 60%;
      margin-top: 5px;
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
      margin-right: 3%;
    }
    body{
    font:15px/1.62 Helvetica,Arial,sans-serif;
    background-color:#fff;
  }

  </style>