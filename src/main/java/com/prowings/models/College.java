package com.prowings.models;

public class College {
	
	int clgId;
	String clgName;
	String address;
	
	
	public College() {
		super();
	}
	
	

	public College(String clgName,int clgId) {
		super();
		System.out.println("College( String clgName,int clgId) called");
		this.clgName = clgName;
		this.clgId = clgId;
	}
	
//	public College(String clgName,String address) {
//		super();
//		System.out.println("College(String clgName,String address) called");
//		this.clgName = clgName;
//		this.address = address;
//	}
	

//	public College(int clgId, String address) {
//		super();
//		System.out.println("College(int clgId,String address) called");
//		this.clgId = clgId;
//		this.address = address;
//	}



	public int getClgId() {
		return clgId;
	}


	public void setClgId(int clgId) {
		this.clgId = clgId;
	}


	public String getClgName() {
		return clgName;
	}


	public void setClgName(String clgName) {
		this.clgName = clgName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + ", address=" + address + "]";
	}
	
	
	

}
