package com.alibaba.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 页面模板类
 * @author JH\wxf
 * ok
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="pageModel")
@XmlType(propOrder={
		"id",
		"name",
		"description",
		"devauthor",
		"devdate",
		"processNodes",
		"pageModelTypes",
		"pagePreConditions"
})
//页面模板类
@Table(name="page_model")
@Entity
public class PageModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	//页面模板前置条件
	@OneToMany
    @JoinColumn(name = "page_pre_conditions")
	@XmlElementWrapper(name="pagePreConditions") 
	@XmlElement(name="pagePreCondition")
	private Set<PagePreCondition> pagePreConditions = new HashSet<PagePreCondition>();

	//页面模板关联的流程节点
	@ManyToMany(mappedBy = "pagemodels")
	@XmlElementWrapper(name="processNodes") 
	@XmlElement(name="processNode")
	private Set<ProcessNode> processNodes;
	//关联业务能力剖面--模块类型
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="pagemdel__pagemodeltype",joinColumns = {
	@JoinColumn(name="pagemodel_id",referencedColumnName="id")},inverseJoinColumns={
	@JoinColumn(name="pagemodel_type_id",referencedColumnName="id")})
	@XmlElementWrapper(name="pageModelTypes") 
	@XmlElement(name="pageModelType")
	private Set<PageModelType> pageModelTypes;
	
	//一个应用下有多个流程……，一对多
	@ManyToOne
	@JoinColumn(name = "application")
	@XmlTransient
	private Application application;
	
	private String name;
	private String description;
	private String devauthor;
	private String devdate;
	
	@XmlTransient
	private String filePath;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<PageModelType> getPageModelTypes() {
		return pageModelTypes;
	}

	public void setPageModelTypes(Set<PageModelType> pageModelTypes) {
		this.pageModelTypes = pageModelTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Set<PagePreCondition> getPagePreConditions() {
		return pagePreConditions;
	}

	public void setPagePreConditions(Set<PagePreCondition> pagePreConditions) {
		this.pagePreConditions = pagePreConditions;
	}

	public Set<ProcessNode> getProcessNodes() {
		return processNodes;
	}

	public void setProcessNodes(Set<ProcessNode> processNodes) {
		this.processNodes = processNodes;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
}
