<template>
	<div>
      <a href="">打开遮罩层</a>
      <div id = "test"></div>
      <div id = "log-window">
        <a href="">关闭</a>
      </div>
    </div>
</template>
<style>
	#test {
    width:100%;
    height:100%;
    background-color:#000;
    position:absolute;
    top:0;
    left:0;
    z-index:2;
    opacity:0.2;
    /*兼容IE8及以下版本浏览器*/
    filter: alpha(opacity=30);
    display:none;
	}
</style>