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
				        <div class="one-container cc-page-name" v-for="(item,index) in pageList">
				          <router-link to="/registerPageTemplate" class="titem-name">页面模板名称：{{item.name}}</router-link>
				          <div class="template-edit">
				            <div class="template-view">
				              <img v-bind:src="item.imgPath" class="template-img cc-img">
				            </div>
				            <div class="bottoms">
				              <router-link to="/registerPageTemplate" class="link-btn link-btn-primary bottom-item">配置</router-link>
				              <br/>
				              <a href="#" class="link-btn link-btn-look bottom-item">查看</a>
				              <br/>
				               <button class="link-btn link-btn-delete delete" @click="deleteDialog(item)">删除</button>
				            </div>
				          </div>
				        </div>
				        <br/><br/>
				    </div>
				    <div class="template-body">
				        <div class="one-container cc-page-name" v-for="(item,index) in pageList">
				          <router-link to="/registerPageTemplate" class="titem-name">页面模板名称：{{item.name}}</router-link>
				          <div class="template-edit">
				            <div class="template-view">
				              <img v-bind:src="item.imgPath" class="template-img cc-img">
				            </div>
				            <div class="bottoms">
				              <router-link to="/registerPageTemplate" class="link-btn link-btn-primary bottom-item">配置</router-link>
				              <br/>
				              <a href="#" class="link-btn link-btn-look bottom-item">查看</a>
				              <br/>
				               <button class="link-btn link-btn-delete delete" @click="deleteDialog(item)">删除</button>
				            </div>
				          </div>
				        </div>
				        <br/><br/>
				    </div>
			    <br/>  <br/>
				</div>
		    <IMask :hide-mask.sync="hideMask"></IMask>
		    <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
		  	</div>
		</div>
<!-- 左侧边栏结束 -->
		<div class="CCEditPageTemplate-CCRight">
			<div class="CCBability">
				<div class="CCEditPageTemplate-CCRight-top">
					<img src="/static/img/glyphicons-742-fingerprint.png" alt="">
					<p>描述标题</p>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="CCability">
						<p>标题长度：</p>
						<div class="CCability-check CCability-check-limit">
							<input type="text" class = "cc-input-limit"><div class="CCability-to"> - </div><input type="text"  class = "cc-input-limit">
						</div>
					</div>
					<div class="CCability">
						<p>敏感词过滤:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
					</div>
				</div>
			</div>

			<div class="CCBability">
				<div class="CCEditPageTemplate-CCRight-top">
					<img src="/static/img/glyphicons-744-fingerprint-ok-blue.png" alt="">
					<p>描述宝贝卖点</p>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="CCability">
						<p>品牌:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>三星</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>小米</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>华为</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>苹果</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>中兴</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>OPPO</label></div>
					</div>
				</div>
			</div>
		</div>
		<div class="xf-clear"></div>
	</div>
</template>
<style scoped>
	.CCEditPageTemplate-CCLeft{width: 50%;float: left;}
	.CCEditPageTemplate-CCRight{width: 45%;float: left;margin-left: 20px;}
	.CCEditPageTemplate-CCRight-top img{float: left;margin-top:10px;margin-left: 3px;}
	.CCBability{margin-bottom: 50px;}
	.CCabiLlity-title{float: left;}
	.CCability-check{float: left;width: 90px;margin-left: 5%;}
	.CCability-check input{padding:5px;}
	.check-cc{width: 18px;height: 18px;margin-right: 5px;margin-top: 5px;}
	.CCability-check label{font-size: 105%;position: relative;top:-3px;}
	.CCBusiness-ability{margin-bottom: 30px;}
	.CCability{clear:both;}
	.CCability p{margin-left: 20px;font-size: 110%;padding:10px;}
	.CCability>div{margin-left: 65px;}
	.cc-page-name{width: 80%;}
	.cc-img{margin:15px 130px;}
	.cc-input-limit{border:1px solid #999;width:60px;float:left;border-radius: 2px;}
	.CCability-check-limit{width:100%;}
	.CCability-to{float: left;margin:-5px 20px 0;}
	.CCEditPageTemplate-CCRight-top{border: 1px solid blue;width: 90%;height: 50px;border-radius: 6px;}
	.CCEditPageTemplate-CCRight-top:hover{border: 1px solid red;background: #f5f5f5;}
	.CCEditPageTemplate-CCRight-top p{text-align: center;margin-top: 12px;font-size: 120%;}
	.CCEditPageTemplate-CCRight-bottom{width: 90%;}
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
        hideMask:true
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
      }
    }
  }
</script>