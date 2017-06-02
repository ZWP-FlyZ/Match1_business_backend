<template>
  <transition name="xf-app">
	<div class = "applicationReg" v-if="!hideDialog">
		<!-- <div class = "applicationReg-des">
			<span>注册应用</span>
			<hr />
		</div>
		<div class = "theme-content">
			<div class = "form-theme">
				<span>名称：</span>
				<input type="text" placeholder="请输入名称">
			</div>
			<div class = "form-content">
				<span>描述：</span>
				<textarea name="" id=""  rows="5" placeholder="请输入描述"></textarea>
			</div>
		</div>
		<div class = "theme-content person">
			<div class = "form-theme">
				<span>负责人:</span>
				<input type="text" >
			</div>
		</div> -->
		<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" style="width:700px;margin-top:50px">
		  <el-form-item label="应用名称" prop="name">
            <el-input v-model="ruleForm.name"></el-input>
          </el-form-item>
          <el-form-item label="应用描述" prop="desc">
    		<el-input type="textarea" v-model="ruleForm.desc"></el-input>
  		  </el-form-item>
        </el-form>

		<div class = "delete-modal-footer">
			<button class = "link-btn link-btn-blue" @click="submitForm('ruleForm')">确认</button>
			<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
		</div>
	</div>
  </transition>
</template>
<script>
	export default{
		data(){
			return {
				ruleForm:{
					name:'',
					desc:''
				},
				rules:{
					name:[
						{required:true,message:'请输入名称',trigger:'blur'},
						{min:3,max:5,message:'长度在 3-5 个字符',trigger:'blur'}
					],
					desc: [
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
						console.log('submit')
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
    .applicationReg{width:800px;background-color: #fff;z-index:103;position: fixed;top: 7%;left: 20%;border-radius: 4px;box-shadow: 2px 2px 1px #000;z-index:1000;}
	

	.delete-modal-footer{margin: 20px;float: right}
	
</style>