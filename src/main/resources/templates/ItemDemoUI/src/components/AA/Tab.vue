<template>
  <ul class="nav nav-tabs">
    <li v-bind:class="{'tab-active':isActive==1}" @click="changeTab(1)">
      <div class="tab-icon tab-icon-process" v-bind:class="{'tab-icon-process-active':isActive==1}"></div>
      <router-link to="" class="link"><span>流程</span>(1)</router-link>
    </li>
    <li v-bind:class="{'tab-active':isActive==2}" @click="changeTab(2)">
      <div class="tab-icon tab-icon-temp" v-bind:class="{'tab-icon-temp-active':isActive==2}"></div>
      <router-link to="/pagetemplate"  class="link" ><span>页面模板</span>(1)</router-link>
    </li>
    <li v-bind:class="{'tab-active':isActive==3}" @click="changeTab(3)">
      <div class="tab-icon tab-icon-bza" v-bind:class="{'tab-icon-bza-active':isActive==3}"></div>
      <router-link to="/bzability" class="link" ><span>业务能力</span>(1)</router-link>
    </li>
    <li v-bind:class="{'tab-active':isActive==4}" @click="changeTab(4)">
      <div class="tab-icon tab-icon-abl" v-bind:class="{'tab-icon-zbl-active':isActive==4}"></div>
      <router-link to="/ability" class="link" ><span>能力</span>(1)</router-link>
    </li>
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
      // if(i==1){
      //   console.log("111")
      //   this.$root.eventHub.$on("giveTabFirstApp",(data)=>{
      //     console.log("tab:"+data)
      //     this.$root.eventHub.$emit("appisEmpty",data);
      //     this.$router.push("/bzprocess")
      //   })
      // }
      
			this.isActive = i;
		}
	}
  }
</script>