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
							能力：描述标题
						</div>
					</div>
					<div class="delete-modal-footer">
						<router-link to="/ability" class = "btn btn-primary">确认</router-link>
						<router-link to="/ability" class = "btn btn-delete">取消</router-link>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<style>
	/*.delete-modal {遮罩层 100%
	  position: fixed;
	  top: 0;
	  right: 0;
	  bottom: 0;
	  left: 0;
	  z-index: 1050;
	  display: none;
	  -webkit-overflow-scrolling: touch;
	  outline: 0;
	}*/
	.delete-modal-content {/*弹窗样式*/
	  position: relative;
	  background-color: #fff;
	  -webkit-background-clip: padding-box;
	          background-clip: padding-box;
	  border: 1px solid #999;
	  border: 1px solid rgba(0, 0, 0, .2);
	  border-radius: 6px;
	  width: 50%;
	  margin:0 auto;
	  outline: 0;
	  -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, .5);
	          box-shadow: 0 3px 9px rgba(0, 0, 0, .5);
	}
	.delete-modal-dialog {/*弹窗布局*/
	  position: relative;
	  width: auto;
	  margin: 10px;
	}
	.delete-modal-backdrop {
	  position: fixed;
	  top: 0;
	  right: 0;
	  bottom: 0;
	  left: 0;
	  z-index: 1040;
	  background-color: #000;
	  background-color: red;
	}
	.delete-modal-backdrop.fade {
	  filter: alpha(opacity=0);
	  opacity: 0;
	}
	.delete-modal-header {
	  background: #0099FF;
	  min-height: 16.42857143px;
	  padding: 15px;
	  border-bottom: 1px solid #e5e5e5;
	}
	.delete-modal-title {
		width: 35%;
		display: inline-block;
		margin: 0;
	    line-height: 1.42857143;
		float: left;
		margin-right: 11px;
	}
	.delete-modal-delete-div{
		float: left;
		width: 60%;
		text-align: right;
	}
	
	.delete-moda-delete:hover{
		transform: scale(1.2,1.2);
	}
	.delete-modal-title p{
		padding-left: 5%;
		float: left;
		margin-right: 55%;
	}
	.delete-modal-body {
	  position: relative;
	  padding: 15px;
	}
	.delete-modal-footer {
	  padding: 15px;
	  text-align: right;
	  border-top: 1px solid #e5e5e5;
	}
	.sr-only { clip: rect(0, 0, 0, 0); }

	.delete-modal-delete-confirm{
		margin-top: 20px;
		margin-left: 30px;
	}
	.delete-modal-delete-content{
		margin-top: 20px;
		margin-left: 100px;
		color: red;
	}
</style>