package com.prowings.models;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	
	int id;
	String name;
	List<Integer> mobileNumbers;
	
	Set<String> emails;
	
	Map<Integer,String> personProfession;

	public Person() {
		super();
	}

	public Person(int id, String name, List<Integer> mobileNumbers, Set<String> emails,
			Map<Integer, String> personProfession) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumbers = mobileNumbers;
		this.emails = emails;
		this.personProfession = personProfession;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	public Map<Integer, String> getPersonProfession() {
		return personProfession;
	}

	public void setPersonProfession(Map<Integer, String> personProfession) {
		this.personProfession = personProfession;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + ", emails=" + emails
				+ ", personProfession=" + personProfession + "]";
	}
	
	
	
	
	
	

}
