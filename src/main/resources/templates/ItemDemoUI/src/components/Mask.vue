<template>
<transition name="fade">
  <div class="mask" v-if="!hideMask"></div>
</transition>
</template>
<script>
  export default{
    props:['hideMask']
  }
</script>  
<style>
  .mask{
    z-index:1100;
    /*兼容IE8及以下版本浏览器*/
    filter: alpha(opacity=30);
    position:absolute;
    top:0;
    bottom:0;
    left:0;
    right:0;
    background:#000;
    opacity:0.7;
    position: fixed;
    width:100%;
    }
</style>