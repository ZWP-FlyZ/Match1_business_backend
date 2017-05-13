<template>
	<div class = "deleteAability" v-bind:class="{'hideDialog':hideDialog}">
	<div id = "nav">
		<div class = "deleteAability-header">
			<p>删除确认</p>
			<!-- <a href=""><router-link to="/ability">X</router-link></a> -->
			<img src="../assets/img/delete.png" alt="" @click="closeDialog" class = "ability-delete">
		</div>
		<div class = "delete-confirm">
			确认删除以下内容：
		</div>
		<div class = "delete-content">
			{{message.item.name}}
		</div>
		<div class = "delete-button">
			<button class = "btn btn-primary" @click="confirmDelete">确认</button>
			<button @click="closeDialog" class = "btn btn-delete">取消</button>
		</div>
	</div>
	</div>
</template>
<script>
	export default{
	  props:['message','hideDialog'],
	  methods:{
	  	closeDialog:function(){
	  		this.hideDialog = !this.hideDialog
	  	},
	  	confirmDelete:function(){
	  	/*this.$http.post(this.message.url,object,{emulateJSON: true}).then((res)=>{
          console.log(res.bodyText);
        }).then((error)=>{
        })*/
	  }
	 }
    }
</script>
<style>
	.hideDialog{display: none}
	.deleteAability{
		/*border:1px solid red;*/
		width: 420px;
		height: 260px;
		margin:0 auto;
	}
	.deleteAability-header{
		background: #0099FF;
		height: 45px;
		font-size: 30px;
		color: #fff;
	}
	.deleteAability-header p{
		padding-left: 5%;
		float: left;
		margin-right: 55%;
	}
	.ability-delete:hover{
		transform: scale(1.2,1.2);
	}
	.deleteAability-header a{
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
		display: inline-block;
	}
	.delete-button{
		margin-top: 40px;
		margin-left: 50%;
		padding-right:30px;
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