<template>
  <div id="content">
    <div class="content-descrition">
      <ul>
        <li>流程总数：4</li>
        <li>页面模板：3</li>
        <li>业务能力：2</li>
        <li>能力：6</li>
      </ul>
    </div>
    <br>
    <div class="content-tab">
      <ul class="nav nav-tabs">
        <li class = "active"><a href="/bzprocess"><h2>流程</h2></a></li>
        <li><a href="/pagetemplate"><h2>页面模板</h2></a></li>
        <li><a href="/bzability"><h2>业务能力</h2></a></li>
        <li><a href="/ability"><h2>能力</h2></a></li>
      </ul>
      <!-- 流程tab内容开始 -->
      <div class = "BZ-tabs">
        <span class = "tabs-BZ-total">流程定制总数：12</span>
        <!-- <table>
          <tr>
            <td width = "30%">分类</td>
            <td width = "30%">流程</td>
            <td width = "20%"><button>注册流程</button></td>
          </tr>
        </table> -->
        <ul class="BZ-register">
          <li>分类</li>
          <li>流程</li>
          <li class = "register"><button type = "submit" value="submit">注册流程</button> </li>
        </ul>
        <div class="BZ-classify">
          <img src="" alt="">
          <a href=""  class = "BZ-classify-title"><router-link to="">商品发布流程（2）</router-link></a>
          <ul class="BZ-edit">
            <li>1</li>
            <li>此处放流程图</li>
            <li><button type = "submit" value="submit">编辑</button></li>
            <li><button type = "submit" value="submit">查看</button></li>
            <span></span>

            <li>2</li>
            <li>此处放流程图</li>
            <li><button type = "submit" value="submit">编辑</button></li>
            <li><button type = "submit" value="submit">查看</button></li>
            <span></span>
          </ul>

           


          <!-- <div class="container">
            <div class="row">
              <div class="col-sm-2">1.</div>
              <div class="col-sm-4">流程图</div>
              <div class="col-sm-2"><button>编辑</button></div>
              <div class="col-sm-2"><button>查看</button></div>
              <div class="col-sm-2"><button>删除</button></div>
            </div>
          </div> -->
        </div>
        
      </div>
      
      <!-- 流程tab内容结束 -->
    </div>

    
  </div>

  <!-- <div class="container">
    <div class="row">
      <Tab></Tab>
    </div>
    <div class="row">
    
      <router-view></router-view>
    </div>
  </div> -->
</template>

<script>
	import Tab from './Tab.vue'
	export default {
		components:{'Tab': Tab}
	}
</script>

