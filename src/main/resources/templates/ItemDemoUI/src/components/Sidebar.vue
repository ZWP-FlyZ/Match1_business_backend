<template>
		<div id="application">
			<div class="application-heading">
				<span>我的应用</span>
			</div>
			<div class="application-list">
				<ul >
					<li v-bind:class="{'application-li-active':isActive == item}" @click="addActive(item)" v-for="(item,index) in appList">
						<i class="icon-triangle-right"></i>
						<router-link to="/content" class="application-router">{{item.name}}</router-link>
					</li>
				</ul>
			</div>
			<router-link to="/registerApplication" class = "btn btn-primary">注册应用</router-link>
		</div>
</template>

<script>
export default {
  data(){
    return {
      isActive:'',
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
  		this.$http.get("http://localhost:3000/api/getAppList").then(res=>{
  			this.appList = JSON.parse(res.body.data).result.appList;
  		})
  	}
  }
}
</script>


