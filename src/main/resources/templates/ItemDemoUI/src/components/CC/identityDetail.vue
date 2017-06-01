<template>
	<div class="xf-identity-detail-main">
      <div class="xf-identity-detail-body">
	   <i class="el-icon-star-off"></i>  <span class="detail">业务身份详情</span>
	   <div class="xf-identity-detail-box">
	   	 <label>业务KEY：</label>
	   	 <span>TB_MENS</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>业务名称：</label>
	   	 <span>淘宝男装-衬衫</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>业务类型：</label>
	   	 <span>业务/活动</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>目标ID：</label>
	   	 <span>类目ID/活动ID</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>Owner：</label>
	   	 <span>XXX</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>起始日期：</label>
	   	 <span>2017年01月06日</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>终止日期：</label>
	   	 <span>2017年11月11日</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>业务概要：</label>
	   	 <span>淘宝男装-衬衫销售</span>
	   </div>
	   <div class="xf-identity-detail-box">
	   	 <label>业务详情：</label>
	   	  <router-link to="/cCLookUpProcess"><span>业务详情业务详情业务详情业务详情业务详情业务详情</span></router-link>
	   	 
	   </div>
	  </div>
	</div>
</template>
<style>
	.xf-identity-detail-main{height:650px;margin-top:-40px;background: #f7f7f9;padding:5% 5%;}
	.xf-identity-detail-body{background: #fff;transform: rotate(0deg);box-shadow:2px 2px 3px #aaa;width:60%;margin:0 auto;padding:30px;}
	.xf-identity-detail-body span.detail{font-size: 18px;}
	.xf-identity-detail-box{margin:20px;}
</style>