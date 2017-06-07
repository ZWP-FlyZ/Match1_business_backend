<template>
  <!-- 全局div开始 -->
  <div>
  <el-checkbox-group v-model="checkList">
  <HistoryPath :historyPathTitle="historyPathTitle"></HistoryPath>
  <div class = "BZProcess">
      <div class="BZProcess-register cc-BZProcess-register">
        <ul><li class = "BZProcess-classify">解决方案</li></ul>
      </div>
      <div class = "classfy-table">
       <div>

        <div class="BZProcess-des">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">商品发布（2）</router-link></a>
        </div> 
        <div>
        <!-- 淘宝女装T-shirt开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
            <img src="../../assets/img/blue-unchecked.png" alt="" class = "blue-check" @click="showProcessChecked(0)" id = "0" v-if = "tbtshirt == 0">
            <img src="../../assets/img/blue-check.png" alt="" style="float:left;" class = "blue-checked" v-if = "tbtshirt == 1"> 
            <img src="../../assets/img/big.png" alt="" class = "blue-check look-into" @click="picBig(0)"> 
          </div>
          
          <div style = "text-align:center;clear:both;">淘宝女装T-shirt商品发布</div>
                  
          <div align="center">
            <router-link to="/cCLookUpProcess"><img src="../../assets/img/tbpublish.png" class="table-process-pic" v-bind:class="{'pic-bigger':picBigger==0}"/></router-link>  
          </div>
        </div>
        <!-- 淘宝女装T-shirt结束 -->
        <!-- 弹窗大图 -->
        <div id = "divCenter" align="center" class = "picBigShow">
          <img src="../../assets/img/tbpublish.png" alt="" style="margin-top:30px;" v-if = "depart == 0"/>
          <img src="../../assets/img/jhspublish.png" alt="" style="margin-top:30px;" v-if = "depart == 1"/>
          <div><a href="javascript:void(0);" @click="picClose()" class="link-btn link-btn-blue">关闭</a></div> 
        </div>
        <!-- 弹窗大图结束 -->
        
        <!-- 淘宝女装衬衫开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
            <img src="../../assets/img/blue-unchecked.png" alt="" class = "blue-check" @click="showProcessChecked(1)" id = "1" v-if = "tbchenshan == 0">
             <img src="../../assets/img/blue-check.png" alt="" style="float:left;" class = "blue-checked" v-if = "tbchenshan == 1"> 
            <img src="../../assets/img/big.png" alt="" class = "blue-check look-into" @click="picBig(0)"> 
          </div>
          
          <div style = "text-align:center;clear:both;">淘宝女装衬衫商品发布</div>
                  
          <div align="center">
            <router-link to="/cCLookUpProcess"><img src="../../assets/img/tbpublish.png" class="table-process-pic" v-bind:class="{'pic-bigger':picBigger==0}"/></router-link>  
          </div>
        </div>
        <!-- 淘宝女装衬衫结束 -->
          </div>
        </div>
      </div>
<!-- 解决方案结束 -->
      <div class="BZProcess-register cc-BZProcess-register">
        <ul>
            <li class = "BZProcess-classify">我的流程</li>
        </ul>
      </div>
      <div class = "classfy-table">
       <div>
        <div class="BZProcess-des">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">商品发布（1）</router-link></a>
        </div> 
        <div class="table-background" v-if = "deleteLogoNums!=1">
          <div style= "border:1px solid transparent;height:32px;">
            <img src="../../assets/img/blue-unchecked.png" alt="" class = "blue-check" @click="showProcessChecked(2)" id = "2" v-if = "tbBoyshoe == 0">
            <img src="../../assets/img/blue-check.png" alt="" style="float:left;" class = "blue-checked" v-if = "tbBoyshoe == 1"> 
            <img src="../../assets/img/big.png" alt="" class = "blue-check look-into" @click="picBig(0)"> 
          </div>
          
          <div style = "text-align:center;clear:both;">淘宝男鞋-帆布鞋商品发布</div>
                  
          <div align="center">
            <router-link to="/cCLookUpProcess"><img src="../../assets/img/tbpublish.png" class="table-process-pic" v-bind:class="{'pic-bigger':picBigger==0}"/></router-link>  
          </div>
          <img src="../../assets/img/timee.jpg" alt="" style="width:27px;height:27px;margin-left:45%;" @click="hideShow(1)" class = "blue-check">
        </div>
       </div>
      </div>
<!-- 我的流程结束 -->
       <div class="BZProcess-register cc-BZProcess-register">
        <ul>
            <li class = "BZProcess-classify">流程模板库</li>
        </ul>
      </div>
      <div class = "classfy-table">
       <div>
        <div class="BZProcess-des">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">商品发布（3）</router-link></a>
        </div> 
        <div>
         <!-- 淘宝一口价商品发布开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
            <img src="../../assets/img/blue-unchecked.png" alt="" class = "blue-check" @click="showProcessChecked(3)" id = "3" v-if = "tbSell == 0">
            <img src="../../assets/img/blue-check.png" alt="" style="float:left;" class = "blue-checked" v-if = "tbSell == 1"> 
            <img src="../../assets/img/big.png" alt="" class = "blue-check look-into" @click="picBig(1)"> 
          </div>
          
          <div style = "text-align:center;clear:both;">淘宝一口价商品发布</div>
                  
          <div align="center">
            <router-link to="/cCLookUpProcess"><img src="../../assets/img/jhspublish.png" class="table-process-pic" v-bind:class="{'pic-bigger':picBigger==0}"/></router-link>  
          </div>
        </div>
        <!-- 淘宝一口价商品发布结束 -->
        <!-- 天猫一口价商品发布开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
            <img src="../../assets/img/blue-unchecked.png" alt="" class = "blue-check" @click="showProcessChecked(4)" id = "4" v-if = "tmSell == 0">
            <img src="../../assets/img/blue-check.png" alt="" style="float:left;" class = "blue-checked" v-if = "tmSell == 1"> 
            <img src="../../assets/img/big.png" alt="" class = "blue-check look-into" @click="picBig(1)"> 
          </div>
          
          <div style = "text-align:center;clear:both;">天猫一口价商品发布</div>
                  
          <div align="center">
            <router-link to="/cCLookUpProcess"><img src="../../assets/img/jhspublish.png" class="table-process-pic" v-bind:class="{'pic-bigger':picBigger==0}"/></router-link>  
          </div>
        </div>
        <!-- 天猫一口价商品发布结束 -->
        <!-- 聚划算一口价商品发布开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
            <img src="../../assets/img/blue-unchecked.png" alt="" class = "blue-check" @click="showProcessChecked(5)" id = "5" v-if = "jhsSell == 0">
            <img src="../../assets/img/blue-check.png" alt="" style="float:left;" class = "blue-checked" v-if = "jhsSell == 1">
            <img src="../../assets/img/big.png" alt="" class = "blue-check look-into" @click="picBig(1)"> 
          </div>
          
          <div style = "text-align:center;clear:both;">聚划算一口价商品发布</div>
                  
          <div align="center">
            <router-link to="/cCLookUpProcess"><img src="../../assets/img/jhspublish.png" class="table-process-pic" v-bind:class="{'pic-bigger':picBigger==0}"/></router-link>  
          </div>
        </div>
        <!-- 聚划算一口价商品发布结束 -->
        </div>
        </div>
      </div>
<!-- 流程模板库结束 -->
      <div class="BZProcess-table" style="border:0;">
          <div class="BZ-edit">
              <router-link to="/cidentity"  class="link-btn link-btn-blue">上一步</router-link>
              <button class="link-btn link-btn-blue" @click="processPre">下一步</button>
          </div>
      </div>
      </div>
      </el-checkbox-group>
      <IMask :hide-mask.sync="hideMask"></IMask>
      <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
      <ProcessPre :hide-pre.sync="hidePre" :hide-mask.sync="hideMask" v-on:closePre="closePre"></ProcessPre>
    </div>  
  </div>
  <!-- 全局div结束 -->
</template>
<script>
import Delete from "../Delete"
import IMask from "../Mask"
import HistoryPath from "../HistoryPath"
import ProcessPre from '../CC/ProcessL1Pre'
  export default{
    data(){
      return {
        processList:[],
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true,
        hidePre:true,
        historyPathTitle:'业务方：选择业务身份 / 选择流程',
        checkList:[],
        deleteLogoNums:0,//deleteLogoNums为0时候 该div显示，若为1，则隐藏显示
        picBigger:'-1',//picBigger为0时显示缩略图状态  非0时，为放大状态
        depart:'-1',//depart=0 展示淘宝流程大图  depart=1展示聚划算流程大图
        tbtshirt:'0',////解决方案--淘宝女装T-shirt商品发布 tbtshirt:'0'展示未选中复选框，为1时显示选中复选框
        tbchenshan:'0',
        tbBoyshoe:'0',
        tbSell:'0',
        tmSell:'0',
        jhsSell:'0'
      }
    },
    components:{"Delete":Delete,"IMask":IMask,"HistoryPath":HistoryPath,"ProcessPre":ProcessPre},
    mounted:function(){
      this.$nextTick(function(){
        this.getProcess();
      })
    },
    methods: {
      getProcess:function(){
        this.$http.get("/api/getList").then(res=>{
          console.log(JSON.parse(res.body.data).result.processList)
          this.processList = JSON.parse(res.body.data).result.processList
        })
      },
      deleteDialog:function(i){
        this.hideDialog = !this.hideDialog
        this.hideMask = !this.hideMask
        this.deleteContent.item = i

      },
      closeDialog:function(childData){
        this.hideDialog = childData
        this.hideMask = childData
      },
      closePre:function(childData,i){
        this.hideMask = childData
        this.hidePre = childData
        if(i==1){
          this.$router.push("/cCbeforeEdit");
        }
      },
      processPre:function(){
        if(this.checkList.length==0){
          alert("请选择流程")
        }else if(this.checkList.length>1){
          this.hidePre = !this.hidePre
          this.hideMask = !this.hideMask
        }else{
          this.$router.push("/cCEditProcess");
        }
        
      },
      hideShow:function(i){
        this.deleteLogoNums = i;
      },
      showProcessChecked:function(i){//点击复选框按钮，图片变换成选中状态
        if (i == 0) {
          this.tbtshirt = 1;//解决方案--淘宝女装T-shirt商品发布
        }else if(i == 1){
          this.tbchenshan = 1;//解决方案---淘宝女装衬衫商品发布
        }else if(i == 2){
          this.tbBoyshoe = 1;//我的流程--淘宝男鞋
        }else if(i == 3){
          this.tbSell = 1;//流程库---淘宝一口价
        }else if(i == 4){
          this.tmSell = 1;//流程库---天猫一口价
        }else if(i ==5){
          this.jhsSell = 1;//流程库---聚划算一口价
        }        
      },
      showProcessBigger:function(i){
        this.picBigger = i;
      },
      picBig:function(i){
        var v = document.getElementById('divCenter');
        v.style.display = "block";
        this.depart = i;
      },
      picClose:function(i){
        var v = document.getElementById('divCenter');
        v.style.display = "none";
      }
    }
  }
</script>
<style scoped>
  .cc-BZProcess-register{margin-top:0px;}
  .table-checkbox{
    margin-left: 20px;
    position:relative;
    top: -9px;
  }
  .BZProcess-total{
    margin-top: 0;
  }
  .BZProcess-register{
    background: #F2F2F2;
    height: 45px;
    /*margin-top: 30px;*/
  }
  .BZProcess-classify{
    top:8px;
    float: left;
    padding-left: 10%;
    position: relative;
  }
  .BZProcess-create{
      position: relative;
      float: right;
      right: 16%;
      padding:6px 12px;
    }
  .BZProcess-des{
    margin-top: 20px;
  }
  .L1-name{
    color:#169BD5;
    display: inline-block;
    width: 20%;
    margin-left: 20px;
  }
  .L1-edit{
    display: inline-block;
    width: 30%;
    text-align: center;
    color:#169BD5;
  }
  .BZProcess-table{
    border:1px solid #f2f2f2;
    margin-top: 20px;
    display: inline-block;
    width: 100%;
    text-align: center;
    padding-bottom: 5px;
  }
  .BZ-edit{
    width:90%;
  }
  .BZProcess-table div{
    float: left;
    text-align: center;
    margin-top: 9px;
  }
  .BZProcess-table .BZ-num{
    width: 23%;
    position: relative;
  }
  .BZProcess-table .process{
    width: 46%;
    margin-right: 15%;
    position: relative;
  }
  .BZProcess-table .process-button{
    margin-left: 50px;

  }
  .BZProcess-table .process-button .link-btn{
    display: block;
  }
  .BZProcess-table .process img{
    width: 430px;
    height: 150px;
  }
  .BZProcess-table .link-btn{
    margin-left: 10px;
    margin-right: 15px;
    margin-top: 5px;
    position: relative;
  }
   hr.BZProcess-table-hr{
    width: 95%;
    margin:0 auto;
    margin-left: 20px;
    float: left;
    background-color: #f2f2f2;
    height: 1px;
    border: none;
    margin-top: 5px;
  }
  .BZProcess-table{
    margin-bottom: 20px;
  }
  .table-background{
     background:#f8f4f3;
     height:240px;
     width:400px;
     border-radius:6px;
     display: inline-block;
     margin:20px 0 20px 50px;
  }
  .table-button-title{
    text-align: center;
    margin-left: 30%;
    margin-right: 50%;
    font-size: 15px;
  }
  .table-title{
    text-align:center;
    margin-top:40px;
    /*margin-bottom: 30px;*/
  }
  .table-title label{
    font-size: 14px;
  }
 .table-process-pic{
  width:90%;
  margin-top:20px;
  /*transition:all 0.3s; */
 }
 .table-background img.blue-check{opacity:0;}
 .table-background:hover img.blue-check{opacity: 1}
 .look-into{float:right;position: relative;top:-3px;}
 .pic-bigger{transform: scale(2,2);}
 *{margin:0;padding:0;}
 .picBigShow{
    position:fixed;
    z-index:10;
    display:none;
    background-color:#000;
    opacity: 0.9;
    width:1250px;
    height:400px;
    left:300px;
    top:200px;
 }
</style>