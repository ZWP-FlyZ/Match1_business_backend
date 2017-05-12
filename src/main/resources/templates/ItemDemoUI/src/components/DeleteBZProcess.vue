<template>
	<div class = "deleteBZProcess">
	<div id = "nav">
		<div class = "deleteBZProcess-header">
			<p>删除确认</p>
			<!-- <a href=""><router-link to="/bzprocess">X</router-link></a> -->
			<router-link to="/bzprocess"><img src="../assets/img/delete.png" alt="" class = "bzprocess-header-delete"></router-link>
		</div>
		<div class = "delete-confirm">
			确认删除：
		</div>
		<div class = "delete-content">
			商品发布流程>>淘宝商品发布流程1
		</div>
		<div class = "delete-button">
			<a href="" ><router-link to="/bzprocess" class = "btn btn-primary">确认</router-link></a>
			<a href=""><router-link to="/bzprocess" class = "btn btn-delete">取消</router-link></a>
		</div>
	</div>
	</div>
</template>
<style>
	.deleteBZProcess{
		/*border:1px solid red;*/
		width: 420px;
		height: 260px;
		margin:0 auto;
	}
	.deleteBZProcess-header{
		background: #0099FF;
		height: 45px;
		font-size: 30px;
		color: #fff;
	}
	.deleteBZProcess-header p{
		padding-left: 5%;
		float: left;
		margin-right: 55%;
	}
	.bzprocess-header-delete:hover{
		transform:scale(1.2,1.2);
	}
	.deleteBZProcess-header a{
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
		display: inline-block;
	}
	.delete-button .btn-primary{
		float: left;
	}
	.delete-button .btn-delete{
		float: left;
		margin-top: 0px;
		position: relative;
		top: -24px;
	}
	.delete-button a{
		margin-right: 20px;
	}

</style>