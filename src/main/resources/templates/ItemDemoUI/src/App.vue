<template>
  <div id="wrapper">
    <nav class="navbar navbar-default">
      <div class="container">
        <a class="navbar-brand" href="#">
          <i class="glyphicon glyphicon-time"></i>
          业务中台
        </a>
        <ul class="nav navbar-nav">
          <li>业务中台首页</li>
          <li>张三</li>
          <li>99999999999</li>
        </ul>
      </div>
    </nav>
    <!-- 以上nav是写首页的头部的 -->
    <!-- 以上div是写首页的内容的 ，其中Sidebar代表导航栏，对应的文件在components文件夹下的sidebar.vue,-->
    <div class="container">
      <div class="col-sm-3">
        <Sidebar></Sidebar>
      </div>
      <div class="col-sm-9">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<script>
  import Sidebar from './components/Sidebar.vue'
  
  export default{
    components: { 'Sidebar': Sidebar}
  };
  
</script>
