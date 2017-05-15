<template>
	<div>
	<!-- 删除页面模板 -->
		<div class="delete-modal">
			<div class="delete-modal-dialog">
				<div class="delete-modal-content">
					<div class="delete-modal-header">
						<!-- <button><span class="sr-only">Close</span></button>
						<h4 class="delete-modal-title">删除确认窗口</h4> -->
						<h4 class="delete-modal-title">删除确认窗口</h4>
						<div class = "delete-modal-delete-div">
							<router-link to="/ability"><img src="../assets/img/delete.png" alt="" class = "delete-moda-delete"></router-link>
						</div>
						
					</div>
					<div class="delete-modal-body">
						<div class = "delete-modal-delete-confirm">
							确认删除：
						</div>
						<div class = "delete-modal-delete-content">
							<div class="delete-content-title">淘宝商品发布页面模板：</div>
							<!-- <div class="delete-content-pic"><img src="@/static/img/process1.png" alt=""></div> -->
							<div class="delete-content-pic"><img src="../assets/img/process1.png" alt=""></div>
						</div>
					</div>
					<div class="delete-modal-footer">
						<router-link to="/pagetemplate" class = "btn btn-primary">确认</router-link>
						<router-link to="/pagetemplate" class = "btn btn-delete">取消</router-link>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<style>
	.delete-content-pic img{
		width: 80%;
    	height: 70%;
	}
</style>
