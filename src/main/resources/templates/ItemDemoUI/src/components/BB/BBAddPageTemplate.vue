<template>
	<div class="delete-modal-dialog identity-modal" v-bind:class="{'hide':hidePdialog}">
		<div class="delete-modal-content">
			<div class="delete-modal-body">
				<div class = "delete-modal-delete-confirm">
					<span class="icon-delete"></span>申请添加
				</div>
				<div class = "delete-modal-delete-content">
					<label>页面名称：</label>
					<input type="text" placeholder="输入名称">
					<br /><br />
					<label>归属节点：</label>
					<input type="text" placeholder="输入名称">
					<br />
					<label>需求描述：</label>
					<textarea></textarea>
          			<br />
				</div>
			</div>
			<div class = "delete-modal-footer">
				<button class = "link-btn link-btn-blue" @click="confirmDelete">确认</button>
				<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
			</div>
		</div>
	</div>
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