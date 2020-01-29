package com.techelevator.PostageCalculator;

public class FedEx implements DeliveryDriver {

	double rate = 20.00;
	
	@Override
	public double calculateRate(int distance, double weight) {
		if ( distance > 500) {
			rate = rate + 5.00;
		} if ( weight > 48) {
			rate = rate + 3.00;
		}
		return rate;
	}

	@Override
	public String name() {
		return "FedEx";
	}

}
