package com.alibaba.model;

import java.util.List;

public class ProcessNodeData {

	private int id;

	private String name;
	private String type;
	private String description;
	
	

	private List<NodePreConData> nodePreConditions ;
	

	private List<PagePreConData> pagePreConditions ;
	

	private List<PageModelData> pagemodels;


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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<NodePreConData> getNodePreConditions() {
		return nodePreConditions;
	}


	public void setNodePreConditions(List<NodePreConData> nodePreConditions) {
		this.nodePreConditions = nodePreConditions;
	}


	public List<PagePreConData> getPagePreConditions() {
		return pagePreConditions;
	}


	public void setPagePreConditions(List<PagePreConData> pagePreConditions) {
		this.pagePreConditions = pagePreConditions;
	}


	public List<PageModelData> getPagemodels() {
		return pagemodels;
	}


	public void setPagemodels(List<PageModelData> pagemodels) {
		this.pagemodels = pagemodels;
	}

	
}
