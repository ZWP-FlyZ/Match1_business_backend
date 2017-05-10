<template>
	<div class = "deleteBZability">
	<div id = "nav">
		<div class = "deleteBZability-header">
			<p>删除确认</p>
			<a href=""><router-link to="/bzability">X</router-link></a>
		</div>
		<div class = "delete-confirm">
			确认删除：
		</div>
		<div class = "delete-content">
			业务能力：描述标题
		</div>
		<div class = "delete-button">
			<a href="" ><router-link to="/bzability" class = "btn btn-primary">确认</router-link></a>
			<a href=""><router-link to="/bzability" class = "btn btn-delete">取消</router-link></a>
		</div>
	</div>
	</div>
</template>
<style>
	.deleteBZability{
		/*border:1px solid red;*/
		width: 420px;
		height: 260px;
		margin:0 auto;
	}
	.deleteBZability-header{
		background: #0099FF;
		height: 45px;
		font-size: 30px;
		color: #fff;
	}
	.deleteBZability-header p{
		padding-left: 5%;
		float: left;
		margin-right: 55%;
	}
	.deleteBZability-header a{
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