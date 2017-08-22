package com.alibaba.util;

import java.util.List;
import java.util.Map;

//定义分返回数据格式
public class ResponseData {
	private String code;
	private String message;
	private List list;
	private Map map;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
}
