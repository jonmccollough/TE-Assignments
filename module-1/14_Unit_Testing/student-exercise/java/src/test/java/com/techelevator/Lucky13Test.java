package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

	@Test
	public void getluck_0_2_4() {
		Lucky13 myTest = new Lucky13();
		int[] nums = { 0, 2, 4 };
		boolean lucky13 = myTest.getLucky(nums);
		Assert.assertTrue(lucky13);
	}
	
	@Test
	public void getluck_1_2_3() {
		Lucky13 myTest = new Lucky13();
		int[] nums = { 1, 2, 3 };
		boolean lucky13 = myTest.getLucky(nums);
		Assert.assertFalse(lucky13);
	}
	
	@Test
	public void getluck_1_2_4() {
		Lucky13 myTest = new Lucky13();
		int[] nums = { 1, 2, 4 };
		boolean lucky13 = myTest.getLucky(nums);
		Assert.assertFalse(lucky13);
	}
	
	@Test
	public void getluck_null() {
		Lucky13 myTest = new Lucky13();
		int[] nums = null;
		boolean lucky13 = myTest.getLucky(nums);
		Assert.assertTrue(lucky13);
	}
	
	@Test
	public void getluck_1() {
		Lucky13 myTest = new Lucky13();
		int[] nums = {1};
		boolean lucky13 = myTest.getLucky(nums);
		Assert.assertFalse(lucky13);
	}
	
	@Test
	public void getluck_3() {
		Lucky13 myTest = new Lucky13();
		int[] nums = {3};
		boolean lucky13 = myTest.getLucky(nums);
		Assert.assertFalse(lucky13);
	}
	
}
