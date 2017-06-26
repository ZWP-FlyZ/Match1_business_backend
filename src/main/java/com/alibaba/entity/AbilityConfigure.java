package com.alibaba.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * 能力基本信息
 * @author JH
 * ok
 */
@Table(name = "abilityconfigure")
@Entity
public class AbilityConfigure {
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
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Ability_id")
	private Ability ability;

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	
	
	
	
}