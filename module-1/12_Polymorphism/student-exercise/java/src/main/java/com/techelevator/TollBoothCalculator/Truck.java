package com.techelevator.TollBoothCalculator;

public class Truck implements VehicleInterface {

	private String Truck;
	private int numberOfAxis() {
		return 0;
	}
	
	Truck(int numberOfAxis){
	}
	
	
	@Override
	public double calculateToll(int distance) {
		
		double toll = 0;
		
		if (numberOfAxis() < 5) {
			toll += distance * 0.040; 
			
		} else if (numberOfAxis() < 7) {
			toll += distance * 0.045;
			
		} else if (numberOfAxis() < 9) {
			toll += distance * 0.048;
			
		}
		
		return toll;
	}

	
	@Override
	public String getType() {
		return Truck;
	}
	
	

}
