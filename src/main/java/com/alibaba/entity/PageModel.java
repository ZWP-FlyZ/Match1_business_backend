package com.alibaba.entity;

import java.util.Set;

import javax.persistence.*;

/**
 * 页面模板类
 * @author JH
 * ok
 */

//页面模板类
@Table(name="pagemodel")
@Entity
public class PageModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	//关联业务能力剖面
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="pagemdel_has_bussinessabilitypou",joinColumns = {
	@JoinColumn(name="pagemodel_id",referencedColumnName="id")},inverseJoinColumns={
	@JoinColumn(name="bussinessabilitypou_id",referencedColumnName="id")})
	private Set<BussinessAbility> bussinessability;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<BussinessAbility> getBussinessability() {
		return bussinessability;
	}

	public void setBussinessability(Set<BussinessAbility> bussinessability) {
		this.bussinessability = bussinessability;
	}

}
