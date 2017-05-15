
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
import RegisterApplication from'@/components/RegisterApplication'
import DeleteBZProcess from '@/components/DeleteBZProcess'
import DeleteBZability from '@/components/DeleteBZability'
import DeleteAbility from '@/components/DeleteAbility'
import DeletePageTemplate from '@/components/DeletePageTemplate'
import Delete from '@/components/Delete'
Vue.use(Router)

export default new Router({
  routes: [
  {
  path: '/',
  redirect:'/content'
  },

  {
  path: '/login',
  component: Login
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
    path: '/registerApplication',
    component: RegisterApplication
    },
    {
    path: '/deleteBZProcess',
    component: DeleteBZProcess
    },
    {
    path: '/deleteBZability',
    component: DeleteBZability
    },
    {
    path: '/deleteAbility',
    component: DeleteAbility
    },
    {
    path: '/deletePageTemplate',
    component: DeletePageTemplate
    },
    {
    path: '/delete',
    component: Delete
    }]
  }]
})

