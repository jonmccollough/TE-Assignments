package com.techelevator.PostageCalculator;

public class SPU2DayBusiness implements DeliveryDriver {

	double rate;
	
	@Override
	public double calculateRate(int distance, double weight) {
		rate = ( (weight / 16) * 0.0500) * distance;
		return rate;
	}

	@Override
	public String name() {
		return "SPU (2-Day Business)\t";
	}
}
