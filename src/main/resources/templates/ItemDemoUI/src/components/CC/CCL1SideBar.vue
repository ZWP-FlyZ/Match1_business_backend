<template>
		<div id="application">
			<div class="application-heading">
				<span>L1流程1</span>
			</div>
			<div class="application-list">
				<ul >
					<li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
						<i class="icon-triangle-right"></i>
						<router-link to="/bBprocess" class="application-router">商业计划</router-link>
					</li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">快速验证</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">找场（建场）</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">品类规划</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">招商</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router application-active">组织货品</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">会员管理</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">导购</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">引流</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">促销活动</router-link>
          </li>
           <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">交易</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">售后</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">资金结算</router-link>
          </li>
          <li v-bind:class="{'application-li-active':isActive == 1}" @click="addActive(1)" >
            <i class="icon-triangle-right"></i>
            <router-link to="/cCprocess" class="application-router">财务</router-link>
          </li>
				</ul>
			</div>
      <!-- <button class = "link-btn link-btn-primary" @click="openApp">L1流程</button> -->
      
		</div>
</template>
<style scoped>
  .application-active{font-weight: bold;color:#448bc7;}
</style>

<script>
export default {
  data(){
    return {
      isActive:'0',
	    appList:[]
	}
  },
  mounted:function(){
  	this.$nextTick(function(){
  		this.getApplication();
  	})
  },
  methods: {
  	addActive:function(item){
  		this.isActive = item;
  	},
  	getApplication:function(){
  		this.$http.get("/api/getList").then(res=>{
  			this.appList = JSON.parse(res.body.data).result.appList;
  		})
  	}
  }
}
</script>


