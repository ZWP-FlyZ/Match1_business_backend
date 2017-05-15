<template>

	<div class = "applicationReg">
		<div class = "applicationReg-header">
			<p>应用基本信息</p>
			<router-link to="/bzprocess"><img src="../assets/img/delete.png" alt="" class = "applicationReg-delete"></router-link>
			<!-- <a href=""><router-link to="/bzprocess">X</router-link></a> -->
		</div>
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
			<div class="applicationReg-des-div">
				<label for="">注册日期:</label>
				<input type="date"  value="2017-05-11"/>
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
		</div>
		<div class = "theme-content person">
			<form action="" class = "form-theme">
				<label for=""><b>有权限编辑人员:</b></label>
				<input type="text" >
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
		border-radius: 6px;
		height: 45px;
		width: 770px;
		font-size: 30px;
	}
	.applicationReg-header p{
		color: #fff;
		float: left;
		padding-left: 5%;
		margin-right: 67%;
	}
	.applicationReg-delete:hover{
		transform:scale(2,2);  
	}
	
	.applicationReg-header a{
		color: #fff;
	}
	.applicationReg-des{
		margin-top: 30px;
		/*padding-left: 5%;*/
		padding-left: 20px;
		width: 760px;
	}
	.applicationReg-des-div{
		float: left;
		margin-bottom: 30px;
	}
	
	.applicationReg-des label{
		/*margin-right: 5px;*/
		display: inline-block;
		width: 67px;
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