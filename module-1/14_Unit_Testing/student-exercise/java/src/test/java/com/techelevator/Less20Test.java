package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

	@Test
	public void less_20_18_true() {
		Less20 myTest = new Less20();
		boolean less20equals18True = myTest.isLessThanMultipleOf20(18);
		Assert.assertTrue(less20equals18True);
	}
	
	@Test
	public void less_20_19_true() {
		Less20 myTest = new Less20();
		boolean less20equals19True = myTest.isLessThanMultipleOf20(19);
		Assert.assertTrue(less20equals19True);
	}
	
	@Test
	public void less_20_20_false() {
		Less20 myTest = new Less20();
		boolean less20equals20False = myTest.isLessThanMultipleOf20(20);
		Assert.assertFalse(less20equals20False);
	}
	
	
}
