<template>
  <!-- 全局div开始 -->
  <div>
  <Step :step="step" v-on:choosePro="choosePro" style="margin-left:-23.05%"></Step>
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
          <input type="checkbox"  @click="checkboxed(0,checkList,flag)" class = "chk_2" name="checkName" id = "11">
          <label for="11"> </label>全选
         
        </div> 
        <div>
        <!-- 淘宝女装T-shirt开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
            <input type="checkbox" value="0" v-model="checkList" id="0" class = "chk_1" name = "checkNameSolved">
            <label for="0"> </label>
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
           <input type="checkbox" v-model="checkList" style = "width:17px;height:17px;" id="1" value="1" class = "chk_1" name = "checkNameSolved">
           <label for="1"> </label>
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
            <li class = "BZProcess-classify">我定制的流程</li>
        </ul>
      </div>
      <div class = "classfy-table">
       <div>
        <div class="BZProcess-des">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">商品发布（1）</router-link></a>
          <input type="checkbox"  @click="checkboxed(1,checkListMy,flagMy)" class = "chk_2"  id = "12">
          <label for="12"> </label>全选
        </div> 
        <div class="table-background" v-if = "deleteLogoNums!=1">
          <div style= "border:1px solid transparent;height:32px;">
            <input type="checkbox"  value="2" v-model="checkListMy" style = "width:17px;height:17px;" id="2" class = "chk_1">
            <label for="2"></label>
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
          <input type="checkbox"  @click="checkboxed(2,checkListRepository,flagRepository)" class = "chk_2"  id = "13">
          <label for="13"> </label>全选
        </div> 
        <div>
         <!-- 淘宝一口价商品发布开始 -->
        <div class="table-background">
          <div style= "border:1px solid transparent;height:32px;">
          <input type="checkbox"  v-model="checkListRepository" value="3" style = "width:17px;height:17px;" id="3" class = "chk_1" name = "checkName">
          <label for="3"></label>
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
           <input type="checkbox"  value="4" v-model="checkListRepository" style = "width:17px;height:17px;" id="4" class = "chk_1" name = "checkName">
           <label for="4"></label>
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
           <input type="checkbox" value="5" v-model="checkListRepository" style = "width:17px;height:17px;" id="5" class = "chk_1" name = "checkName">
           <label for="5"></label>
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
      <ProcessPre :hide-pre.sync="hidePre" :hide-mask.sync="hideMask" v-on:closePre="closePre" :message="message"></ProcessPre>
    </div>  
  </div>
  <!-- 全局div结束 -->
</template>
<script>
import Delete from "../Delete"
import IMask from "../Mask"
import HistoryPath from "../HistoryPath"
import ProcessPre from '../CC/ProcessL1Pre'
import Step from '../CC/Step.vue'
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
        checkList:[],//解决方案复选框数组
        checkListMy:[],//我的流程 复选框数组
        checkListRepository:[],//流程模板库，复选框数组
        deleteLogoNums:0,//deleteLogoNums为0时候 该div显示，若为1，则隐藏显示
        picBigger:'-1',//picBigger为0时显示缩略图状态  非0时，为放大状态
        depart:'-1',//depart=0 展示淘宝流程大图  depart=1展示聚划算流程大图
        step:'2',
        message:'process',
        flag:false,
        flagMy:false,
        flagRepository:false
      }
    },
    components:{"Delete":Delete,"IMask":IMask,"HistoryPath":HistoryPath,"ProcessPre":ProcessPre,Step},
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
      choosePro:function(){
        this.processPre();
      },
      processPre:function(){
        if(this.checkList.length==0){
          alert("请选择流程")
        }else if(this.checkList.length>1){
          this.hidePre = !this.hidePre
          this.hideMask = !this.hideMask
        }else{
          //this.$router.push("/cCEditProcess");
          this.$router.push("/cCEditProcessFchoosed");

        }
      },
      hideShow:function(i){
        this.deleteLogoNums = i;
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
      },
      checkboxed:function(num,list,flag){
        // true  ok
        if(num == 0){
          this.flag = !this.flag;
          if(!this.flag){
            this.checkList = [];
          }else{
            this.checkList.push("0","1");

            this.checkList = this.unique(this.checkList).slice(0);
          }
        }else if(num == 1){
          this.flagMy = !this.flagMy;
          if(!this.flagMy){
            this.checkListMy = [];
          }else{
            this.checkListMy.push("2");
            this.checkListMy = this.unique(this.checkListMy).slice(0);
          }
        }else if(num == 2){
          this.flagRepository = !this.flagRepository;
          if(!this.flagRepository){
            this.checkListRepository = [];
          }else{
            this.checkListRepository.push("3","4","5");
            this.checkListRepository = this.unique(this.checkListRepository).slice(0);
          }
        }
      },
      unique:function(arr){
        var arrNew = [];
        for(var i = 0; i < arr.length; i++){
          if(arrNew.indexOf(arr[i]) == -1) arrNew.push(arr[i]);
        }
        return arrNew;
      }
    }
  }
       
</script>
<style scoped>
  #content{margin-top: 123px}
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
 /*.table-background input.blue-check-checkbox{opacity:0;}
 .table-background:hover input.blue-check-checkbox{opacity: 1;}*/
 .look-into{float:right;position: relative;top:-3px;}
 .pic-bigger{transform: scale(2,2);}
 *{margin:0;padding:0;}

/*<<<<<<< Updated upstream*/
  .picBigShow{
/*=======
 .picBigShow{
>>>>>>> Stashed changes*/
    position: fixed;
    top: 50%;
    left: 55%;
    margin-top: -200px;
    margin-left: -625px;
    width: 1250px;
    height: 400px;
    background: #000;
    z-index: 10;
    opacity: 0.9;
    display: none;
 }
.chk_1,.chk_2 { 
    display: none; 
} 
 
.chk_1 + label { 
    background-color: #FFF; 
    border: 1px solid #C1CACA; 
    box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05), inset 0px -15px 10px -12px rgba(0, 0, 0, 0.05); 
    border-radius: 3px; 
    display: inline-block; 
    position: relative; 
    width: 17px;
    height: 17px;
    margin-right: 30px; 
} 
.chk_1 + label:active,.chk_2 + label:active  { 
    box-shadow: 0 1px 2px rgba(0,0,0,0.05), inset 0px 1px 3px rgba(0,0,0,0.1); 
} 
 
.chk_1:checked + label,.chk_2:checked + label { 
    background-color: #ECF2F7; 
    border: 1px solid #92A1AC; 
    box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05), inset 0px -15px 10px -12px rgba(0, 0, 0, 0.05), inset 15px 10px -12px rgba(255, 255, 255, 0.1); 
    color: #243441; 
} 
 
.chk_1:checked + label:after,.chk_2:checked + label:after { 
    content: '\2714'; /*//勾选符号 */
    position: relative; 
    top: -4px; 
    left: 1px; 
    color: #758794; 
    text-align: center; 
    vertical-align: text-top; 
} 

.chk_2 + label { 
    background-color: #FFF; 
    border: 1px solid #C1CACA; 
    box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05), inset 0px -15px 10px -12px rgba(0, 0, 0, 0.05); 
    border-radius: 3px; 
    display: inline-block; 
    position: relative; 
    width: 17px;
    height: 17px;
    top:3px;
    margin-right: 3px; 
} 
</style>