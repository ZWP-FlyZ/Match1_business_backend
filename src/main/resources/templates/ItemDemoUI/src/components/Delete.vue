<template>
	<div class = "deleteAability" v-bind:class="{'hideDialog':hideDialog}">
		<!-- <div class="delete-modal"> -->
	      <div class="delete-modal-dialog">
	        <div class="delete-modal-content">
				<!-- <div class = "deleteAability-header">
					 <h4 class="delete-modal-title">删除确认</h4>
					 <div class = "delete-modal-delete-div">
		             <img src="/static/img/delete.png" alt="" @click="closeDialog"class = "delete-moda-delete">
		            </div>
				</div> -->

			<div class="delete-modal-body">
				<div class = "delete-modal-delete-confirm">
					<span class="icon-delete"></span>确认删除以下内容：
				</div>
				<div class = " delete-modal-delete-content">
					{{message.item.name}}
				</div>
			</div>
			<div class = "delete-modal-footer">
				<button class = "link-btn link-btn-blue" @click="confirmDelete">确认</button>
				<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
			</div>
			</div>
		  </div>
		<!-- </div> -->
	</div>
</template>
<script>
	export default{
	  props:['message','hideDialog','hideMask'],
	  methods:{
	  	closeDialog:function(){
	  		this.$emit("increment",!this.hideDialog)
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
<style scoped>
	.hideDialog{display: none}
	.icon-delete{background-position: -248px 0px;width: 22px;height: 22px;display: inline-block;background-image: url(/static/img/icon.png);position: relative;top: 6px;left: -9px;}
	.deleteAability{
		/*border:1px solid red;*/
		width: 420px;
		height: 260px;
		/*margin:0 auto;*/
		position: fixed;
		top: 30%;
		left: 35%;
		z-index:103;
	}/*
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
	}*/
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
	/*.delete-modal {遮罩层 100%
    position: fixed;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    z-index: 1050;
    display: none;
    -webkit-overflow-scrolling: touch;
    outline: 0;
  }*/
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
	

	.delete-modal-content {/*弹窗样式*/
    position: relative;
    background-color: #fff;
    -webkit-background-clip: padding-box;
            background-clip: padding-box;
    border: 1px solid #999;
    border: 1px solid rgba(0, 0, 0, .2);
    border-radius: 6px;
    width: 100%;
    margin:0 auto;
    outline: 0;
    -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, .5);
            box-shadow: 0 3px 9px rgba(0, 0, 0, .5);
  }
  .delete-modal-dialog {/*弹窗布局*/
    position: relative;
    width: auto;
    margin: 10px;
  }
  .delete-modal-backdrop {
    position: fixed;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    z-index: 1040;
    background-color: #000;
    background-color: red;
  }
  .delete-modal-backdrop.fade {
    filter: alpha(opacity=0);
    opacity: 0;
  }
  .delete-modal-header {
    background: #0099FF;
    min-height: 16.42857143px;
    padding: 15px;
    border-bottom: 1px solid #e5e5e5;
  }
  .delete-modal-title {
    width: 30%;
    display: inline-block;
    margin: 0;
    line-height: 1.42857143;
    float: left;
    margin-left: 20px;
    margin-right: 11px;
  }
  .delete-modal-delete-div{
    float: left;
    width: 60%;
    text-align: right;
  }
  
  .delete-moda-delete:hover{
    transform: scale(1.2,1.2);
  }
  .delete-modal-title p{
    padding-left: 5%;
    float: left;
    margin-right: 55%;
  }
  .delete-modal-body {
    position: relative;
    padding: 15px;
  }
  .delete-modal-footer {
    padding: 15px;
    text-align: right;
    border-top: 1px solid #e5e5e5;
  }
  .sr-only { clip: rect(0, 0, 0, 0); }

  .delete-modal-delete-confirm{
    margin-top: 20px;
    margin-left: 30px;
  }
  .delete-modal-delete-content{
    margin-top: 20px;
    margin-left: 100px;
    color: red;
  }
</style>