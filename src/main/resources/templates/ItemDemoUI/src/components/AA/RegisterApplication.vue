<template>
  <transition name="xf-app">
	<div class = "applicationReg" v-if="!hideDialog">
		<div class = "applicationReg-des">
			<span>注册应用</span>
			<hr />
		</div>
		<div class = "theme-content">
			<div class = "form-theme">
				<span>名称：</span>
				<input type="text" placeholder="请输入名称">
			</div>
			<div class = "form-content">
				<span>描述：</span>
				<textarea name="" id=""  rows="5" placeholder="请输入描述"></textarea>
			</div>
		</div>
		<div class = "theme-content person">
			<div class = "form-theme">
				<span>负责人:</span>
				<input type="text" >
			</div>
		</div>
		<div class = "delete-modal-footer">
			<button class = "link-btn link-btn-blue" >确认</button>
			<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
		</div>
	</div>
  </transition>
</template>
<script>
	export default{
		props:['hideDialog','hideMask'],
		methods:{
			closeDialog:function(){
				this.$emit("isClose",!this.hideDialog)
			}
		}
	}
</script>
<style scoped>
    .hide-dialog{display: none}
    .applicationReg{width:800px;background-color: #fff;z-index:103;position: fixed;top: 7%;left: 20%;border-radius: 4px;box-shadow: 2px 2px 1px #000}
	.applicationReg-header{
		text-align: left;
	    font: 15px/40px Arial, sans-serif;
	    background: #E8F5FB;
	    position: relative;
	    text-decoration: none;
	    width: 740px;
	    height: 40px;
	    padding: 0 20px;
	    margin-bottom: 10px;
	    border-radius: 6px;
	}
	.applicationReg-header p{
		/*color: #fff;*/
		float: left;
		padding-left: 5%;
		margin-right: 80%;
	}
	.applicationReg-delete:hover{
		transform:scale(1.2,1.2);  
	}
	
	.applicationReg-header a{
		color: #fff;
	}
	.applicationReg-des{
		margin-top: 30px;
		/*padding-left: 5%;*/
		padding-left: 20px;
	}
	.applicationReg-des hr{width:98%;border:1px solid #e5e5e5;margin-top:5px;}
	.applicationReg-des-div{
		float: left;
		margin-bottom: 30px;
	}
	.applicationReg-des label{
		/*margin-right: 5px;*/
		display: inline-block;
		width: 90px;
	}
	.applicationReg-des input{
		border: 1px solid #000;
		margin-right: 30px;
		height: 30px;
		width: 145px;
		padding-left: 5px;
	}
	.theme-content{
		/*background: #F2F2F2;灰色*/
		background: #E8F5FB;
		/*width: 70%;*/
		border-radius: 6px;
		width: 760px;
		clear: both;
		display: table;
		margin-left: 20px;
		margin-top: 30px;
	}
	.applicationReg label b{
		/*font-size: 15px;*/
		margin-right: 5px;
		padding-left: 20px;
		/*color: #666666;*/
	}
	.form-theme{
		padding-top:30px;
	}
	.form-theme input{
		height: 30px;
		width: 85%;
	}
	.form-content{
		margin-top: 40px;
		padding-bottom: 40px;
	}
	.form-content span{
		float: left;
		padding-left: 20px;
		padding-right: -10px;
	}
	.form-content textarea{
		float: left;
		border:none;
		font:15px/1.62 Helvetica,Arial,sans-serif;
		background-color:#fff;
		margin-bottom: 40px;
		width: 85%;
	}
	.person{
		padding-bottom:20px;
	}
	body{
		font:15px/1.62 Helvetica,Arial,sans-serif;
		background-color:#fff;
	}
	.theme-content,.person{
		text-align: center;
	}
	.applicationReg-submit{
		padding-top: 30px;
		margin-left: 370px;
	}
	.applicationReg-des-div input{
		border:1px solid #878787;
	}
	input{
		text-align: left;
	}
	.delete-modal-footer{margin: 20px;float: right}
	
</style>