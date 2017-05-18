<template>
  <div class="functional-select-wrapper" v-on:click.stop="multipleFocus()">
    <label class="display-container multiple-select-container clearfix" v-bind:class="(show)?'single-selected-focus':''">
      <p v-show="selectedList.length == 0 ">
        <span v-if="originOptions.length != 0 ">请选择</span>
        <span v-else>没有选项</span>
      </p>
      <p class="multiple-selected-item" v-for="item in selectedList" track-by="$index">{{ item.name }}
        <i v-on:click.stop.prevent="multipleRemove(item.id)">×</i>
      </p>
      <i class="drop" v-bind:class="(show)?'drop-up':''">▼</i>
    </label>
    <div class="options-container" v-show="show">
      <div class="search-container">
        <input placeholder="search here" class="search-input" v-model="search" v-on:keyup="multipleSearch($event)" v-on:click.stop />
      </div>
      <ul class="options-ul-list">
        <li v-show="displayOptions.length == 0">没有查询到数据</li>
        <li v-for="item in displayOptions" v-on:click.stop.prevent="multipleSelect(item.id)" v-bind:class=" selectedIdList.indexOf(item.id)!=-1?'selected':'' ">{{ item.name }}</li>
      </ul>
    </div>
  </div>
</template>

<script>
    export default{
      props:['selecteddata','optionsdata'],
	  data:function(){
		return {
		  originOptions:[],
		  displayOptions:[],
		  show:false,
		  search:'',
		  selectedList: [],
          selectedIdList: []
		}
	  },
	  mounted:function(){
	  	this.$nextTick(function(){
	  		window.addEventListener('click',this.blur)
	  	})
	  },
	  watch: {
        optionsdata: function (val, oldVal) {
            this.show = false;
            this.originOptions = val;
        },
        selecteddata: function(val, oldVal){
            // console.log('selected old: ' + JSON.stringify(oldVal))
            // console.log('selected new: ' + JSON.stringify(val))
            this.selectedList = val;
            this.selectedIdList = [];
            // 赋值selectedList
            for (var i=0;i<this.selectedList.length;i++){
                var item = this.selectedList[i];
                this.selectedIdList.push(item.id); 
            }
        }
      },
      methods:{
        multipleFocus: function(){
            if (!this.show){
                document.body.click();
                console.log('multiple show');
                this.show = true;
                this.multipleSearch();
                this.searchInputFocus();
            }
            else{
                this.blur();
            }
        },
        searchInputFocus: function(){
            var searchInput = this.$el.getElementsByClassName('search-input')[0];
            this.$nextTick(function(){
                searchInput.focus();
            })
        },
        multipleSelect: function(id){
            var mySelf = this;
            var displayOptions = mySelf.originOptions;
            var selectedList = mySelf.selectedList;
            var selectedIdList = mySelf.selectedIdList;
            //在原始数组里找 找到后1.添加到selectedList
            //若selectedIdList存在 则删除
            if (selectedIdList.indexOf(id)!=-1){
                mySelf.multipleRemove(id);
                return;
            }

            for (var i=0;i<displayOptions.length;i++){
                var item = displayOptions[i]
                if (item.id == id){
                    selectedList.push(item);
                    selectedIdList.push(id);
                    mySelf.multipleInitSearch();
                    mySelf.multipleSearch();
                    mySelf.dispatchData();
                    mySelf.searchInputFocus();
                }
            }

        },
        dispatchData: function(){
            // console.log('派发！！');
            this.$emit('selected', this.selectedList);
        },
        multipleRemove: function(id){
            console.log('删除！' + id)
            var mySelf = this;
            var selectedList = mySelf.selectedList;
            var selectedIdList = mySelf.selectedIdList;
            for (var i=0;i<selectedList.length;i++){
                var item = selectedList[i]
                if (item.id == id){
                    //1.从selectedList中删除 2.从selectedIdList中删除
                    selectedList.splice(i,1);
                    var index = selectedIdList.indexOf(item.id)
                    selectedIdList.splice(index,1)
                    mySelf.multipleInitSearch();
                    mySelf.multipleSearch();
                    mySelf.dispatchData();
                    mySelf.searchInputFocus();
                    return;
                }
            }
        },
        multipleSearch: function(event){
            var mySelf = this;
            var search = mySelf.search;
            var REG_RULE = new RegExp(search,"i") //根据用户输入值做正则
            // console.log(REG_RULE)
            //inputDom.style.width = (search.length*0.6) + 'em'
            
            var originOptions = mySelf.originOptions;
            var displayOptions = mySelf.displayOptions;

            // 通过回车键 添加
            if (event && event.keyCode==13 && search!=''){
                console.log('回车！');
                console.log('通过回车添加的值' + search);

                for (var i=0;i<originOptions.length;i++){
                    var item = originOptions[i]
                    if (item.name == search){
                        mySelf.multipleSelect(item.id);
                        return;
                    }
                    else if(i == (originOptions.length-1)){
                        alert('不存在的选项！');
                        return;
                    }
                }
            }

            //将展示列表置空 然后用正则去原始列表中匹配
            mySelf.displayOptions = [];
            //正则表达 匹配搜索字符
            for (var i=0;i<originOptions.length;i++){
                var item = originOptions[i]
                if (REG_RULE.test(item.name)){
                    mySelf.displayOptions.push(item)
                    // console.log(JSON.stringify(item))
                }
            }
            // console.log(JSON.stringify(mySelf.multiple.displayOptions))
        },
        multipleInitSearch: function(){
            var mySelf = this;
            //重置搜索框 1.清空搜索数据 2.下拉框展示全量
            mySelf.search = '';
        },
        blur: function(){
            console.log('hide multiple！！')
            this.show = false;
            this.search = '';
        }

	},
    }
	
</script>
<style scoped>
	@charset "UTF-8";
body,div,section,ul,li,p,img,dl,dt,dd,table,tr,td,input,button,h1,h2,h3,h4,h5,h6,fieldset{margin: 0px;padding: 0px;font-family: "Microsoft Yahei";}
input{
	border: 1px solid #ccc;
	outline:0;
	transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
}

input:focus,select:focus,textarea:focus{
	border-color: rgba(82,168,236,.8);
	box-shadow: 0 0 8px rgba(82,168,236,.6);
}

.clearfix:after {content: "."; height: 0px; display: block; clear: both; visibility: hidden;}

h3{
	margin: 20px;
}

.wrapper{
	width: 800px;
	margin: 20px 0px 50px 20px;
}

/*功能下拉框 整体壁纸*/
.functional-select-wrapper{
	width: 40%;
    font-size: 14px;
    position: absolute;
}

/*展示容器*/
.functional-select-wrapper .display-container{
	width: 100%;
	min-height: 34px;
	box-sizing: border-box;
	position: relative;
	display: block;
	padding: 6px 12px 6px 12px;
	color: #555;
	background-color: #FFF;
	border: 1px solid #CCC;
	border-radius: 4px;
	word-break: break-all;
	cursor: pointer;
}

.functional-select-wrapper .display-container .single-selected{
	float: left;
}

/*单选 搜索框获取焦点后 display-container下边框圆弧去掉radius*/
.functional-select-wrapper .single-selected-focus{
	border-bottom-left-radius: 0px;
	border-bottom-right-radius: 0px;
	transition: all 0.5s ease;
}

.functional-select-wrapper .display-container .drop{
	position: absolute;
	top: 4px;
	right: 6px;
	float: right;
	font-style: normal;
	transition: all 0.5s ease;
}

.functional-select-wrapper .display-container .drop-up{
	transform: rotate(180deg);
}

/*选项容器*/
.functional-select-wrapper .options-container{
	width: 100%;
	border: 1px solid #CCC;
	background-color: #FFF;
	position: absolute;
	top: 100%;
	margin-top: -1px;
	box-sizing: border-box;
	border-bottom-left-radius: 4px;
	border-bottom-right-radius: 4px;
	overflow: hidden;
	z-index: 1;
}

.functional-select-wrapper .options-container .search-container{
	display: block;
	padding: 5px;
}

.functional-select-wrapper .options-container .search-container input{
	width: 100%;
	height: 30px;
	box-sizing: border-box;
	padding-left: 6px;
	display: block;
	border-radius: 4px;
}

.functional-select-wrapper .options-container .options-ul-list{
	max-height: 160px;
	list-style-type: none;
	overflow-x: visible;
	overflow-y: auto;
	cursor: pointer;
}

.functional-select-wrapper .options-container .options-ul-list li{
	height: 32px;
	line-height: 20px;
	box-sizing: border-box;
	text-indent: 5px;
	padding: 6px;
}

.functional-select-wrapper .options-container .options-ul-list li:hover{
	background-color: #5897fb;
	color: #FFF;
	transition: all 0.3s ease;
}

.functional-select-wrapper .options-container .options-ul-list .selected{
	background-color: #DDD;
}

/*多选框 展示容器*/
.functional-select-wrapper .multiple-select-container{
	overflow: hidden;
	padding: 6px 6px 0px 12px;
	/*cursor: text;*/
}

/*多选框 获取焦点时的input*/
/*.functional-select-wrapper .multiple-select-input{
	min-width: 15px;
	border: none;
	background-color: orange;
	display: inline-block;
	float: left;
	margin-top: 2px;
}

.functional-select-wrapper .multiple-select-input:focus{
	border-color: none;
	box-shadow: none;
}*/

/*单个选中的item*/
.functional-select-wrapper .multiple-selected-item{
	width: auto;
	height: 20px;
	line-height: 15px;
	box-sizing: border-box;
	margin: 0px 5px 5px 0px;
	padding: 2px 15px 2px 6px;
	border: 1px solid #ccc;
	border-radius: 4px;
	display: inline-block;
	position: relative;
	float: left;
	background: #eee;
}

.functional-select-wrapper .multiple-selected-item i{
	font-style: normal;
	position: absolute;
	right: 3px;
	top: 0px;
	cursor: pointer;
	color: #aaa;
}

.functional-select-wrapper .multiple-selected-item i:hover{
	font-weight: bolder;
	color: #000;
}

</style>