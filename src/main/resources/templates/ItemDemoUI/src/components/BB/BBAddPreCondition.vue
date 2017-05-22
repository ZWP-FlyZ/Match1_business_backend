<template>
<!-- 全局div开始 -->
<!-- <div>添加前置条件</div> -->
	<div>
		<div class="delete-modal-dialog identity-modal">
			<div class="delete-modal-content">
			<div class="delete-modal-header"><span class = "identity-header">申请添加</span></div>
				<div class = "delete-modal-footer">
					<div class = "modal-footer-name">条件名称：<input type="text" class = "modal-footer-input BB-modal-footer-input"></div>
					<div class = "modal-footer-name">归属节点：<input type="text" class = "modal-footer-input BB-modal-footer-input"></div>
					<div class = "modal-footer-name"><span class = "requirement">需求描述：</span><textarea name="" id="" cols="30" rows="10"></textarea></div>

					<button class = "link-btn link-btn-blue bb-button">确认</button>
					<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
				</div>
			</div>
		</div>
	</div>	
<!-- 全局div结束 -->
</template>
<style>
	.requirement{position: relative;top:-130px;}
	.BB-modal-footer-input{width: 230px;}
</style>

