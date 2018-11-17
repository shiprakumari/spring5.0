package com.assignment1.bean;

public class EmployeeBean {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	private SBUBean getSbuDetails;

	
	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + ", businessUnit="
				+ businessUnit + ", age=" + age + ", getSbuDetails="
				+ getSbuDetails + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	public SBUBean getGetSbuDetails() {
		return getSbuDetails;
	}
	public void setGetSbuDetails(SBUBean getSbuDetails) {
		this.getSbuDetails = getSbuDetails;
	}
	
	
	
	

}
