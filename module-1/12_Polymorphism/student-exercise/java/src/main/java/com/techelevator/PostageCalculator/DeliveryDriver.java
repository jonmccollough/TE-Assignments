package com.techelevator.PostageCalculator;

public interface DeliveryDriver {

	public double calculateRate(int distance, double weight);
	
	public String name();
}
