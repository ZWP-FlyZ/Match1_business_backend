package com.alibaba.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 业务能力类   包含了业务能力基本信息类 和业务能力剖面类
 * @author JH
 *	ok
 */
@Table(name = "bussinessability")
@Entity
public class BussinessAbility{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	//业务能力名称
	private String name;
	//业务能力描述
	private String badesc;
	//业务能力key
	private String bakey;
	//业务能力开发日期
	private Date devdate;
	//应用方
	private String appuser;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBadesc() {
		return badesc;
	}

	public void setBadesc(String badesc) {
		this.badesc = badesc;
	}

	public String getBakey() {
		return bakey;
	}

	public void setBakey(String bakey) {
		this.bakey = bakey;
	}

	public Date getDevdate() {
		return devdate;
	}

	public void setDevdate(Date devdate) {
		this.devdate = devdate;
	}

	public String getAppuser() {
		return appuser;
	}

	public void setAppuser(String appuser) {
		this.appuser = appuser;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
