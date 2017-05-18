<template>

  <div class="regisiterpage">
    <div class="heads">
      页面模板基本信息
    </div>
    <div class="items">
      <form  class="itemsform">
        <div class="item">
        <label class="nameid">模板名称: </label><input type="text" class="inputbox checkView"  value="淘宝一口价商品发布填写商品信息模板" autocomplete="on" autofocus="autofocus">
        </div>

        <div class="item">
        <label class="nameid">模板描述: </label> <input type="text" class="inputbox checkView"  value="填写商品信息模板" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid"> 模板KEY: </label> <input type="text" class="inputbox checkView"  value="TBPUBLISH" autocomplete="on" >
        </div>

        <div class="item">
        <label class="nameid">应用方: </label> <input type="text" class="inputbox checkView"  value="应用1" autocomplete="on" >
        </div>
        <div class="item">
          <label class="nameid">开发日期: </label><input type="datetime-local" class="inputbox checkView"  value="2017-05-13"  autocomplete="on" >
        </div>


      </form>
    </div>

    <div class="heads">
      页面流程节点关联
    </div>
    <div class="yellow yellow-div">
      <div class="items">
          <select class="longinput checkView page-SelectList" >
            <option value=''>招商</option>
            <option value=''>组织货品</option>
            <option value=''>导购</option>
          </select>
          <select class="longinput checkView page-SelectList" >
            <option value=''>淘宝一口价商品发布</option>
            <option value=''>淘宝拍卖商品发布</option>
            <option value=''>天猫一口价商品发布</option>
            <option value=''>天猫拍卖商品发布</option>
            <option value=''>聚划一口价算商品发布</option>
            <option value=''>天猫一口价算商品发布</option>
          </select>
          <select class="longinput checkView page-SelectList" >
            <option value=''>获取类目列表</option>
            <option value=''>选择货品类目</option>
            <option value=''>是否使用产品模板</option>
            <option value=''>填写商品信息</option>
            <option value=''>搜索获取货品模板</option>
            <option value=''>审核</option>
            <option value=''>机器审核</option>
          </select>
          <select class="longinput checkView page-SelectList" >
            <option>活动小二</option>
            <option>流量小二</option>
            <option>渠道小二</option>
            <option>商家</option>
          </select>
           <select class="longinput checkView page-SelectList" >
            <option>天猫一口价--填写商品信息</option>
            <option>淘宝一口价--填写商品信息</option>
          </select>
          <!-- <div class="relate-choose-list">
            <div class="back-color">
                <div class="relate-choose-button">天猫一口价--填写商品信息</div>
                <div class="relate-choose-delete"><a href=""><img src="../assets/img/delete-ability.png" alt="" /></a>
                </div>
            </div>
          </div>
          <div class="relate-choose-list">
            <div class="back-color">
                <div class="relate-choose-button">淘宝一口价--填写商品信息</div>
                <div class="relate-choose-delete"><a href=""><img src="../assets/img/delete-ability.png" alt="" /></a>
                </div>
            </div>
          </div> -->
      </div>
      
    </div>
    <div class="heads">
      关联的业务能力剖面
    </div>

      <form  class="yellow">
        <div class="item-row">
          <div class="item item-select-relate ">
            <label class="smallname">宝贝基本信息</label>
            <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item item-select-relate">
            <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="longname">业务能力剖面：</label>
            <MutipleSelectDelete v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata = "multiple.selectedList" v-on:selected="multipleCallback"></MutipleSelectDelete>
          </div>
          <div class="item item-select-relate">
            <label class="smallnamed"> 宝贝卖点， </label>
            <label class="smallnamed"> 宝贝类型， </label>
            <label class="smallnamed"> 描述帆布鞋 </label>
          </div>
        </div>
        <div class="item-row">
          <div class="item item-select-relate">
            <label class="smallname">支付信息</label>
            <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item item-select-relate">
            <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="longname">业务能力剖面：</label>
            <MutipleSelectDelete v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata = "multiple.selectedList" v-on:selected="multipleCallback"></MutipleSelectDelete>
          </div>
          <div class="item item-select-relate">
            <label class="smallnamed"> 会员打折， </label>
            <label class="smallnamed"> 预售 </label>
          </div>
          <!-- <div class="relate-choose-list">
            <div class="back-color">
                <div class="relate-choose-button">预售</div>
                <div class="relate-choose-delete"><a href=""><img src="../assets/img/delete-ability.png" alt="" /></a>
                </div>
            </div>
          </div> -->
        </div>
        <div class="item-row">
          <div class="item item-select-relate">
            <label class="smallname">物流信息</label>
            <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item item-select-relate">
            <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="longname">业务能力剖面：</label>
            <MutipleSelectDelete v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata = "multiple.selectedList" v-on:selected="multipleCallback"></MutipleSelectDelete>
          </div>
          <!-- <div class="relate-choose-list">
            <div class="back-color">
                <div class="relate-choose-button">运费模板</div>
                <div class="relate-choose-delete"><a href=""><img src="../assets/img/delete-ability.png" alt="" /></a>
                </div>
            </div>
          </div> -->
           <div class="item item-select-relate">
            <label class="smallnamed"> 运费模板， </label>
            <label class="smallnamed"> 电子凭证 </label>
          </div>
        </div>
        <div class="item-row">
          <div class="item item-select-relate">
            <label class="smallname">售后信息</label>
            <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="" autocomplete="on" autofocus="autofocus">
          </div>
          <div class="item item-select-relate">
            <label class="smallname">名称: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="smallnamed"> 描述: </label> <input type="text" class="smallinput"  placeholder="121"  autocomplete="on" >
          </div>
          <div class="item item-select-relate">
            <label class="longname">业务能力剖面：</label>
            <MutipleSelectDelete v-bind:optionsdata="multiple.originOptions" v-bind:selecteddata = "multiple.selectedList" v-on:selected="multipleCallback"></MutipleSelectDelete>
          </div>
          <!-- <div class="relate-choose-list">
            <div class="back-color">
                <div class="relate-choose-button">发票</div>
                <div class="relate-choose-delete"><a href=""><img src="../assets/img/delete-ability.png" alt="" /></a>
                </div>
            </div>
          </div> -->
          
        </div>
      </form>

    <div class="heads">
      前置条件
    </div>
    <div class="items">
      <div class="twocolor">
      <form class="grey">
        <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>
        <div class="item">
        <label class="longname">卖家信用等级</label>
        <select class="longinput" >
          <option>前置条件库</option>
          <option value=''></option>
        </select>
        </div>
      <div class="item">
        <label class="smallname">KEY: </label><input type="text" class="smallinput"  placeholder="Star" autocomplete="on" autofocus="autofocus">
      </div>
        <div class="item">
        <label class="smallname">名称: </label> <input type="text" class="smallinput checkView"  value="121"  autocomplete="on" >
        </div>

        <a href="#" class="addbottom">添加同类型配置项</a>
      </form>
        <!-- <div class="items2">
          <div class="item">
          <label class="longname">配置项值选项</label>
          <select class="inputbox" >
            <option>多选</option>
            <option value=''></option>
          </select>
          </div>
          <a href="#" class="rightaddbottom">添加值选项</a>
          <div class="items3">
          <form class="grey">
            <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">

            <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="1" autocomplete="on" autofocus="autofocus">
          </div>
            <div class="item">
            <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="一颗星" autocomplete="on" >
            </div>

          </form>
            <br/>
            <form class="grey">
              <router-link to="/bzprocess"><img src="../assets/img/delete-red.png" alt="" class = "bzprocess-delete"></router-link>

          <div class="item">
              <label class="smallname">KEY: </label><input type="text" class="inputbox"  placeholder="2"  autocomplete="on" autofocus="autofocus">
          </div>
              <div class="item">
              <label class="smallname">名称: </label> <input type="text" class="inputbox"  placeholder="两颗星" autocomplete="on" >
              </div>

            </form>
            <br/>
          </div>
        </div> -->
      </div>
      
    </div>
  <br/>
    <div class="bottom" >
      <router-link to="/pagetemplate"  class="ok">确定</router-link>
    </div>
    <br/>
  </div>

</template>
<script>
  import MutipleSelectDelete from './mutipleSelectDelete'
  export default{
    data:function(){
      return {
        multiple:{
          originOptions: [],
          selectedList: []
      }
     }
    },
    components:{'MutipleSelectDelete':MutipleSelectDelete},
    mounted:function(){
      this.$nextTick(function(){
        this.queryData();
      })
    },
    methods:{
      queryData:function(){
        var mySelf = this
        this.$http.get("/api/getList").then(res=>{
          mySelf.multiple.originOptions = JSON.parse(res.body.data).result.pageList
        })
        mySelf.multiple.selectedList = [{"id":"1","name":"天猫商品发布"}]
      },
      multipleCallback: function(data){
            this.multiple.selectedList = data;
        }
    }
  }
</script>
<style>
@import "../assets/css/edit.css";
.page-SelectList{
  border-style:none;
    appearance:none;
    display: inline-block;
    float: left;
}
.back-color{
  display: inline-block;
  padding: 6px 12px;
  margin-bottom: 0;
  font-size: 14px;
  font-weight: normal;
  line-height: 1.428571429;
  text-align: center;
  white-space: nowrap;
  vertical-align: middle;
  cursor: pointer;
  background-image: none;
  border: 1px solid transparent;
  border-radius: 4px;
  background:#4FD2C2;
  color: #ffffff;
  width: 100px;
  /*background-color: #428bca;*/
  border-color: #357ebd;
  /*float: left;*/
}
    .relate-choose-button{
      float: left;
      width: 60%;
    }
    .relate-choose-delete{
      margin-left: 20%;
      float: right;
      position: relative;
      top: -6px;
    }
    .relate-choose-delete:hover{
      transform: scale(1.2,1.2);
    }
    .item-relate-list{
      float: left;
      /*border:1px solid red;*/
    }
    .item-select-relate{
      float:left;
    }
    .relate-choose-list{
      float: left;
      display: inline-block;
      margin-right: 10px;
    }
    
   /* .items{border:1px solid red;}*/

</style>
<script>
    export default{
      data(){
        return {
          nextState:1
        }
      },
      methods:{
        change:function(obj){
          var liArray=document.getElementById(obj.currentTarget.parentNode.id);
          var arr = liArray.getElementsByTagName("li")
          var i=1;
          var length=liArray.length;
          switch(this.nextState){
            case 1:
              document.getElementById(obj.currentTarget.id).innerHTML="当前选择↑";
              for(;i<arr.length;i++){
              arr[i].className="liShow";
              }
              this.nextState=0;
            break;
            case 0:
              document.getElementById(obj.currentTarget.id).innerHTML="当前选择↓";
              for(;i<arr.length;i++){
              arr[i].className="liHide";
              }
              this.nextState=1;
          }
        }
      }
    }   
  </script>

