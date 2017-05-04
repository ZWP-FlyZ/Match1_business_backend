package com.alibaba.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table
@Entity
public class TestEntity implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int testId;
    
    @Column
    private String testName;
    
    @Column
    private Timestamp testDate;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Timestamp getTestDate() {
		return testDate;
	}

	public void setTestDate(Timestamp testDate) {
		this.testDate = testDate;
	}

	public TestEntity(){
		super();
	}
	
	public TestEntity(int testId, String testName, Timestamp testDate) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testDate = testDate;
	}    

}
