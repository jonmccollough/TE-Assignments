package com.techelevator;

public class Employee {
	
	//Data Members
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	//Get && Set
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public String getFullName(){
		return lastName + ", " + firstName;
	}
	
	
	
	//Constructor
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		annualSalary = salary;
	}
	
	//Method
	
	public void raiseSalary(double percent) {
		
		percent = percent * 0.01;
		annualSalary += annualSalary * percent;
	
	}
	
	

}
