
import Vue from 'vue'
import Router from 'vue-router'

import App from '@/App'
import Login from '@/Login'
import Content from '@/components/Content'
import BZProcess from '@/components/BZProcess'
import PageTemplate from '@/components/PageTemplate'
import BZability from '@/components/BZability'
import Ability from '@/components/Ability'
import RegisterProcess from '@/components/RegisterProcess'
import RegisterBZAbility from '@/components/RegisterBZAbility'
import RegisterAbility from '@/components/RegisterAbility'
import RegisterPageTemplate from '@/components/RegisterPageTemplate'
import ConfigPreCondition from '@/components/ConfigPreCondition'
import GraphProcess from '@/components/GraphProcess'
import Identity from '@/components/Identity'
import BBprocess from '@/components/bBprocess'
import BBL1SideBar from '@/components/bBL1SideBar'
import BBEditProcess from '@/components/bBEditProcess'
import BBConfigProcess from '@/components/BBConfigProcess'
import BBindex from '@/components/BBindex'


Vue.use(Router)

export default new Router({
  routes: [
  {
  path: '/',
  redirect:'/content'
  },
  {
  path: '/BBindex',
  component:BBindex
  },
  {
  path: '/login',
  component: Login
  },
  {
  path:'/graphProcess',
  component:GraphProcess
  },
  {
  path: '/content',
  component: Content,
  children:[{
    path: '/',
    redirect: '/bZProcess' 
    },{
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
    },
    {
    path: '/registerProcess',
    component: RegisterProcess
    },
    {
    path: '/registerPageTemplate',
    component: RegisterPageTemplate
    },
    {
    path: '/registerBZAbility',
    component: RegisterBZAbility
    },
    {
    path: '/registerAbility',
    component: RegisterAbility
    },
    {
    path: '/configPreCondition',
    component: ConfigPreCondition
    },
    {
    path: '/identity',
    component: Identity
    },
    {
    path: '/bBprocess',
    component: BBprocess
    },
    {
    path: '/bBL1SideBar',
    component: BBprocess
    },
    {
    path: '/bBEditProcess',
    component: BBEditProcess
    },
    {
    path: '/bBConfigProcess',
    component: BBConfigProcess
    }]
  }]
})

