<template>
	<div class="historyTitle">
		{{historyPathTitle}}
	</div>
</template>

<script>
	export default{
		props:['historyPathTitle']
	}
</script>
<style scoped>
	.historyTitle{margin-top:-10px;margin-bottom:10px;color:#ccc;cursor: pointer;}
</style>