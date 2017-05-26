<template>
  <div>
    <div id="application" v-if="message==1">
      <div class="application-heading">
        <span>我的应用</span>
      </div>
      <div class="application-list">
        <ul >
          <li v-bind:class="{'application-li-active':isActive == index}" @click="addActive(index)" v-for="(item,index) in appList">
            <i class="icon-triangle-right"></i>
            <router-link to="/content" class="application-router">{{item.name}}</router-link>
          </li>
        </ul>
      </div>
      <button class = "link-btn link-btn-primary" @click="openApp">注册应用</button>
      <IMask :hide-mask.sync="hideMask"></IMask>
      <RegisterApplication :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask"  v-on:isClose="closeDialog"></RegisterApplication>
    </div>

    <div id="application" v-if="message==4">
      <div class="application-heading">
        <span>已选流程列表</span>
      </div>
      <div class="application-list choose-fix-list">
        <ul >
          <li v-bind:class="{'application-li-active':isActive == index}" @click="addActive(index)" v-for="(item,index) in choosedList">
            <!-- <i class="icon-triangle-right"></i> -->
            <router-link to="/cCEditProcessFchoosed" class="application-router choose-fix-router">{{item.name}}</router-link>
          </li>
        </ul>
      </div>
    </div>

    <div id="application" v-if="message==3">
      <div class="application-heading">
        <span>L1流程1</span>
      </div>
      <div class="application-list">
        <ul >
          <li v-bind:class="{'application-li-active':isActive == item}" @click="addActive(item)" v-for="(item,index) in processL1">
            <i class="icon-triangle-right"></i>
            <router-link to="/cCprocess" class="application-router">{{item.name}}</router-link>
          </li>
        </ul>
      </div>
    </div>

    <div id="application" v-if="message==2">
      <div class="application-heading">
        <span>L1流程</span>
      </div>
      <div class="application-list">
        <ul >
          <li v-bind:class="{'application-li-active':isActive == item}" @click="addActive(item)" v-for="(item,index) in processL1">
            <i class="icon-triangle-right"></i>
            <router-link to="/bBprocess" class="application-router">{{item.name}}</router-link>
          </li>
        </ul>
      </div>
    </div>

    <div id="application" v-if="message==5">
      <div class="application-heading">
        <span>可用业务能力</span>
      </div>
      <div class="application-list">
        <el-collapse v-model="activeNames" @change="handleChange">
          <el-collapse-item title="描述类业务能力" name="1">
            <div class="xf-component-item" v-for="(item,index) in componentImg1">
              <img v-bind:src="item.src" />
            </div>
          </el-collapse-item>
          <el-collapse-item title="校验类业务能力" name="2">
            <div class="xf-component-item" v-for="(item,index) in componentImg2">
              <img v-bind:src="item.src" />
            </div>
          </el-collapse-item>
          <el-collapse-item title="其他类业务能力" name="3">
            <div class="xf-component-item" v-for="(item,index) in componentImg3">
              <img v-bind:src="item.src" />
            </div>
          </el-collapse-item>
        </el-collapse>
      </div>
    </div>


  </div>
</template>

<script>
import IMask from './Mask'
import RegisterApplication from './AA/RegisterApplication'
export default {
  data(){
    return {
      isActive:'0',
      hideMask:true,
      hideDialog:true,
      choosedList:[],
      appList:[],
      processL1:[],
      activeNames:['1'],
      componentImg1:[
        {src:'/static/img/component8.png'},
        {src:'/static/img/component9.png'},
        {src:'/static/img/component10.png'}
      ],
      componentImg2:[
        {src:'/static/img/component5.png'},
        {src:'/static/img/component6.png'},
        {src:'/static/img/component7.png'}
      ],
      componentImg3:[
        {src:'/static/img/component1.png'},
        {src:'/static/img/component2.png'},
        {src:'/static/img/component3.png'},
        {src:'/static/img/component4.png'}
      ]
    }
  },
  props:['message'],
  components:{'IMask':IMask,'RegisterApplication':RegisterApplication},
  mounted:function(){
    this.$nextTick(function(){
      this.getChoosedList();
      this.getProcessL1();
      this.getApplication();
    })
  },
  methods: {
    addActive:function(item){
      this.isActive = item;
    },
    getChoosedList:function(){
      this.$http.get("/api/getList").then(res=>{
        this.choosedList = JSON.parse(res.body.data).result.choosedList;
      })
    },
    getProcessL1:function(){
      this.$http.get("/api/getList").then(res=>{
        this.processL1 = JSON.parse(res.body.data).result.processL11;
      })
    },
    getApplication:function(){
      this.$http.get("/api/getList").then(res=>{
        this.appList = JSON.parse(res.body.data).result.appList;
      })
    },
    openApp:function(){
      this.hideMask = !this.hideMask
      this.hideDialog = !this.hideDialog
    },
    closeDialog:function(childData){
      this.hideDialog = childData
      this.hideMask = childData
    }
  }
}
</script>
<style scoped>
  .application-active{font-weight: bold;color:#448bc7;}
  .choose-fix-list ul li{padding-left:0!important;}
  .choose-fix-router{width:95%!important;margin-left:15px;}

  /*组件*/
  .xf-component-item{display: inline-block;width: 33.2%;height: 65px;overflow: hidden;padding: 5px 1px;}
</style>


