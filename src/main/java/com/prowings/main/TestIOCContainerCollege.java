package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.College;

public class TestIOCContainerCollege {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansCollege.xml");
		
		
		College clg = context.getBean("clg1",College.class);
		
		System.out.println(clg);
		
	}

}
