package com.techelevator.PostageCalculator;

public class PostalServiceThirdClass implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight <= 2) {
			rate = distance * 0.0020;
		} else if (weight <= 8) {
			rate = distance * 0.0022;
		} else if (weight <= 15) {
			rate = distance * 0.0024;
		} else if (weight <= 48) {
			rate = distance * 0.0150;
		} else if (weight <= 128) {
			rate = distance * .0160;
		} else if (weight > 128)
			rate = distance * 0.0170;
		return rate;
	}

	@Override
	public String name() {
		return "Postal Service (Third Class)";
	}

}
