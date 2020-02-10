package com.techelevator.company;

public class Company {

	private String name;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	private int numberOfEmployees;
	
	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}
	
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	private double revenue;
	
	public double getRevenue() {
		return this.revenue;
	}
	
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
		
	
	private double expenses;
	
	public double getExpenses() {
		return this.expenses;
	}
	
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	
	
	private String companySize;
	
	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}

	
	//Method
	
	 public String getCompanySize() {
	
		 if (numberOfEmployees <= 50) { 
		
			 return "small";
		
		 } else if (numberOfEmployees > 50 && numberOfEmployees <= 250 ){
			 
			 return "medium";
			 
		 } else if (numberOfEmployees > 250 ){ 
			 
			 return "large";
		 } else { return null;
		 
		 }
	
	 }
	 
	 public double getProfit() {

		return revenue - expenses; 
		
	 }
	
	
}
