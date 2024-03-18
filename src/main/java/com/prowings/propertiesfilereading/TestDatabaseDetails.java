package com.prowings.propertiesfilereading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatabaseDetails {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeansDatabaseProperties.xml");
		
		
		MyDatabaseDetails dbDetails = context.getBean("dbProps",MyDatabaseDetails.class);
		
		System.out.println(dbDetails);
		
		
	}

}
