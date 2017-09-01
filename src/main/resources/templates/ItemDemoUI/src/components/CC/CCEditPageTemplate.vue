<template>
	<!-- <div>为页面模板配置业务能力yy版本</div> -->
	<div>
	   <HistoryPath :historyPathTitle="historyPathTitle"></HistoryPath>
		<div class="CCEditPageTemplate-CCLeft">
			<div class="template-page">
			    <div class="template-center">
				    <div class="template-head">
				      <div class="head-left">页面模板</div>
				    </div>
				    <div class="template-body">
				    <!-- 普通样式 -->
				        <div class="one-container cc-page-name cc-page-size" v-if="(AlignStyle==-1&&ColorStyle==-1)||(AlignStyle==-1&&ColorStyle==0)||(AlignStyle==0&&ColorStyle==-1)||(AlignStyle==0&&ColorStyle==0)">
				          <div style="width: 100%;height: 37px;top: 2px;left: 19px;" class="beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==0}" @click="showRight(0)"><span class="titem-name">页面模板名称：童鞋一口价商品发布页面模板</span></div>
						   <div class= "classify-title">1.宝贝基本信息</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==2}" @click="showRight(2)"  v-if = "LogoNum!=2">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝类型</label>
						   		</div>
						   		<div  style="width:80%">
						   			<el-radio class="radio" v-model="type" label="1">全新</el-radio>
  									<el-radio class="radio" v-model="type" label="2">二手</el-radio>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=2}" @click="showLogo(2)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability" v-if = "LogoNum!=3" v-bind:class="{'afterCheck':clickBorderContent==3}" @click="showRight(3)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝标题</label>
						   		</div>
						   		<div style="width:80%">
						   			<el-input placeholder="请输入内容"></el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=3}" @click="showLogo(3)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability" v-if = "LogoNum!=4" v-bind:class="{'afterCheck':clickBorderContent==4}" @click="showRight(4)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝卖点</label>
						   		</div>
						   		<div style="width:80%">
						   			<el-input type="textarea" :rows="2" placeholder="请输入内容">
						   			</el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=4}" @click="showLogo(4)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==6}" @click="showRight(6)" v-if = "LogoNum!=6">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝图片</label>
						   		</div>
						   		<div style="width:80%">
						   			<img src="../../assets/img/page-pic1.jpg" alt="图片" class="basic-bzability-img">
						   			<img src="../../assets/img/page-pic2.png" alt="图片" class="basic-bzability-img">
						   			<img src="../../assets/img/page-pic3.png" alt="图片" class="basic-bzability-img">
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=6}" @click="showLogo(6)" class="xf-red-delete">
						   		</div>
						   	</div>
						   <div class= "classify-title">2.宝贝物流</div>
						   <div class= "classify-title">3.售后保障信息</div>
						   <div class= "classify-title">4.宝贝其他信息</div>
				        </div>
				        <!-- 普通样式结束 -->

				        <!-- 左对齐样式 -->
				        <div class="one-container cc-page-name cc-page-size" v-if="(AlignStyle==1&&ColorStyle==-1)||(AlignStyle==1&&ColorStyle==0)">
				           <div style="width: 100%;height: 37px;top: 2px;left: 19px;" class="beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==0}" @click="showRight(0)"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>
				          <div class= "classify-title">1.宝贝基本信息</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==2}" @click="showRight(2)"  v-if = "LogoNum!=2">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝类型</label>
						   		</div>
						   		<div  style="width:80%">
						   			<el-switch v-model="type" on-text="全新" off-text="二手">
						   			</el-switch>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=2}" @click="showLogo(2)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability" v-if = "LogoNum!=3" v-bind:class="{'afterCheck':clickBorderContent==3}" @click="showRight(3)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝标题</label>
						   		</div>
						   		<div  style="width:80%">
						   			<el-input placeholder="请输入内容"></el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=3}" @click="showLogo(3)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability"  v-if = "LogoNum!=4" v-bind:class="{'afterCheck':clickBorderContent==4}" @click="showRight(4)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝卖点</label>
						   		</div>
						   		<div style="width:80%">
						   			<el-input type="textarea" :rows="2" placeholder="请输入内容" 
						   			>
						   			</el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=4}" @click="showLogo(4)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==6}" @click="showRight(6)" v-if = "LogoNum!=6">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝图片</label>
						   		</div>
						   		<div style="width:80%">
						   			<img src="../../assets/img/page-pic1.jpg" alt="图片" class="basic-bzability-img">
						   			<br />
						   			<img src="../../assets/img/page-pic2.png" alt="图片" class="basic-bzability-img">
						   			<br />
						   			<img src="../../assets/img/page-pic3.png" alt="图片" class="basic-bzability-img">
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=6}" @click="showLogo(6)" class="xf-red-delete">
						   		</div>
						   	</div>
						   <div class= "classify-title">2.宝贝物流</div>
						   <div class= "classify-title">3.售后保障信息</div>
						   <div class= "classify-title">4.宝贝其他信息</div>
				          
				        </div>
				        <!-- 左对齐样式结束 -->

				        <!-- 对齐方式+颜色变换开始 -->
				         <div class="one-container cc-page-name cc-page-size" v-if="AlignStyle==1&&ColorStyle==1">
				           <div style="width: 100%;height: 37px;top: 2px;left: 19px;" class="beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==0}" @click="showRight(0)"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>
				          <div class= "classify-title">1.宝贝基本信息</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==2}" @click="showRight(2)"  v-if = "LogoNum!=2">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝类型</label>
						   		</div>
						   		<div  style="width:80%">
						   			<el-switch v-model="type" on-text="全新" off-text="二手">
						   			</el-switch>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=2}" @click="showLogo(2)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability" v-if = "LogoNum!=3" v-bind:class="{'afterCheck':clickBorderContent==3}" @click="showRight(3)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝标题</label>
						   		</div>
						   		<div  style="width:80%">
						   			<el-input class="xf-classify-title" placeholder="请输入内容"></el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=3}" @click="showLogo(3)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability"  v-if = "LogoNum!=4" v-bind:class="{'afterCheck':clickBorderContent==4}" @click="showRight(4)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝卖点</label>
						   		</div>
						   		<div style="width:80%">
						   			<el-input class="xf-classify-title" type="textarea" :rows="2" placeholder="请输入内容" 
						   			>
						   			</el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=4}" @click="showLogo(4)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==6}" @click="showRight(6)" v-if = "LogoNum!=6">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝图片</label>
						   		</div>
						   		<div style="width:80%">
						   			<img src="../../assets/img/page-pic4.png" alt="图片" class="basic-bzability-img">
						   			<br />
						   			<img src="../../assets/img/page-pic5.png" alt="图片" class="basic-bzability-img">
						   			<br />
						   			<img src="../../assets/img/page-pic6.png" alt="图片" class="basic-bzability-img">
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=6}" @click="showLogo(6)" class="xf-red-delete">
						   		</div>
						   	</div>
						   <div class= "classify-title">2.宝贝物流</div>
						   <div class= "classify-title">3.售后保障信息</div>
						   <div class= "classify-title">4.宝贝其他信息</div>
				        </div>
						<!-- 对齐方式+颜色变换结束 -->
						<!-- 变色样式 开始-->
				        <div class="one-container cc-page-name cc-page-size" v-if="(AlignStyle==0&&ColorStyle==1)||(AlignStyle==-1&&ColorStyle==1)">
				           <div style="height: 37px;top: 2px;left: 19px;" class="beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==0}" @click="showRight(0)"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>
				          <div class= "classify-title ">1.宝贝基本信息</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==2}" @click="showRight(2)"  v-if = "LogoNum!=2">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝类型</label>
						   		</div>
						   		<div  style="width:80%">
						   			<el-radio class="radio xf-classify-title" v-model="type" label="1">全新</el-radio>
  									<el-radio class="radio xf-classify-title" v-model="type" label="2">二手</el-radio>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=2}" @click="showLogo(2)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability"  v-if = "LogoNum!=3" v-bind:class="{'afterCheck':clickBorderContent==3}" @click="showRight(3)" >
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝标题</label>
						   		</div>
						   		<div style="width:80%">
						   			<el-input class="xf-classify-title" placeholder="请输入内容"></el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=3}" @click="showLogo(3)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability" v-if = "LogoNum!=4"  v-bind:class="{'afterCheck':clickBorderContent==4}" @click="showRight(4)">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝卖点</label>
						   		</div>
						   		<div style="width:80%">
						   			<el-input class="xf-classify-title" 
						   			:rows="2" placeholder="请输入内容"
						   			>
						   			</el-input>
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=4}" @click="showLogo(4)" class="xf-red-delete">
						   		</div>
						   	</div>
						   	<div class= "basic-bzability xf-basic-bzability beforeCheck" v-bind:class="{'afterCheck':clickBorderContent==6}" @click="showRight(6)"  v-if = "LogoNum!=6">
						   		<div style="width:17%">
						   			<label for="" class ="basic-bzability-title">宝贝图片</label>
						   		</div>
						   		<div style="width:80%">
						   			<img src="../../assets/img/page-pic4.png" alt="图片" class="basic-bzability-img">
						   			<img src="../../assets/img/page-pic5.png" alt="图片" class="basic-bzability-img">
						   			<img src="../../assets/img/page-pic6.png" alt="图片" class="basic-bzability-img">
						   		</div>
						   		<div>
						   			<img src="../../assets/img/delete-3.png" alt="" v-bind:class = "{'hide':DeleteLogoNums!=6}" @click="showLogo(6)" class="xf-red-delete">
						   		</div>
						   	</div>

						   <div class= "classify-title">2.宝贝物流</div>
						   <div class= "classify-title">3.售后保障信息</div>
						   <div class= "classify-title">4.宝贝其他信息</div>
				        </div>
						<!-- 变色样式结束 -->
				        <br/><br/>
				    </div>
			    <br/>  <br/>
				</div>
				<div class = "template-confirm">
					<router-link to="/cCEditProcessFchoosed"  class="link-btn link-btn-blue">保存</router-link>
					<label @click="showRight(110)"><router-link to=""  class="link-btn link-btn-primary" style="margin-left:10px;">查看所有业务能力</router-link></label>
				</div>
				<!-- <div class="BZProcess-table" style="border:0;">
		          <div class="BZ-edit">
		            <router-link to="/cCEditprocess"  class="link-btn link-btn-blue">上一步</router-link>
		            <router-link to="/cCEditprocess"  class="link-btn link-btn-blue">下一步</router-link>
		            <label @click="showRight(110)"><router-link to=""  class="link-btn link-btn-primary" style="margin-left:10px;">查看所有业务能力</router-link></label>
		          </div>
		        </div> -->
		    <IMask :hide-mask.sync="hideMask"></IMask>
		    <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
		  	</div>
		</div>
<!-- 左侧边栏结束 -->
		<div class="CCEditPageTemplate-CCRight">
			<div class="CCBability"  v-if="clickLeftContent==0||clickLeftContent==110">
				<!-- <el-collapse v-model="activeNames" @change="handleChange">
          			<el-collapse-item class="text" name="1">
          				<template slot="title">
      						UI样式
      						<button class = "link-btn link-btn-primary title-button">保存</button>
    					</template>
          			</el-collapse-item>
          		</el-collapse> -->
				<div class="CCEditPageTemplate-CCRight-top">
					<span class="text">UI样式</span>
					<button class = "link-btn link-btn-primary title-button">保存</button>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="ccright-UI">
						<div v-if="AlignStyle==-1"><!-- 初始化进来时 -->
							<label for="" class= "UI-name" >页面排列</label><img class = "UI-option img-out" src="../../assets/img/align-justify.png" alt="" title = "横向显示" @click="showAlign(0)"><img src="../../assets/img/align-left.png" alt="" title = "纵向显示" style = "margin-left:10px;" class = "img-out" @click="showAlign(1)">
							<hr>
						</div>
						<div v-if="AlignStyle==1"><!-- 选中“横向显示” -->
							<label for="" class= "UI-name" >页面排列</label><img class = "UI-option img-out" src="../../assets/img/align-justify.png" alt="" title = "横向显示" @click="showAlign(0)"><img src="../../assets/img/align-left.png" alt="" title = "纵向显示" style = "margin-left:10px;width:20px;height:20px;">
							<hr>
						</div>
						<div v-if="AlignStyle==0"><!-- 选中“纵向显示” -->
							<label for="" class= "UI-name" >页面排列</label><img class = "UI-option" src="../../assets/img/align-justify.png" alt="" title = "横向显示" style="width:20px;height:20px;"><img src="../../assets/img/align-left.png" alt="" title = "纵向显示" style = "margin-left:10px;" class = "img-out" @click="showAlign(1)">
							<hr>
						</div>
						<div v-if="ColorStyle==-1"><!-- 初始化 -->
							<label for="" class= "UI-name">背景颜色</label>
							<img src="../../assets/img/yellow.png" alt="" title = "淡黄色" style = "margin-left:10px;" class = "img-out" @click="showColor(1)">
							<img src="../../assets/img/grey.png" alt="" title = "默认色" style = "margin-left:10px;" class = "img-out" @click="showColor(0)">
							<hr>
						</div>
						<div v-if="ColorStyle==1"><!-- 选中“淡黄色” -->
							<label for="" class= "UI-name">背景颜色</label>
							<img src="../../assets/img/yellow.png" alt="" title = "淡黄色" style = "margin-left:10px;width:20px;height:20px;">
							<img src="../../assets/img/grey.png" alt="" title = "默认色" style = "margin-left:10px;" class = "img-out" @click="showColor(0)">
							<hr>
						</div>
						<div v-if="ColorStyle==0"><!-- 选中“默认色” -->
							<label for="" class= "UI-name">背景颜色</label>
							<img src="../../assets/img/yellow.png" alt="" title = "淡黄色" style = "margin-left:10px;" class = "img-out" @click="showColor(1)">
							<img src="../../assets/img/grey.png" alt="" title = "默认色" style = "margin-left:10px;width:20px;height:20px;" >
							<hr>
						</div>
						<form action="">
							<label for="" class= "UI-name">不透明度</label><input type="text" class = "UI-option cc-input-limit"  value = "100" style="width:65px;padding:5px;">%
							<hr>
						</form>
						<form action="">
							<label for="" class= "UI-name" >限制类型</label>
							<input type="radio" class = "UI-option check-cc" name="radio"><label>单选</label>
							<input type="radio" class = "UI-option check-cc" name="radio"><label>多选</label>
							<hr>
						</form>
						<form action="">
							<label for="" class= "UI-name" >页面名称</label>
							<input type="text"  class = "UI-option" value = "淘宝童鞋一口价商品发布页面模板" style="width:250px;padding:5px;border:1px solid #999;border-radius:2px;">
							<hr>
						</form>
					</div>
				</div>
			</div>
			<!-- UI结束 -->
			<div class="ccright-config">
				<!-- 业务能力-描述宝贝类型 -->
				<div class="CCBability" v-if="clickLeftContent==2||clickLeftContent==110">
					<div class="CCEditPageTemplate-CCRight-top">
						<span class="text">描述宝贝类型</span>
						<button class = "link-btn link-btn-primary title-button">保存</button>
					</div>
					<div class="CCEditPageTemplate-CCRight-bottom">
						<div class="CCability">
							<p><input type="checkbox" class = "check-cc">限制类型:</p>
							<div class="CCability-check"><input type="radio" name = "type" class = "check-cc"><label>全新</label></div>
							<div class="CCability-check"><input type="radio" name = "type" class = "check-cc"><label>二手</label></div>
						</div>
					</div>
				</div>
				<!-- 业务能力-描述宝贝类型 -->
				<!-- 业务能力-描述标题 -->
				<div class="CCBability" v-if="clickLeftContent==3||clickLeftContent==110">
					<div class="CCEditPageTemplate-CCRight-top">
						<span class="text">描述标题</span>
						<button class = "link-btn link-btn-primary title-button">保存</button>
					</div>
					<div class="CCEditPageTemplate-CCRight-bottom">
						<div class="CCability">
							<p><input type="checkbox" class = "check-cc">标题长度范围：</p>
							<div class="CCability-check CCability-check-limit">
								<input type="text" class = "cc-input-limit" placeholder="单位：字"> - <input type="text"  class = "cc-input-limit" placeholder="单位：字">
							</div>
						</div>
						<div class="CCability">
							<p><input type="checkbox" class = "check-cc">是否敏感词过滤</p>
						</div>
						<div class="CCability">
							<p><input type="checkbox" class = "check-cc">标题堆砌检测</p>
						</div>
					</div>
				</div>
				<!-- 业务能力-描述标题 -->
				<!-- 业务能力-描述宝贝卖点 -->
				<div class="CCBability" v-if="clickLeftContent==4||clickLeftContent==110">
					<div class="CCEditPageTemplate-CCRight-top">
						<span class="text">描述宝贝卖点</span>
						<button class = "link-btn link-btn-primary title-button">保存</button>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">字数限制：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder="30"> &nbsp;个字 
						</div>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">对接KFC，过滤敏感词</p>
					</div>
				</div>
				<!-- 业务能力-描述宝贝卖点 -->
				<!-- 业务能力-描述宝贝图片 -->
				<div class="CCBability" v-if="clickLeftContent==6||clickLeftContent==110">
					<div class="CCEditPageTemplate-CCRight-top">
						<!-- <span class="xf-ability-icon" ></span> -->
						<span class="text">描述宝贝图片</span>
						<button class = "link-btn link-btn-primary title-button">保存</button>
					</div>
					<!-- <div class="CCEditPageTemplate-CCRight-bottom">
						<div class="CCability">
							<span>长度：</span>
							<input type="text" class = "cc-input-limit" placeholder="12">
							<span>宽度：</span>
							<input type="text" class = "cc-input-limit" placeholder="12">
							<span>路径：</span>
							<input type="text" class = "cc-input-limit" placeholder="C://桌面/帆布鞋.png">
						</div>
					</div> -->
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">图片宽度：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder="24"> &nbsp;px
						</div>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">图片高度：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder="24"> &nbsp;px
						</div>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">图片路径：</p>
						<div class="CCability-check CCability-check-limit">
							<input type="file" class = "cc-input-limit" placeholder="C://桌面/帆布鞋.png" style="width:300px;">
						</div>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">系统默认图片</p>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">原创保护</p>
					</div>
					<div class="CCability">
						<p><input type="checkbox" class = "check-cc">盗图盗链检测</p>
					</div>
				</div>
				<!-- 业务能力-描述宝贝图片 -->
				<!-- <a href="javascript:scrollTo(0,0);" target = "_self">回到顶部</a> -->
			</div>
		</div>
		<div class="xf-clear"></div>
	</div>
</template>
<style scoped>
    .template-head{min-width:;}
	.CCEditPageTemplate-CCLeft{width: 70%;float: left;}
	.CCEditPageTemplate-CCRight{width: 28%;float: left;margin-left: 2px;background: #f2f2f2;}
    .xf-ability-icon-active{background: url(../../assets/img/ability-choosed.png)!important;}
    .CCEditPageTemplate-CCRight-top input[type="checkbox"]{margin-left:5%;margin-top:4px;}
    .CCEditPageTemplate-CCRight-top span{position: relative;top: 12px;}
	.CCEditPageTemplate-CCRight-top span.text{font-size:16px;margin-left:35%;}
	.CCBability{margin-bottom: 50px;border:1px solid #f0f0f0;}
	.CCabiLlity-title{float: left;}
	.CCability-check{float: left;margin-left: 5%;}/*width: 90px;*/
	.CCability-check input{padding:5px;}
	.check-cc{width: 15px;height: 15px;margin-right: 5px;margin-top: 5px;}
	.CCability-check label{position: relative;top:-3px;}
	.CCBusiness-ability{margin-bottom: 30px;}
	.CCability{clear:both;}
	.CCability p{margin-left: 20px;font-size: 15px;padding:10px;}
	.CCability>div{margin-left: 65px;}
	.cc-page-name{width: 100%;}
	.cc-img{margin:15px 130px;}
	.cc-input-limit{border:1px solid #999;width:85px;border-radius: 2px;}
	.CCability-check-limit{width:100%;}
	.CCability-to{float: left;margin:-5px 20px 0;}
	.CCEditPageTemplate-CCRight-top{border: 1px solid #ddd;width: 100%;height: 50px;border-radius: 6px;clear:both;}
	.CCEditPageTemplate-CCRight-top:hover{border: 1px solid #448bc7;background: #f0f0f0;}
	.CCEditPageTemplate-CCRight-top p{text-align: center;margin-top: 12px;font-size: 120%;}
	.CCEditPageTemplate-CCRight-bottom{padding:15px 10px;}
	.bottoms{right:114px;}
	.template-confirm{margin-left: 45%;}
	.cc-page-size{height:auto;}
	.axure-img{margin-top: 20px;}
	/*.title-button{margin-left: 120px;margin-top: 10px;}*/
	.title-button{float: right;margin-right: 20px;margin-top: 8px;}
	/*.delet{display: none}*/
	/*.ccright-UI{height: 200px;}*/
	.UI-name{margin-left:10px;line-height:2.7;width:80px;}
	.UI-option{margin-left:23px;}
	/*.CCEditPageTemplate-CCRight .ccright-UI form:hover{background: #ccc;}*/
	.img-out{transition:All 0.3s ease-in-out;}
	.img-out:hover{width: 20px;height: 20px;}
	/*.template-total-name{border:1px solid green;margin-left: 40%;}*/
	.classify-title{
		text-align: left;
		margin-left: 10%;
		width: 60%;
		margin-top: 20px;
	}
	.basic-bzability{
		text-align: left;
		margin-left: 11%;
		margin-top: 20px;
		display: flex
	}
	.xf-basic-bzability{display: flex;width:80%;border:2px solid transparent;padding:5px;}
	.basic-bzability-title{
		display: inline-block;
		width:100px;
		/*margin-right: 30px;*/
	}
	.basic-bzability-option{
		margin-right: 10px;
	}
	.basic-title-input{
		border:1px solid #999;
		width: 76%;
		border-radius: 2px;
		padding:5px;
	}
	.sale{
		position: relative;
		top: -130px;
		/*width:100px;
		height: 150px;*/
	}
	.basic-bzability-img{
		margin-right: 5px;
	}
	.basic-pic{
		position: relative;
		top: -90px;
	}
	.beforeCheck{border:2px solid transparent;padding: 5px;}
	/*.beforeCheck:hover{border:1px solid #448bc7;}*/
	.afterCheck{border:2px solid #448bc7;padding: 5px;}
	.hide{display: none;}
	.basic-title-input-color{background: #ffff66;}
	.xf-red-delete{width:17px;height:17px;position:relative;}
</style>
<style>
	.xf-classify-title .el-input__inner,.xf-classify-title .el-textarea__inner{background: #ffff66;}
</style>
<script>
  import Delete from "../Delete"
  import IMask from "../Mask"
  import HistoryPath from "../HistoryPath"
  export default{
    data(){
      return {
        pageList:[],
        historyPathTitle:'业务方：选择业务标 / 选择流程 / 配置流程 / 配置业务能力',
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true,
        show:'-1',
        clickLeftContent:'110',//gm  控制选中后右侧区域显示出相应的业务能力配置项。默认是110；
        clickBorderContent:'110',//控制选中后边框的显示效果，默认是110。
        UIStyle:'0',//UIStyle=0表示是正常显示，UIStyle=1表示要向左对齐显示，要唤醒新的div，UIStyle=2表示要换颜色
        AlignStyle:'-1',//AlignStyle=0 正常样式，AlignStyle = 1，左对齐样式
        ColorStyle:'-1',//ColorStyle=0,正常样式，ColorStyle = 1，变色样式
        DeleteLogoNums:'-1',//DeleteLogoNums = 3时，表示删除的logo要出现，不能触发Hide类，用户选中某个业务能力，触发showRight（i），DeleteLogoNums=i;hide类不能被触发。
        LogoNum:'-1',//LogoNum=3时，说明删除按钮被点击，应该调用hide类将表示删除的logo去掉，并且！将该div因此掉，也就是说该div只能在LogoNum！=3时出现（即if语句中添加LogoNum！=3）
        type:''
      }
    },
    components:{"Delete":Delete,"IMask":IMask,"HistoryPath":HistoryPath},
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
      deletel:function(i){
      	this.show = i
      },
      showRight:function(i){
      	this.clickLeftContent = i;//gm  控制选中后右侧区域显示出相应的业务能力配置项。默认是110；
      	this.clickBorderContent = i;//控制选中后边框的显示效果，默认是110。
      	this.DeleteLogoNums = i;//设为i后，表示删除的图标出现，也就是说不能调用hide类
      },
      showAlign:function(i){
      	this.AlignStyle = i;
      },
      showColor:function(i){
      	this.ColorStyle = i;
      },
      showLogo:function(i){
      	this.LogoNum = i;
      }
    }
  }
  // window.location.href = "#top";
  // document.body.scrollTop = 0;
</script>
