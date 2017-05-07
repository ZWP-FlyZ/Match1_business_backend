import Vue from 'vue'
import vuex from 'vuex'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'

import App from './App'
import Content from './components/Content'
import BZProcess from './components/BZProcess'
import PageTemplate from './components/PageTemplate'
import BZability from './components/BZability'
import Ability from './components/Ability'
import 'bootstrap/dist/css/bootstrap.css'

Vue.use(VueRouter)
Vue.use(VueResource)
Vue.use(vuex)
const routes = [{
  path: '/',
  component: App
},
{
  path: '/content',
  component: Content
},
{
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

const router = new VueRouter({
  routes
})

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App}
})
