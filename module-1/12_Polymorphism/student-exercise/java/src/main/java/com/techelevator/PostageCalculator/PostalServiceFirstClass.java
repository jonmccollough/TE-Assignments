package com.techelevator.PostageCalculator;

public class PostalServiceFirstClass implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight < 2) {
			rate = weight * 0.035;
		} else if (weight < 8) {
			rate = weight * 0.040;
		} else if (weight < 15)
		return 0;
	}

	@Override
	public String name() {
		return "Postal Service (FirstClass)";
	}

}
