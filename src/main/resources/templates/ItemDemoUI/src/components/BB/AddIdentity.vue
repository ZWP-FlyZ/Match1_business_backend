<template>
	<div class = "deleteAability" v-bind:class="{'hide':hideIdentity}">
	      <div class="delete-modal-dialog">
	        <div class="delete-modal-content">
			<div class="delete-modal-body">
				<div class = "delete-modal-delete-confirm">
					<span class="icon-delete"></span>新建业务身份
				</div>
				<div class = "delete-modal-delete-content">
					<label>名称：</label>
					<input type="text" placeholder="输入名称">
					<br />
					<label>描述：</label>
					<textarea></textarea>
          <br />
				</div>
        <br />
        <div class="block">
          <label>业&nbsp; 务&nbsp; 树：</label>
          <el-cascader placeholder="试试搜索：女装" :options="bztree" filterable="" change-on-select></el-cascader>
        </div>
        <br />
        <div class="block">
          <label>选择类目：</label>
          <el-cascader placeholder="试试搜索：女装" :options="category" filterable="" change-on-select></el-cascader>
        </div>
        <div class="delete-modal-delete-content">
          <label>开始时间：</label>
          <input type="date" class="datetime-width" placeholder="开始时间">
          <br /><br />
          <label>结束时间：</label>
          <input type="date" class="datetime-width" placeholder="结束时间">
        </div>
			</div>
			<div class = "delete-modal-footer">
				<button class = "link-btn link-btn-blue" @click="confirmDelete">确认</button>
				<button @click="closeDialog" class = "link-btn link-btn-red">取消</button>
			</div>
			</div>
		  </div>
		<!-- </div> -->
	</div>
</template>
<script>
	export default{
    data(){
      return {
        category:[],
        bztree:[]
      }
    },
	  props:['hideIdentity','hideMask'],
    mounted:function(){
      this.$nextTick(function(){
        this.getCategory();
      })
    },
	  methods:{
	  	closeDialog:function(){
	  		this.$emit("increment",!this.hideIdentity)
	  	},
	  	confirmDelete:function(){
	  	/*this.$http.post(this.message.url,object,{emulateJSON: true}).then((res)=>{
          console.log(res.bodyText);
        }).then((error)=>{
        })*/
        this.$emit("confirm",true)
	     },
       handleChange(value){
         console.log(value)
       },
       getCategory:function(){
        /*this.$http.get('/api/getList').then((res)=>{
          this.category = JSON.parse(res.body.data).result.category
        })*/
        this.bztree = [
          {
            "value":"quanqiugou",
            "label":"全球购",
            "children":[
              {
                "value":"C2B",
                "label":"C2B"
              }
            ]
          },
          {
            "value":"ziyongxianshizhuanrang",
            "label":"天猫",
            "children":[
              {
                "value":"女装",
                "label":"女装"
              },
              {
                "value":"服饰/服装",
                "label":"服饰/服装"
              }
            ]
          }
        ];
        this.category = [
          {
            "value":"quanqiugou",
            "label":"全球购",
            "children":[
              {
                "value":"C2B",
                "label":"C2B"
              }
            ]
          },
          {
            "value":"nvzhuang",
            "label":"女装/女士精品",
            "children":[
              {
                "value":"lianyiqun",
                "label":"连衣裙"
              },
              {
                "value":"T-恤",
                "label":"T-恤"
              },
              {
                "value":"衬衫",
                "label":"衬衫"
              },
              {
                "value":"裤子",
                "label":"裤子",
                "children":[
                  {
                    "value":"休闲裤",
                    "label":"休闲裤"
                  },
                  {
                    "value":"西装裤/正装裤",
                    "label":"西装裤/正装裤"
                  },
                  {
                    "value":"打底裤",
                    "label":"打底裤"
                  }
                ]
              }
            ]
          },
          {
            "value":"ziyongxianshizhuanrang",
            "label":"自用闲置转让",
            "children":[
              {
                "value":"女装",
                "label":"女装"
              },
              {
                "value":"服饰/服装",
                "label":"服饰/服装"
              }
            ]
          }
        ];

       }
	  }
  }
</script>
<style>
	.hide{display: none}
  .block{margin-left:30px;}
  .delete-modal-delete-content label{width:22.2%;display: inline-block;}
  .datetime-width{width:63.2% !important;}
	.icon-delete{background-position: -281px 0px;width: 22px;height: 22px;display: inline-block;background-image: url(../../assets/img/icon.png);position: relative;top: 6px;left: -6px;}
	.deleteAability{
		width: 420px;
		height: 260px;
		position: fixed;
		top: 16%;
		left: 35%;
		z-index:1113;
	}
	.ability-delete:hover{
		transform: scale(1.2,1.2);
	}
	.deleteAability-header a{
		color: #fff;
	}
	.delete-confirm{
		margin-top: 30px;
		margin-left: 30px;
	}
	#nav{
		 width:420px; 
		 height: 260px;
		 border: 1px solid #D4CD49; 
		 position:fixed;
		 left:40%;
		 top:20%;
		 background: #fff;
	}
	.delete-content{
		margin-top: 20px;
		margin-left: 100px;
		color: red;
		display: inline-block;
	}
	.delete-button{
		margin-top: 40px;
		margin-left: 50%;
		padding-right:30px;
	}
	.delete-button .btn-primary{
		float: left;
	}
	.delete-button .btn-delete{
		float: left;
		margin-top: 0px;
		position: relative;
		top: -24px;
	}
	.delete-button a{
		margin-right: 20px;
	}

	.delete-modal-content {/*弹窗样式*/
    position: relative;
    background-color: #fff;
    -webkit-background-clip: padding-box;
            background-clip: padding-box;
    border: 1px solid #999;
    border: 1px solid rgba(0, 0, 0, .2);
    border-radius: 6px;
    width: 100%;
    margin:0 auto;
    outline: 0;
    -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, .5);
            box-shadow: 0 3px 9px rgba(0, 0, 0, .5);
  }
  .delete-modal-dialog {/*弹窗布局*/
    position: relative;
    width: auto;
    margin: 10px;
  }
  .delete-modal-backdrop {
    position: fixed;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    z-index: 1040;
    background-color: #000;
    background-color: red;
  }
  .delete-modal-backdrop.fade {
    filter: alpha(opacity=0);
    opacity: 0;
  }
  .delete-modal-header {
    background: #0099FF;
    min-height: 16.42857143px;
    padding: 15px;
    border-bottom: 1px solid #e5e5e5;
  }
  .delete-modal-title {
    width: 30%;
    display: inline-block;
    margin: 0;
    line-height: 1.42857143;
    float: left;
    margin-left: 20px;
    margin-right: 11px;
  }
  .delete-modal-delete-div{
    float: left;
    width: 60%;
    text-align: right;
  }
  
  .delete-moda-delete:hover{
    transform: scale(1.2,1.2);
  }
  .delete-modal-title p{
    padding-left: 5%;
    float: left;
    margin-right: 55%;
  }
  .delete-modal-body {
    position: relative;
    padding: 15px;
  }
  .delete-modal-footer {
    padding: 15px;
    text-align: right;
  }
  .sr-only { clip: rect(0, 0, 0, 0); }

  .delete-modal-delete-confirm{
    margin-top: 10px;
    margin-left: 20px;
  }
  .delete-modal-delete-content{
    margin-top: 10px;
    margin-left: 30px;
  }
  .delete-modal-delete-content input{height: 34px;padding: 6px 12px;font-size: 14px;line-height: 1.42857143;color: #555;background-color: #fff;border: 1px solid #ccc;border-radius: 4px;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);width:63.3%;
    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;}
  .delete-modal-delete-content textarea{position: relative;top:20px;  padding: 6px 12px;
    font-size: 14px;
    line-height: 1.42857143;
    color: #555;
    width:63.3%;
    background-color: #fff;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;}
</style>