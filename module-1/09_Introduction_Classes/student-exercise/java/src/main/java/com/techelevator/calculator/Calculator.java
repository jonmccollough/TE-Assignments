package com.techelevator.calculator;

public class Calculator {

	private int result;
	
//	public int getResult() {
//		return this.result;
//	}
	
	//Methods
	
	public int add(int addend) {
		
		result = addend + result;
		
		return result;
	}
	
	public int getResult() {
		
		return result;
	}
	
	public int multiply(int multiplier) {
		
		result = multiplier * result;
		
		return result;
	}
	
	public int power(int exponent) {
		
		result = (int) Math.pow(result,  exponent);
		
		return result;
	}
	
	public  void reset() {
		
		result = 0;
	}
	
	public int subtract(int subtrahend) {
		
		result = result - subtrahend;
		
		return result;
	}
	
	
	
	
}
