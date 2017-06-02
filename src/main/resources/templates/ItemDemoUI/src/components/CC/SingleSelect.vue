<template>
    <div class="functional-select-wrapper" v-on:click.stop="singleFocus()">
        <label class="display-container clearfix" v-bind:class="(show)?'single-selected-focus':''">
            <p v-show="selected.id == '' ">
                <span v-if="originOptions.length != 0 ">请选择</span>
                    <span v-else>没有选项</span>
                </p>
                <p class="single-selected">{{ selected.name }}</p>
                <i class="el-input__icon el-icon-caret-top" v-bind:class="(show)?'drop-up':''"> </i>
            </label>
            <div class="options-container" v-show="show">
                <div class="search-container">
                    <input placeholder="在这里搜索" class="search-input" v-model="search" v-on:keyup="singleSearch()" v-on:click.stop />
                </div>
                <ul class="options-ul-list">
                    <li v-show="displayOptions.length == 0">没有查询到数据</li>
                    <li v-for="item in displayOptions" v-on:click.stop.prevent="singleSelect(item.id)" v-bind:class=" (item.id == selected.id)?'selected':'' ">{{ item.name }}</li>
                </ul>
            </div>
        </div>
</template>
<script>
    export default{
        props: ['optionsdata','selecteddata'],
        data: function() {
        var data = {
            originOptions: [],
            displayOptions: [],
            show: false,
            search: '',
            selected: {
                id: "",
                name: ""
            }
        }
        return data
    },
    computed:{
        // selectedFocus:function(){
        //  return {
        //      "single-selected-focus": this.show
        //  } 
        // },
        // dropUp: function(){
        //  return {
        //      "drop-up": this.show
        //  }
        // }
    },
    mounted:function(){
        this.$nextTick(function(){
           window.addEventListener('click',this.blur)
        })
    },
    watch: {
        optionsdata: function (val, oldVal) {
            this.originOptions = val;
            this.show = false;
            // 默认值
            if (this.selected.id == ''){
                this.selected = this.originOptions[0];
            }

        },
        selecteddata: function(val, oldVal){
            this.selected = val
        }

    },
    methods:{
        singleFocus: function(){
            if (!this.show){
                document.body.click();
                console.log('single show')
                this.show = true;
                this.singleSearch();
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
        singleSelect: function(id){
            var mySelf = this;
            // var originOptions = mySelf.single.originOptions;
            var displayOptions = mySelf.displayOptions;
            for (var i=0; i<displayOptions.length;i++){
                var item = displayOptions[i]
                //在展示数组里找 找到后1.添加到selected
                if (item.id == id){
                    var selected = mySelf.selected;
                    selected.id = item.id
                    selected.name = item.name
                }
            }
            mySelf.show = false;
            this.search = '';
            //传递给父级组件
            // console.log('派发！！')
            //this.$dispatch('selected', this.selected)
            // console.log('选中的是' + JSON.stringify(this.selected))
        },
        singleSearch: function(){
            var mySelf = this;
            var search = mySelf.search;
            var REG_RULE = new RegExp(search,"i") //根据用户输入值做正则
            var originOptions = mySelf.originOptions;
            //将展示列表置空 然后用正则去原始列表中匹配
            mySelf.displayOptions = [];

            //console.log('搜索的内容是' + search)
            for (var i=0;i<originOptions.length;i++){
                var item = originOptions[i]
                // console.log('当前校验的是' + item.name)
                // console.log('校验的结果是' + REG_RULE.test(item.name))
                if (REG_RULE.test(item.name)){
                    mySelf.displayOptions.push(item)
                }
            }
        },
        blur: function(){
            console.log('hide single！！')
            this.show = false;
            this.search = '';
        }
      }
    }
</script>
<style scoped>
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

/*功能下拉框 整体壁纸*/
.functional-select-wrapper{
    width: 20%;
    font-size: 14px;
    position: relative;
}

/*展示容器*/
.functional-select-wrapper .display-container{
    width: 100%;
    min-height: 30px;
    box-sizing: border-box;
    position: relative;
    display: block;
    padding: 0px 12px 0px 12px;
    color: #555;
    background-color: #FFF;
    border: 1px solid #CCC;
    border-radius: 4px;
    word-break: break-all;
    cursor: pointer;
    height:30px;
}

.functional-select-wrapper .display-container .single-selected{
    float: left;
    margin-top:-5px;
}

/*单选 搜索框获取焦点后 display-container下边框圆弧去掉radius*/
.functional-select-wrapper .single-selected-focus{
    border-bottom-left-radius: 0px;
    border-bottom-right-radius: 0px;
    transition: all 0.5s ease;
}

.functional-select-wrapper .display-container .drop{
    position: absolute;
    top: -5px;
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
.display-container span{color:#bfcbd9;}
</style>