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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 页面模板类
 * @author JH\wxf
 * ok
 */

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
	private Set<PagePreCondition> pagePreConditions = new HashSet<PagePreCondition>();

	//页面模板关联的流程节点
	@ManyToMany(mappedBy = "pagemodels")
	private Set<ProcessNode> processNodes;
	//关联业务能力剖面--模块类型
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="pagemdel__pagemodeltype",joinColumns = {
	@JoinColumn(name="pagemodel_id",referencedColumnName="id")},inverseJoinColumns={
	@JoinColumn(name="pagemodel_type_id",referencedColumnName="id")})
	private Set<PageModelType> pageModelTypes;
	
	private String name;
	private String description;
	private String devauthor;
	private String devdate;
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

	
}
