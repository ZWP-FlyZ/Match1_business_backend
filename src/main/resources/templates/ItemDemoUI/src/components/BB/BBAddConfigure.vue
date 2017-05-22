<template>
<!-- 全局div开始 -->
<!-- <div>添加配置项</div> -->
	<div>
		<div class="delete-modal-dialog identity-modal">
			<div class="delete-modal-content">
			<div class="delete-modal-header"><span class = "identity-header">申请添加</span></div>
				<div class = "delete-modal-footer">
					<div class = "modal-footer-name">配置项名称：<input type="text" class = "modal-footer-input BB-modal-footer-input"></div>
					<div class = "modal-footer-name">所属归属方：<input type="text" class = "modal-footer-input BB-modal-footer-input"></div>
					<div class = "modal-footer-name"><span class = "requirement">需求方描述：</span><textarea name="" id="" cols="30" rows="10"></textarea></div>
					<button class = "link-btn link-btn-blue bb-button">确认</button>
					<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
				</div>
			</div>
		</div>
	</div>	
<!-- 全局div结束 -->
</template>
<style>
	.bb-button-div{width: 500px;height:200px;margin:0 auto;border:1px solid red;}
	.bb-button{margin-left:150px;}
</style>

