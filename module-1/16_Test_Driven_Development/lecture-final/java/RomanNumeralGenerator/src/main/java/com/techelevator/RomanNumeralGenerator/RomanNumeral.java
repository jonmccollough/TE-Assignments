package com.techelevator.RomanNumeralGenerator;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
	
//	private int valueToConvert;
	private String romanNumeralResult = "";
	
	Map<Integer, String> numeralLookup = new HashMap<Integer, String>();
	
	public RomanNumeral() {
		numeralLookup.put(1, "I");
		numeralLookup.put(4, "IV");
		numeralLookup.put(5, "V");
		numeralLookup.put(9, "IX");
		numeralLookup.put(10, "X");
		numeralLookup.put(40, "XL");
		numeralLookup.put(50, "L");
		numeralLookup.put(90, "XC");
		numeralLookup.put(100, "C");
		numeralLookup.put(400, "CD");
		numeralLookup.put(500, "D");
		numeralLookup.put(900, "CM");
		numeralLookup.put(1000, "M");
	}
	
//	public i getNumeralAndDecrementValue (int i) {
//		
//		romanNumeralResult = romanNumeralResult + numeralLookup.get(i);
//		valueToConvert = valueToConvert - i;
//		return valueToConvert;
//		
//	}

	public String generateRomanNumeral(int i) {
		
	
		while ( i >= 1000 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(1000);
			i = i - 1000;
		}
		while ( i >= 900 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(900);
			i = i - 900;
		}
		while ( i >= 500 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(500);
			i = i - 500;
		}
		while ( i >= 400 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(400);
			i = i - 400;
		}
		while ( i >= 100 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(100);
			i = i - 100;
		}
		while ( i >= 90 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(90);
			i = i - 90;
		}
		while ( i >= 50 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(50);
			i = i - 50;
		}
		while ( i >= 40 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(40);
			i = i - 40;
		}
		while ( i >= 10 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(10);
			i = i - 10;
		}
		while ( i >= 9 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(9);
			i = i - 9;
		}
		while ( i >= 5 ) {
			romanNumeralResult =  romanNumeralResult + numeralLookup.get(5);
			i = i - 5;
		}
		while ( i >= 4 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(4);
			i = i - 4;
		}
		while ( i >= 1 ) {
			romanNumeralResult = romanNumeralResult + numeralLookup.get(1);
			i = i - 1;
		}
		
		return romanNumeralResult;	
	}

	
}
