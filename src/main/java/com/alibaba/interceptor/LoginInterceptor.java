package com.alibaba.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.util.*;
public class LoginInterceptor implements HandlerInterceptor {
	 Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	            throws Exception {
	        logger.info("------preHandle------");
	        //获取session
	        HttpSession session = request.getSession(true);
	        //判断用户ID是否存在，不存在就跳转到登录界面
	        if(session.getAttribute(Constants.Session_User) == null){
	            logger.info("------:应该跳转到login页面！");
	            ResponseData resp = new ResponseData();
	            resp.setCode(Constants.IDENTITY_FAIL);//401
	            response.getWriter().append(JSON.toJSONString(resp));
	            //response.sendRedirect("http://localhost:3000/");
	            /*RequestDispatcher rd = request.getRequestDispatcher("/reLogin");

	            rd.forward(request,response);*/
	            
	            return false;
	        }else{
	            session.setAttribute(Constants.Session_User, session.getAttribute(Constants.Session_User));
	            return true;
	        }
	    }

	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	            ModelAndView modelAndView) throws Exception {
	        // TODO Auto-generated method stub

	    }

	    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	            throws Exception {
	        // TODO Auto-generated method stub

	    }

}
