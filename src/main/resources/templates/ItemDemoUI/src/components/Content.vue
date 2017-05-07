<template>
  <div class="panel panel-default">
    <div class="container">
      <div class="row">
        <ul>
      	<li><router-link to="/bzprocess">流程</router-link></li>
      	<li><router-link to="/pagetemplate">页面模板</router-link></li>
      	<li><router-link to="/bzability">业务能力</router-link></li>
      	<li><router-link to="/ability">能力</router-link></li>
      </ul>
      </div>
      <div class="row">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

