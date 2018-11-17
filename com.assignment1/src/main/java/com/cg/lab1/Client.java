package com.cg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		//Employee employee = (Employee) context.getBean("employee");
		System.out.println("SBU Details");
		System.out.println("____________________");
		
		
		SBUbean ubean = (SBUbean) context.getBean("ubean");
		System.out.println(ubean);
		System.out.println(ubean.getEmpList());
	}

}
