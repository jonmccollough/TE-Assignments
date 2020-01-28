package com.techelevator.TollBoothCalculator;

public class Car implements VehicleInterface {

	private String Tank;
	
	public boolean hasTrailer() {
		return false;
	}

	Car(boolean hasTrailer) {
	}

	public double calculateToll(int distance) {

		double toll = 0;

		if (hasTrailer() == true) {

			toll += distance * 0.020;
			toll += toll + 1.00;
			return toll;
		} else {

			toll += toll + 1.00;
			return toll;
		}
	}

	@Override
	public String getType() {
		return Tank;
	}

}
