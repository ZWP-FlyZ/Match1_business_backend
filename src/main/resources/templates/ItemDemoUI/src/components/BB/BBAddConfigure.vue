<template>
		<div class="delete-modal-dialog identity-modal addConfigure-modal" v-bind:class="{'hide':hideFdialog}">
			<div class="delete-modal-content">
			<div class="delete-modal-body">
				<div class = "delete-modal-delete-confirm">
					<span class="icon-delete"></span>添加配置项
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
<script>
	export default{
		props:['hideFdialog','hideMask'],
		methods:{
			closeDialog:function(){
				this.$emit("closeDialog",!this.hideFdialog,2);
			}
		}
	}
</script>
<style scoped>
 .hide{display: none}
 .delete-modal-dialog{position: fixed;z-index:1000;top:200px;left:30%;}
 /*.bb-button-div{width: 500px;height:200px;margin:0 auto;border:1px solid red;}
 .bb-button{margin-left:150px;}
 .addConfigure-modal{border:1px solid red;background: red;}*/





</style>

