package com.prowings.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycle {
	
	public static void main(String[] args) {
		
//		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("springBeansBeanLifecycle.xml");
		
//		Student s1 = con.getBean("std",Student.class);
		
//		System.out.println(s1);
		
//		Student2 s2 = con.getBean("std",Student2.class);
		
//		System.out.println(s2);
		
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("springBeansBeanLifecycle.xml");
		
		Student2 s3 = con.getBean("std",Student2.class);
		
		System.out.println(s3);
		
		con.close();
		
	}

}
