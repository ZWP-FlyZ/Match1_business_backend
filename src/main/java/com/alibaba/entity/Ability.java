package com.alibaba.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 能力基本信息
 * @author JH
 * ok
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ability")
@XmlType(propOrder={
		"id",
		"name",
		"adesc",
		"akey",
		"storelocation",
		"devauthor",
		"date",
		"bussinessabilitypou"
})
@Table(name = "ability")
@Entity
public class Ability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	//一个应用下有多个流程……，一对多
	@ManyToOne
	@JoinColumn(name = "application")
	@XmlTransient
	private Application application;

	//能力名称
	private String name;
	//能力描述
	private String adesc;
	//能力Key
	private String akey;
	//能力存储位置
	private String storelocation;
	//开发者
	private String devauthor;
	//开发日期
	private Date date;
	//显示多对多的关系 左侧的name是这个中间表的 id 而referenceColumnName是被关联的表的name
		
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bussinessabilitypou_has_ability", joinColumns = {
    @JoinColumn(name = "bussinessabilitypou_id", referencedColumnName = "id")}, inverseJoinColumns = {
    @JoinColumn(name = "ability_id", referencedColumnName = "id")})
	@XmlElementWrapper(name="bussinessabilitypous") 
	@XmlElement(name="bussinessabilitypou")
	private Set<BussinessAbilityPou> bussinessabilitypou;
	 

	public Set<BussinessAbilityPou> getBussinessabilitypou() {
		return bussinessabilitypou;
	}


	public void setBussinessabilitypou(Set<BussinessAbilityPou> bussinessabilitypou) {
		this.bussinessabilitypou = bussinessabilitypou;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdesc() {
		return adesc;
	}


	public void setAdesc(String adesc) {
		this.adesc = adesc;
	}

	public String getAkey() {
		return akey;
	}


	public void setAkey(String akey) {
		this.akey = akey;
	}


	public String getStorelocation() {
		return storelocation;
	}


	public void setStorelocation(String storelocation) {
		this.storelocation = storelocation;
	}


	public String getDevauthor() {
		return devauthor;
	}


	public void setDevauthor(String devauthor) {
		this.devauthor = devauthor;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

}