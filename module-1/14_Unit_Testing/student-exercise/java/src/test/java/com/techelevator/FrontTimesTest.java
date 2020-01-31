package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

	@Test
	public void chocolate_2_returns_chocho () {
		FrontTimes testFront = new FrontTimes();
		String choco = testFront.generateString("Chocolate", 2);
		Assert.assertEquals("ChoCho", choco);
	}
	
	@Test
	public void chocolate_3_returns_chochocho () {
		FrontTimes testFront = new FrontTimes();
		String choco = testFront.generateString("Chocolate", 3);
		Assert.assertEquals("ChoChoCho", choco);
	}
	
	@Test
	public void abc_3_returns_chocho () {
		FrontTimes testFront = new FrontTimes();
		String choco = testFront.generateString("Abc", 3);
		Assert.assertEquals("AbcAbcAbc", choco);
	}
	
	@Test
	public void blank_0_returns_blanks () {
		FrontTimes testFront = new FrontTimes();
		String choco = testFront.generateString(null,3);
		Assert.assertEquals("", choco);
	}
	
	@Test
	public void null_returns_null () {
		FrontTimes testFront = new FrontTimes();
		String choco = null;
		Assert.assertEquals(null, choco);
	}
	
}

// Given a string and a non-negative int n, we'll say that the front of the
//string is the first 3 chars, or whatever is there if the string is less than
//length 3. 
//Return n copies of the front; frontTimes("Chocolate", 2) → "ChoCho" 
//frontTimes("Chocolate", 3) → "ChoChoCho" 
//frontTimes("Abc", 3) →"AbcAbcAbc"
