package com.springboot.demoapp;

public class Student {
	
	private String firstName;
	private String lastName;
	private int RegNo;
	

	public Student(String firstName, String lastName, int regNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		RegNo = regNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	

}
