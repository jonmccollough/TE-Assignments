package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

	@Test
	public void hello_returns_Hlo () {
		StringBits testStart = new StringBits();
		String bits = testStart.getBits("Hello");
		Assert.assertEquals("Hlo", bits);
	}
	
	@Test
	public void null_returns_null () {
		StringBits testStart = new StringBits();
		String bits = testStart.getBits(null);
		Assert.assertEquals( "", bits);
	}
}
