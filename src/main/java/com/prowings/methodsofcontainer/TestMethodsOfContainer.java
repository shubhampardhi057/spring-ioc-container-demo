package com.prowings.methodsofcontainer;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodsOfContainer {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springBeansMethodOfContainer.xml");
		
		Employee e1 = context.getBean("emp2",Employee.class);
		
		System.out.println(e1);
		
		System.out.println("Count Of Beans : "+Employee.countBeans);
		
		System.out.println(context.containsBean("emp2"));
		
		int beanCount = context.getBeanDefinitionCount();
		
		System.out.println(beanCount);
		
		String[] input = context.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(input));
		
		String[] input1 = context.getBeanNamesForType(Employee.class);
		
		System.out.println(Arrays.toString(input1));
		
		context.registerShutdownHook();
		
	}

}
