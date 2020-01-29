package com.techelevator.PostageCalculator;

public class SPU4DayGround implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		rate = (weight * 0.0050) * distance;
		return rate;
	}

	@Override
	public String name() {
		return "SPU (4-Day Ground)";
	}

}
