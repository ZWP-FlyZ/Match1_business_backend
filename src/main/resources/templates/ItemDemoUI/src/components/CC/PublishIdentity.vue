<template>
	<div class="xf-publish-main">
		<!-- <div class="xf-publish-box">
		  <img class="xf-new-identity-img" src="static/img/new-identity.png" />
		  <div class="xf-publish-footer-new">
		  	<button class="link-btn link-btn-look" @click="addIdentity">另存为新的业务身份</button>
		  </div>
		</div> -->
		<div class="xf-publish-box">
		  <img class="xf-update-identity-img" src="static/img/update-identity.png" />
		  <div class="xf-publish-footer-update">
		    <button class="link-btn link-btn-primary" @click="openClick">确定保存业务身份</button>
		  </div>
		</div>
		<IMask :hide-mask.sync="hideMask"></IMask>
        <AddIdentity :hide-identity.sync="hideIdentity" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></AddIdentity>
        <Tip :hide-tip.sync="hideTip" v-on:closeTip="closeTip"></Tip>
	</div>
</template>
<script>
	import AddIdentity from "../BB/AddIdentity"
	import IMask from "../Mask"
	import Tip from "../Tip"
	export default{
		data(){
			return{
				hideIdentity:true,
				hideMask:true,
				hideTip:true,
				toIdentityDetail:''
			}
		},
		components:{'AddIdentity':AddIdentity,'IMask':IMask,"Tip":Tip},
		methods:{
			addIdentity:function(){
				this.hideMask=!this.hideMask
				this.hideIdentity=!this.hideIdentity
			},
			closeDialog:function(data){
				this.hideIdentity = data
				this.hideMask = data
			},
			openClick:function(){
				this.hideTip = false
				var that = this
				setTimeout(function(){
					that.$router.push("/identityDetail")
				},3000)
				
			},
			closeTip:function(data){
				this.hideTip = data
			}
		}
	}
</script>
<style scoped>
	.xf-publish-main{margin:80px auto;margin-left:3%;}
    .xf-publish-box{display: inline-block;margin-left:5%;width:43%;}
	.xf-new-identity-img{width:60%;}
	.xf-update-identity-img{width:65%;}
	.xf-publish-footer-new{margin-top:40px;margin-left:15%;}
	.xf-publish-footer-update{margin-top:40px;margin-left:20%;}
</style>