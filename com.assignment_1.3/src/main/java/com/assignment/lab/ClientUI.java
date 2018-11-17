package com.assignment.lab;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientUI {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("employeebean.xml");
	
		SBUBean bean2 = (SBUBean) factory.getBean("sbu");
		
		System.out.println(bean2);
		System.out.println(bean2.getSbuList());
		
		
		
	}

}
