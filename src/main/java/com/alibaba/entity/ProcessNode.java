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
 * 流程节点实体
 * @author WXF
 *
 */
@Table(name = "process_node")
@Entity
public class ProcessNode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	private String name;
	private String type;
	private String description;
	
	//节点前置条件  ，一个节点下面有多个前置条件
	@OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name = "node_pre_conditions")
	private Set<NodePreCondition> nodePreConditions = new HashSet<NodePreCondition>();
	
	//页面模板前置条件
	@OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name = "page_pre_conditions")
	private Set<PagePreCondition> pagePreConditions = new HashSet<PagePreCondition>();
	
	//页面模板
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Node_Page",joinColumns = {
			@JoinColumn(name="Node_id",referencedColumnName="id")},inverseJoinColumns = {
			@JoinColumn(name="Page_id",referencedColumnName="id")})
	private Set<PageModel> pagemodels;

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

	public Set<NodePreCondition> getNodePreConditions() {
		return nodePreConditions;
	}

	public void setNodePreConditions(Set<NodePreCondition> nodePreConditions) {
		this.nodePreConditions = nodePreConditions;
	}

	public Set<PagePreCondition> getPagePreConditions() {
		return pagePreConditions;
	}

	public void setPagePreConditions(Set<PagePreCondition> pagePreConditions) {
		this.pagePreConditions = pagePreConditions;
	}

	public Set<PageModel> getPagemodels() {
		return pagemodels;
	}

	public void setPagemodels(Set<PageModel> pagemodels) {
		this.pagemodels = pagemodels;
	}
}
