<template>
  <div>
    <Sidebar :message="message"></Sidebar>
    <router-view></router-view>
  </div>
</template>

<script scoped>
  import Sidebar from './Sidebar.vue'
  
  export default{
  	data(){
      return{
        message:'1'
      }
    },
    components: { 'Sidebar': Sidebar}
  };
  
</script>


