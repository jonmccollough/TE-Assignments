package com.techelevator.TollBoothCalculator;

public class Car implements VehicleInterface {

	private String Car;
	
	public boolean hasTrailer;
	

	Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	@Override
	public double calculateToll(int distance) {

		double toll = 0;

		if (this.hasTrailer == true) {
			toll += (double) distance * 0.020;
			toll += toll + 1.00;
			return toll;
			
		} else {
			toll += distance * 0.020;
			return toll;
		}
	}

	@Override
	public String getType() {
		if( hasTrailer == true ) {
			return "Car (with trailer)";
		}else {
			return ("Car              ");
		}

	}

}
