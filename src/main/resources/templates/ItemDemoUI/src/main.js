import Vue from 'vue'
import vuex from 'vuex'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'

import App from './App'
import Login from './Login'
import Content from './components/Content'
import BZProcess from './components/BZProcess'
import PageTemplate from './components/PageTemplate'
import BZability from './components/BZability'
import Ability from './components/Ability'

import 'bootstrap/dist/css/bootstrap.css'
import './assets/css/index.css'
import './assets/css/login.css'

Vue.use(VueRouter)
Vue.use(VueResource)
Vue.use(vuex)
const routes = [{
  path: '/',
  component: App
},
{
  path: '/login',
  component: Login
},
{
  path: '/content',
  component: Content,
  children:[{
    path: '/bzprocess',
    component: BZProcess 
  },
  {
    path: '/pagetemplate',
    component: PageTemplate
  },
  {
    path: '/bzability',
    component: BZability
  },
  {
    path: '/ability',
    component: Ability
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
  template: '<Login/>',
  components: { Login}
})
