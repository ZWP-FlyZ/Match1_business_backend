<template>

	<div class = "applicationReg" v-bind:class="{'hide-dialog':hideDialog}">
		<div class = "applicationReg-des">
			<form action="">
			<div class="applicationReg-des-div">
				<label for="">应用名称:</label>
				<input type="text"  placeholder = "商品发布">
			</div>
			<div class="applicationReg-des-div">
				<label for="">应用描述:</label>
				<input type="text"  placeholder = "用于商品发布">
			</div>
			<div class="applicationReg-des-div">
				<label for="">负责人:</label>
				<input type="text"  placeholder="xxxx">
			</div>
			</form>
		</div>
		<div class = "theme-content">
			<form action="" class = "form-theme">
				<label for=""><b>主题：</b></label>
				<input type="text"  placeholder = "" placeholder="请输入主题">
			</form>
			<form action="" class = "form-content">
				<label for=""><b>内容：</b></label>
				<textarea name="" id=""  rows="5" placeholder="请输入内容"></textarea>
			</form>
		</div>
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>对外服务人员:</b></label>
				<input type="text" >
			</form>
		</div><!-- 
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>有权限编辑人员:</b></label>
				<input type="text" >
			</form>
		</div> -->
		<div class = "applicationReg-submit">
			<a href="" ><router-link to="/bzprocess" class = "btn btn-primary">确定</router-link></a>
			<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
		</div>
	</div>
	
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
<style>
    .hide-dialog{display: none}
    .applicationReg{width:900px;background-color: #fff;z-index:100;position: fixed;top: 1%;left: 15%;border-radius: 4px;box-shadow: 4px 4px 3px #888}
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
		background: #F2F2F2;
		/*width: 70%;*/
		border-radius: 6px;
		width: 760px;
		clear: both;
		display: table;
		margin-left: 8px;
		margin-top: 30px;
	}

	.applicationReg label b{
		/*font-size: 15px;*/
		margin-right: 5px;
		padding-left: 20px;
		color: #666666;
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
	.form-content label{
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

	.person input{
		width: 75%;
	}
	.person{
		height: 10%;
	}
	.person .form-theme{
		padding-bottom: 40px;
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
</style>