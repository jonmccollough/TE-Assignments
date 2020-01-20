package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("Hello, please enter the fibonacci number:");
	
	String strUserNum = myScanner.nextLine();
	
	int intUserNum = Int.parseInt(strUserNum);
	
	double doubleUserNum = Double.parseDouble(strUserNum);
	
	int[] arrayFib = new int[0];
	
//	String arrayString = Arrays.toString();
	
	while( doubleUserNum < doubleUserNum) {
		
		for (int i = 0; i < doubleUserNum ; i++ ) {
		
			int fibZero = 0 ;
			int fibOne = 1 ;
			int fibSecond = fibZero + fibOne;
			
			System.out.println(fibSecond);
			
		
	} 
	
		
		
		
	}

}




//The Fibonacci numbers are the integers in the following sequence:
//
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//By definition, the first two numbers in the Fibonacci sequence are 0 and 1, 
//and each subsequent number is the sum of the previous two.
//
//Write a command line program which prompts the user for an integer value 
//and display the Fibonacci sequence leading up to that number.
//
//Please enter the Fibonacci number: 25
//
//0, 1, 1, 2, 3, 5, 8, 13, 21