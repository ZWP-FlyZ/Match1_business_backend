package com.alibaba.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.entity.User;
import com.alibaba.repository.UserRepository;

@RestController
public class UserController {
	@Autowired//别漏了
	private UserRepository userRepository;
	
//	@Autowired
//	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(TestEntityController.class);
	
	
	//用户登录验证
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(@RequestBody  User user){
				Map<String, Object> modelMap = new HashMap<String,Object>(3);
				User user1 = userRepository.findByUsernameAndUserpassword(user.getUsername(), user.getUserpassword());
				
				String status = null;
				if(user1!=null){
					status = "success";
					logger.debug("1111========");
				}
				else{
					status = "error";
					logger.debug("============2222");
				}
				modelMap.put("status",status);
				modelMap.put("user",user1);
				
				return modelMap;
//				return userRepository.save(user);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(){
		
		return "hello";
	}
	
}
