
import Vue from 'vue'
import Router from 'vue-router'

import App from '@/App'
import Login from '@/Login'
import Content from '@/components/AA/Content'
import BZProcess from '@/components/AA/BZProcess'
import PageTemplate from '@/components/AA/PageTemplate'
import BZability from '@/components/AA/BZability'
import Ability from '@/components/AA/Ability'
import RegisterProcess from '@/components/AA/RegisterProcess'
import RegisterBZAbility from '@/components/AA/RegisterBZAbility'
import RegisterAbility from '@/components/AA/RegisterAbility'
import RegisterPageTemplate from '@/components/AA/RegisterPageTemplate'
import ConfigPreCondition from '@/components/AA/ConfigPreCondition'
import Identity from '@/components/BB/Identity'
import BBprocess from '@/components/BB/bBprocess'
import BBL1SideBar from '@/components/BB/bBL1SideBar'
import BBEditProcess from '@/components/BB/bBEditProcess'
import BBConfigProcess from '@/components/BB/BBConfigProcess'
import BBRegisterProcess from '@/components/BB/BBRegisterProcess'
import BBAddPreCondition from '@/components/BB/BBAddPreCondition'
import BBAddPageTemplate from '@/components/BB/BBAddPageTemplate'
import BBAddConfigure from '@/components/BB/BBAddConfigure'

import BBindex from '@/components/BBindex'
import AppIndex from '@/components/AppIndex'
import CCIndex from '@/components/CCIndex'
import CCprocess from '@/components/CC/CCprocess'
import CIdentity from '@/components/CC/identity'
import CCEditProcess from '@/components/CC/cCEditProcess'
import CCRegisterProcess from '@/components/CC/cCRegisterProcess'
import CCPageTemplate from '@/components/CC/cCPageTemplate'
import CCEditPageTemplate from '@/components/CC/cCEditPageTemplate'

Vue.use(Router)

export default new Router({
  routes: [
  {
    path:'/',
    redirect:'/ccindex'
  },
  {
    path:'/aaindex',
    component:AppIndex,
    children:[
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
        children:[
          {
            path: '/',
            redirect: '/bZProcess' 
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
          }
        ]
      }
    ]
  },
  {
    path:'/bbindex',
    component:BBindex,
    children:[
      {
        path:'/',
        redirect:'/identity'
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
      },
      {
        path: '/bBRegisterProcess',
        component: BBRegisterProcess
      },
      {
        path: '/bBAddPreCondition',
        component: BBAddPreCondition
      },
      {
        path: '/bBAddPageTemplate',
        component: BBAddPageTemplate
      },
      {
        path: '/bBAddConfigure',
        component: BBAddConfigure
      }
     ]
    },
    {
      path:'/ccindex',
      component:CCIndex,
      children:[
        {
          path:"/",
          redirect:'/cidentity'
        },
        {
          path:'/cidentity',
          component:CIdentity
        },
        {
          path:'/cCprocess',
          component:CCprocess
        },
        {
          path:'/cCEditProcess',
          component:CCEditProcess
        },
        {
          path:'/cCRegisterProcess',
          component:CCRegisterProcess
        },
        {
          path:'/cCEditPageTemplate',
          component:CCEditPageTemplate
        },
        {
          path:'/cCPageTemplate',
          component:CCPageTemplate
        }
      ]
    },
  ]
})

