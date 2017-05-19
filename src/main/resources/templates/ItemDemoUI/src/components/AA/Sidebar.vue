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
      <button class = "link-btn link-btn-primary" @click="openApp">注册应用</button>
      <IMask :hide-mask.sync="hideMask"></IMask>
      <RegisterApplication :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask"  v-on:isClose="closeDialog"></RegisterApplication>
		</div>
</template>

<script>
import IMask from '../Mask'
import RegisterApplication from './RegisterApplication'
export default {
  data(){
    return {
      isActive:'0',
	    appList:[],
      hideMask:true,
      hideDialog:true
	}
  },
  components:{'IMask':IMask,'RegisterApplication':RegisterApplication},
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
  	},
    openApp:function(){
      this.hideMask = !this.hideMask
      this.hideDialog = !this.hideDialog
    },
    closeDialog:function(childData){
      this.hideDialog = childData
      this.hideMask = childData
    }
  }
}
</script>


