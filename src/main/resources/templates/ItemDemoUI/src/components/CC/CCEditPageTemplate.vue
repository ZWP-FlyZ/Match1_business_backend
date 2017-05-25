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
				          <div @click="showRight(0)"  style="width: 650px;height: 37px;top: 2px;left: 19px;"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>
						<!-- 名称选中后要显示的边框 -->
				          <div v-if="clickBorderContent==0">
				          	<div style="width: 650px;height: 37px;border: 2px dashed red;position: absolute;top: 2px;left: 19px;"></div>
				          </div>
				        <!-- 选中后要显示的边框 -->

				          <div class="template-edit">
				            <div class="template-view">
					            <div v-bind:class="{'delet':show==1}">
					            	<img src="/static/img/page1/basic-info.png" alt="宝贝基本信息" class = "axure-img" @click="showRight(1)">
					            </div>

				            	<div v-bind:class="{'delet':show==2}">
				             		<img src="/static/img/page1/type-1.png" alt="宝贝类型" @click="showRight(2)">
				            	</div>
				            	<!-- 宝贝类型选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==2">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 93px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style="width: 25px;height:23px;position: absolute;top: 88px;left: 640px;" @click="deletel(2)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==3}">
				             		<img src="/static/img/page1/title-1.png" alt="宝贝标题" @click="showRight(3)">
				            	</div>
				            	<!-- 宝贝标题选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==3">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 133px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 123px;left: 640px;" @click="deletel(3)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

	                            <div v-bind:class="{'delet':show==4}">
					            	<img src="/static/img/page1/sale.png"  alt="宝贝卖点" @click="showRight(4)">
					            </div>
					            <!-- 宝贝卖点选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==4">
				            		<div style="width: 635px;height: 140px;border: 2px dashed red;position: absolute;top: 173px;left: 23px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 167px;left: 640px;" @click="deletel(4)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<!-- <div v-bind:class="{'delet':show==5}">
									<img src="/static/img/page1/attribute-1.png"  alt="宝贝属性" @click="showRight(5)">
					            </div> -->
					            <!-- 宝贝属性选中后要显示的边框 -->
				            	<!-- <div v-if="clickBorderContent==5">
				            		<div style="width: 635px;height: 137px;border: 2px dashed red;position: absolute;top: 325px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 317px;left: 640px;" @click="deletel(5)">
				            	</div> -->
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==6}">
					            	<img src="/static/img/page1/pic.png" alt="图片" @click="showRight(6)">
					            </div>
					            <!-- 图片选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==6">
				            		<div style="width: 635px;height: 137px;border: 2px dashed red;position: absolute;top: 325px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 317px;left: 640px;" @click="deletel(6)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==7}">
					              <img src="/static/img/page1/transport.png" alt="物流运输" @click="showRight(7)" >
					            </div>

								<div v-bind:class="{'delet':show==8}">
					              <img src="/static/img/page1/service.png" alt="售后服务" @click="showRight(8)">
					            </div>

								<div v-bind:class="{'delet':show==9}">
					              <img src="/static/img/page1/other.png" alt="其他信息" @click="showRight(9)">
					            </div>
				            </div>
				          </div>
				        </div>
				        <!-- 普通样式结束 -->
				        <!-- 左对齐样式 -->
				        <div class="one-container cc-page-name cc-page-size" v-if="(AlignStyle==1&&ColorStyle==-1)||(AlignStyle==1&&ColorStyle==0)">
				           <div @click="showRight(0)"  style="width: 650px;height: 37px;top: 2px;left: 19px;"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>

				          <!-- 名称选中后要显示的边框 -->
				          <div v-if="clickBorderContent==0">
				          	<div style="width: 650px;height: 37px;border: 2px dashed red;position: absolute;top: 2px;left: 19px;"></div>
				          </div>
				        <!-- 选中后要显示的边框 -->
				          <div class="template-edit">
				            <div class="template-view">
					            <div v-bind:class="{'delet':show==1}">
					            	<img src="/static/img/page1/basic-info.png" alt="宝贝基本信息" class = "axure-img" @click="showRight(1)">
					            </div>

				            	<div v-bind:class="{'delet':show==2}">
				             		<img src="/static/img/page1/type-1.png" alt="宝贝类型" @click="showRight(2)">
				            	</div>
				            	
								<!-- 宝贝类型选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==2">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 93px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style="width: 25px;height:23px;position: absolute;top: 88px;left: 640px;" @click="deletel(2)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==3}">
				             		<img src="/static/img/page1/title-1.png" alt="宝贝标题" @click="showRight(3)">
				            	</div>
				            	<!-- 宝贝标题选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==3">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 133px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 123px;left: 640px;" @click="deletel(3)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

	                            <div v-bind:class="{'delet':show==4}">
					            	<img src="/static/img/page1/sale.png"  alt="宝贝卖点" @click="showRight(4)">
					            </div>
					            <!-- 宝贝卖点选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==4">
				            		<div style="width: 635px;height: 140px;border: 2px dashed red;position: absolute;top: 173px;left: 29px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 167px;left: 650px;" @click="deletel(4)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<!-- <div v-bind:class="{'delet':show==5}">
									<img src="/static/img/page1/attribute-1.png"  alt="宝贝属性" @click="showRight(5)"><img src="/static/img/delete-blue.png" style= "margin-left:2px;" @click="deletel(5)">
					            </div> -->
					            <!-- 宝贝属性选中后要显示的边框 -->
				            	<!-- <div v-if="clickBorderContent==5">
				            		<div style="width: 635px;height: 137px;border: 2px dashed red;position: absolute;top: 325px;left: 19px;"></div>
				            	</div> -->
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==6}">
					            	<img src="/static/img/page4-align-only/pic.png" alt="图片" @click="showRight(6)">
					            </div>
					             <!-- 图片选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==6">
				            		<div style="width: 255px;height: 430px;border: 2px dashed red;position: absolute;top: 325px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 317px;left: 260px;" @click="deletel(6)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==7}">
					              <img src="/static/img/page1/transport.png" alt="物流运输" @click="showRight(7)" >
					            </div>

								<div v-bind:class="{'delet':show==8}">
					              <img src="/static/img/page1/service.png" alt="售后服务" @click="showRight(8)">
					            </div>

								<div v-bind:class="{'delet':show==9}">
					              <img src="/static/img/page1/other.png" alt="其他信息" @click="showRight(9)">
					            </div>
				            </div>
				          </div>
				        </div>
				        <!-- 左对齐样式结束 -->

				        <!-- 对齐方式+颜色变换开始 -->
				         <div class="one-container cc-page-name cc-page-size" v-if="AlignStyle==1&&ColorStyle==1">
				           <div @click="showRight(0)"  style="width: 650px;height: 37px;top: 2px;left: 19px;"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>
				          <!-- 名称选中后要显示的边框 -->
				          <div v-if="clickBorderContent==0">
				          	<div style="width: 650px;height: 37px;border: 2px dashed red;position: absolute;top: 2px;left: 19px;"></div>
				          </div>
				        <!-- 选中后要显示的边框 -->
				          <div class="template-edit">
				            <div class="template-view">
					            <div v-bind:class="{'delet':show==1}">
					              <img src="/static/img/page2-color/basic-info.png" alt="宝贝基本信息" class = "axure-img" @click="showRight(1)">
					            </div>

					            <div v-bind:class="{'delet':show==2}">
					              <img src="/static/img/page3-align/type-1.png" alt="宝贝类型" @click="showRight(2)">
					            </div>
					             <!-- 宝贝类型选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==2">
				            		<div style="width: 635px;height: 53px;border: 2px dashed red;position: absolute;top: 92px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style="width: 25px;height:23px;position: absolute;top: 78px;left: 640px;" @click="deletel(2)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==3}">
					              <img src="/static/img/page2-color/title.png" alt="宝贝标题" @click="showRight(3)">
					            </div>
					            <!-- 宝贝标题选中后要显示的边框 -->
				            	<div  v-if="clickBorderContent==3">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 160px;left: 24px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 145px;left: 645px;" @click="deletel(3)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

	                            <div v-bind:class="{'delet':show==4}">
					              <img src="/static/img/page2-color/sale.png"  alt="宝贝卖点" @click="showRight(4)">
					            </div>
					            <!-- 宝贝卖点选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==4">
				            		<div style="width: 635px;height: 130px;border: 2px dashed red;position: absolute;top: 209px;left: 23px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 195px;left: 640px;" @click="deletel(4)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<!-- <div v-bind:class="{'delet':show==5}">
								  <img src="/static/img/page2-color/attribute.png"  alt="宝贝属性" @click="showRight(5)"><img src="/static/img/delete-blue.png" style= "margin-left:2px;" @click="deletel(5)">
					            </div> -->
					            <!-- 宝贝属性选中后要显示的边框 -->
				            	<!-- <div v-if="clickBorderContent==5">
				            		<div style="width: 635px;height: 137px;border: 2px dashed red;position: absolute;top: 325px;left: 19px;"></div>
				            	</div> -->
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==6}">
					              <img src="/static/img/page3-align/pic.png" alt="图片" @click="showRight(6)">
					            </div>
					            <!-- 图片选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==6">
				            		<div style="width: 255px;height: 410px;border: 2px dashed red;position: absolute;top: 345px;left: 23px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 337px;left: 262px;" @click="deletel(6)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->


								<div v-bind:class="{'delet':show==7}">
					              <img src="/static/img/page2-color/transport.png" alt="物流运输" @click="showRight(7)" >
					            </div>

								<div v-bind:class="{'delet':show==8}">
					              <img src="/static/img/page2-color/service.png" alt="售后服务" @click="showRight(8)">
					            </div>

								<div v-bind:class="{'delet':show==9}">
					              <img src="/static/img/page2-color/other.png" alt="其他信息" @click="showRight(9)">
					            </div>
				            </div>
				          </div>
				        </div>
						<!-- 对齐方式+颜色变换结束 -->
						<!-- 变色样式 开始-->
				        <div class="one-container cc-page-name cc-page-size" v-if="(AlignStyle==0&&ColorStyle==1)||(AlignStyle==-1&&ColorStyle==1)">
				           <div @click="showRight(0)"  style="width: 650px;height: 37px;top: 2px;left: 19px;"><span class="titem-name">页面模板名称：淘宝童鞋一口价商品发布页面模板</span></div>
				           <!-- 名称选中后要显示的边框 -->
				          <div v-if="clickBorderContent==0">
				          	<div style="width: 650px;height: 37px;border: 2px dashed red;position: absolute;top: 2px;left: 19px;"></div>
				          </div>
				        <!-- 选中后要显示的边框 -->

				          <div class="template-edit">
				            <div class="template-view">
					            <div v-bind:class="{'delet':show==1}">
					              <img src="/static/img/page2-color/basic-info.png" alt="宝贝基本信息" class = "axure-img" @click="showRight(1)">
					            </div>
					            <!-- 名称选中后要显示的边框 -->
						          <div v-if="clickBorderContent==0">
						          	<div style="width: 650px;height: 37px;border: 2px dashed red;position: absolute;top: 2px;left: 19px;"></div>
						          </div>
						        <!-- 选中后要显示的边框 -->

					            <div v-bind:class="{'delet':show==2}">
					              <img src="/static/img/page2-color/type-1.png" alt="宝贝类型" @click="showRight(2)">
					            </div>
					            <!-- 宝贝类型选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==2">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 93px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style="width: 25px;height:23px;position: absolute;top: 83px;left: 640px;" @click="deletel(2)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<div v-bind:class="{'delet':show==3}">
					              <img src="/static/img/page2-color/title.png" alt="宝贝标题" @click="showRight(3)">
					            </div>
					            <!-- 宝贝标题选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==3">
				            		<div style="width: 635px;height: 37px;border: 2px dashed red;position: absolute;top: 138px;left: 24px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 128px;left: 640px;" @click="deletel(3)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

	                            <div v-bind:class="{'delet':show==4}">
					              <img src="/static/img/page2-color/sale.png"  alt="宝贝卖点" @click="showRight(4)">
					            </div>
					            <!-- 宝贝卖点选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==4">
				            		<div style="width: 635px;height: 140px;border: 2px dashed red;position: absolute;top: 173px;left: 27px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 167px;left: 645px;" @click="deletel(4)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->

								<!-- <div v-bind:class="{'delet':show==5}">
								  <img src="/static/img/page2-color/attribute.png"  alt="宝贝属性" @click="showRight(5)"><img src="/static/img/delete-blue.png" style= "margin-left:2px;" @click="deletel(5)">
					            </div> -->
					            <!-- 宝贝属性选中后要显示的边框 -->
				            	<!-- <div v-if="clickBorderContent==5">
				            		<div style="width: 635px;height: 137px;border: 2px dashed red;position: absolute;top: 325px;left: 19px;"></div>
				            	</div> -->
				            	<!-- 选中后要显示的边框 -->


								<div v-bind:class="{'delet':show==6}">
					              <img src="/static/img/page2-color/pic.png" alt="图片" @click="showRight(6)">
					            </div>
					            <!-- 图片选中后要显示的边框 -->
				            	<div v-if="clickBorderContent==6">
				            		<div style="width: 635px;height: 137px;border: 2px dashed red;position: absolute;top: 310px;left: 19px;"></div>
				            		<img src="/static/img/delete-3.png" style= "margin-left:2px;width: 25px;height:23px;position: absolute;top: 307px;left: 640px;" @click="deletel(6)">
				            	</div>
				            	<!-- 选中后要显示的边框 -->
								<div v-bind:class="{'delet':show==7}">
					              <img src="/static/img/page2-color/transport.png" alt="物流运输" @click="showRight(7)" >
					            </div>

								<div v-bind:class="{'delet':show==8}">
					              <img src="/static/img/page2-color/service.png" alt="售后服务" @click="showRight(8)">
					            </div>

								<div v-bind:class="{'delet':show==9}">
					              <img src="/static/img/page2-color/other.png" alt="其他信息" @click="showRight(9)">
					            </div>
				            </div>
				          </div>
				        </div>
						<!-- 变色样式结束 -->

				        <br/><br/>
				    </div>
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
			<div class="CCBability"  v-if="clickLeftContent==0||clickLeftContent==110">
				<div class="CCEditPageTemplate-CCRight-top">
					<span class="text">UI样式</span>
					<button class = "link-btn link-btn-primary title-button">保存</button>
				</div>
				<div class="CCEditPageTemplate-CCRight-bottom">
					<div class="ccright-UI">
						<div v-if="AlignStyle==-1"><!-- 初始化进来时 -->
							<label for="" class= "UI-name" >页面排列</label><img class = "UI-option img-out" src="/static/img/align-justify.png" alt="" title = "横向显示" @click="showAlign(0)"><img src="/static/img/align-left.png" alt="" title = "纵向显示" style = "margin-left:10px;" class = "img-out" @click="showAlign(1)">
							<hr>
						</div>
						<div v-if="AlignStyle==1"><!-- 选中“横向显示” -->
							<label for="" class= "UI-name" >页面排列</label><img class = "UI-option img-out" src="/static/img/align-justify.png" alt="" title = "横向显示" @click="showAlign(0)"><img src="/static/img/align-left.png" alt="" title = "纵向显示" style = "margin-left:10px;width:20px;height:20px;">
							<hr>
						</div>
						<div v-if="AlignStyle==0"><!-- 选中“纵向显示” -->
							<label for="" class= "UI-name" >页面排列</label><img class = "UI-option" src="/static/img/align-justify.png" alt="" title = "横向显示" style="width:20px;height:20px;"><img src="/static/img/align-left.png" alt="" title = "纵向显示" style = "margin-left:10px;" class = "img-out" @click="showAlign(1)">
							<hr>
						</div>
						<div v-if="ColorStyle==-1"><!-- 初始化 -->
							<label for="" class= "UI-name">背景颜色</label>
							<img src="/static/img/yellow.png" alt="" title = "淡黄色" style = "margin-left:10px;" class = "img-out" @click="showColor(1)">
							<img src="/static/img/grey.png" alt="" title = "默认色" style = "margin-left:10px;" class = "img-out" @click="showColor(0)">
							<hr>
						</div>
						<div v-if="ColorStyle==1"><!-- 选中“淡黄色” -->
							<label for="" class= "UI-name">背景颜色</label>
							<img src="/static/img/yellow.png" alt="" title = "淡黄色" style = "margin-left:10px;width:20px;height:20px;">
							<img src="/static/img/grey.png" alt="" title = "默认色" style = "margin-left:10px;" class = "img-out" @click="showColor(0)">
							<hr>
						</div>
						<div v-if="ColorStyle==0"><!-- 选中“默认色” -->
							<label for="" class= "UI-name">背景颜色</label>
							<img src="/static/img/yellow.png" alt="" title = "淡黄色" style = "margin-left:10px;" class = "img-out" @click="showColor(1)">
							<img src="/static/img/grey.png" alt="" title = "默认色" style = "margin-left:10px;width:20px;height:20px;" >
							<hr>
						</div>
						<form action="">
							<label for="" class= "UI-name">不透明度</label><input type="text" class = "UI-option cc-input-limit"  value = "100" style="width:65px;padding:5px;">
							<hr>
						</form>
						<form action="">
							<label for="" class= "UI-name" >限制类型</label>
							<input type="radio" class = "UI-option check-cc" name="radio"><label>单选</label>
							<input type="radio" class = "UI-option check-cc" name="radio"><label>多选</label>
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
						<!-- <span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span> -->
						<span class="text">描述宝贝类型</span>
						<button class = "link-btn link-btn-primary title-button">保存</button>
					</div>
					<div class="CCEditPageTemplate-CCRight-bottom">
						<div class="CCability">
							<p>限制类型:</p>
							<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>全新</label></div>
							<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>二手</label></div>
						</div>
					</div>
				</div>
				<!-- 业务能力-描述宝贝类型 -->
				<!-- 业务能力-描述标题 -->
				<div class="CCBability" v-if="clickLeftContent==3||clickLeftContent==110">
					<div class="CCEditPageTemplate-CCRight-top">
						<!-- <span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span> -->
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
						<div class="CCability">
							<p>标题堆砌检测:</p>
							<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
							<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
						</div>
					</div>
				</div>
				<!-- 业务能力-描述标题 -->
				<!-- 业务能力-描述宝贝卖点 -->
				<div class="CCBability" v-if="clickLeftContent==4||clickLeftContent==110">
					<div class="CCEditPageTemplate-CCRight-top">
						<!-- <span class="xf-ability-icon" v-bind:class="{'xf-ability-icon-active':showBilityContent}"></span> -->
						<span class="text">描述宝贝卖点</span>
						<button class = "link-btn link-btn-primary title-button">保存</button>
					</div>
					<!-- <div class="CCEditPageTemplate-CCRight-bottom">
						<div class="CCability">
							<span>字数限制：</span>
								不超过<input type="text" class = "cc-input-limit" placeholder="">个字
						</div>
					</div> -->
					<div class="CCability">
						<p>字数限制：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder=""> &nbsp;个字 
						</div>
					</div>
					<div class="CCability">
						<p>对接KFC，过滤敏感词:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
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
						<p>图片宽度：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder="24"> &nbsp;px
						</div>
					</div>
					<div class="CCability">
						<p>图片高度：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder="24"> &nbsp;px
						</div>
					</div>
					<div class="CCability">
						<p>图片路径：</p>
						<div class="CCability-check CCability-check-limit">
							不超过&nbsp;<input type="text" class = "cc-input-limit" placeholder="24"> &nbsp;px
						</div>
					</div>
					<div class="CCability">
						<p>系统默认图片:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
					</div>
					<div class="CCability">
						<p>原创保护:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
					</div>
					<div class="CCability">
						<p>盗图盗链检测:</p>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>是</label></div>
						<div class="CCability-check"><input type="checkbox" class = "check-cc"><label>否</label></div>
					</div>
				</div>
				<!-- 业务能力-描述宝贝图片 -->
			</div>
		</div>
		<div class="xf-clear"></div>
	</div>
</template>
<style scoped>
    .template-head{min-width:;}
	.CCEditPageTemplate-CCLeft{width: 70%;float: left;}
	.CCEditPageTemplate-CCRight{width: 28%;float: left;margin-left: 2px;background: #f2f2f2;}
	/*.CCEditPageTemplate-CCRight-top .xf-ability-icon{
		background: url(/static/img/ability.png);
	    width: 24px;
	    height: 23px;
	    display: inline-block;
	    position: relative;
	    top: 9px;
	    left: 26%;
	}*/
    .xf-ability-icon-active{background: url(/static/img/ability-choosed.png)!important;}
    .CCEditPageTemplate-CCRight-top input[type="checkbox"]{margin-left:5%;margin-top:4px;}
    .CCEditPageTemplate-CCRight-top span{position: relative;top: 12px;}
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
	.cc-page-name{width: 100%;}
	.cc-img{margin:15px 130px;}
	.cc-input-limit{border:1px solid #999;width:65px;border-radius: 2px;}
	.CCability-check-limit{width:100%;}
	.CCability-to{float: left;margin:-5px 20px 0;}
	.CCEditPageTemplate-CCRight-top{border: 1px solid #ddd;width: 100%;height: 50px;border-radius: 6px;clear:both;}
	.CCEditPageTemplate-CCRight-top:hover{border: 1px solid #448bc7;background: #f0f0f0;}
	.CCEditPageTemplate-CCRight-top p{text-align: center;margin-top: 12px;font-size: 120%;}
	.CCEditPageTemplate-CCRight-bottom{padding:15px 10px;}
	.bottoms{right:114px;}
	.template-confirm{margin-left: 30%;}
	.cc-page-size{height:auto;}
	.axure-img{margin-top: 20px;}
	/*.title-button{margin-left: 120px;margin-top: 10px;}*/
	.title-button{float: right;margin-right: 20px;margin-top: 8px;}
	.delet{display: none}
	/*.ccright-UI{height: 200px;}*/
	.UI-name{margin-left:10px;line-height:2.7;width:80px;}
	.UI-option{margin-left:23px;}
	/*.CCEditPageTemplate-CCRight .ccright-UI form:hover{background: #ccc;}*/
	.img-out{transition:All 0.3s ease-in-out;}
	.img-out:hover{width: 20px;height: 20px;}
</style>
<script>
  import Delete from "../Delete"
  import IMask from "../Mask"
  import HistoryPath from "../HistoryPath"
  export default{
    data(){
      return {
        pageList:[],
        historyPathTitle:'业务方：选择业务身份 / 选择流程 / 配置流程 / 配置业务能力',
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true,
        show:'5',
        clickLeftContent:'110',//gm  控制选中后右侧区域显示出相应的业务能力配置项。默认是110；
        clickBorderContent:'110',//控制选中后边框的显示效果，默认是110。
        UIStyle:'0',//UIStyle=0表示是正常显示，UIStyle=1表示要向左对齐显示，要唤醒新的div，UIStyle=2表示要换颜色
        AlignStyle:'-1',//AlignStyle=0 正常样式，AlignStyle = 1，左对齐样式
        ColorStyle:'-1',//ColorStyle=0,正常样式，ColorStyle = 1，变色样式
        AlignStyleUI:0
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
      },
      showAlign:function(i){
      	this.AlignStyle = i;
      	this.AlignStyleUI = i;
      },
      showColor:function(i){
      	this.ColorStyle = i;
      }
    }
  }
</script>