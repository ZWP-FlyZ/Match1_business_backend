package com.alibaba.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.FileStorageUtil;
import com.alibaba.entity.Application;
import com.alibaba.entity.Message;
import com.alibaba.entity.PageModel;
import com.alibaba.entity.Process;
import com.alibaba.entity.User;
import com.alibaba.repository.ApplicationRepository;
import com.alibaba.repository.MessageReponsitory;
import com.alibaba.repository.PageModelRepository;
import com.alibaba.repository.ProcessRepository;
import com.alibaba.repository.UserRepository;
import com.alibaba.util.BaseController;
import com.alibaba.util.Constants;
import com.alibaba.util.ResponseData;
import com.alibaba.util.XMLReadHepler;
import com.alibaba.util.XMLUtil;
import com.google.gson.Gson;

@RestController
@RequestMapping("app")
public class AppController extends BaseController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProcessRepository processRepository;
	@Autowired
	private ApplicationRepository applicationRepository;
	@Autowired
	private PageModelRepository pageModelRepository;
	
	
	@Autowired
	private FileStorageUtil fs;
	
	@Autowired
	private MessageReponsitory mr;
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	private ResponseData responseData= new ResponseData();
	@RequestMapping("/getApps")
	@ResponseBody
	public ResponseData getAppList(HttpSession session){
		User loginUser = (User) session.getAttribute(Constants.Session_User);
		List<Application> apps = new ArrayList<Application>();
		apps = applicationRepository.findAllByUser(loginUser);
		if(apps.size()>0){
			responseData.setCode(Constants.IDENTITY_SUCCESS);
			responseData.setList(apps);
		}else{
			responseData.setCode(Constants.EMPTY);
		}
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
		//存入xml-----开始
		/*if(XMLWriteHepler.writeProcess(process)!=null){
			responseData.setCode(Constants.IDENTITY_SUCCESS);
	        System.out.println("xml文档添加成功！");  
		}else{
			responseData.setCode(Constants.IDENTITY_ERROR);
		}*/
		//存入xml-----结束;
		logger.debug("get in regiset");
		try{
			//processRepository.save(process);
			Message msg = new Message();
			msg.setName(getFileName(process));
			msg.setMessage(new Gson().toJson(process));
			mr.save(msg);
			responseData.setCode(Constants.IDENTITY_SUCCESS);
		}catch(Exception e){
			responseData.setCode(Constants.IDENTITY_ERROR);
			logger.error("reg_pross err",e);
			//e.printStackTrace();
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
		responseData.setCode(Constants.IDENTITY_SUCCESS);
		//responseData.getList().clear();
		if(id!=null){
			List<Message> ms = mr.findAll();
			List<Process> ps = new ArrayList<>();
			Gson g = new Gson();
			
			for(Message m :ms)
				ps.add(g.fromJson(m.getMessage(), Process.class));
			
			responseData.setList(ps);
		}
		return responseData;
	}
	
	@RequestMapping(value = "register_pageModel",method = RequestMethod.POST)
	public ResponseData registerPageModel(@RequestBody PageModel pageModel,HttpSession session){
		System.out.println(pageModel);
		logger.info("---将对象转换成string类型的xml Start---");  
		//String path = String.format(Constants.PROCESS_LIB, args);
		String filePath = AppController.class.getResource(".." + File.separator + ".." + File.separator+".." + File.separator).getPath();
		System.out.println(filePath);
        XMLUtil.convertToXml(pageModel,filePath+"templates"+File.separator+pageModel.getName()+"1.xml"); 
        logger.info("---将对象转换成string类型的xml End---");  
        logger.info("application:"+pageModel.getApplication());
        try{
			pageModelRepository.save(pageModel); 
			responseData.setCode(Constants.IDENTITY_SUCCESS);
		}catch(Exception e){
			responseData.setCode(Constants.IDENTITY_ERROR);
			e.printStackTrace();
		}
		return responseData;
	}
	//根据应用获取所有页面模版 
	@RequestMapping(value = "get_pageList",method = RequestMethod.GET)
	public ResponseData getPageList(Integer id){
		responseData.setCode("");
		responseData.getList().clear();
		if(id!=null){
			Application app = applicationRepository.findById(id);
			//根据应用找到所有的页面模版
			List<PageModel> pageList = pageModelRepository.findByApplication(app);
			System.out.println(pageList.size());
			if(pageList.size()!=0){
				responseData.setList(pageList);
				responseData.setCode(Constants.IDENTITY_SUCCESS);
			}else{
				responseData.setCode(Constants.EMPTY);
			}
		}
		return responseData;
	}
	
	//删除页面模版
	/*请求参数：id   页面模版id
	  相应结果：
	  {
	  	code:200/401
	  }
    */
	@RequestMapping(value="delete_pagemodel",method = RequestMethod.POST)
	public ResponseData deletePageModel(@RequestParam(value = "id", required = true) Integer id){
		System.out.println(id);
		try{
			pageModelRepository.delete(id);
			responseData.setCode("200");
		}catch(Exception e){
			responseData.setCode("401");
			e.printStackTrace();
		}
		return responseData;
	}
	
	
	private String getFileName(Process p){
		if(p==null) return "null";
		Application a = p.getApplication();
		User u = a.getUser();
		
		return u.getUsername()+"_"+a.getAppname()+"_"+a.getId()+"_"+p.getName();
		
		
	}
	
	
}
