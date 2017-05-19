<template>
<div>
    <BBL1SideBar></BBL1SideBar>
    <router-view></router-view>
</div>
</template>
<style>
  .log-out{
    margin-left: 30px;
  }
</style>

<script>
  import BBL1SideBar from './BB/BBL1SideBar.vue'
  export default{
    components: { 'BBL1SideBar': BBL1SideBar}
  };
  
</script>


