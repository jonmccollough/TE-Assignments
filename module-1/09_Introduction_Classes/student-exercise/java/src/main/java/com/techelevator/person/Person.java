package com.techelevator.person;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Methods 
	
	public String getFullName() {
		
		return firstName + " " + lastName;
		
	}
	
	public boolean isAdult() {
		
		if( age >= 18 ) {
			
			return true;
			
		} else { 
			
			return false;
		
		}
	}
	
	
	
}
