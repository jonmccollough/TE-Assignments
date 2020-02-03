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
		
		Assert.assertEquals( "Fizz",  tester.fizzBuzz(check) );
		
	}

	@Test
	public void div_by_5_convert_to_buzz() {
		
		int check = 5;
		
		Assert.assertEquals( "Buzz",  tester.fizzBuzz(check) );
		
	}
	
	@Test
	public void div_by_both_3_and_5_convert_to_FuzzBizz() {
		
		int check = 15;
		
		Assert.assertEquals("FizzBuzz", tester.fizzBuzz(check));
		
	}
}
