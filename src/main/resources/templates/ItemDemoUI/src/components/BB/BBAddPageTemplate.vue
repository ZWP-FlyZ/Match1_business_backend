<template>
<!-- 全局div开始 -->
<!-- <div>添加页面模板</div> -->
	<div class="delete-modal-dialog identity-modal" v-bind:class="{'hide':hidePdialog}">
			<div class="delete-modal-content">
			<div class="delete-modal-header"><span class = "identity-header">申请添加</span></div>
				<div class = "delete-modal-footer">
					<div class = "modal-footer-name">页面名称：<input type="text" class = "modal-footer-input BB-modal-footer-input"></div>
					<div class = "modal-footer-name">归属节点：<input type="text" class = "modal-footer-input BB-modal-footer-input"></div>
					<div class = "modal-footer-name"><span class = "requirement">需求描述：</span><textarea name="" id="" cols="30" rows="10"></textarea></div>
					<button class = "link-btn link-btn-blue bb-button">确认</button>
					<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
				</div>
			</div>
	</div>
<!-- 全局div结束 -->
</template>
<script>
	export default{
		props:['hidePdialog','hideMask'],
		methods:{
			closeDialog:function(){
				this.$emit("closeDialog",!this.hidePdialog,0);
			}
		}
	}
</script>
<style scoped>
	.hide{display: none}
	.delete-modal-dialog{position: fixed;z-index:1000;top:200px;left:30%;}
</style>