package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Hello! Please enter a temperature, and whether it's in (C)elsius or (F)ahrenheit.");
		
		String strMyTemp = myScanner.nextLine();
		
	//	double 
		
	//	if ( )
	}

}


/* 
 * 
 * Tc = (Tf - 32) / 1.8


where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit.

The Celsius to Fahrenheit conversion formula is:

Tf = Tc * 1.8 + 32
Write a command line program which prompts a user to enter a temperature, and whether it's in degrees (C)elsius or (F)ahrenheit. Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.

Please enter the temperature: 58
Is the temperature in (C)elsius, or (F)ahrenheit? F
58F is 14C.

*/