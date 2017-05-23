<template>
		<div id="application">
			<div class="application-heading">
				<span>L1流程</span>
			</div>
			<div class="application-list">
				<ul >
          <li v-bind:class="{'application-li-active':isActive == item}" @click="addActive(item)" v-for="(item,index) in processL1">
            <i class="icon-triangle-right"></i>
            <router-link to="/cCprocess" class="application-router">{{item.name}}</router-link>
          </li>
        </ul>
			</div>
      <!-- <button class = "link-btn link-btn-primary" @click="openApp">L1流程</button> -->
      <IMask :hide-mask.sync="hideMask"></IMask>
      <RegisterApplication :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask"  v-on:isClose="closeDialog"></RegisterApplication>
		</div>
</template>
<style>
  .application-active{font-weight: bold;color:#448bc7;}
</style>

<script>
import IMask from '../Mask'
import RegisterApplication from '../AA/RegisterApplication'
export default {
  data(){
    return {
      isActive:'0',
	    processL1:[],
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
  			this.processL1 = JSON.parse(res.body.data).result.processL1;
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


