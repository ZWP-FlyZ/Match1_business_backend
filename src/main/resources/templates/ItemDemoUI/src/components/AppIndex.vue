<template>
  <div>
    <Sidebar></Sidebar>
    <router-view></router-view>
  </div>
</template>

<script>
  import Sidebar from './AA/Sidebar.vue'
  
  export default{
    components: { 'Sidebar': Sidebar}
  };
  
</script>


