package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(int check) {
		
		String fizzStr = "";
		
		if (check % 3 == 0 && check % 5 == 0) {
			
			fizzStr = "FizzBuzz";
			
		} else if (check % 3 == 0) {
			
			fizzStr = "Fizz";
			
		} else if (check % 5 == 0 ) {
			
			fizzStr = "Buzz";
		}
		
		return fizzStr;

	}
	
}
