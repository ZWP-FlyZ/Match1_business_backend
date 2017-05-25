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
	import Sidebar from '../Sidebar'
	export default{
    data(){
      return {
        message:'5'
      }
    },
		components:{'Sidebar':Sidebar}
	}
</script>