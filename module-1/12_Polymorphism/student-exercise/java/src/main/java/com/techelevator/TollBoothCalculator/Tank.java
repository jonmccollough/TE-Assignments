package com.techelevator.TollBoothCalculator;

public class Tank implements VehicleInterface {

	private String Tank;
	
	double toll = 0;
	
	@Override
	public double calculateToll(int distance) {
		distance = distance *0;
		return toll;
	}

	@Override
	public String getType() {
		return "Tank             ";
	}
	
}
