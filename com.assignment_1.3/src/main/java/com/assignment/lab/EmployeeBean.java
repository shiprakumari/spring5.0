package com.assignment.lab;

public class EmployeeBean {
	private int employeeId;
	private String employeeName;
	private double salary;
	

	
	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
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
	
	
	

	
	
	
	

}
