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

import com.alibaba.entity.PageModel;
import com.alibaba.entity.User;
import com.alibaba.util.XMLUtil;
  
/** 
 * 使用dom4j解析xml文档 
 * @author Administrator 
 * 
 */  
public class TesXML {  
      
	public static void main(String[] args) {  
        // 创建需要转换的对象  
        PageModel user = new PageModel();  
        user.setId(1);
        user.setName("test xml");
        user.setDescription("desscription");
        user.setDevauthor("wxfei");
        user.setDevdate("2014-3-3");
        System.out.println("---将对象转换成string类型的xml Start---");  
        // 将对象转换成string类型的xml  
        String str = XMLUtil.convertToXml(user);  
        // 输出  
        System.out.println(str);  
        System.out.println("---将对象转换成string类型的xml End---");  
        System.out.println();  
        System.out.println("---将String类型的xml转换成对象 Start---");  
        PageModel pageModel = (PageModel) XMLUtil.convertXmlStrToObject(PageModel.class, str);  
        System.out.println(pageModel);  
        System.out.println("---将String类型的xml转换成对象 End---");  
        
        
        // 创建需要转换的对象  
        /*User user = new User(1, "Steven", "@sun123", new Date(), 1000.0);  
  
        String path = "D:\\user.xml";  
        System.out.println("---将对象转换成File类型的xml Start---");  
        XMLUtil.convertToXml(user, path);  
        System.out.println("---将对象转换成File类型的xml End---");  
        System.out.println();  
        System.out.println("---将File类型的xml转换成对象 Start---");  
        User user2 = (User) XMLUtil.convertXmlFileToObject(User.class, path);  
        System.out.println(user2);  
        System.out.println("---将File类型的xml转换成对象 End---"); */
    }
}