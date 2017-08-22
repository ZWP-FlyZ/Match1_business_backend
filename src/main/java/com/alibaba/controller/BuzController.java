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
import com.alibaba.util.BaseController;

@RestController
@RequestMapping("buz")
public class BuzController extends BaseController {
	@Autowired//别漏了
	private UserRepository userRepository;
	
//	@Autowired
//	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(BuzController.class);
	
	//用户登录验证
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(@RequestBody  User user){
		logger.info("进入了");
		User user1 = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		logger.info(user.getUsername());
		return writePage(user,"用户登录失败");
	}
}
