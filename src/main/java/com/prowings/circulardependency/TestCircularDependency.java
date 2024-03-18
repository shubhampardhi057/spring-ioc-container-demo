package com.prowings.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularDependency {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansCircularDependency.xml");
		
		A a = context.getBean("aaBean",A.class);
		
		System.out.println(a);
		
		B b = context.getBean("bbBean",B.class);
		
		System.out.println(b);
	}

}
