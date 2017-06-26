package com.alibaba.entity;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * 业务能力剖面实体
 * @author JH
 *	ok
 */
@Table(name = "bussiness_ability_pou")
@Entity
public class BussinessAbilityPou {
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

	//业务能力剖面名称
	private String name;
	//业务能力剖面描述
	private String badesc;
	//业务能力剖面关联的能力类

	//UI类型
	private String uitype;
	
	@ManyToMany(mappedBy ="bussinessability")
	private Set<PageModel> pagemodel;
	
public Set<PageModel> getPagemodel() {
		return pagemodel;
	}

	public void setPagemodel(Set<PageModel> pagemodel) {
		this.pagemodel = pagemodel;
	}

	public BussinessAbility getBussinessabilty() {
		return bussinessabilty;
	}

	public void setBussinessabilty(BussinessAbility bussinessabilty) {
		this.bussinessabilty = bussinessabilty;
	}

	//	//关联的业务能力类
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bussinessabilitypou_id")
	private BussinessAbility bussinessabilty;
	
	
	@ManyToMany(mappedBy = "bussinessabilitypou")
	private Set<Ability> ability;
	//关联能力
	
	public Set<Ability> getAbility() {
		return ability;
	}

	public void setAbility(Set<Ability> ability) {
		this.ability = ability;
	}

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


	public String getUitype() {
		return uitype;
	}

	public void setUitype(String uitype) {
		this.uitype = uitype;
	}
	
}
