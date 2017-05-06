import Vue from 'vue'
import vuex from 'vuex'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'

import App from './App'
import Home from './components/Hello'
import Form from './components/From'
import 'bootstrap/dist/css/bootstrap.css'

import store from './store'
import TimeEntries from './components/TimeEntries.vue'

Vue.use(VueRouter)
Vue.use(VueResource)
Vue.use(vuex)
const routes = [{
  path: '/',
  component: App
},
{
  path: '/home',
  component: Home
},
{
  path: '/form',
  component: Form
},
{
  path: '/time-entries',
  component: TimeEntries,
  children: [{
    path: 'log-time',
    component: resolve => require(['./components/LogTime.vue'], resolve)
  }]
}]

const router = new VueRouter({
  routes
})

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  template: '<App/>',
  components: { App }
})
