<template>
  <div id="wrapper">
    <div id="header">
      <div class="header-left">
        <img src="" alt="">
        <span class = "left-title">业务定制平台</span>
      </div>
      <div class="header-right">
        <img src="" alt="">
        <span class = "right-title">业务定制平台</span>
        <img src="" alt="">
      </div>
      <div class="header-author" >
          <i class="el-icon-message"></i>
          <span>您好： {{user.username}}</span>
      </div>
      <div class="header-author header-logout" @click="logout">
          <span>退出</span>
      </div>
      <br />
      <div class="test-btn" v-if="!user.username">
          <router-link to="/aaindex" class = "link-btn link-btn-primary log-out">应用方</router-link>
          <router-link to="/bbindex" class = "link-btn link-btn-primary log-out">老师版业务方</router-link>
          <router-link to="/ccindex" class = "link-btn link-btn-primary log-out">Ali版业务方</router-link>
      </div>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
import {mapState} from 'vuex'
  export default{
    beforeCreate:function(){
      window.scrollTo(0,0); 
      document.body.scrollTop = 0;
      document.documentElement.scrollTop = 0;
    },
    computed:mapState({user:state=>state.user}),
    methods:{
      logout:function(){
        this.$router.replace('/login')
      }
    }
  }
</script>
<style scoped>
  .log-out{
    margin-left: 30px;
  }
  .test-btn{position: relative;top:-30px;}
  .header-logout{cursor: pointer;}
</style>


