package com.prowings.models;

public class Student {

	int roll;
	String name;
	Address address;
	
	public Student() {
		super();
		System.out.println("No-arg  Student called");
	}

	public Student(int roll, String name, Address address) {
		super();
		
		System.out.println("All-arg  Student called");
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println("Setter Roll Student called ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setter Name Student called ");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Address Student called ");
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
