<template>
	<div class="xf-identity-main">
	   <div class="xf-item-header">
	   	 <i class="xf-icon-chooseidentity"></i><span>选择业务身份</span>
	   </div>
	   <div>
	   	 <div class="xf-item-box xf-item-box-new" @click="addIdentity">
	   	 	<div class="new-big-bg"></div>
	   	 	<p>新建业务身份</p>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/bBprocess">
	   	 	<i class="xf-icon-identity"></i><span title="点击查看详情"><router-link to="/identityDetail">淘宝女装-T-shirt商品发布</router-link></span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>流程总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>页面模板总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>业务能力总数</p>
	   	 		</div>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/bBprocess">
	   	 	<i class="xf-icon-identity"></i><span title="点击查看详情"><router-link to="/identityDetail">淘宝女装-衬衫商品发布</router-link></span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>流程总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>页面模板总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>业务能力总数</p>
	   	 		</div>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/bBprocess">
	   	 	<i class="xf-icon-identity"></i><span title="点击查看详情"><router-link to="/identityDetail">淘宝男鞋-帆布鞋商品发布</router-link></span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>流程总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>页面模板总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>业务能力总数</p>
	   	 		</div>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-clear"></div>
	   </div>
	   <IMask :hide-mask.sync="hideMask"></IMask>
       <AddIdentity :hide-identity.sync="hideIdentity" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></AddIdentity>
	</div>
</template>
<script>
	import AddIdentity from "./AddIdentity"
	import IMask from "../Mask"
	export default{
		data(){
			return{
				hideIdentity:true,
				hideMask:true
			}
		},
		components:{'AddIdentity':AddIdentity,'IMask':IMask},
		methods:{
			addIdentity:function(){
				this.hideMask=!this.hideMask
				this.hideIdentity=!this.hideIdentity
			},
			closeDialog:function(data){
				this.hideIdentity = data
				this.hideMask = data
			}
		}
	}
</script>
<style scoped>
	.xf-identity-main{margin-top:-40px;background: #f7f7f9;padding:5% 5%;}
	.xf-item-header span{font-size:20px;margin-left:10px;}
	.xf-item-header{margin-bottom:10px;}
	.xf-item-box{background:#fff;transition:All 0.3s ease-in-out;border:1px solid;border-color: #f0f0f0;float: left;margin-right: 4%;width:26%;height:200px;margin-bottom:20px;padding:15px 10px;overflow: hidden;white-space:normal;word-wrap:break-word; }
	.xf-item-box-chooose span{font-size:18px;color:#333;}
	.xf-item-box-chooose .xf-show-detail,.xf-item-box-des,.xf-item-box-des span{font-size:14px;color:#ccc;}
	.xf-item-box-new{border:2px dashed #f0f0f0;}
	.xf-show-detail{margin-top:20px;}
	.xf-show-detail span{color:#448bc7;font-size:16px}
	.xf-item-box:hover{transform:translate(0,-4px);border:1px solid #448bc7;}
	.new-big-bg{background: url("/static/img/new-big.png");width: 80px;height: 80px; margin: 10px auto;}
	.xf-item-box-new:hover .new-big-bg{background: url("/static/img/new-big-blue.png")}
	.xf-item-box-new p{text-align: center;margin-top:30px;}
	.xf-icon-chooseidentity{background: url("/static/img/choose-identity.png");width:20px;height:20px;display: inline-block;position: relative;top:4px;}
	.xf-icon-identity{background: url("/static/img/identity.png");width:19px;height:17px;display: inline-block;position: relative;margin-right:10px;}
	.xf-show-detail-box{width:31%;display: inline-block;text-align: center;}
</style>
