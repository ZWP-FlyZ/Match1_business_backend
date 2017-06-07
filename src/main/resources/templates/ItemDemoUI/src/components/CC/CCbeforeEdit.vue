<template>
  <div>
    <Sidebar :message="message"></Sidebar>
    <Step :step="step"></Step>
    <div id="content">
     <div class="content-main-fix">
      <transition name="fade"><router-view></router-view></transition>
     </div>
    </div>
 </div>
</template>
<script>
  import Sidebar from '../Sidebar.vue'
  import Step from './Step.vue'
  export default{
    data(){
      return{
        message:'4',
        step:'3'
      }
    },
    components: {Sidebar,Step}
  };
  
</script>
<style scoped>
   #content{margin-top:123px;}
</style>