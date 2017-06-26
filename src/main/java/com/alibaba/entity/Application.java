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

/**
 * 应用实体
 * @author WXF
 *
 */
@Table(name = "application")
@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	private String appname;
	private String appdesc;
	
	//一个用户下有多个应用
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;

	//一个应用下有多个流程……，一对多
	@OneToMany
	@JoinColumn(name="processes")
	private Set<Process> processes = new HashSet<Process>();
	
	//一个应用下有多个页面模板……，一对多
	@OneToMany
	@JoinColumn(name="page_models")
	private Set<PageModel> pageModels = new HashSet<PageModel>();
	
	//一个应用下有多个业务能力……，一对多
	//一个应用下有多个能力……，一对多
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getAppdesc() {
		return appdesc;
	}

	public void setAppdesc(String appdesc) {
		this.appdesc = appdesc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Process> getProcesses() {
		return processes;
	}

	public void setProcesses(Set<Process> processes) {
		this.processes = processes;
	}
	
}
