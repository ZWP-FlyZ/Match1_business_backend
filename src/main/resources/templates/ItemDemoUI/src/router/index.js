import Vue from 'vue'
import Router from 'vue-router'

import App from '@/App'
import Login from '@/Login'
import Content from '@/components/Content'
import BZProcess from '@/components/BZProcess'
import PageTemplate from '@/components/PageTemplate'
import BZability from '@/components/BZability'
import Ability from '@/components/Ability'

Vue.use(Router)

export default new Router({
  routes: [
  {
  path: '/12',
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
})
