package com.prowings.methodsofcontainer;

public class Employee {
	
	int empId;
	String name;
	Address address;
	
	static int countBeans=0;
	
	public Employee() {
		super();
		countBeans++;
	}

	public Employee(int empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
