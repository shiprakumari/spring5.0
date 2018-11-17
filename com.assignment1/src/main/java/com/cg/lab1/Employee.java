package com.cg.lab1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;

	// private String businessUnit;
	// private int age;
	// private SBUbean getSbuDetails;

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

	
	@PostConstruct
	public void customInit() {
		System.out.println("this is custome init");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("this is custome destroy");
	}

	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + ", ]";
	}
}
