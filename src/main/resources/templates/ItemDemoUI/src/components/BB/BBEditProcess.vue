<template>
	<!-- 全局div开始 -->
	<div>
	<div class = "BZProcess">
	    <div class="BZProcess-register">
	      <ul>
	          <li class = "BZProcess-classify">抽象流程模板</li>
	      </ul>
	    </div>
	    <div class="class-table">
	    	<div class="BZProcess-table">
	    		<div class="BZ-edit">
	    			<div class="BZ-num"></div>
	    			<div class="process"><img src="/static/img/process1-highlight.png" alt=""></div>
	    		</div>
	    	</div>
	    </div>

	    <div class="BZProcess-register">
	      <ul>
	          <li class = "BZProcess-classify">流程自定义</li>
	      </ul>
	    </div>
	    <div class="class-table">
	    	<div class="BZProcess-table">
	    		<div class="BZ-edit">
	    			<div class="BZ-num"></div>
	    			<div class="process"><img src="/static/img/process1-white.png" alt=""></div>
	    		</div>
	    	</div>
	    </div>

	    <div class="BZProcess-table" style="border:0;">
	        <div class="BZ-edit">
	            <router-link to="/bBEditProcess" class = "link-btn link-btn-blue">确定</router-link>
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
  export default{
    data(){
      return {
        processList:[],
        deleteContent:{
          item:'',
          url:''//删除的url请求
        },
        hideDialog:true,
        hideMask:true
      }
    },
    components:{"Delete":Delete,"IMask":IMask},
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
<style>
  .table-checkbox{
  	margin-left: 0;
  	position:relative;
  	top: -9px;
  }
  .BZProcess-total{
    margin-top: 0;
  }
  .BZProcess-register{
    background: #F2F2F2;
    height: 45px;
    margin-top: 30px;
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
    width: 20%;
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
</style>