package com.alibaba.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.alibaba.entity.Process;
public class XMLReadHepler {
	public static List readProcess(){
		List list = new ArrayList();
		try{
			InputStream inputStream = new FileInputStream(new File("H:/process.xml"));
			SAXReader saxReader = new SAXReader();  
			Document document = saxReader.read(new File("H:/process.xml"));
			Element rootElement = document.getRootElement();   
			if(document.getRootElement() != null ){  
				 String name = rootElement.attributeValue("name");//为节点添加属性值  
				 String nodeNum = rootElement.attributeValue("nodeNum");//为节点添加属性值  
				 String pdesc = rootElement.attributeValue("pdesc");//为节点添加属性值  
				 String type = rootElement.attributeValue("type");//为节点添加属性值  
				 String devdate = rootElement.attributeValue("devdate");//为节点添加属性值  
				 String devauthor = rootElement.attributeValue("devauthor");//为节点添加属性值  
				 Process process = new Process();
				 process.setName(name);
				 process.setNodeNum(nodeNum);
				 process.setPdesc(pdesc);
				 process.setDevauthor(devauthor);
				 process.setDevdate(devdate);
				 process.setType(type);
				 list.add(process);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

}
