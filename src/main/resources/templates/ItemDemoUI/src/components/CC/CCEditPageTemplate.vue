<template>
	<!-- <div>为页面模板配置业务能力yy版本</div> -->
	<div>
		<div class="CCEditPageTemplate-CCLeft">
			<div class="template-page">
			    <div class="template-center">
				    <div class="template-head">
				      <div class="head-left">页面模板</div>
				    </div>
				    <div class="template-body">
				        <div class="one-container cc-page-name cc-page-size">
				          <span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span>
				          <div class="template-edit">
				            <div class="template-view">
				            <div v-bind:class="{'delet':show==1}">
				              <img src="/static/img/a-title.png" alt="图片" style="    float: left;width: 95%;" @click="showXf(1)"><img src="/static/img/delete-blue.png" style="float:left" @click="deletel(1)" ></div>
				              <div class="xf-clear"></div>

				              <div v-bind:class="{'delet':show==2}">
				              <img src="/static/img/a-type.png" style="float: left;width: 95%;" alt="图片" @click="showXf(2)"><img src="/static/img/delete-blue.png" style="float:left" @click="deletel(2)"></div>
<div class="xf-clear"></div>
                              <div v-bind:class="{'delet':show==3}">
				              <img src="/static/img/a-maidian.png" alt="图片" @click="showXf(3)" style="    float: left;width: 95%;" ><img src="/static/img/delete-blue.png" style="float:left" @click="deletel(3)"></div>
<div class="xf-clear"></div>
				              <img src="/static/img/a-img.png" alt="图片" @click="showXf(4)" >
				              <div class="xf-clear"></div>
				              <!-- <div style="width: 480px;height: 19px;border: 1px solid transparent;position: absolute;top: 180px;left: 46px;" @click="showTitle"></div>
				              <div style="width: 480px;height: 65px;border: 1px solid transparent;position: absolute;top: 205px;left: 46px;" @click="showSale"></div> -->
				            </div>
				            <!-- <div class="bottoms">
				               <button class="link-btn link-btn-delete delete" @click="deleteDialog(item)">删除</button>
				            </div> -->
				          </div>
				        </div>
				        <br/><br/>
				    </div>
				    <!-- <div class="template-body" @click="showAbility">
				        <div class="one-container cc-page-name" v-for="(item,index) in pageList">
				          <span class="titem-name">页面模板名称：{{item.name}}</span>
				          <div class="template-edit">
				            <div class="template-view">
				              <img v-bind:src="item.imgPath" class="template-img cc-img">
				            </div>
				            <div class="bottoms">
				               <button class="link-btn link-btn-delete delete" @click="deleteDialog(item)">删除</button>
				            </div>
				          </div>
				        </div>
				        <br/><br/>
				    </div> -->
			    <br/>  <br/>
				</div>
				<div class = "template-confirm">
					<router-link to="/publishIdentity"  class="link-btn link-btn-blue">保存</router-link>
				</div>
		    <IMask :hide-mask.sync="hideMask"></IMask>
		    <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
		  	</div>
		</div>
<!-- 左侧边栏结束 -->
		<div class="CCEditPageTemplate-CCRight">
			<div class="CCBability" v-if="clickContent==1||clickContent==5">
				<div class="CCEditPageTemplate-CCRight-top">
					<span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span>
					<span class="text">描述标题</span>
					<button class = "link-btn link-btn-primary title-button">保存</button>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="CCability">
						<p>标题长度范围：</p>
						<div class="CCability-check CCability-check-limit">
							<input type="text" class = "cc-input-limit" placeholder="单位：字"> - <input type="text"  class = "cc-input-limit" placeholder="单位：字">
						</div>
					</div>
					<div class="CCability">
						<p>是否敏感词过滤:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
					</div>
				</div>
			</div>

			<div class="CCBability" v-if="clickContent==2||clickContent==5">
				<div class="CCEditPageTemplate-CCRight-top">
					<span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span>
					<span class="text">描述宝贝类型</span>
					<button class = "link-btn link-btn-primary title-button">保存</button>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="CCability">
						<span>单选框1：</span>
							<input type="text" class = "cc-input-limit" placeholder="12">
						<span>单选框2：</span>
							<input type="text" class = "cc-input-limit" placeholder="12">
					</div>
				</div>
			</div>

			<div class="CCBability" v-if="clickContent==3||clickContent==5">
				<div class="CCEditPageTemplate-CCRight-top">
					<span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span>
					<span class="text">描述宝贝卖点</span>
					<button class = "link-btn link-btn-primary title-button">保存</button>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="CCability">
						<span>字数限制：</span>
							不超过<input type="text" class = "cc-input-limit" placeholder="">个字
					</div>
				</div>
			</div>
			<div class="xf-clear"></div>
			<div class="CCBability" v-if="clickContent==4||clickContent==5">
				<div class="CCEditPageTemplate-CCRight-top">
					<span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span>
					<span class="text">描述宝贝图片</span>
					<button class = "link-btn link-btn-primary title-button">保存</button>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="CCability">
						<span>长度：</span>
						<input type="text" class = "cc-input-limit" placeholder="12">
						<span>宽度：</span>
						<input type="text" class = "cc-input-limit" placeholder="12">
						<span>路径：</span>
						<input type="text" class = "cc-input-limit" placeholder="C://桌面/帆布鞋.png">
					</div>
				</div>
			</div>
		</div>
		<div class="xf-clear"></div>
	</div>
</template>
<style scoped>
    .template-head{width:83%;min-width:;}
	.CCEditPageTemplate-CCLeft{width: 50%;float: left;}
	.CCEditPageTemplate-CCRight{width: 45%;float: left;margin-left: 20px;}
	.CCEditPageTemplate-CCRight-top .xf-ability-icon{
		background: url(/static/img/ability.png);
	    width: 24px;
	    height: 23px;
	    display: inline-block;
	    position: relative;
	    top: 9px;
	    left: 26%;
	}
    .xf-ability-icon-active{background: url(/static/img/ability-choosed.png)!important;}
    .CCEditPageTemplate-CCRight-top input[type="checkbox"]{margin-left:5%;margin-top:4px;}
	.CCEditPageTemplate-CCRight-top span.text{font-size:16px;margin-left:35%;}
	.CCBability{margin-bottom: 50px;border:1px solid #f0f0f0;}
	.CCabiLlity-title{float: left;}
	.CCability-check{float: left;width: 90px;margin-left: 5%;}
	.CCability-check input{padding:5px;}
	.check-cc{width: 18px;height: 18px;margin-right: 5px;margin-top: 5px;}
	.CCability-check label{position: relative;top:-3px;}
	.CCBusiness-ability{margin-bottom: 30px;}
	.CCability{clear:both;}
	.CCability p{margin-left: 20px;font-size: 105%;padding:10px;}
	.CCability>div{margin-left: 65px;}
	.cc-page-name{width: 80%;}
	.cc-img{margin:15px 130px;}
	.cc-input-limit{border:1px solid #999;width:65px;border-radius: 2px;}
	.CCability-check-limit{width:100%;}
	.CCability-to{float: left;margin:-5px 20px 0;}
	.CCEditPageTemplate-CCRight-top{border: 1px solid #ddd;width: 100%;height: 50px;border-radius: 6px;clear:both;}
	.CCEditPageTemplate-CCRight-top:hover{border: 1px solid #448bc7;background: #f0f0f0;}
	.CCEditPageTemplate-CCRight-top p{text-align: center;margin-top: 12px;font-size: 120%;}
	.CCEditPageTemplate-CCRight-bottom{width: 90%;padding:15px 10px;}
	.bottoms{right:114px;}
	.template-confirm{margin-left: 30%;}
	.cc-page-size{height:auto;}
	.template-view img{margin-top: 20px;}
	/*.title-button{margin-left: 120px;margin-top: 10px;}*/
	.title-button{float: right;margin-right: 20px;margin-top: 8px;}
	.delet{display: none}
</style>
<script>
  import Delete from "../Delete"
  import IMask from "../Mask"
  export default{
    data(){
      return {
        pageList:[],
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true,
        show:'5',
        clickContent:'5'
      }
    },
    components:{"Delete":Delete,"IMask":IMask},
    mounted:function(){
      this.$nextTick(function(){
        this.getPages();
      })
    },
    methods:{
      getPages:function(){
        this.$http.get("/api/getList").then((res)=>{
          this.pageList = JSON.parse(res.body.data).result.pageList;
        })
      },
      deleteDialog:function(i){
        this.hideDialog = !this.hideDialog
        this.hideMask = !this.hideMask
        this.deleteContent.item = i
      },
      closeDialog:function(childData){
        this.hideDialog = childData
        this.hideMask = childData
      },
      showXf:function(i){
      	this.clickContent = i
      },
      deletel:function(i){
      	this.show = i
      }
    }
  }
</script>