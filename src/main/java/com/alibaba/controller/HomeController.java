package com.alibaba.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.entity.User;
import com.alibaba.repository.UserRepository;
import com.alibaba.util.BaseController;
import com.alibaba.util.ResponseData;
import com.alibaba.util.WebSecurityConfig;

@RestController
public class HomeController extends BaseController {
	@Autowired//别漏了
	private UserRepository userRepository;
	
//	@Autowired
//	private UserService userService;

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
				if(usertype.equals("0")){
					responseData.setCode("2000");
				}
				if(usertype.equals("1")){
					responseData.setCode("2001");
				}
				session.setAttribute("user", checkUser.getUsername());
			}else{
				responseData.setCode("404");
			}
			
			return responseData;
		}catch(Exception e){
			e.printStackTrace();
			responseData.setCode("error");
			return responseData;
		}
	}
}
