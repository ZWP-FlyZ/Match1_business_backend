<template>
	<div class = "applicationReg">
		<div class = "applicationReg-header">
			<p>应用基本信息</p>
		</div>
		<div class = "applicationReg-des">
			<form action="">
				<label for="">应用名称:</label>
				<input type="text">
				<label for="">应用描述:</label>
				<input type="text">
				<label for="">负责人:</label>
				<input type="text">
			</form>
		</div>
		<div class = "theme-content">
			<form action="" class = "form-theme">
				<label for=""><b>主题：</b></label>
				<input type="text">
			</form>
			<form action="" class = "form-content">
				<label for=""><b>内容：</b></label>
				<input type="text">
				<div class = "empty"></div>
			</form>
		</div>
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>对外服务人员:</b></label>
				<input type="text">
			</form>
		</div>
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>有权限编辑人员:</b></label>
				<input type="text">
			</form>
		</div>
	</div>
	
</template>
<style>
	.applicationReg-header{
		background: #0099FF;
		height: 45px;
	}
	.applicationReg-header p{
		color: #fff;
		font-size: 30px;
		padding-left: 5%;
	}
	.applicationReg-des{
		margin-top: 30px;
		padding-left: 5%;
	}
	.applicationReg-des label{
		margin-right: 5px;
	}
	.applicationReg-des input{
		border: 1px solid #000;
		margin-right: 5%;
	}
	.theme-content{
		background: #F2F2F2;
		/*width: 70%;*/
		width: 760px;
		
		margin-left: 5%;
		margin-top: 30px;
	}

	.applicationReg label b{
		font-size: 20px;
		margin-right: 5px;
		padding-left: 20px;
	}
	.form-theme{
		padding-top:40px;
	}
	.form-theme input{
		height: 30px;
		width: 85%;
	}
	.form-content{
		margin-top: 40px;
		padding-bottom: 40px;
	}
	.form-content input{
		height: 200px;
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
</style>