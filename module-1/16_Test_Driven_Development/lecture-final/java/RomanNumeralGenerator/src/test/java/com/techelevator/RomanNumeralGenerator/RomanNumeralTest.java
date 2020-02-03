package com.techelevator.RomanNumeralGenerator;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {
	
	@Test 
	public void generate_I_for_1() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(1);
		
		Assert.assertEquals("I", myRomanNumeral);
	}
	
	@Test 
	public void generate_II_for_2() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(2);
		
		Assert.assertEquals("II", myRomanNumeral);
	}
	
	@Test 
	public void generate_III_for_3() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(3);
		
		Assert.assertEquals("III", myRomanNumeral);
	}
	
	@Test 
	public void generate_IV_for_4() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(4);
		
		Assert.assertEquals("IV", myRomanNumeral);
	}
	
	@Test 
	public void generate_IV_for_5() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(5);
		
		Assert.assertEquals("V", myRomanNumeral);
	}
	
	@Test 
	public void generate_C_for_100() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(100);
		
		Assert.assertEquals("C", myRomanNumeral);
	}
	
	@Test 
	public void generate_XCIX_for_99() {
		RomanNumeral myNumeral = new RomanNumeral();
		String myRomanNumeral = myNumeral.generateRomanNumeral(99);
		
		Assert.assertEquals("XCIX", myRomanNumeral);
	}
}
