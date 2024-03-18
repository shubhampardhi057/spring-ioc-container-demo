package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean,DisposableBean {
	
	int pin;
	String street;
	String country;
	
	
	public Address() {
		super();
	}

	public Address(int pin, String street, String country) {
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

	public void destroy() throws Exception {
		
		System.out.println("====Address Distroy====");
		
	}


	public void afterPropertiesSet() throws Exception {
		
		System.out.println("====Address Intialization====");
		
	}
	
	
	

}
