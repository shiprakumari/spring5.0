package com.assignment1.bean;

import java.util.ArrayList;
import java.util.List;

public class SBUBean {
	
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	
	ArrayList<EmployeeBean> sbuList;
	
	
	
	public ArrayList<EmployeeBean> getSbuList() {
		return sbuList;
	}
	public void setSbuList(ArrayList<EmployeeBean> sbuList) {
		this.sbuList = sbuList;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
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
	@Override
	public String toString() {
		return "SBUBean [sbuId=" + sbuId + ", sbuName=" + sbuName
				+ ", sbuHead=" + sbuHead + ", sbuList=" + sbuList + "]";
	}
	

}
