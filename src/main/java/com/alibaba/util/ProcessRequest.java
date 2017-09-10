package com.alibaba.util;

import java.util.List;

import com.alibaba.entity.Application;
import com.alibaba.entity.ProcessNode;

public class ProcessRequest {

	private int id;

	private String name;
	private String devauthor;
	private String devdate;
	private String nodeNum;
	private String pdesc;
	private String type;
	

    private List<ProcessNode> processNodes ;
	
	private Application application;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevauthor() {
		return devauthor;
	}

	public void setDevauthor(String devauthor) {
		this.devauthor = devauthor;
	}

	public String getDevdate() {
		return devdate;
	}

	public void setDevdate(String devdate) {
		this.devdate = devdate;
	}

	public String getNodeNum() {
		return nodeNum;
	}

	public void setNodeNum(String nodeNum) {
		this.nodeNum = nodeNum;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ProcessNode> getProcessNodes() {
		return processNodes;
	}

	public void setProcessNodes(List<ProcessNode> processNodes) {
		this.processNodes = processNodes;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
	
	
}
