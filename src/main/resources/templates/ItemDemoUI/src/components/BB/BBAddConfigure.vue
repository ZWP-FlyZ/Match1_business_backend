<template>
<!-- 全局div开始 -->
<!-- <div>添加配置项</div> -->
	<div>
		<div class="delete-modal-dialog identity-modal">
			<div class="delete-modal-content">
			<div class="delete-modal-header"><span class = "identity-header">申请添加</span></div>
				<div class = "delete-modal-footer">
					<div class = "modal-footer-name">配置项名称：<input type="text" class = "modal-footer-input"></div>
					<div class = "modal-footer-name">所属归属方：<input type="text" class = "modal-footer-input"></div>
					<button class = "link-btn link-btn-blue">确认</button>
					<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
				</div>
			</div>
		</div>
	</div>	
<!-- 全局div结束 -->
</template>

