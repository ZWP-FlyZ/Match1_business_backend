<template>
	<!-- 全局div开始 -->
  <div>
  	<div class = "BBright">
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
  	    			<div class="process"><img src="../../assets/img/process1-highlight.png" alt=""></div>
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
  	    			<div class="process"><img src="../../assets/img/process1-white.png" alt=""></div>
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
      <div class="BBleft">
      <!-- <div class="todo mrm">
        <div class="todo-search">
          <input type="search" class="todo-search-field" placeholder="search">
          <ul>
            <li cass = "todo-done">
              <div class="todo-icon fui-man-24">图片</div>
              <div class="todo-content"><h4>选项</h4><input type="table-checkbox"></div>
            </li>
          </ul>
        </div>
      </div> -->
      <div class="search-header">
        <input type="search" class="todo-search-field" placeholder="search">
        <img src="/static/img/glyphicons-28-search.png" alt="">
      </div>
      <div class="search-body">
        <img src="/static/img/glyphicons-61-compass.png" alt="">
        <span>选项</span>
        <input type="checkbox">
      </div>
    </div>
    <div class="xf-clear"></div>
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
  .BBleft{
    width: 25%;
    height: 200px;
    float: left;
    margin-left: 20px;
    margin-top: 30px;
    border:1px solid red;
  }
  .todo li.todo-done{
    /*background: transparent url(../images/todo/done.png) 92% center no-repeat;*/
    background-size: 20px 20px;
    color: #1abc9c;
  }
  .todo li {
    /*background: #34495e url(../images/todo/todo.png) 92% center no-repeat;*/
    background-size: 20px 20px;
    cursor: pointer;
    margin-top: 2px;
    padding: 18px 42px 17px 25px;
    position: relative;
    -webkit-transition: 0.25s;
    -moz-transition: 0.25s;
    -o-transition: 0.25s;
    transition: 0.25s;
    -webkit-backface-visibility: hidden;
}
li {
    line-height: 20px;
}
li {
    display: list-item;
    text-align: -webkit-match-parent;
}
  .BBright{
    width: 60%;
    margin-top: 30px;
    border: 1px solid green;
    float: left;
  }
  .search-header{
    background: #1abc9c;
    height: 40px;
    border-radius: 6px;
    background-size: 16px 16px;
    border-radius: 6px 6px 0 0;
    color: #34495e;
    /*padding: 19px 25px 20px;*/
  }
  input.todo-search-field {
    background: none;
    border: none;
    color: #34495e;
    font-size: 19px;
    font-weight: 700;
    margin-left: 23px;
    line-height: 23px;
    padding: 5px 0;
    text-indent: 0;
    -webkit-box-shadow: none;
    -moz-box-shadow: none;
    box-shadow: none;
    float: left;
}
.search-header img{
  float: left;
  margin-left: 3px;
  margin-top: 5px;
}
.search-body{
  float: left;
  margin-left: 13px;
  margin-top: 10px;
}
.search-body span{
  width: 50px;
  border:1px solid red;
  margin-right:3px;
}
/*.search-body img{
  float: left;
  margin-left: 13px;
  margin-top: 10px;
  /*margin:3px 4px;
}*/
</style>