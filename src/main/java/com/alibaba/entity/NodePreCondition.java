package com.alibaba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 节点前置条件实体
 * @author WXF
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="nodePreCondition")
@XmlType(propOrder={
		"id"
})
@Table(name = "node_pre_condition")
@Entity
public class NodePreCondition {
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
	
}
