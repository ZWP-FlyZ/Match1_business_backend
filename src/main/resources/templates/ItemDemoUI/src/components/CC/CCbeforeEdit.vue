<template>
  <div>
    <ChoosedProcess></ChoosedProcess>
    <div id="content">
     <div class="content-main-fix">
      <transition name="fade"><router-view></router-view></transition>
     </div>
    </div>
 </div>
</template>
<script>
	import ChoosedProcess from './ChoosedProcess'
	export default{
		components:{'ChoosedProcess':ChoosedProcess}
	}
</script>