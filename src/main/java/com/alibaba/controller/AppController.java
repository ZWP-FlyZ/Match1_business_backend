package com.alibaba.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.entity.Application;
import com.alibaba.entity.BussinessAbilityPou;
import com.alibaba.entity.PageModel;
import com.alibaba.entity.PageModelType;
import com.alibaba.entity.PagePreCondition;
import com.alibaba.entity.Process;
import com.alibaba.entity.ProcessNode;
import com.alibaba.entity.User;
import com.alibaba.repository.ApplicationRepository;
import com.alibaba.repository.UserRepository;
import com.alibaba.util.BaseController;
import com.alibaba.util.Constants;
import com.alibaba.util.ResponseData;
import com.alibaba.util.XMLReadHepler;
import com.alibaba.util.XMLWriteHepler;

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
	
	@RequestMapping(value = "register_pageModel",method = RequestMethod.POST)
	public ResponseData registerPageModel(@RequestBody PageModel pageModel,HttpSession session){
		logger.info("pageModel-name:===="+pageModel.getName());
		logger.info("pageModel-processnode-size:===="+pageModel.getProcessNodes().size());
		Iterator<ProcessNode> pn = pageModel.getProcessNodes().iterator();
		while(pn.hasNext()){
			ProcessNode pnode = pn.next();
			logger.info("pageModel-processnode-id:"+pnode.getId());
		}
		logger.info("pageModel-pou:===="+pageModel.getPageModelTypes().size());
		Iterator<PageModelType> it = pageModel.getPageModelTypes().iterator();
		while(it.hasNext()){
			PageModelType pou = it.next();
			logger.info("pou name,pou ability==="+pou.getModulename()+","+pou.getBussinessabilitypou().size());
			Iterator<BussinessAbilityPou> bas = pou.getBussinessabilitypou().iterator();
			while(bas.hasNext()){
				BussinessAbilityPou ppp = bas.next();
				logger.info("bas--id:=="+ppp.getId());
			}
		}
		logger.info("pageModel:===="+pageModel.getPagePreConditions().size());
		Iterator<PagePreCondition> pageconditions = pageModel.getPagePreConditions().iterator();
		while(pageconditions.hasNext()){
			PagePreCondition pc = pageconditions.next();
			logger.info("pagecondition：==="+pc.getId());
		}
		responseData.setCode(Constants.IDENTITY_SUCCESS);
		return responseData;
	}
	
}
