<template>
  <!-- <div class = "BZ-tabs">
        <span class = "tabs-BZ-total">流程定制总数：12</span>
        <ul class="BZ-register">
          <li>分类</li>
          <li class = "register btn btn-primary">注册流程</li>
        </ul>

        <div class="BZ-classify">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">交易下单流程（2）</router-link></a>
          <a href="" ><router-link to="" class = "L1-edit">配置前置条件</router-link></a>
          <a href="" ><router-link to="" class = "L1-edit">查看前置条件</router-link></a>
          <div class = "BZ-table">
            <ul class="BZ-edit">
              <li class = "BZ-num">1</li>
              <li class = "process">此处放流程图</li>
              <li class = "btn btn-primary">编辑</li>
              <li class = "btn btn-primary">查看</li>
              <li class = "btn btn-delete">删除</li>
            </ul>
            <hr class = "hr hr-BZProcess">
            <ul class="BZ-edit">
                <li class = "BZ-num">2</li>
                <li class = "process">此处放流程图</li>
                <li class = "btn btn-primary">编辑</li>
                <li class = "btn btn-primary">查看</li>
                <li class = "btn btn-delete">删除</li>
            </ul> 
          </div>  
        </div>

        <div class="BZ-classify">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">交易下单流程（2）</router-link></a>
          <a href="" ><router-link to="" class = "L1-edit">配置前置条件</router-link></a>
          <a href="" ><router-link to="" class = "L1-edit">查看前置条件</router-link></a>
          <div class = "BZ-table">
            <ul class="BZ-edit">
              <li class = "BZ-num">1</li>
              <li class = "process">此处放流程图</li>
              <li class = "btn btn-primary">编辑</li>
              <li class = "btn btn-primary">查看</li>
              <li class = "btn btn-delete">删除</li>
            </ul>
            <hr class = "hr hr-BZProcess">
            <ul class="BZ-edit">
                <li class = "BZ-num">2</li>
                <li class = "process">此处放流程图</li>
                <li class = "btn btn-primary">编辑</li>
                <li class = "btn btn-primary">查看</li>
                <li class = "btn btn-delete">删除</li>
            </ul> 
          </div>  
        </div>
  </div> -->
  <div class = "BZProcess">
    <div class = "BZProcess-total">流程定制总数：12</div>

    <div class="BZProcess-register">
      <ul>
          <li class = "BZProcess-classify">分类</li>
          <li><router-link to="/registerProcess" class = "link-btn link-btn-primary">注册流程</router-link></li>
      </ul>
    </div>
    <div class = "classfy-table">
      <div class="BZProcess-des">
        <img src="" alt="">
        <a href="" ><router-link to="" class = "L1-name">商品发布流程（2）</router-link></a>
        <a href="" ><router-link to="" class = "L1-edit">配置前置条件</router-link></a>
        <a href="" ><router-link to="" class = "L1-edit">查看前置条件</router-link></a>
      </div> 
      <div class = "BZProcess-table">
        <ul class="BZ-edit">
          <li class = "BZ-num">1</li>
          <li class = "process">此处放流程图</li>
          <!-- <li class = "btn btn-primary">编辑</li> -->
          <li><router-link to="/registerProcess" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteBZProcess" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
        <hr class = "BZProcess-table-hr">
        <ul class="BZ-edit">
          <li class = "BZ-num">2</li>
          <li class = "process">此处放流程图</li>
           <li><router-link to="/registerProcess" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteBZProcess" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
    </div>

    <div class = "classfy-table">
      <div class="BZProcess-des">
        <img src="" alt="">
        <a href="" ><router-link to="" class = "L1-name">交易下单流程（2）</router-link></a>
        <a href="" ><router-link to="" class = "L1-edit">配置前置条件</router-link></a>
        <a href="" ><router-link to="" class = "L1-edit">查看前置条件</router-link></a>
      </div> 
      <div class = "BZProcess-table">
        <ul class="BZ-edit">
          <li class = "BZ-num">1</li>
          <li class = "process">此处放流程图</li>
           <li><router-link to="/registerProcess" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteBZProcess" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
        <hr class = "BZProcess-table-hr">
        <ul class="BZ-edit">
          <li class = "BZ-num">2</li>
          <li class = "process">此处放流程图</li>
           <li><router-link to="/registerProcess" class = "link-btn link-btn-primary">编辑</router-link></li>
          <li><router-link to="/registerPageTemplate" class = "link-btn link-btn-primary">查看</router-link></li>
          <li><router-link to="/deleteBZProcess" class = "link-btn link-btn-delete">删除</router-link></li>
        </ul>
      </div>
    </div>
  </div>       
</template>
<style>
  .BZProcess-total{
    margin-top: 0;
  }
  .BZProcess-register{
    background: #F2F2F2;
    height: 45px;
    margin-top: 30px;
  }
  .BZProcess-register li{
    float: left;
  }
  .BZProcess-classify{
    width: 20%;
    text-align: center;
    margin-top: 8px;
  }
  .BZProcess-register li .link-btn{
    margin-left: 87.7%;
    margin-top: 7px;
  }
  .BZProcess-des{
    margin-top: 20px;
  }
  .L1-name{
    color:#169BD5;
    display: inline-block;
    width: 20%;
    margin-left: 20px;
  }
  .L1-edit{
    display: inline-block;
    width: 30%;
    text-align: center;
    color:#169BD5;
  }
  .BZProcess-table{
    border:1px solid #BCBCBC;
    margin-top: 20px;
    display: inline-block;
    width: 100%;
    text-align: center;
    padding-bottom: 5px;
  }
  .BZProcess-table ul li{
    float: left;
    text-align: center;
    margin-top: 9px;
  }
  .BZProcess-table .BZ-num{
    margin-left: 3%;
    width: 5%;
  }
  .BZProcess-table .process{
    width: 50%;
    margin-right: 40px;
  }
  .BZProcess-table .link-btn{
    margin-left: 10px;
    margin-right: 15px;
    margin-top: 5px;
  }
   hr.BZProcess-table-hr{
    width: 95%;
    margin:0 auto;
    margin-left: 20px;
    float: left;
    border-color: #F2F2F2;
    margin-top: 5px;
  }
  .BZProcess-table{
    margin-bottom: 20px;
  }

</style>

