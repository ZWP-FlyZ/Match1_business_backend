<template>

	<div class = "applicationReg">
		<div class = "applicationReg-header">
			<p>应用基本信息</p>
			<a href=""><router-link to="/bzprocess">X</router-link></a>
		</div>
		<div class = "applicationReg-des">
			<form action="">
				<label for="">应用名称:</label>
				<input type="text" value = "商品发布">
				<label for="">应用描述:</label>
				<input type="text" value = "用于商品发布">
				<label for="">负责人:</label>
				<input type="text" value="xxxx">
			</form>
		</div>
		<div class = "theme-content">
			<form action="" class = "form-theme">
				<label for=""><b>主题：</b></label>
				<input type="text" value = "请输入主题">
			</form>
			<form action="" class = "form-content">
				<label for=""><b>内容：</b></label>
				<input type="text" value = "请输入内容">
				<div class = "empty"></div>
			</form>
		</div>
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>对外服务人员:</b></label>
				<input type="text" value="xxx,xxx">
			</form>
		</div>
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>有权限编辑人员:</b></label>
				<input type="text" value="xxx,xxx">
			</form>
		</div>
		<div class = "applicationReg-submit">
			<a href="" ><router-link to="/bzprocess" class = "btn btn-primary">确定</router-link></a>
		</div>
	</div>
	
</template>
<style>
	.applicationReg-header{
		background: #0099FF;
		height: 45px;
		width: 770px;
		font-size: 30px;
	}
	.applicationReg-header p{
		color: #fff;
		float: left;
		padding-left: 5%;
		margin-right: 65%;
	}
	.applicationReg-header a{
		color: #fff;
	}
	.applicationReg-des{
		margin-top: 30px;
		/*padding-left: 5%;*/
		padding-left: 20px;
	}
	.applicationReg-des label{
		margin-right: 5px;
	}
	.applicationReg-des input{
		border: 1px solid #000;
		margin-right: 30px;
		height: 30px;
		width: 148px;
	}
	.theme-content{
		background: #F2F2F2;
		/*width: 70%;*/
		width: 760px;
		
		/*margin-left: 5%;*/
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
	.theme-content,.person{
		text-align: center;
	}
	.applicationReg-submit{
		padding-top: 30px;
		margin-left: 370px;
	}
	input{
		text-align: left;
	}
</style>