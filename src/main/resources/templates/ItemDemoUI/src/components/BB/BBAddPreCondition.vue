<template>
<!-- 全局div开始 -->
		<div class="delete-modal-dialog identity-modal" v-bind:class="{'hide':hideCdialog}">
			<div class="delete-modal-content">
			<div class="delete-modal-body">
				<div class = "delete-modal-delete-confirm">
					<span class="icon-delete"></span>添加前置条件
				</div>
				<div class = "delete-modal-delete-content">
					<label>名称：</label>
					<input type="text" placeholder="输入名称">
					<br/><br>
					<label>归属：</label>
					<input type="text" placeholder="输入归属">
					<br/>
					<label>描述：</label>
					<textarea></textarea>
          		<br/>
			</div>
       
			</div>
			<div class = "delete-modal-footer">
				<button class = "link-btn link-btn-blue" @click="confirmDelete">确认</button>
				<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
			</div>
			</div>
		</div>
</template>
<style scoped>
	.hide{display: none}
	.delete-modal-dialog{position: fixed;z-index:1000;top:200px;left:30%;}
	.requirement{position: relative;top:-130px;}
	.BB-modal-footer-input{width: 230px;}
</style>
<script>
	export default{
		props:['hideCdialog','hideMask'],
		methods:{
			closeDialog:function(){
				this.$emit("closeDialog",!this.hideCdialog,1);
			}
		}
	}
</script>

