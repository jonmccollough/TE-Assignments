package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(int check) {
		
		String fizzStr = "";
		
		String testString = Integer.toString(check);
		
		if ( testString.contains("3") && testString.contains("5") || check % 3 == 0 && check % 5 == 0 && check >= 1 && check <= 100 ){
			
			fizzStr = "FizzBuzz";

			
		} else if (( check % 5 == 0 && check >= 1 && check <= 100 ) || testString.contains("5")) {
			
			fizzStr = "Buzz";
			
		} else if (testString.contains("3") || check % 3 == 0 && check >= 1 && check <= 100 ) {
				
			fizzStr = "Fizz";
			
		} else if (check >= 1 && check <= 100 ) {
		
			fizzStr = Integer.toString(check);
	
		}
			
		return fizzStr;

	}
}
