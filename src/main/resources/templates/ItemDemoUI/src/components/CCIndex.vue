<style>
  .log-out{
    margin-left: 30px;
  }
</style>
<template>
<div>
    <CCL1SideBar></CCL1SideBar>
    <div id="content">
    <div class="content-main-fix">
      <transition name="fade"><router-view></router-view></transition>
    </div>
  </div>
</div>
</template>


<script scoped>
  import CCL1SideBar from './CC/CCL1SideBar.vue'
  export default{
    components: { 'CCL1SideBar': CCL1SideBar}
  };
  
</script>


