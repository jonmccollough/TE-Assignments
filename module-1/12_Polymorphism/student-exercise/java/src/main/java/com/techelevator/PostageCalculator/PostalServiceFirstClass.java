package com.techelevator.PostageCalculator;

public class PostalServiceFirstClass implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight <= 2) {
			rate = distance * 0.035;
		} else if (weight <= 8) {
			rate = distance * 0.040;
		} else if (weight <= 15) {
			rate = distance * .047;
		} else if (weight <= 48) {
			rate = distance * 0.195;
		} else if (weight <= 128) {
			rate = distance * .450;
		} else if (weight > 128)
			rate = distance * .500;
		return rate;
	}

	@Override
	public String name() {
		return "Postal Service (First Class)";
	}

}
