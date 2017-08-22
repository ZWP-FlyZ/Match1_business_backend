import Vue from 'vue'
import vuex from 'vuex'
import VueRouter from 'vue-router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-default/index.css'
import VueResource from 'vue-resource'
import router from './router'
import store from './store/'
import App from './App'
import Login from './Login'
//import 'bootstrap/dist/css/bootstrap.css'
import './assets/css/index.css'
import './assets/css/login.css'
Vue.use(VueResource)
Vue.use(vuex)
Vue.use(ElementUI)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  template: '<App/>',
  components: { App },
  data:{
  	eventHub:new Vue()
  }
})
