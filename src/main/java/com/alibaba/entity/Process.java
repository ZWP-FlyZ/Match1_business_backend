package com.alibaba.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 流程实体
 * @author WXF
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="process")
@XmlType(propOrder={
		"id",
		"name",
		"devauthor",
		"devdate",
		"nodeNum",
		"pdesc",
		"type",
		"processNodes"
})
@Table(name = "process")
@Entity
public class Process {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	private String name;
	private String devauthor;
	private String devdate;
	private String nodeNum;
	private String pdesc;
	private String type;
	
	//流程节点  一个流程下面有多个流程节点--单向一对多
	@OneToMany
    @JoinColumn(name = "process_nodes")
	@XmlElementWrapper(name="processNodes") 
	@XmlElement(name="processNode")
    private Set<ProcessNode> processNodes = new HashSet<ProcessNode>();
	
	//一个应用下有多个流程……，一对多
	@ManyToOne
	@JoinColumn(name = "application")
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

	public Set<ProcessNode> getProcessNodes() {
		return processNodes;
	}

	public void setProcessNodes(Set<ProcessNode> processNodes) {
		this.processNodes = processNodes;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
	
}
