package com.alibaba.entity;

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
import javax.persistence.Table;

/**
 * 页面模板模块类型类
 * @author wxf
 * ok
 */

//页面模板类
@Table(name="page_model_type")
@Entity
public class PageModelType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	private String modulename;
	private String moduledesc;
	
	//关联业务能力剖面
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="pagemdelType_bussinessabilitypou",joinColumns = {
	@JoinColumn(name="pagemodelType_id",referencedColumnName="id")},inverseJoinColumns={
	@JoinColumn(name="bussinessabilitypou_id",referencedColumnName="id")})
	private Set<BussinessAbilityPou> bussinessabilitypou;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModulename() {
		return modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}

	public String getModuledesc() {
		return moduledesc;
	}

	public void setModuledesc(String moduledesc) {
		this.moduledesc = moduledesc;
	}

	public Set<BussinessAbilityPou> getBussinessabilitypou() {
		return bussinessabilitypou;
	}

	public void setBussinessabilitypou(Set<BussinessAbilityPou> bussinessabilitypou) {
		this.bussinessabilitypou = bussinessabilitypou;
	}
	
}
