package com.prowings.models;

public class Address {
	
	int pin;
	String city;
	
	
	public Address() {
		super();
		System.out.println("No-arg Address called");
	}
	
	
	
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
		System.out.println("All-arg Address called");
	}
	
	
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
		System.out.println("Setter Pin Address called");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("Setter City Address called");
	}
	
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	

}
