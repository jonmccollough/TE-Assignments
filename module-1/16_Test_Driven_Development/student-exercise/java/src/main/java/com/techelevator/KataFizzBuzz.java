package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(int check) {
		
		String fizzStr = "";
		
		if(check % 3 == 0) {
			
			fizzStr = "fizz";
			
		}
		
		return fizzStr;

	}
	
}
