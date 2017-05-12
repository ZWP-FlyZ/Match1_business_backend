<template>
		<div id="application">
			<div class="application-heading">
				<span>我的应用</span>
			</div>
			<div class="application-list">
				<ul >
					<li v-bind:class="{'application-li-active':isActive == index}" @click="addActive(index)" v-for="(item,index) in appList">
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


