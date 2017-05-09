package com.alibaba.controller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.entity.TestEntity;
import com.alibaba.fastjson.JSON;
import com.alibaba.repository.TestEntityRepository;

@Controller
public class TestEntityController {
	@Autowired
	private TestEntityRepository testEntityRepository;
	private static final Logger logger = LoggerFactory.getLogger(TestEntityController.class);
	@RequestMapping("/getData")
	@ResponseBody//返回数据，没加则进入templates里面查找对应页面
	public String result(){
		List<TestEntity> tests = testEntityRepository.findAll();
		String temp = "";
		for(TestEntity one:tests){
			temp+= one.getTestName()+"\n";
		}
		return temp;
	}
	
	@RequestMapping(value="/receiveData",
			method=RequestMethod.POST)//拦截url
	@ResponseBody
	public void receiveData(@RequestBody TestEntity test){
		testEntityRepository.save(test);
	}
	
	@RequestMapping("/testone")
	public String getTest(){
		return "test";
	}
	@RequestMapping("/aaa")
	@ResponseBody
	public String getaa(){
		return "aaa";
	}
}
