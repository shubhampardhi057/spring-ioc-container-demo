package com.prowings.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address2  {
	
	int pin;
	String street;
	String country;
	
	
	public Address2() {
		super();
	}

	public Address2(int pin, String street, String country) {
		super();
		this.pin = pin;
		this.street = street;
		this.country = country;
	}

	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + ", country=" + country + "]";
	}

	@PreDestroy
	public void customDestroy() throws Exception {
		
		System.out.println("====Address2 Distroy====");
		
	}

	@PostConstruct
	public void customInit() throws Exception {
		
		System.out.println("====Address2 Intialization====");
		
	}
	
	
	

}
