package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionsLecture {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Add cities to an array");
		String[] cities = new String[] {"Pittsburgh", "Santa Fe", "Filthadelphia" };
		
		try {
			
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Somethings wrong this is what it told us: " + e.getMessage() );
		}
		
		System.out.println();
		System.out.println("====");
		System.out.println();
		
		try {
			doSomethingDangerous();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch exception from a method we called: " + e.getMessage() );
		}

		int nights = 3;
		int numberOfGuests = -2;
		
		try {
			System.out.println("I'm calling the method");
		double roomCharges = calculateHotelRoomCharges(nights, numberOfGuests);
		} catch(IllegalArgumentException e) {
			System.out.println(numberOfGuests + " guests for " + nights + " nights doesnt compute");
	
		}finally {
			System.out.println("This will always run");
		}
		
		
		System.out.println(" ==== overdraw method =====");
		
		double currentBalance = 250;
		double amountToWithdraw = 300;
		
		try {
		double balance = withdraw(currentBalance, amountToWithdraw);
			
		} catch (OverdraftException e) {
			System.out.println(e.getMessage() + " " + e.getOverdraftAmount());
			e.printStackTrace();
		}
		
		System.out.println("Printed the stack trace, but all was well after that");
		
		scan.close();
	}
	
	public static double withdraw(double currentBalance, double amountToWithdraw )throws OverdraftException{
    double newBalance;
    if(amountToWithdraw <= currentBalance) {
        newBalance = currentBalance - amountToWithdraw;
    } else {
        throw new OverdraftException("The requested withdrawal amount is greater than the current balance", Math.abs(currentBalance - amountToWithdraw));
    }
    return newBalance;      
	}
	
	
	
	
	private static double calculateHotelRoomCharges(int nights, int numberOfGuests) {
		final double EXTRA_GUEST_CHARGE = 20;
		final double ROOM_RATE = 85;

		    /* The throw statements below demonstrate how to throw a new Exception. */
		    if(nights < 1) {
		        throw new IllegalArgumentException("Minimum number of nights is 1");
		    } else if(numberOfGuests < 1) {
		        throw new IllegalArgumentException("Minimum number of guests is 1");
		    }
		    
		    int numberOfExtraGuests = 0;
		    if(numberOfGuests > 4) {
		        numberOfExtraGuests = numberOfGuests - 4;
		    }
		    
		    double dailyRate = ROOM_RATE + (EXTRA_GUEST_CHARGE * numberOfExtraGuests);
		    return dailyRate * nights;
		}
	
	private static void doSomethingDangerous() {
		int[] numbers = new int[5];
		for(int i = 0; i < 10; i++) {
		numbers[i] = i; // this line will throw an Exception once i reaches 5
		}
		
		System.out.println("Look Ma, no Exceptions!"); // This line will not execute because an Exception will be thrown inside the for loop
		}
	
}








