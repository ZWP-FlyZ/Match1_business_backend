package com.alibaba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.entity.TestEntity;
import com.alibaba.repository.TestEntityRepository;

@Controller
public class TestEntityController {
	@Autowired
	private TestEntityRepository testEntityRepository;
	
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
	
	@RequestMapping(value="/receiveData",method=RequestMethod.POST)//拦截url
	public void receiveData(@RequestParam("names") String name){
		TestEntity user = new TestEntity();
		user.setTestName(name);
		testEntityRepository.save(user);
	}
	
	@RequestMapping("/testone")
	public String getTest(){
		return "test";
	}
	
	@RequestMapping("/copyw")
	public String getCopy(){
		return "copy";
	}
	
	@RequestMapping("/tony")
	public String getTony(){
		return "test/copy";
	}
}
