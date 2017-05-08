import Vue from 'vue'
import vuex from 'vuex'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import router from './router'

import App from './App'
import Login from './Login'

import 'bootstrap/dist/css/bootstrap.css'
import './assets/css/index.css'
import './assets/css/login.css'

Vue.use(VueResource)
Vue.use(vuex)

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<Login/>',
  components: { Login }
})
