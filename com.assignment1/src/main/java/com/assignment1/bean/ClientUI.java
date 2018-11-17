package com.assignment1.bean;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientUI {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("employeebean.xml");
	EmployeeBean bean = (EmployeeBean) factory.getBean("employeeB");
		//SBUBean bean2 = (SBUBean) factory.getBean("sbu");
		System.out.println("Employee Details");
		System.out.println("____________________");
		System.out.println("Employee id: "+bean.getEmployeeId());
		System.out.println(("Employee name: "+bean.getEmployeeName()));
		System.out.println("Business Unit: "+bean.getBusinessUnit());
		System.out.println("Employee Salary: "+bean.getSalary());
		System.out.println("Employee Age: "+bean.getAge());
		System.out.println(bean);
		
		
		//System.out.println(bean2);
		//ArrayList<EmployeeBean> SBUlist = bean2.getSbuList();
		//System.out.println(bean2);
		//System.out.println(SBUlist);
/*
		SBUBean bean2 = (SBUBean) factory.getBean("sbu");
		
		System.out.println(bean2);
		System.out.println(bean2.getSbuList());
		
		*/
		
	}

}
