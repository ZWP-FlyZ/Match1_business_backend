<template>
  <div>
    <Sidebar></Sidebar>
    <router-view></router-view>
  </div>
</template>

<script scoped>
  import Sidebar from './AA/Sidebar.vue'
  
  export default{
    components: { 'Sidebar': Sidebar}
  };
  
</script>


