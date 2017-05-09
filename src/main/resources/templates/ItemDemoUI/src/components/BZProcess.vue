<template>
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
</template>