package com.alibaba.controller;

import com.alibaba.entity.TestEntity;
import com.alibaba.repository.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestEntityController {
	@Autowired
	private TestEntityRepository testEntityRepository;
	
	@RequestMapping("")
	@ResponseBody
	public String result(){
		List<TestEntity> tests = testEntityRepository.findAll();
		String temp = "";
		for(TestEntity one:tests){
			temp+= one.getTestName()+"\n";
		}
		return temp;
	}
	
	@RequestMapping("/")
	public String getPage(){
		return "index";
	}
	
	@RequestMapping("/testone")
	public String getTest(){
		return "test";
	}
	
	@RequestMapping("/copyw")
	public String getCopy(){
		return "copy";
	}
}
