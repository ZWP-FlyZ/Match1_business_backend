<template>
  <!-- 全局div开始 -->
  <div>
  <HistoryPath :historyPathTitle="historyPathTitle"></HistoryPath>
  <div class = "BZProcess">
      <div class="BZProcess-register cc-BZProcess-register">
        <ul>
            <li class = "BZProcess-classify">解决方案</li>
            <li class = "BZProcess-create"><router-link to="" class = "link-btn link-btn-default">新建解决方案</router-link></li>
        </ul>
      </div>
      <div class = "classfy-table">
       <div>
        <div class="BZProcess-des">
          <img src="" alt="">
          <a href="" ><router-link to="" class = "L1-name">商品发布（2）</router-link></a>
        </div> 
        <div>
          <div class = "table-background">
             <div align="center">
               <router-link to="/cCLookUpProcess"><img src="../../assets/img/tbpublish.png" class="table-process-pic" />
               </router-link>  
             </div>
             <div class = "table-title"><div class = "table-checkbox"><el-checkbox ><label for="">淘宝女装T-shirt商品发布</label></el-checkbox></div></div>
             <router-link to="/cCEditprocess" class = "link-btn table-button" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title">配置</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
          </div>

          <div class = "table-background">
             <div align="center">
              <router-link to="/cCLookUpProcess"><img src="../../assets/img/tbpublish.png" class="table-process-pic"/>
              </router-link>
             </div>
             <div class = "table-title"><div class = "table-checkbox"><el-checkbox ><label for="">淘宝女装衬衫商品发布</label></el-checkbox></div></div>
             <router-link to="/cCEditprocess" class = "link-btn table-button" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title">配置</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
          </div>

        </div>
        </div>
      </div>

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
        <!-- <div class="BZProcess-table">
          <div class="BZ-edit">
            <div class="BZ-num"><div class = "table-checkbox"><el-checkbox >淘宝男鞋-帆布鞋商品发布</el-checkbox></div></div>
            <div class="process"><img src="../../assets/img/tbpublish.png" /></div>
            <div class = "process-button">
              <router-link to="/cCEditProcess" class = "link-btn link-btn-primary">编辑</router-link>
              <router-link to="/cCEditProcess" class = "link-btn link-btn-look">查看</router-link>
              <li><button class = "link-btn link-btn-delete" @click="deleteDialog(item)" >删除</button></li>
            </div>
          </div>
        </div> -->
        <div class = "table-background">
             <div align="center">
              <router-link to="/cCLookUpProcess"><img src="../../assets/img/tbpublish.png" class="table-process-pic"/>
              </router-link>
             </div>
             <div class = "table-title"><div class = "table-checkbox" ><el-checkbox ><label for="">淘宝男鞋-帆布鞋商品发布</label></el-checkbox></div></div>
             <router-link to="/cCEditprocess" class = "link-btn table-button-my" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title-my">配置</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
             <router-link to="" class = "link-btn table-button-my" align="center">
                 <img src="../../assets/img/glyphicons-446-floppy-remove.png">
                  <label for="" class = "table-button-title-my">删除</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
             <!-- <router-link to="" class = "link-btn table-button" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title">删除</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link> -->
          </div>
        </div>
      </div>


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
          <div class = "table-background">
             <div align="center">
               <router-link to="/cCLookUpProcess"><img src="../../assets/img/jhspublish.png" class="table-process-pic" />
               </router-link>  
             </div>
             <div class = "table-title"><div class = "table-checkbox"><el-checkbox ><label for="">淘宝一口价商品发布</label></el-checkbox></div></div>
             <router-link to="/cCEditprocess" class = "link-btn table-button" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title">配置</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
          </div>

          <div class = "table-background">
             <div align="center">
              <router-link to="/cCLookUpProcess"><img src="../../assets/img/jhspublish.png" class="table-process-pic"/>
              </router-link>
             </div>
             <div class = "table-title"><div class = "table-checkbox"><el-checkbox ><label for="">天猫一口价商品发布</label></el-checkbox></div></div>
             <router-link to="/cCEditprocess" class = "link-btn table-button" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title">配置</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
          </div>

          <div class = "table-background">
             <div align="center">
              <router-link to="/cCLookUpProcess"><img src="../../assets/img/jhspublish.png" class="table-process-pic"/>
              </router-link>
             </div>
             <div class = "table-title"><div class = "table-checkbox"><el-checkbox ><label for="">聚划算一口价商品发布</label></el-checkbox></div></div>
             <router-link to="/cCEditprocess" class = "link-btn table-button" align="center">
                 <img src="../../assets/img/glyphicons-137-cogwheel.png">
                  <label for="" class = "table-button-title">配置</label>
                 <img src="../../assets/img/glyphicons-224-chevron-right.png">
             </router-link>
          </div>

        </div>

        <!-- <div class="BZProcess-table">
          <div class="BZ-edit">
            <div class="BZ-num">
            <div class = "table-checkbox">
              <el-checkbox>淘宝一口价商品发布</el-checkbox>
            </div>
            </div>
            <div class="process"><img src="../../assets/img/tbpublish.png" /></div>
            <div class = "process-button">
              <router-link to="/cCEditProcess" class = "link-btn link-btn-look">查看</router-link>
            </div>
          </div>
        </div> -->
        <!-- <div class="BZProcess-table">
          <div class="BZ-edit">
            <div class="BZ-num"><div class = "table-checkbox"><el-checkbox >天猫一口价商品发布</el-checkbox></div></div>
            <div class="process"><img src="../../assets/img/tmpublish.png" /></div>
            <div class = "process-button">
              <router-link to="/cCEditProcess" class = "link-btn link-btn-look">查看</router-link>
            </div>
          </div>
        </div> -->
        <!-- <div class="BZProcess-table">
          <div class="BZ-edit">
            <div class="BZ-num"><div class = "table-checkbox"><el-checkbox >聚划算一口价商品发布</el-checkbox></div></div>
            <div class="process"><img src="../../assets/img/jhspublish.png" /></div>
            <div class = "process-button">
              <router-link to="/cCEditProcess" class = "link-btn link-btn-look">查看</router-link>
            </div>
          </div>
        </div> -->
        </div>
      </div>
      <div class="BZProcess-table" style="border:0;">
          <div class="BZ-edit">
              <router-link to="/cCbeforeEdit" class = "link-btn link-btn-blue">确定</router-link>
          </div>
      </div>
      </div>
      <IMask :hide-mask.sync="hideMask"></IMask>
      <Delete :message="deleteContent" :hide-dialog.sync="hideDialog" :hide-mask.sync="hideMask" v-on:increment="closeDialog"></Delete>
    </div>  
    
  </div>
  <!-- 全局div结束 -->
</template>
<script>
import Delete from "../Delete"
import IMask from "../Mask"
import HistoryPath from "../HistoryPath"
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
        historyPathTitle:'业务方：选择业务身份 / 选择流程',

      }
    },
    components:{"Delete":Delete,"IMask":IMask,"HistoryPath":HistoryPath},
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
     height:380px;
     width:460px;
     border-radius:6px;
     display: inline-block;
     margin:20px 0 20px 50px;
  }
  .table-button-title{
    text-align: center;
    margin-left: 30%;
    margin-right: 50%;
    font-size: 150%;
  }
  .table-title{
    text-align:center;
    margin-top:40px;
    margin-bottom: 30px;
  }
  .table-title label{
    font-size: 140%;
  }
  .table-button-title-my{
    text-align: center;
    margin-left: 10%;
    margin-right: 25%;
    font-size: 150%;
  }
  .table-title-my{
    text-align:center;
    margin-top:40px;
    margin-bottom: 30px;
  }
  .table-title-my label{
    font-size: 140%;
  }
  .table-button-my{
    border:3px solid #ebe8e7;
    padding: 14px 20px;
    text-align: left;
    transition: all .5s ease-out;
    color: #8d8d8d;
    width: 40%;
    border-radius: 5px;
    margin-left: 30px;
  }
  .table-button-my:hover{
    transition: all .5s ease-out;
    border:3px solid #169BD5;
  }
  .table-button{
    border:3px solid #ebe8e7;
    padding: 14px 20px;
    text-align: left;
    transition: all .5s ease-out;
    color: #8d8d8d;
    width: 90%;
    border-radius: 5px;
    margin-left: 30px;
  }
  .table-button:hover{
    transition: all .5s ease-out;
    border:3px solid #169BD5;
  }
 .table-process-pic{
  width:85%;
  margin-top:40px;
  transition:all 0.3s; 
 }
 .table-process-pic:hover{
  transform: scale(1.5,1.5);
 }

</style>