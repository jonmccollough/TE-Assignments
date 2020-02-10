package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the length:");
		
		String strEnteredLength = myScanner.nextLine();
		
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		
		String strUnit = myScanner.nextLine();
		
		double enteredLength = Double.parseDouble(strEnteredLength);
		
		if(strUnit.equalsIgnoreCase("m")) {
			
			double meterToFoot = enteredLength * 3.2808399;
			System.out.println(strEnteredLength + "m is " + meterToFoot + "f" );
			
		} else {
			
			double footToMeter = enteredLength * 0.3048;
			System.out.println(strEnteredLength + "f is " + footToMeter + "m");
		}
		
	}

}


//Write a program that converts meters to feet and vice-versa.
//
//The foot to meter conversion formula is:
//
//m = f * 0.3048
//The meter to foot conversion formula is:
//
//f = m * 3.2808399