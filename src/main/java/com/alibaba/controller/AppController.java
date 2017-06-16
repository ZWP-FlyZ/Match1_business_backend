package com.alibaba.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.entity.Application;
import com.alibaba.entity.User;
import com.alibaba.repository.ApplicationRepository;
import com.alibaba.repository.UserRepository;
import com.alibaba.util.BaseController;
import com.alibaba.util.ResponseData;

@RestController
@RequestMapping("app")
public class AppController extends BaseController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ApplicationRepository applicationRepository;
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	private ResponseData responseData= new ResponseData();
	@RequestMapping("/getApps")
	@ResponseBody
	public ResponseData getAppList(HttpSession session){
		User loginUser = (User) session.getAttribute("user");
		logger.info(loginUser.getUsername());
		List<Application> apps = new ArrayList<Application>();
		apps = applicationRepository.findAllByUser(loginUser);
		responseData.setList(apps);
		return responseData;
	}
	@RequestMapping(value = "app_add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseData addApp(@RequestBody Application app,HttpSession session){
		logger.info("appname88888"+app.getAppname());
		app.setUser((User) session.getAttribute("user"));
		try{
			List<Application> apps = getAppList(session).getList();
			logger.info("length:"+apps.size());
			Boolean flag = false;
			for(Application item : apps) {
				logger.info("======="+item.getAppname()+","+app.getAppname()+","+(item.getAppname().equals(app.getAppname())));
				if(item.getAppname().equals(app.getAppname())){
					flag = true;
				}
			}
			logger.info("flag:"+flag);
			if(flag){
				responseData.setCode("401");
			}else{
				responseData.setCode("200");
				applicationRepository.save(app);
			}
		}catch(Exception e){
			responseData.setCode("error");
			e.printStackTrace();
		}
		return responseData;
	}
}
