<style>
  .log-out{
    margin-left: 30px;
  }
</style>
<template>
<div>
    <BBL1SideBar></BBL1SideBar>
    <div id="content">
    <div class="content-main-fix">
      <transition name="fade"><router-view></router-view></transition>
    </div>
  </div>
</div>
</template>


<script>
  import BBL1SideBar from './BB/BBL1SideBar.vue'
  export default{
    components: { 'BBL1SideBar': BBL1SideBar}
  };
  
</script>


