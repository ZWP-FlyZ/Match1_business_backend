<template>
	<div>
	   <div class="xf-item-header">
	   	 <span>选择业务身份</span>
	   </div>
	   <div>
	   	 <div class="xf-item-box xf-item-box-new" @click="addIdentity">
	   	 	<div class="new-big-bg"></div>
	   	 	<p>新建业务身份</p>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/cCprocess">
	   	 	<span>业务身份1</span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 	    <p>已有流程数：<span>1</span></p>
	   	 	    <p>已有页面模板数：<span>3</span></p>
	   	 	    <p>已有业务能力数：<span>10</span></p>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/cCprocess">
	   	 	<span>业务身份1</span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 	    <p>已有流程数：<span>1</span></p>
	   	 	    <p>已有页面模板数：<span>3</span></p>
	   	 	    <p>已有业务能力数：<span>10</span></p>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/cCprocess">
	   	 	<span>业务身份1</span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 	    <p>已有流程数：<span>1</span></p>
	   	 	    <p>已有页面模板数：<span>3</span></p>
	   	 	    <p>已有业务能力数：<span>10</span></p>
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
	import AddIdentity from "../BB/AddIdentity"
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
	.xf-item-header span{font-size:20px;}
	.xf-item-header{margin-bottom:10px;}
	.xf-item-box{transition:All 0.3s ease-in-out;border:1px solid;border-color: #f0f0f0;float: left;margin-right: 4%;width:24%;height:200px;margin-bottom:20px;padding:15px 10px;overflow: hidden;white-space:normal;word-wrap:break-word; }
	.xf-item-box-chooose span{font-size:18px;color:#333;}
	.xf-item-box-chooose .xf-show-detail,.xf-item-box-des,.xf-item-box-des span{font-size:14px;color:#ccc;}
	.xf-show-detail span{color:#448bc7;font-size:14px}
	.xf-item-box:hover{transform:translate(0,-4px);border:1px solid #448bc7;}
	.new-big-bg{background: url("/static/img/new-big.png");width: 80px;height: 80px; margin: 10px auto;}
	.xf-item-box-new:hover .new-big-bg{background: url("/static/img/new-big-blue.png")}
	.xf-item-box-new p{text-align: center;margin-top:30px;}
</style>
