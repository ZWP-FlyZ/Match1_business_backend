package com.alibaba;
/*
import org.dom4j.*;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception {
        String xmlStr= readFile("H:/test.xml");
        Document doc= DocumentHelper.parseText(xmlStr);
        JSONObject json=new JSONObject();
        //dom4j2Json(doc.getRootElement(),json);
        System.out.println( xml2Json(xmlStr));
        System.out.println("xml2Json:"+json.toJSONString());

    }

    public static String readFile(String path) throws Exception {
        File file=new File(path);
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(new Long(file.length()).intValue());
        //fc向buffer中读入数据
        fc.read(bb);
        bb.flip();
        String str=new String(bb.array(),"UTF8");
        fc.close();
        fis.close();
        return str;

    }
    *//**
     * xml转json
     * @param xmlStr
     * @return
     * @throws DocumentException
     *//*
    public static JSONObject xml2Json(String xmlStr) throws DocumentException{
        Document doc= DocumentHelper.parseText(xmlStr);
        JSONObject json=new JSONObject();
        dom4j2Json(doc.getRootElement(), json);
        return json;
    }

    *//**
     * xml转json
     * @param element
     * @param json
     *//*
    public static void dom4j2Json(Element element,JSONObject json){
        //如果是属性
        for(Object o:element.attributes()){
            Attribute attr=(Attribute)o;
            if(!isEmpty(attr.getValue())){
                json.put("@"+attr.getName(), attr.getValue());
            }
        }
        List<Element> chdEl=element.elements();
        if(chdEl.isEmpty()&&!isEmpty(element.getText())){//如果没有子元素,只有一个值
            json.put(element.getName(), element.getText());
        }

        for(Element e:chdEl){//有子元素
            if(!e.elements().isEmpty()){//子元素也有子元素
                JSONObject chdjson=new JSONObject();
                dom4j2Json(e,chdjson);
                Object o=json.get(e.getName());
                if(o!=null){
                    JSONArray jsona=null;
                    if(o instanceof JSONObject){//如果此元素已存在,则转为jsonArray
                        JSONObject jsono=(JSONObject)o;
                        json.remove(e.getName());
                        jsona=new JSONArray();
                        jsona.add(jsono);
                        jsona.add(chdjson);
                    }
                    if(o instanceof JSONArray){
                        jsona=(JSONArray)o;
                        jsona.add(chdjson);
                    }
                    json.put(e.getName(), jsona);
                }else{
                    if(!chdjson.isEmpty()){
                        json.put(e.getName(), chdjson);
                    }
                }


            }else{//子元素没有子元素
                for(Object o:element.attributes()){
                    Attribute attr=(Attribute)o;
                    if(!isEmpty(attr.getValue())){
                        json.put("@"+attr.getName(), attr.getValue());
                    }
                }
                if(!e.getText().isEmpty()){
                    json.put(e.getName(), e.getText());
                }
            }
        }
    }

    public static boolean isEmpty(String str) {

        if (str == null || str.trim().isEmpty() || "null".equals(str)) {
            return true;
        }
        return false;
    }
}
*/

import java.io.File;  
import java.io.FileInputStream;  
import java.io.InputStream;  
import java.util.Iterator;  
import java.util.List;  
  
import org.dom4j.Document;  
import org.dom4j.DocumentHelper;  
import org.dom4j.Element;  
import org.dom4j.io.SAXReader;  
  
/** 
 * 使用dom4j解析xml文档 
 * @author Administrator 
 * 
 */  
public class TestRead {  
      
    public void parseXml01(){  
        try{  
            //将src下面的xml转换为输入流  
            InputStream inputStream = new FileInputStream(new File("H:/test.xml"));   
            //InputStream inputStream = this.getClass().getResourceAsStream("/module01.xml");//也可以根据类的编译文件相对路径去找xml  
            //创建SAXReader读取器，专门用于读取xml  
            SAXReader saxReader = new SAXReader();  
            //根据saxReader的read重写方法可知，既可以通过inputStream输入流来读取，也可以通过file对象来读取   
            //Document document = saxReader.read(inputStream);    
            Document document = saxReader.read(new File("H:/test.xml"));//必须指定文件的绝对路径  
            //另外还可以使用DocumentHelper提供的xml转换器也是可以的。  
            //Document document = DocumentHelper.parseText("<?xml version=\"1.0\" encoding=\"UTF-8\"?><modules id=\"123\"><module> 这个是module标签的文本信息</module></modules>");  
              
            //获取根节点对象  
            Element rootElement = document.getRootElement();    
            if(rootElement.elements("module") != null ){  
                //因为第一个module标签只有内容没有子节点，直接.iterator()就java.lang.NullPointerException了, 所以需要分开实现  
                List<Element> elementList = rootElement.elements("module");  
                for (Element element : elementList) {  
                    if(!element.getTextTrim().equals("")){  
                        System.out.println("【1】" + element.getTextTrim());  
                    }else{  
                        Element nameElement = element.element("name");  
                        System.out.println("   【2】" + nameElement.getName() + ":" + nameElement.getText());  
                        Element valueElement = element.element("value");  
                        System.out.println("   【2】" + valueElement.getName() + ":" + valueElement.getText());  
                        Element descriptElement = element.element("descript");  
                        System.out.println("   【2】" + descriptElement.getName() + ":" + descriptElement.getText());  
                          
                        List<Element> subElementList = element.elements("module");  
                        for (Element subElement : subElementList) {  
                            if(!subElement.getTextTrim().equals("")){  
                                System.out.println("      【3】" + subElement.getTextTrim());  
                            }else{  
                                Element subnameElement = subElement.element("name");  
                                System.out.println("      【3】" + subnameElement.getName() + ":" + subnameElement.getText());  
                                Element subvalueElement = subElement.element("value");  
                                System.out.println("      【3】" + subvalueElement.getName() + ":" + subvalueElement.getText());  
                                Element subdescriptElement = subElement.element("descript");  
                                System.out.println("      【3】" + subdescriptElement.getName() + ":" + subdescriptElement.getText());  
                            }  
                        }  
                    }  
                }  
               }  
        } catch (Exception e) {    
               e.printStackTrace();    
           }        
    }  
      
    public static void main(String[] args) {  
        TestRead demo = new TestRead();  
        demo.parseXml01();  
    }  
}