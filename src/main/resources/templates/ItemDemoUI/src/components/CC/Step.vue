<template>
<div>
    <div class="xf-cc-step-big-box " v-bind:class="{'scroll':scroll>=38}">
      
      <div class="xf-cc-step-box">
      <router-link to="/cidentity" class="step-a">
        <img v-if="step==0" class="xf-cc-step-img" src="static/img/step1.png"/>
        <img v-if="step!=0" class="xf-cc-step-img" src="static/img/step11.png"/>
        <span class="xf-cc-step-text" style="left:1%">选择业务身份{{step}}</span>
      </router-link>
      </div>
      <div class="xf-cc-step-line"></div>
      
      
      <div class="xf-cc-step-box">
      <router-link to="/cCprocess" class="step-a">
        <img v-if="step==0||step==1" class="xf-cc-step-img" src="static/img/step2.png"/>
        <img v-if="step==2||step==3||step==4 ||step==5" class="xf-cc-step-img" src="static/img/step22.png"/>
        <span class="xf-cc-step-text" style="left:3%">选择流程</span>
      </router-link>
      </div>
      <div class="xf-cc-step-line"></div>
      
      
      <div class="xf-cc-step-box">
      <router-link to="/cCEditProcessFchoosed" class="step-a">
        <img v-if="step==0||step==1||step==2" class="xf-cc-step-img" src="static/img/step3.png"/>
        <img v-if="step==3||step==4 || step==5" class="xf-cc-step-img" src="static/img/step33.png"/>
        <span class="xf-cc-step-text" style="left:3.5%">配置流程</span>
      </router-link>
      </div>

      <div class="xf-cc-step-line"></div>
      
      
      <div class="xf-cc-step-box">
      <router-link to="/cCEditPageTemplate" class="step-a">
        <img v-if="step==0||step==1 || step==2|| step==3" class="xf-cc-step-img" src="static/img/step4.png"/>
        <img v-if="step==4 || step==5" class="xf-cc-step-img" src="static/img/step44.png"/>
        <span class="xf-cc-step-text" style="left:3.5%">配置页面、业务能力</span>
      </router-link>
      </div>
      <div class="xf-cc-step-line"></div>
      
      
      <div class="xf-cc-step-box">
      <router-link to="/publishIdentity" class="step-a">
        <img v-if="step!=5" class="xf-cc-step-img" src="static/img/step5.png"/>
        <img v-if="step==5" class="xf-cc-step-img" src="static/img/step55.png"/>
        <span class="xf-cc-step-text" style="left:3.5%">发布业务身份</span>
      </router-link>
      </div>
      <div class="xf-cc-step-box xf-cc-step-box-button" v-if="step==0||step==2||step==3||step==4">
        <button v-if="step!=4" @click="preStep" class="link-btn link-btn-default">上一步</button >
        <button v-if="step==4" @click="preStep" class="link-btn link-btn-default">保存</button > 
        <button @click="nextStep" v-if="step!=4" class="link-btn link-btn-default">下一步</button>
      </div>
    </div>
</div>
</template>


<script>
  export default{
    data(){
      return{
        scroll:'',
        active:''
      }
    },
    props:['step'],
    mounted() {
      window.addEventListener('scroll', this.menu);
    },
    methods:{
      menu:function(){
        this.scroll = document.body.scrollTop;
      },
      preStep:function(){
        if(this.step==2){
          this.$router.push("/cidentity");
        }
        if(this.step==3){
          this.$router.push("/cCprocess");
        }
        if(this.step==4){
          this.$router.push("/cCEditProcessFchoosed");
        }
      },
      nextStep:function(){
        if(this.step==2){
          //要判断有没有选择流程
          this.$emit("choosePro");
          //this.$router.push("/cCEditProcessFchoosed");
        }
        //要判断有没有配置页面模板
        if(this.step==3){
          this.$router.push("/publishIdentity");
        }
      }
    }
  };
  
</script>

<style scoped>
  .xf-cc-step-big-box{
    width: 100%;
    background: #fff;
    position: absolute;
    top: 38px; 
    z-index: 102;
    margin:15px 0px;
    padding-left:0%;
    height:105px;
    padding-left:5%;
  }
  .xf-cc-step-big-box .xf-cc-step-box{width:10%;text-align: center}
  .xf-cc-step-big-box .xf-cc-step-line{width:5%;text-align: center}
  .scroll{top:-15px;padding-top:10px;background: #fff;position: fixed;margin-bottom:10px;border:1px solid #f0f0f0;}
  .xf-cc-step-box{display: inline-block;margin-top:-10px;}
  .xf-cc-step-text{font-size:13px;color:#ccc;display: block;position: relative;top:-10px;left:-10px;}
  .xf-cc-step-img{width:50%;}
  .xf-cc-step-line{width:60px;height:3px;border:3px dashed #f0f0f0;display: inline-block;margin: 0px 10px 31px;    position: relative;top:-12px;}
   .xf-cc-step-box-button{width:18% !important;position: relative;top:-40px;}
</style>


