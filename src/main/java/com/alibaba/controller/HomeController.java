package com.alibaba.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.entity.User;
import com.alibaba.repository.UserRepository;
import com.alibaba.util.BaseController;
import com.alibaba.util.Constants;
import com.alibaba.util.ResponseData;

@Controller
public class HomeController{
	@Autowired//别漏了
	private UserRepository userRepository;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ResponseData responseData = new ResponseData();
	//用户登录验证
	@RequestMapping("/login")
	@ResponseBody
	public ResponseData login(@RequestBody  User user, HttpSession session){
		try{
			User checkUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
			if(checkUser!=null){
				String usertype = checkUser.getUsertype();
				logger.info(usertype+","+user.getUsername());
				if(usertype.equals(Constants.ROLE_BUZ)){
					responseData.setCode(Constants.ROLE_BUZ_LOGIN);
				}
				if(usertype.equals(Constants.ROLE_APP)){
					responseData.setCode(Constants.ROLE_APP_LOGIN);
				}
				session.setAttribute(Constants.Session_User, checkUser);
			}else{
				responseData.setCode(Constants.IDENTITY_NOT_FOUND);
			}
			
			return responseData;
		}catch(Exception e){
			e.printStackTrace();
			responseData.setCode(Constants.IDENTITY_ERROR);
			return responseData;
		}
	}
	
	@RequestMapping("/test")
	public String geIndex(){
		return "test";
	}
}
