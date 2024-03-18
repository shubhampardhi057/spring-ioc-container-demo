package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScopes {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansScopes.xml");
		
		Car c1 = context.getBean("car1",Car.class);
		
		System.out.println(c1.hashCode());
		
		
		Car c2 = context.getBean("car2",Car.class);
		
		System.out.println(c2.hashCode());
		
		
		System.out.println(c1 == c2);
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("springBeansScopes.xml");
	
		
		Car c3 = context1.getBean("car1",Car.class);
		
		System.out.println(c3.hashCode());
		
		System.out.println(c1 == c3);
		
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("springBeansScopes.xml");
		
		Car c4 = context2.getBean("car2",Car.class);
		
		System.out.println(c4.hashCode());
		
		
		Car c5 = context2.getBean("car2",Car.class);
		
		System.out.println(c5.hashCode());
		
		
		System.out.println(c4 == c5);
		
	}

}
