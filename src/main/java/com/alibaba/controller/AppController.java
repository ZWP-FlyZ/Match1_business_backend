package com.alibaba.controller;

import java.util.ArrayList;
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
import com.alibaba.entity.PageModel;
import com.alibaba.entity.Process;
import com.alibaba.entity.User;
import com.alibaba.repository.ApplicationRepository;
import com.alibaba.repository.ProcessRepository;
import com.alibaba.repository.UserRepository;
import com.alibaba.util.BaseController;
import com.alibaba.util.Constants;
import com.alibaba.util.ResponseData;
import com.alibaba.util.XMLReadHepler;
import com.alibaba.util.XMLUtil;
import com.alibaba.util.XMLWriteHepler;

@RestController
@RequestMapping("app")
public class AppController extends BaseController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProcessRepository processRepository;
	@Autowired
	private ApplicationRepository applicationRepository;
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	private ResponseData responseData= new ResponseData();
	@RequestMapping("/getApps")
	@ResponseBody
	public ResponseData getAppList(HttpSession session){
		User loginUser = (User) session.getAttribute(Constants.Session_User);
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
		app.setUser((User) session.getAttribute(Constants.Session_User));
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
				responseData.setCode(Constants.IDENTITY_FAIL);
			}else{
				responseData.setCode(Constants.IDENTITY_SUCCESS);
				applicationRepository.save(app);
			}
		}catch(Exception e){
			responseData.setCode(Constants.IDENTITY_ERROR);
			e.printStackTrace();
		}
		return responseData;
	}
	
	@RequestMapping(value = "register_process",method = RequestMethod.POST)
	@ResponseBody
	public ResponseData registerProcess(@RequestBody Process process,HttpSession session){
		if(XMLWriteHepler.writeProcess(process)!=null){
			responseData.setCode(Constants.IDENTITY_SUCCESS);
	        System.out.println("xml文档添加成功！");  
		}else{
			responseData.setCode(Constants.IDENTITY_ERROR);
		}
		return responseData;
	}
	
	//根据process_id获取流程信息
	@RequestMapping("/get_process")
	//参数是id
	public ResponseData getProcess(Integer id){
		logger.info("id:"+id);
		if(XMLReadHepler.readProcess()!=null){
			responseData.setList(XMLReadHepler.readProcess());
			responseData.setCode(Constants.IDENTITY_SUCCESS);
		}
		return responseData;
	}
	//根据应用id获取所有的流程信息
	@RequestMapping("/get_processList")
	public ResponseData getProcessList(Integer id){
		if(id==0){
			responseData.setCode(Constants.EMPTY);
		}else{
			Application app = applicationRepository.findById(id);
			//根据应用找到所有的流程
			logger.info("app.id:"+app.getId());
			List processList = processRepository.findByApplication(app);
			if(processList!=null){
				responseData.setList(processList);
				responseData.setCode(Constants.IDENTITY_SUCCESS);
			}else{
				responseData.setCode(Constants.IDENTITY_FAIL);
			}
		}
		return responseData;
	}
	
	@RequestMapping(value = "register_pageModel",method = RequestMethod.POST)
	public ResponseData registerPageModel(@RequestBody PageModel pageModel,HttpSession session){
		logger.info("---将对象转换成string类型的xml Start---");  
		//String path = String.format(Constants.PROCESS_LIB, args);
        XMLUtil.convertToXml(pageModel,"H:\\test.xml"); 
        logger.info("---将对象转换成string类型的xml End---");  
		responseData.setCode(Constants.IDENTITY_SUCCESS);
		return responseData;
	}
	
}
