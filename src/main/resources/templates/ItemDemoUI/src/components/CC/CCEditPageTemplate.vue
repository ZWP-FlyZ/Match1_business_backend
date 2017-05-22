<template>
	<!-- <div>为页面模板配置业务能力yy版本</div> -->
	<div>
		<div class="CCEditPageTemplate-CCLeft">
			
		</div>
		<div class="CCEditPageTemplate-CCRight">
		<!-- 能力1开始 -->
			<div class="CCBusiness-ability">
				<h2>描述标题</h2>
				<div class="CCability">
					标题长度：<input type="text" style="border:1px solid #000;width:60px;"> - <input type="text"  style="border:1px solid #000;width:60px;">
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
			</div>
		<!-- 能力2开始 -->
		<!-- 能力3开始 -->
			<div class="CCBusiness-ability">
				<h2>描述标题</h2>
				<div class="CCability">
					标题长度：<input type="text" style="border:1px solid #000;width:60px;"> - <input type="text"  style="border:1px solid #000;width:60px;">
				</div>
				<div class="CCability">
					敏感词过滤:<br/>
					<div class="CCability-check"><input type="checkbox">是</div>
					<div class="CCability-check"><input type="checkbox">否</div>
				</div>
			</div>
		<!-- 能力3开始 -->
		</div>
	</div>
</template>
<style>
	.CCEditPageTemplate-CCLeft{
		border:1px solid green;
		width: 60%;
		height: 300px;
		float: left;
	}
	.CCEditPageTemplate-CCRight{
		border:1px solid red;
		width: 35%;
		height: 300px;
		float: left;
		margin-left: 20px;
	}
	.CCabiLlity-title{float: left;}
	.CCability-check{
		float: left;
		margin-left: 5%;
		margin-right: 10px;
	}
	.CCBusiness-ability{
		margin-bottom: 30px;
	}
</style>