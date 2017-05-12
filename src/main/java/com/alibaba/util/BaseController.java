package com.alibaba.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 所有controller继承该类
 * @author XRH
 *
 */
public class BaseController {
	
	/**
	 * 方法返回json格式规范
	 * @param object 需要返回的实体
	 * @param errorString  返回错误信息
	 * @return 返回格式： 成功{status:success；describe：需要返回的对象（实体、实体对象）}
	 * 								失败{status:error；describe：返回错误提示}
	 */ 
	public Map<String, Object> writePage(Object object,String errorString){
		Map<String, Object> modelMap = new HashMap<String,Object>(3);
		
		String status = null;
		
		if(object!=null)
			status = "success";
		else{
			status = "error";
			object=errorString;
		}
		
		modelMap.put("status",status);
		modelMap.put("describe",object);
		
		return modelMap;
	}
	
}
