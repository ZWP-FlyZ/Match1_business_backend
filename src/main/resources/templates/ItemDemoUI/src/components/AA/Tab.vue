<template>
  <!-- <ul class="nav nav-tabs">
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
   </ul> -->
   <el-tabs v-model="tab" type="border-card" @tab-click="handleClick"><!-- @tab-click="handleClick" -->
    <el-tab-pane name="first">  
      <span slot="label"><i class="el-icon-date"></i> 流程</span>
      <transition name="fade"><router-view></router-view></transition>
    </el-tab-pane>
    <el-tab-pane name="second">
      <span slot="label"><i class="el-icon-menu"></i> 页面模版</span>
      <transition name="fade"><router-view></router-view></transition>
    </el-tab-pane>
    <el-tab-pane name="third">
      <span slot="label"><i class="el-icon-setting"></i> 业务能力</span>
      <transition name="fade"><router-view></router-view></transition>
    </el-tab-pane>
    <el-tab-pane name="fourth">
    <span slot="label"><i class="el-icon-document"></i> 能力</span>
    <transition name="fade"><router-view></router-view></transition>
    </el-tab-pane>
  </el-tabs>
</template>

<script>
  import BZProcess from "./BZProcess"
  import PageTemplate from "./PageTemplate"
  import BZability from "./BZability"
  import Ability from "./Ability"

  export default{
  	data(){
		return {
      tab:'first',
			isActive:'1'
		}
	},
  components:{BZProcess,PageTemplate,BZability,Ability},
	methods:{
		changeTab:function(i){
      /*if(i==1){
        console.log("111")
        this.$root.eventHub.$emit("appisEmpty",data);
      }
*/      
			this.isActive = i;
		},
    handleClick:function(tab,event){
      if(tab.name == 'first'){
        this.$router.push("/bzprocess")
      }else if(tab.name == 'second'){
        this.$router.push("/pagetemplate")
      }else if(tab.name == 'third'){
        this.$router.push("/bzability")
      }else{
        this.$router.push("/ability")
      }


    }
	}
  }
</script>