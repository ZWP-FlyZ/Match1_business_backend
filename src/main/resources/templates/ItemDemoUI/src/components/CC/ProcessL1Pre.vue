<template>
	<div class = "deleteAability" v-bind:class="{'hidePre':hidePre}">
	      <div class="delete-modal-dialog">
	        <div class="delete-modal-content">
			<div class="delete-modal-body">
				<div class = "delete-modal-delete-confirm">
					<span class="icon-delete"></span>请为流程配置前置条件
				</div>
				<div class = "delete-modal-delete-content">
				  <div class="item xf-item xf-item-fix" v-for="i in count">
		            <div style="width:13%">
		              <el-select v-model="value1" filterable placeholder="请选择">
		                  <el-option v-for="item in outPreOptions" :key="item.name" :label="item.name" :value="item.name"></el-option>
		               </el-select>
		            </div>
              		<div style="width:60%">
                	   <span class="xf-span-fix">若等于</span>
                		<el-select v-model="value2" filterable placeholder="请选择">
                          <el-option v-for="item in outPreCondition" :key="item.name" :label="item.name" :value="item.name"></el-option>
                        </el-select>
                        <span class="xf-span-fix">则选择 <b>强管控流程</b>; 否则选择 <b>弱管控流程</b></span>
              		</div>
              		<div style="width:13%">
                		<el-select v-model="value3" filterable placeholder="请选择">
                  			<el-option v-for="item in options" :key="item.value" :label="item.value" :value="item.value"></el-option>
                		</el-select>
              		</div>
              		<div class="xf-predition-delete">
                		<i class="el-icon-plus xf-edit-icon
                		" @click="showAdvance"></i>
                		<i v-if="i!=1" class="el-icon-minus xf-edit-icon" @click="hideAdvance"></i>
              		</div>
            	   </div>
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
	  data(){
	  	return{
	  	  options:[
            {value:'无'},
            {value:'与'},
            {value:'或'}
          ],
          outPreCondition:[],
          outPreOptions:[],
          count:1
	  	}
	  },
	  props:['message','hidePre','hideMask'],
	  mounted:function(){
        this.$nextTick(function(){
          this.queryData();
        })
      },
	  methods:{
	  	queryData:function(){
          var mySelf = this
          this.outPreOptions = [{"id":"1","name":"商家类型"},{"id":"2","name":"前置条件1"},{"id":"3","name":"前置条件2"},{"id":"4","name":"前置条件3"}];
          this.outPreCondition = [{"id":"value1","name":"天猫商家"},{"id":"value2","name":"淘宝商家"},{"id":"value3","name":"聚划算商家"}];
          /*this.$http.get("/api/getList").then(res=>{
            mySelf.outPreOptions = JSON.parse(res.body.data).result.outPreCondition;
          })*/
        },
	  	closeDialog:function(){
	  		this.$emit("closePre",!this.hidePre,0)
	  	},
	  	confirmDelete:function(){
	  		this.$emit("closePre",!this.hidePre,1)
	  	/*this.$http.post(this.message.url,object,{emulateJSON: true}).then((res)=>{
          console.log(res.bodyText);
        }).then((error)=>{
        })*/
	  },
	  showAdvance:function(){
	  	this.count++;
	  },
	  hideAdvance:function(){
	  	this.count--;
	  }
	 }
    }
</script>
<style scoped>
	.hidePre{display: none}
	.icon-delete{background-position: -248px 0px;width: 22px;height: 22px;display: inline-block;background-image: url(../../assets/img/icon.png);position: relative;top: 6px;left: -9px;}
	.deleteAability{
		/*border:1px solid red;*/
		width: 1000px;
		/*margin:0 auto;*/
		position: fixed;
		top: 25%;
		left: 15%;
		z-index:103;
	}/
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
  }
  .xf-item{display: flex;margin-bottom:20px;}
  .delete-modal-delete-content input{width:80%;}
  .xf-edit-icon{top:4px;position:relative;left:10px;}
</style>