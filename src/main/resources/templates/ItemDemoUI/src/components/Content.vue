<template>
  <div class="container">
    <div class="row">
      <Tab></Tab>
    </div>
    <div class="row">
      9090
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
	import Tab from './Tab.vue'
	export default {
		components:{'Tab': Tab}
	}
</script>

