package com.techelevator.PostageCalculator;

public class PostalServiceSecondClass implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight < 2) {
			rate = distance * 0.0035;
		} else if (weight < 8) {
			rate = distance * 0.0040;
		} else if (weight < 15) {
			rate = distance * .0047;
		} else if (weight < 48) {
			rate = distance * 0.0195;
		} else if (weight < 128) {
			rate = distance * .0450;
		} else if (weight >= 128)
			rate = distance * .0500;
		return rate;
	}

	@Override
	public String name() {
		return "Postal Service (Second Class)";
	}

}
