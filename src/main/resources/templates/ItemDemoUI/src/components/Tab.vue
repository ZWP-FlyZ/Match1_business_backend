<template>
  <ul class="nav nav-tabs">
    <li v-bind:class="{'tab-active':isActive==1}" @click="changeTab(1)"><router-link to="/bzprocess" class="link">流程(1)</router-link></li>
    <li v-bind:class="{'tab-active':isActive==2}" @click="changeTab(2)"><router-link to="/pagetemplate"  class="link" >页面模板(3)</router-link></li>
    <li v-bind:class="{'tab-active':isActive==3}" @click="changeTab(3)"><router-link to="/bzability" class="link" >业务能力(3)</router-link></li>
    <li v-bind:class="{'tab-active':isActive==4}" @click="changeTab(4)"><router-link to="/ability" class="link" >能力(3)</router-link></li>
   </ul>
</template>

<script>
  export default{
  	data(){
		return {
			isActive:'1'
		}
	},
	methods:{
		changeTab:function(i){
			this.isActive = i;
		}
	}
  }
</script>