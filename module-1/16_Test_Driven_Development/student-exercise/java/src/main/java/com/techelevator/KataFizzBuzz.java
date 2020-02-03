package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(int check) {
		
		String fizzStr = "";
		
		if (check % 3 == 0 && check % 5 == 0 && check >= 1 && check <= 100 ){
			
			fizzStr = "FizzBuzz";
			
		} else if (check % 3 == 0 && check >= 1 && check <= 100 ) {
			
			fizzStr = "Fizz";
			
		} else if (check % 5 == 0 && check >= 1 && check <= 100 ) {
			
			fizzStr = "Buzz";
		} else if (check >= 1 && check <= 100 ) {
		
			fizzStr = Integer.toString(check);
			
		}	
			
		return fizzStr;

	}
	
}
