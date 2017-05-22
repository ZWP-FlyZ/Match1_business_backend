<template>
  <div id="wrapper">
    <div id="header">
      <div class="header-left">
        <img src="" alt="">
        <span class = "left-title">业务中台</span>
      </div>
      <div class="header-right">
        <img src="" alt="">
        <span class = "right-title">业务中台demo</span>
        <img src="" alt="">
      </div>
      <div class="header-author">
         <img src="" alt="">
          <span>OS建模小组</span>
      </div>
      <div>
          <router-link to="/aaindex" class = "link-btn link-btn-primary log-out">应用方</router-link>
          <router-link to="/bbindex" class = "link-btn link-btn-primary log-out">老师版业务方</router-link>
          <router-link to="/ccindex" class = "link-btn link-btn-primary log-out">Ali版业务方</router-link>
          <router-link to="/publishIdentity" class = "link-btn link-btn-primary log-out">测试发布</router-link>
      </div>
    </div>
    <router-view></router-view>
  </div>
</template>
<style>
  .log-out{
    margin-left: 30px;
  }
</style>


