
<template>
  <div id="content">
    <div class="content-descrition">
      <!-- <ul>
        <li>流程总数：4</li>
        <li>页面模板：3</li>
        <li>业务能力：2</li>
        <li>能力：6</li>
      </ul> -->
    </div>
    <br>
    <div class="content-tab">
      <!-- <ul class="nav nav-tabs">
        <li class = "active"><a href="/bzprocess"><h2>流程</h2></a></li>
        <li><a href="/pagetemplate"><h2>页面模板</h2></a></li>
        <li><a href="/bzability"><h2>业务能力</h2></a></li>
        <li><a href="/ability"><h2>能力</h2></a></li>
      </ul> -->
       <Tab></Tab>
      <!-- 流程tab内容开始 -->
      <router-view></router-view>

      
      <!-- 流程tab内容开始 -->
      

      <!-- 流程tab内容结束 -->
    </div>

    
  </div>

  <!-- <div class="container">
    <div class="row">
      <Tab></Tab>
    </div>
    <div class="row">
    
      <router-view></router-view>
    </div>
  </div> -->
</template>

<script>
  import Tab from './Tab.vue'
  export default {
    components:{'Tab': Tab}
  }
</script>

