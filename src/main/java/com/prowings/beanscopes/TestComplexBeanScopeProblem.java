package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComplexBeanScopeProblem {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansComplexBeanScopeProblem.xml");
		
		FourWheeler fortuner = context.getBean("fourWheeler1",FourWheeler.class);
		
		System.out.println("FORTUNER :"+ fortuner);
		
		
		FourWheeler virtus = context.getBean("fourWheeler1",FourWheeler.class);
		
		System.out.println("VIRTUS :"+ virtus);
		
		
		System.out.println(fortuner == virtus);
		
		
		System.out.println(fortuner.getEngine() == virtus.getEngine());
	}
}
