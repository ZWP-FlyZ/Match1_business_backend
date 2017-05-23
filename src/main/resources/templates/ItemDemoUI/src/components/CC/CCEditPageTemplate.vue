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
		<div class="CCEditPageTemplate-CCRight">
		<!-- 能力1开始 -->
			<div class="CCBusiness-ability">
				<h2>描述标题</h2>
				<div class="CCability">
					标题长度：<br/>
					<div class="CCability-check CCability-check-limit">
						<input type="text" class = "cc-input-limit"><div class="CCability-to"> - </div><input type="text"  class = "cc-input-limit">
					</div>
				</div>
				<div class="CCability">
					敏感词过滤:<br/>
					<div class="CCability-check"><input type="checkbox">是</div>
					<div class="CCability-check"><input type="checkbox">否</div>
				</div>
			</div>
		<!-- 能力1结束 -->
		<!-- 能力2开始 -->
			<div class="CCBusiness-ability">
				<h2>描述宝贝卖点</h2>
				<div class="CCability">
					品牌:<br/>
					<div class="CCability-check"><input type="checkbox">三星</div>
					<div class="CCability-check"><input type="checkbox">小米</div>
					<div class="CCability-check"><input type="checkbox">华为</div>
					<div class="CCability-check"><input type="checkbox">iPhone</div>
				</div>
				<div class="CCability">
					型号:<br/>
					<div class="CCability-check"><input type="checkbox">Galaxy</div>
					<div class="CCability-check"><input type="checkbox">5S</div>
					<div class="CCability-check"><input type="checkbox">p9</div>
					<div class="CCability-check"><input type="checkbox">7plus</div>
				</div>
				<div class="CCability">
					CPU:<br/>
					<div class="CCability-check"><input type="checkbox">128G</div>
					<div class="CCability-check"><input type="checkbox">32G</div>
					<div class="CCability-check"><input type="checkbox">64G</div>
				</div>
				<div class="CCability">
					CPU:<br/>
					<div class="CCability-check"><input type="checkbox">128G</div>
					<div class="CCability-check"><input type="checkbox">32G</div>
					<div class="CCability-check"><input type="checkbox">64G</div>
				</div>
				<div class="CCability">
					CPU:<br/>
					<div class="CCability-check"><input type="checkbox">128G</div>
					<div class="CCability-check"><input type="checkbox">32G</div>
					<div class="CCability-check"><input type="checkbox">64G</div>
				</div>
			</div>
		<!-- 能力2开始 -->
		<!-- 能力3开始 -->
			<div class="CCBusiness-ability">
				<h2>描述手机</h2>
				<div class="CCability">
					品牌:<br/>
					<div class="CCability-check"><input type="checkbox">三星</div>
					<div class="CCability-check"><input type="checkbox">小米</div>
					<div class="CCability-check"><input type="checkbox">华为</div>
					<div class="CCability-check"><input type="checkbox">iPhone</div>
				</div>
				<div class="CCability">
					型号:<br/>
					<div class="CCability-check"><input type="checkbox">Galaxy</div>
					<div class="CCability-check"><input type="checkbox">5S</div>
					<div class="CCability-check"><input type="checkbox">p9</div>
					<div class="CCability-check"><input type="checkbox">7plus</div>
				</div>
				<div class="CCability">
					CPU:<br/>
					<div class="CCability-check"><input type="checkbox">128G</div>
					<div class="CCability-check"><input type="checkbox">32G</div>
					<div class="CCability-check"><input type="checkbox">64G</div>
				</div>
				<div class="CCability">
					CPU:<br/>
					<div class="CCability-check"><input type="checkbox">128G</div>
					<div class="CCability-check"><input type="checkbox">32G</div>
					<div class="CCability-check"><input type="checkbox">64G</div>
				</div>
				<div class="CCability">
					CPU:<br/>
					<div class="CCability-check"><input type="checkbox">128G</div>
					<div class="CCability-check"><input type="checkbox">32G</div>
					<div class="CCability-check"><input type="checkbox">64G</div>
				</div>
			</div>

		<!-- 能力3开始 -->
		</div>
		<div class="xf-clear"></div>
	</div>
</template>
<style scoped>
	.CCEditPageTemplate-CCLeft{
		width: 50%;
		float: left;
	}
	.CCEditPageTemplate-CCRight{
		width: 45%;
		float: left;
		margin-left: 20px;
	}
	.CCabiLlity-title{float: left;}
	.CCability-check{
		float: left;
		width: 60px;
		margin-left: 5%;
		margin-right: 10px;
	}
	.CCBusiness-ability{
		margin-bottom: 30px;
	}
	.CCability{clear:both;}
	.cc-page-name{width: 80%;}
	.cc-img{margin:15px 130px;}
	.cc-input-limit{border:1px solid #000;width:60px;float:left;}
	.CCability-check-limit{width:100%;}
	.CCability-to{float: left;margin:-5px 20px 0;}
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