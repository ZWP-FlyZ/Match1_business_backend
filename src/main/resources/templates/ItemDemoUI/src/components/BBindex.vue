<template>
<div>
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
          <router-link to="/" class = "link-btn link-btn-primary log-out">退出</router-link>
      </div>
    </div>
    <!-- 以上nav是写首页的头部的 -->
    <!-- 以上div是写首页的内容的 ，其中Sidebar代表导航栏，对应的文件在components文件夹下的sidebar.vue,-->
    <BBL1SideBar></BBL1SideBar>
    <router-view></router-view>
    <!-- <div class="container">
      <div class="col-sm-3">
        <Sidebar></Sidebar>
      </div>
      <div class="col-sm-9">
        <router-view></router-view>
      </div>
    </div> -->
  </div>
</div>
  
</template>
<style>
  .log-out{
    margin-left: 30px;
  }
</style>

<script>
  import BBL1SideBar from './BBL1SideBar.vue'
  
  export default{
    components: { 'BBL1SideBar': BBL1SideBar}
  };
  
</script>


