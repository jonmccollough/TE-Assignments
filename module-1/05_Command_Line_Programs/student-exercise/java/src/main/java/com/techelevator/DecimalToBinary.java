package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner myScanner  = new Scanner(System.in);
		
		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		
		String strDecimals = myScanner.nextLine();
		
		String[] decimalsArray = strDecimals.split(" ");
		
		for (int i = 0; i < decimalsArray.length; i++  ) {
			
				int element1 = Integer.parseInt( decimalsArray[i]);
				
				int quotient2 = element1;
				
				int remainder3 = 0;
				
				String userDigit = "";
				
				String binaryOut = "";
				
				while (0 < quotient2) {
					remainder3 = quotient2 % 2;
					quotient2 = quotient2 / 2;
					
					userDigit = String.valueOf(remainder3);
					
					binaryOut = userDigit + binaryOut;
					
				}
			System.out.println(element1 + " in binary is " + binaryOut);
		}
	}

}


// Integer.toBinaryString()