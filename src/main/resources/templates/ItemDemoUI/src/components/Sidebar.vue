<template>
  <div>
    <div id="application" v-if="message==1">
      <div class="application-heading">
        <span>我的应用</span>
        <i class="el-icon-plus xf-icon-app-new" title="注册应用" @click="openApp"></i>
       <!--  <button class = "link-btn link-btn-primary" >注册应用</button> -->
      </div>
      <div class="application-list xf-application-list">
        <ul>
          <li v-bind:class="{'application-li-active':isActive == index}" @click="addActive(index)" v-for="(item,index) in appList">
          <router-link to="/content" class="xf-ta-center">
            <img class="xf-application-list-img" v-bind:src="item.img" />
            <span class="xf-application-list-span">{{item.appname}}</span>
          </router-link>
          </li>
        </ul>
      </div>
      <IMask :hide-mask.sync="hideMask"></IMask>
      <RegisterApplication :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask"  v-on:isClose="closeDialog"></RegisterApplication>
    </div>

    <div id="application" v-if="message==4">
      <div class="application-heading ">
        <span>已选流程列表</span>
      </div>
      <div class="application-list choose-fix-list">
        <!-- <ul >
          <li v-bind:class="{'application-li-active':isActive == index}" @click="addActive(index)" v-for="(item,index) in choosedList">
            <i class="icon-triangle-right"></i>
            <router-link to="/cCEditProcessFchoosed" class="application-router choose-fix-router">{{item.name}}</router-link>
          </li>
        </ul> -->
        <div class="xf-step-process">
         <router-link to="/cCEditProcessFchoosed">
          <div class="xf-step-per" @click="chooseProcess(index)" v-for="(item,index) in choosedList">
            <span class="xf-step-circle" v-bind:class="{'xf-step-font-active':whatprocess==index,'xf-step-border-active':whatprocess==index}"v-if="index!=0">{{index+1}}
            </span>
            <i class="el-icon-circle-check xf-edit-icon" v-if="index==0"></i>
            <span class="xf-step-text xf-step-active" v-bind:class="{'xf-step-font-active':whatprocess==index}">{{item.name}}</span>
            <div style="height:10px"></div>
          </div>
         </router-link>
        </div>
      </div>
    </div>

    <div id="application" v-if="message==3">
      <div class="application-heading xf-application-heading-fix">
        <span>一级流程
        </span>
        <span style="font-size:12px" v-if="identitytype!='无'">当前选择：{{identitytype}}</span>
        <i class="el-icon-caret-bottom xf-el-icon-caret-bottom"></i>
        <el-select class="xf-identity-type-left" v-model="identitytype" filterable placeholder="筛选条件">
        <el-option-group v-for="group in identitytypeList" :key="group.label" :label="group.label">
          <el-option
              v-for="item in group.options"
              :key="item.value"
              :label="item.label"
              :value="item.label">
            </el-option>
        </el-option-group>
       </el-select>
      </div>
      <div class="application-list">
        <div class="xf-step-process">
         <router-link to="/cCprocess">
          <div class="xf-step-per" v-for="(item,index) in processL1" @click="chooseProcess(index)">
            <span class="xf-step-circle" v-bind:class="{'xf-step-font-active':whatprocess==index,'xf-step-border-active':whatprocess==index}">{{index+1}}</span>
            <span class="xf-step-text xf-step-active" v-bind:class="{'xf-step-font-active':whatprocess==index}">{{item.name}}</span>
            <div class="xf-step-line" v-if="index!=processL1.length-1"></div>
          </div>
         </router-link>
        </div>
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
        <el-collapse v-model="activeNames">
          <el-collapse-item title="宝贝基本信息" name="1">
            <div class="xf-component-item" v-for="(item,index) in componentImg1">
              <img v-bind:src="item.src" />
            </div>
          </el-collapse-item>
          <el-collapse-item title="支付信息" name="2">
            <div class="xf-component-item" v-for="(item,index) in componentImg2">
              <img v-bind:src="item.src" />
            </div>
          </el-collapse-item>
          <el-collapse-item title="物流信息" name="3">
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
      activeNames:['1','2','3'],
      componentImg1:[
        {src:'static/img/component1.png'},
        {src:'static/img/component2.png'},
        {src:'static/img/component3.png'},
        {src:'static/img/component4.png'}
      ],
      componentImg2:[
        {src:'static/img/component10.png'}
      ],
      componentImg3:[
        {src:'static/img/component6.png'}
      ],
      whatprocess:'',
      identitytype:'',
        identitytypeList:[{
                      label: '无',
                      options:[{
                        value:"无",
                        label:'无'
                      }]
                    },{
                      label: '全局业务身份',
                      options: [{
                        value: 'tm',
                        label: '天猫'
                      }, {
                        value: 'tb',
                        label: '淘宝'
                      }]
                    }],
    }
  },
  props:['message'],
  components:{'IMask':IMask,'RegisterApplication':RegisterApplication},
  mounted:function(){
      this.$nextTick(function(){
      if(this.message == 1){
        this.getApplication();
      }
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
      /*this.$http.get("/api/getList").then(res=>{
        this.choosedList = JSON.parse(res.body.data).result.choosedList;
      })*/
      this.choosedList = [
        {
        "id":"1001",
        "name":"淘宝女装T-shirt商品发布",
        "imgPath":"static/img/tbpublish.png"
      },
      {
        "id":"1002",
        "name":"淘宝女装衬衫商品发布",
        "imgPath":"static/img/tbpublish.png"
      }
      ]
    },
    getProcessL1:function(){
      /*this.$http.get("/api/getList").then(res=>{
        this.processL1 = JSON.parse(res.body.data).result.processL11;
      })*/
      this.processL1 = [
        {
        "id":"1",
        "name":"买\\卖家注册"
      },
      {
        "id":"1",
        "name":"货品发布"
      },
      {
        "id":"1",
        "name":"货品选品"
      },
      {
        "id":"1",
        "name":"商品发布"
      },
      {
        "id":"1",
        "name":"商品选品"
      },
      {
        "id":"1",
        "name":"投放"
      },
      {
        "id":"1",
        "name":"加购\\收藏"
      },
      {
        "id":"1",
        "name":"合同订立"
      },
      {
        "id":"1",
        "name":"合同履行"
      },
      {
        "id":"1",
        "name":"评价"
      },
      {
        "id":"1",
        "name":"售后"
      }
      ]
    },
    getApplication:function(){
      this.$http.get("/api/app/getApps").then(function(res){
        this.appList = res.body;
        this.appList.forEach((i)=>{
          this.$set(i,'img','static/img/application2.png')
        })
      })
    },
    openApp:function(){
      this.hideMask = !this.hideMask
      this.hideDialog = !this.hideDialog
    },
    closeDialog:function(childData){
      this.hideDialog = childData
      this.hideMask = childData
    },
    chooseProcess:function(index){
      this.whatprocess=index
    }
  }
}
</script>
<style scoped>
  .application-active{font-weight: bold;color:#448bc7;}
  .choose-fix-list div{margin-left:3px!important;}
  .choose-fix-router{width:95%!important;margin-left:15px;}
  /*组件*/
  .xf-component-item{display: inline-block;width: 33.2%;height: 65px;overflow: hidden;padding: 5px 1px;}
  #application .xf-application-list ul li{height:78px;line-height: 78px;text-align: center;cursor: pointer;}
  .xf-application-list-img{width:50px;display: block;position: relative;left:25%;}
  .xf-application-list-span{position: relative;top:-28px;margin-left:-15px;}
  .xf-ta-center{text-align: center!important;}
  .xf-icon-app-new{color:white;position: relative;cursor: pointer;width:15px;height:15px;left: -1px;top: 10px;}
  .application-li-active{border-color:#f0f0f0 transparent #f0f0f0 #448bc7 !important;}
  .xf-step-process{margin-left:50px;margin-top:10px;}
  .xf-l1process-heading{padding-left:0px;}
  .xf-step-per{margin-left:0px;}
  .xf-step-circle{width:24px;height:24px;border-radius:12px;background-color: #fff;border:2px solid #bfcbd9;display: inline-block;text-align: center;color:#bfcbd9;font-size:14px;cursor: pointer;}
  .xf-step-text{cursor: pointer;text-align: center;color:#bfcbd9;font-size:14px}
  .xf-step-line{width:2px;height:20px;background-color:#bfcbd9;position: relative;top: -2px;left: 12px;}
  .xf-step-font-active{color:#448bc7;}
  .xf-step-border-active{border:2px solid #448bc7;}
  .xf-application-heading-fix{position: relative;}
  .xf-el-icon-caret-bottom{margin-left:5px;font-size:12px;position: relative;
    top: 10px;}
    .xf-identity-type-left{
      opacity:0;position: relative;top:-15px;
    }
</style>


