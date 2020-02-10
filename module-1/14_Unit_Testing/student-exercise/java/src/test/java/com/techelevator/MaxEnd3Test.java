package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

	@Test
	public void max_end_1_2_3() {
		MaxEnd3 myTest = new MaxEnd3();
		int[] nums = { 1, 2, 3 };
		int[] ans = {3, 3 ,3 };
		int[] maxEnd3 = myTest.makeArray(nums);
		
		Assert.assertArrayEquals(ans, maxEnd3);
	}
	
	@Test
	public void max_end_11_5_9() {
		MaxEnd3 myTest = new MaxEnd3();
		int[] nums = { 11, 5, 9 };
		int[] ans = {11, 11 ,11 };
		int[] maxEnd3 = myTest.makeArray(nums);
		
		Assert.assertArrayEquals(ans, maxEnd3);
	}
	
	@Test
	public void max_end_2_11_3() {
		MaxEnd3 myTest = new MaxEnd3();
		int[] nums = { 2, 11, 3 };
		int[] ans = {3, 3 ,3 };
		int[] maxEnd3 = myTest.makeArray(nums);
		
		Assert.assertArrayEquals(ans, maxEnd3);
	}
	
}
