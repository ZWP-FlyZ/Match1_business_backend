<template>
	<div>
	<!-- 删除能力 -->
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
							业务能力：业务能力2
						</div>
					</div>
					<div class="delete-modal-footer">
						<router-link to="/bzability" class = "btn btn-primary">确认</router-link>
						<router-link to="/bzability" class = "btn btn-delete">取消</router-link>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
