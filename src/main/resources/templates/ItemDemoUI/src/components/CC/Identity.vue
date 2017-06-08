<template>
	<div>
	<Step :step="step" style="margin-left:0%"></Step>
	<div class="xf-identity-main">
	   <div class="xf-item-header">
	   	 <i class="xf-icon-chooseidentity"></i>
	   	 <span>选择业务身份</span><sup class="xf-sup-identity">3</sup>
	   	 <el-select style="margin-left:10px" v-model="identitytype" filterable placeholder="筛选条件">
    		<el-option-group v-for="group in identitytypeList" :key="group.label" :label="group.label">
    			<el-option
		          v-for="item in group.options"
		          :key="item.value"
		          :label="item.label"
		          :value="item.label">
		        </el-option>
		      </el-option-group>
  		    </el-select>
		 <!-- <span style="font-size:16px;" @click="showFilter=!showFilter">全部<i style="margin-left:5px" class="el-icon-caret-bottom xf-edit-icon"></i></span>
		 <transition name="fromtop">
		 <select class="xf-identity-type-ul" v-if="showFilter==1">
		 	<option class="xf-identity-type-li"><a>全部</a><sup class="xf-sup-identity" title="点我选择全局业务身份">3</sup></option>
		 	<option class="xf-identity-type-li"><a>全局业务身份</a><sup class="xf-sup-identity" title="点我选择全局业务身份">3</sup></option>
		 	<option class="xf-identity-type-li"><a>局部业务身份</a><sup class="xf-sup-identity" title="点我选择全局业务身份">3</sup></option>
		 </select> -->
		 </transition>
	   </div>
	   <div>
	   	 <div v-if="!addAndUse" class="xf-item-box xf-item-box-new" @click="addIdentity" >
	   	 	<div class="new-big-bg"></div>
	   	 	<p>新建业务身份</p>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/cCprocess">
	   	 	<i class="xf-icon-identity"></i><span title="点击查看详情"><router-link to="/identityDetail">淘宝女装-衬衫商品发布</router-link></span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>流程总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>页面模板总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>业务能力总数</p>
	   	 		</div>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/cCprocess">
	   	 	<i class="xf-icon-identity"></i><span title="点击查看详情"><router-link to="/identityDetail">淘宝女装-T-shirt商品发布</router-link></span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>流程总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>页面模板总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>业务能力总数</p>
	   	 		</div>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-item-box xf-item-box-chooose">
	   	   <router-link to="/cCprocess">
	   	 	<i class="xf-icon-identity"></i><span title="点击查看详情"><router-link to="/identityDetail">淘宝男鞋-帆布鞋商品发布</router-link></span>
	   	 	<div class="xf-item-box-des">
	   	 	   <span class="xf-item-box-des-content">描述:描述文字描述文字描述文字描述文字描述文字描述文字</span>
	   	 	   <br>
	   	 	   <span class="xf-item-box-des-content">归属方：XXX</span>
	   	 	</div>
	   	 	<div class="xf-show-detail">
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>流程总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>页面模板总数</p>
	   	 		</div>
	   	 		<div class="xf-show-detail-box">
	   	 			<p><span>2</span></p>
	   	 			<p>业务能力总数</p>
	   	 		</div>
	   	 	</div>
	   	   </router-link>
	   	 </div>
	   	 <div class="xf-clear"></div>
	   </div>
	   <div class="xf-skip-step" v-if="addAndUse">
	   	 <router-link to="/cCprocess"><span>跳过此步骤？</span></router-link>	   	
	   </div>
	   <IMask :hide-mask.sync="hideMask"></IMask>
       <AddIdentity :hide-identity.sync="hideIdentity" :hide-mask.sync="hideMask" v-on:increment="closeDialog" v-on:confirm="confirm"></AddIdentity>
	</div>
	</div>
</template>
<script>
	import AddIdentity from "../BB/AddIdentity"
	import IMask from "../Mask"
	import Step from './Step.vue'
	export default{
		data(){
			return{
				hideIdentity:true,
				hideMask:true,
				addAndUse:false,
				step:'1',
				identitytype:'',
				identitytypeList:[{
						          label: '全局业务身份',
						          options: [{
						            value: 'tm',
						            label: '天猫'
						          }, {
						            value: 'tb',
						            label: '淘宝'
						          }]
						        }, {
						          label: '原子业务身份',
						          options: [{
						            value: 'tmpublish',
						            label: '天猫商品发布'
						          }, {
						            value: 'tbpublish',
						            label: '淘宝商品发布'
						          }, {
						            value: 'tbjy',
						            label: '淘宝交易'
						          }, {
						            value: 'tmjy',
						            label: '天猫交易'
						          }]
						        }],
			}
		},
		mounted() {

    	},
		destroyed:function(){
			this.addAndUse = false;
		},
		components:{AddIdentity,IMask,Step},
		methods:{
			addIdentity:function(){
				this.hideMask=!this.hideMask
				this.hideIdentity=!this.hideIdentity
			},
			closeDialog:function(data){
				this.hideIdentity = data
				this.hideMask = data
			},
			confirm:function(data){
				this.hideIdentity = data
				this.hideMask = data
				this.addAndUse = data
			}
		}
	}
</script>
<style scoped>
	.xf-identity-main{height:650px;margin-top:80px;background: #f7f7f9;padding:5% 5%;}
	.xf-item-header span,.xf-el-dropdown-link{font-size:20px;margin-left:10px;}
	.xf-item-header{margin-bottom:10px;position: relative;}
	.xf-item-box{background:#fff;transition:All 0.3s ease-in-out;border:1px solid;border-color: #f0f0f0;float: left;margin-right: 4%;width:26%;height:200px;margin-bottom:20px;padding:15px 10px;overflow: hidden;white-space:normal;word-wrap:break-word; }
	.xf-item-box-chooose span{font-size:18px;color:#333;}
	.xf-item-box-chooose .xf-show-detail,.xf-item-box-des,.xf-item-box-des span{font-size:14px;color:#ccc;}
	.xf-item-box-new{border:2px dashed #f0f0f0;}
	.xf-show-detail{margin-top:20px;}
	.xf-show-detail span{color:#448bc7;font-size:16px}
	.xf-item-box:hover{transform:translate(0,-4px);border:1px solid #448bc7;}
	.new-big-bg{background: url("../../assets/img/new-big.png");width: 80px;height: 80px; margin: 10px auto;}
	.xf-item-box-new:hover .new-big-bg{background: url("../../assets/img/new-big-blue.png")}
	.xf-item-box-new p{text-align: center;margin-top:30px;}
	.xf-icon-chooseidentity{background: url("../../assets/img/choose-identity.png");width:20px;height:20px;display: inline-block;position: relative;top:4px;}
	.xf-icon-identity{background: url("../../assets/img/identity.png");width:19px;height:17px;display: inline-block;position: relative;margin-right:10px;}
	.xf-show-detail-box{width:31%;display: inline-block;text-align: center;}
	.xf-skip-step{float:right;}
	.xf-skip-step span{color:#000;cursor: pointer;}
	.xf-skip-step span:hover{color:#448bc7;}
	.xf-sup-identity{
	    background-color:#448bc7;
	    border-radius:10px;
	    color:#fff;
	    display: inline-block;
	    font-size:12px;
	    height:18px;
	    line-height: 18px;
	    padding:0 6px;
	    text-align: center;
	    white-space: nowrap;
	    border: 1px solid #fff;
	    position: relative;
	    top:-8px;
	 }
	 .xf-identity-type-ul{
	 	z-index:100;
	 	margin:5px 0;
	 	border:1px solid #d1dbe5;
	 	box-shadow: 0 2px 4px rgba(0,0,0,.12), 0 0 6px rgba(0,0,0,.12);
	 	padding:8px 0px;
	 	width:200px;
	 	position: absolute;
	 	left:180px;
	 	background-color: #fff;
	 	top:25px;
	 }
	 .xf-identity-type-ul .xf-identity-type-li{height:30px;padding-left:18px;cursor: pointer;}
	 .xf-identity-type-ul .xf-identity-type-li:hover{background: #f0f0f0}
	 .fromtop-enter-active, .fromtop-leave-active {
	    transition: opacity .5s
	  }
     .fromtop-enter, .fromtop-leave-active {
        opacity: 0
      }
</style>
