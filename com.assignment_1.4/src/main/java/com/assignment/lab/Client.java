package com.assignment.lab;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				EmpConfig.class);
		Scanner scanner = new Scanner(System.in);
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println("SBU Details");
		System.out.println("____________________");

		SBUbean ubean = (SBUbean) context.getBean("ubean");
		// System.out.println(ubean);
		// System.out.println(ubean.getEmpList());
		System.out.println("enter id ");
		int id = scanner.nextInt();
		

		if (employee1.getEmployeeId() == id) {
			System.out.println(employee1);
		}else {
			System.err.println("invalid id ");
		}
	}

}
