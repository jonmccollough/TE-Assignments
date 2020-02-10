package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("Hello, please enter the fibonacci number:");
	
	String strUserNum = myScanner.nextLine();
	
//	int intUserNum = Integer.parseInt(strUserNum);   // int or array??
	
//	double doubleUserNum = Double.parseDouble(strUserNum);
	
//	int[] arrayFib = new int[0];
	
	int fibA = 0 ;
	int fibB = 1 ;
	int fibC = 0 ;
	int intUserNum = Integer.parseInt(strUserNum);  //start an array with user number
	System.out.print(fibA + " " + fibB + " ");
	
//	String arrayString = Arrays.toString();
		
	for (int i = 1; i <= intUserNum ; i++) {
		
		i = i + fibC;
	
		fibC = fibA + fibB;
		fibA = fibB;
		fibB = fibC;
		
		
//		while (fibB <= intUserNum) {   // going beyond the entered number
//			
//			
//		
//			fibC = fibA + fibB;
//			fibA = fibB;
//			fibB = fibC;
		
			
		System.out.print(fibC + " ");
		
			
	} //	System.out.println(Arrays.toString(arrayFib));

		
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