<template>
  <transition name="xf-app">
	<div class = "applicationReg" v-if="!hideDialog">
		<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" style="width:700px;margin-top:50px">
		  <el-form-item label="应用名称" prop="appname">
            <el-input v-model="ruleForm.appname"></el-input>
          </el-form-item>
          <el-form-item label="应用描述" prop="appdesc">
    		<el-input type="textarea" v-model="ruleForm.appdesc"></el-input>
  		  </el-form-item>
        </el-form>

		<div class = "delete-modal-footer">
			<button class = "link-btn link-btn-blue" @click="submitForm('ruleForm')">确认</button>
			<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
		</div>
		<p class="server-message server-message-registerApp" v-if="server_message!=0"><i class="el-icon-information" style="color:red"></i> {{this.server_message}}</p>
	</div>
  </transition>
</template>
<script>
	export default{
		data(){
			return {
				ruleForm:{
					appname:'',
					appdesc:''
				},
				server_message:'0',
				rules:{
					appname:[
						{required:true,message:'请输入名称',trigger:'blur'},
						{min:3,max:5,message:'长度在 3-5 个字符',trigger:'blur'}
					],
					appdesc: [
            			{ required: true, message: '请填写应用内容', trigger: 'blur' }
          			]
				}
			}
		},
		props:['hideDialog','hideMask'],
		methods:{
			submitForm(formName){
				this.$refs[formName].validate((valid)=>{
					if(valid){
						var _this = this;
						this.$http.post('/api/app/app_add',JSON.stringify(this.ruleForm)).then(function(res){
							if(res.body.code=='200'){
								this.$emit("isClose",!this.hideDialog)
								window.location.reload();
							}
							if(res.body.code=='401'){
								this.server_message = "该应用名称已经存在，请重新填写";
							}
							if(res.body.code=='error'){
								this.server_message = "系统错误，请尝试重新连接"
							}
							
						})
						
					}else{
						console.log('error');
						return false;
					}
				})
			},
			closeDialog:function(){
				this.$emit("isClose",!this.hideDialog)
			}
		}
	}
</script>
<style scoped>
    .hide-dialog{display: none}
    .applicationReg{width:800px;background-color: #fff;z-index:103;position: fixed;top: 7%;left: 20%;border-radius: 4px;box-shadow: 2px 2px 1px #000;z-index:1102;}
	.delete-modal-footer{margin: 20px;float: right}
	.server-message-registerApp{margin-left:100px;margin-top:50px}
</style>