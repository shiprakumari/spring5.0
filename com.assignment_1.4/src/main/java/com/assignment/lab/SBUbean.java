package com.assignment.lab;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SBUbean {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private ArrayList<Employee> empList;

	// constructors
	/*
	 * public SBUbean(String sbuId, String sbuName, String sbuHead) { super();
	 * this.sbuId = sbuId; this.sbuName = sbuName; this.sbuHead = sbuHead; }
	 */

	public ArrayList<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}

	public SBUbean(String sbuId, String sbuName, String sbuHead,
			ArrayList<Employee> empList) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}

	public SBUbean() {
		super();
	}

	// getter setter
	public String getSbuId() {
		return sbuId;
	}

	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@PostConstruct
	public void customInit() {
		// System.out.println("this is custome init");
	}

	@PreDestroy
	public void customDestroy() {
		// System.out.println("this is custome destroy");
	}

	public void setUp() {
		// System.out.println("this is set up");
	}

	public void cleanUp() {
		// System.out.println("this is clean up");

	}

	@Override
	public String toString() {
		return "SBUbean [sbuId=" + sbuId + ", sbuName=" + sbuName
				+ ", sbuHead=" + sbuHead + ", empList=" + empList + "]";
	}

}
