<template>
	<div class = "deletePageTemplate">
	<div id = "nav">
		<div class = "deletePageTemplate-header">
			<p>删除确认</p>
			<!-- <a href=""><router-link to="/bzability">X</router-link></a> -->
			<router-link to="/pagetemplate"><img src="../assets/img/delete.png" alt="" class = "pageTemplate-delete"></router-link>
		</div>
		<div class = "delete-confirm">
			确认删除页面模板：
		</div>
		<div class = "delete-content">
			天猫商品发布页面
		</div>
		<div class = "delete-button">
			<a href="" ><router-link to="/pagetemplate" class = "btn btn-primary">确认</router-link></a>
			<a href=""><router-link to="/pagetemplate" class = "btn btn-delete">取消</router-link></a>
		</div>
	</div>
	</div>
</template>
<style>
	.deletePageTemplate{
		/*border:1px solid red;*/
		width: 420px;
		height: 260px;
		margin:0 auto;
	}
	.deletePageTemplate-header{
		background: #0099FF;
		height: 45px;
		font-size: 30px;
		color: #fff;
	}
	.deletePageTemplate-header p{
		padding-left: 5%;
		float: left;
		margin-right: 55%;
	}
	.pageTemplate-delete:hover{
		transform:scale(1.2,1.2);
	}
	.deletePageTemplate-header a{
		color: #fff;
	}
	.delete-confirm{
		margin-top: 30px;
		margin-left: 30px;
	}
	#nav{
		 width:420px; 
		 height: 260px;
		 border: 1px solid #D4CD49; 
		 position:fixed;
		 left:40%;
		 top:20%;
		 background: #fff;
	}
	.delete-content{
		margin-top: 30px;
		margin-left: 100px;
		color: red;
	}
	.delete-button{
		margin-top: 40px;
		margin-left: 50%;
		padding-right:30px;
	}
	.delete-button a{
		margin-right: 20px;
	}

</style>