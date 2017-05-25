<style>
  .log-out{
    margin-left: 30px;
  }
</style>
<template>
<div>
    <Sidebar :message="message"></Sidebar>
    <div id="content">
    <div class="content-main-fix">
      <transition name="fade"><router-view></router-view></transition>
    </div>
  </div>
</div>
</template>


<script>
  import Sidebar from './Sidebar.vue'
  export default{
    data(){
      return{
        message:'2'
      }
    },
    components: { 'Sidebar': Sidebar}
  };
  
</script>


