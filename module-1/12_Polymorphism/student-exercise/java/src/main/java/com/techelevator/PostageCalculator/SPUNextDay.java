package com.techelevator.PostageCalculator;

public class SPUNextDay implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		rate = (weight * 0.0750) * distance;
		return rate;
	}

	@Override
	public String name() {
		return "SPU (Next Day)";
	}
}
