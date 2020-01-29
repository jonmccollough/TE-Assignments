package com.techelevator.TollBoothCalculator;

public class Truck implements VehicleInterface {

	private String Truck;
	
	private int numberOfAxels;
	
	private int getNumberOfAxels() {
		return numberOfAxels;
	}
	
	Truck(int numberOfAxels){
		this.numberOfAxels = numberOfAxels;
	}
	
	
	
	
	@Override
	public double calculateToll(int distance) {
		
		double toll = 0;
		
		if (this.getNumberOfAxels() == 4) {
			toll = distance * 0.040; 
			
		} else if (this.getNumberOfAxels() < 7) {
			toll += distance * 0.045;
			
		} else if (this.getNumberOfAxels() < 9) {
			toll += distance * 0.048;
			
		}
		
		return toll;
	}

	@Override
	public String getType() {
		if (getNumberOfAxels() == 4) {
			return "Truck (4 Axel)    "; 
			
		} else if (getNumberOfAxels() == 6) {
			return "Truck (6 Axel)    ";
			
		} else if (getNumberOfAxels() == 8) {
			return "Truck (8 Axel)    ";
		}
		return getType();
		
	}


	
	
	

}
