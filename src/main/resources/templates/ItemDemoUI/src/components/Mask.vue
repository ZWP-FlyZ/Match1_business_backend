<template>
  <div class="mask" v-bind:class="{'hideMask':hideMask}"></div>
</template>
<script>
  export default{
    props:['hideMask']
  }
</script>  
<style>
  .mask{
    z-index:1;
    /*兼容IE8及以下版本浏览器*/
    filter: alpha(opacity=30);
    position:absolute;
    top:0;
    bottom:0;
    left:0;
    right:0;
    background:#000;
    opacity:0.7;
    height:188888px;
    width:100%;
    }
  .hideMask{display: none}
</style>