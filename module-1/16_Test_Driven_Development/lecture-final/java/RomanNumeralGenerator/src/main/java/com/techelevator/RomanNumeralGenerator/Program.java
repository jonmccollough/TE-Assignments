package com.techelevator.RomanNumeralGenerator;

public class Program {

	public static void main(String[] args) {
		
		RomanNumeral myNumeral = new RomanNumeral();
		
		for ( int i = 1; i <= 10; i++) {
			myNumeral = new RomanNumeral();
			System.out.println(myNumeral.generateRomanNumeral(i));
		}

	}

}
