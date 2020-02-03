package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(int check) {
		
		String fizzStr = "";
		
		if(check % 3 == 0) {
			
			fizzStr = "Fizz";
			
		} if (check % 5 == 0 ) {
			
			fizzStr = "Buzz";
		}
		
		return fizzStr;

	}
	
}
