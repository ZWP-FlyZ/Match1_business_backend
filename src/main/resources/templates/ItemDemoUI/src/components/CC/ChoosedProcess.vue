<template>
		<div id="application">
			<div class="application-heading">
				<span>已选流程列表</span>
			</div>
			<div class="application-list">
				<ul >
					<li v-bind:class="{'application-li-active':isActive == item}" @click="addActive(item)" v-for="(item,index) in choosedList">
						<!-- <i class="icon-triangle-right"></i> -->
						<router-link to="/cCEditProcessFchoosed" class="application-router">{{item.name}}</router-link>
					</li>
				</ul>
			</div>
      <!-- <button class = "link-btn link-btn-primary" @click="openApp">L1流程</button> -->
      
		</div>
</template>
<style scoped>
  .application-active{font-weight: bold;color:#448bc7;}
  #application .application-list ul li{padding-left:0;}
  #application .application-list .application-router{width:95%;margin-left:15px;}
</style>

<script>
export default {
  data(){
    return {
      isActive:'0',
	    choosedList:[]
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
  			this.choosedList = JSON.parse(res.body.data).result.choosedList;
  		})
  	}
  }
}
</script>


