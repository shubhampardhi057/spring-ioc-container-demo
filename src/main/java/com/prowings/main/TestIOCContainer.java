package com.prowings.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.Employee;
import com.prowings.models.Student;

public class TestIOCContainer {
	
	public static void main(String[] args) {
		
//		Student std1 = new Student();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
//		
//		Student std1 = context.getBean("std1",Student.class);
//		
//		System.out.println("Stuudent1 : "+std1);
//		
//		
//		Student std2 = context.getBean("std2",Student.class);
//		
//		System.out.println("Stuudent2 : "+std2);
//		
//		System.out.println(std1 == std2);
//		
//		System.out.println(std1.equals(std2));
		
		
		
		ApplicationContext contextEmp = new ClassPathXmlApplicationContext("springBeans.xml");
		
		Employee emp11 = contextEmp.getBean("emp1",Employee.class);
		
		System.out.println("Employee :"+emp11);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<");
		
		Employee emp22 = contextEmp.getBean("emp2",Employee.class);
		
		System.out.println("Employee :"+emp22);
		
		
	}

}
