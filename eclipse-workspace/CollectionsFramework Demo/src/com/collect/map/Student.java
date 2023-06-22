package com.collect.map;

public class Student {
	
	private String firstName;
	private String lastName;
	
	//constructor
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]\n";
	}
	
	
}
