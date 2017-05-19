<template>
<!-- 全局div开始 -->
	<div>
		<div class="delete-modal-dialog identity-modal">
			<div class="delete-modal-content">
			<div class="delete-modal-header"><span class = "identity-header">已有业务身份</span></div>
				<div class="delete-modal-body">
					<div class="delete-modal-delete-confirm">
						<div class = "identity-list">
							<span class="icon-android"></span>
							<span>业务身份1</span>
							<router-link to="/bBprocess" class = "link-btn link-btn-primary identity-button-edit">编辑</router-link>
						</div>
						<div class = "identity-list">
							<span class="icon-android"></span>
							<span>业务身份2</span>
							<router-link to="/bBprocess" class = "link-btn link-btn-primary identity-button-edit">编辑</router-link>
						</div>
						<router-link to="/bBprocess" class = "link-btn link-btn-blue identity-new">新建业务身份</router-link>
					</div>
				</div>
				<div class = "delete-modal-footer">
					<div class = "modal-footer-name">业务身份名称：<input type="text" class = "modal-footer-input"></div>
					<div class = "modal-footer-name">业务归属方:<input type="text" class = "modal-footer-input" style="margin-left:25px;"></div>
					
					<button class = "link-btn link-btn-blue">确认</button>
					<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
				</div>
			</div>
		</div>
	</div>	
<!-- 全局div结束 -->
</template>
<style>
	.identity-modal{width:500px;margin:0 auto;top:10px;}
	.identity-header{color: #fff;font-size: 20px;}
	.icon-android{background-position: 0px 0px;width: 22px;height: 22px;display: inline-block;background-image: url(/static/img/android.png);position: relative;top: 6px;left: -9px;}
	.identity-button-edit{margin-left: 100px;}
	.identity-list{margin-bottom: 20px;}
	.identity-new{margin-left: 75px;}
	.modal-footer-div{height: 300px;}
	.modal-footer-name{text-align: left;}
	.modal-footer-input{border:1px solid #000;height:20px;margin-bottom: 10px;}
</style>
