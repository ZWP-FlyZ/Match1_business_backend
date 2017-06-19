package com.alibaba.util;

import java.io.FileWriter;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import com.alibaba.entity.Process;
public class XMLHepler {
	public static XMLWriter writeXML(Process process){
		try{
			//DocumentHelper提供了创建Document对象的方法  
	        Document document = DocumentHelper.createDocument();  
	        //添加节点信息  
	        Element rootElement = document.addElement("process");  
	        rootElement.addAttribute("name",process.getName());
	        rootElement.addAttribute("nodeNum",process.getNodeNum());
	        rootElement.addAttribute("pdesc",process.getPdesc());
	        rootElement.addAttribute("type",process.getType());
	        rootElement.addAttribute("devdate",process.getDevdate());
	        rootElement.addAttribute("devauthor",process.getDevauthor());
	        //这里可以继续添加子节点，也可以指定内容  
	        rootElement.setText("我是生成的");  
	        Element element = rootElement.addElement("module");  
	        
	        Element nameElement = element.addElement("name");  
	        Element valueElement = element.addElement("value");  
	        Element descriptionElement = element.addElement("description");  
	        nameElement.setText("名称");  
	        nameElement.addAttribute("language", "java");//为节点添加属性值  
	        valueElement.setText("值");  
	        valueElement.addAttribute("language", "c#");  
	        descriptionElement.setText("描述"); 
	        descriptionElement.addAttribute("language", "sql server");  
	        System.out.println(document.asXML()); //将document文档对象直接转换成字符串输出  
	        Writer fileWriter = new FileWriter("h:\\process.xml");  
	        //dom4j提供了专门写入文件的对象XMLWriter  
	        XMLWriter xmlWriter = new XMLWriter(fileWriter);  
	        xmlWriter.write(document);  
	        xmlWriter.flush();  
	        xmlWriter.close();  
			return xmlWriter;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

}
