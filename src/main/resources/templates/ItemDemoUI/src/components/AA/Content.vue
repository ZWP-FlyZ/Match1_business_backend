<template>
  <div id="content">
    <div class="content-descrition">
    </div>
    <div class="content-tab">
       <Tab></Tab>
    </div>
    <div class="content-main">
      <transition name="fade"><router-view></router-view></transition>
    </div>
  </div>
</template>

<script>
  import Tab from './Tab.vue'
  export default {
    components:{'Tab': Tab}
  }
</script>

