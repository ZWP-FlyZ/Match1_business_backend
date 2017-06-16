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

@RestController
@RequestMapping("app")
public class AppController extends BaseController {
	@Autowired
	private UserRepository userRepository;


	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@RequestMapping("/getApps")
	@ResponseBody
	public String getAppList(HttpSession session){
		logger.info("username=====:"+session.getAttribute("user"));
		return "";
	}
}
