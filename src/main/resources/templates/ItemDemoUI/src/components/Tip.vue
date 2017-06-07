<template>
	<div class="xf-tip-main" v-bind:class="{'hideTip':hideTip}">
		<div class="xf-tip-left"></div>
		<div class="xf-tip-content">保存成功!</div>
	</div>
</template>
<script>
	export default{
		props:['hideTip'],
		mounted:function(){
			this.$nextTick(function(){
				this.hideTipK();
			}),
			window.addEventListener('scroll',this.hideTipS)
		},
		methods:{
			hideTipK:function(){
				var that = this;
				setTimeout(function () {
                  that.$emit("closeTip",true)
                }, 3000)
			},
			hideTipS:function(){
				this.$emit("closeTip",true);
			}
		}
	}
</script>
<style scoped>
	.hideTip{opacity: 0;transform: translate(0px,0px)}
	.xf-tip-main{height:35px;width:300px;background-color:#fff;line-height: 35px;border:1px solid #448bc7;transform: translate(0px,10px);transition: all .4s;    position: fixed;top: 160px;left: 40%;}
	.xf-tip-left{background:url("../assets/img/icon.png") 0px -23px;display: inline-block;width:40px;height:33px;}
	.xf-tip-content{top:10px;color:#448bc7;display: inline-block;position:relative;top:-10px;left:16px;width:80px;font-size:14px;}
</style>