package com.assignment.lab;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	ArrayList<Employee> empList = new ArrayList<Employee>();

	@Bean
	public Employee employee() {
		
		Employee employee = new Employee();
		employee.setEmployeeId(12345);
		employee.setEmployeeName("Harriet");
		employee.setSalary(40000.00);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(12346);
		employee1.setEmployeeName("Harry");
		employee1.setSalary(50000.00);
		empList.add(employee1);
		empList.add(employee);
		return employee1;

	}

	@Bean(initMethod = "setUp", destroyMethod = "cleanUp")
	public SBUbean ubean() {

		SBUbean ubean = new SBUbean();
		ubean.setSbuHead("Kiran Rao");
		ubean.setSbuId("PES-BU");
		ubean.setSbuName("Product Engineering Services");
		ubean.setEmpList(empList);
		return ubean;
		

	}


}
