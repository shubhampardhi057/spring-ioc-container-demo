package com.prowings.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student2 {
	
	int roll;
	String name;
	Address2 address;
	
	
	public Student2() {
		super();
	}


	public Student2(int roll, String name, Address2 address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address2 getAddress() {
		return address;
	}


	public void setAddress(Address2 address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	@PreDestroy
	public void customDestroy() throws Exception {
		
		System.out.println("====Student2 Distroy====");
		
	}

	@PostConstruct
	public void customInit() throws Exception {
		
		System.out.println("====Student2 Intialization====");
	}
	
	

}
