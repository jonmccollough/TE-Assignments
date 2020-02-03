package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {

	KataFizzBuzz tester = new KataFizzBuzz();
	
	
	@Test
	public void div_by_3_convert_to_fizz() {
		
		int check = 3;
		
		Assert.assertEquals( "fizz",  tester.fizzBuzz(check) );
		
	}

	
}
