package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

	@Test
	public void same_first_letter_1_2_3_False() {
		SameFirstLast myTest = new SameFirstLast();
		int[] nums = { 1, 2, 3 };
		boolean isItTheSame = myTest.isItTheSame(nums);

		Assert.assertFalse(isItTheSame);
	}
	
	@Test
	public void same_first_letter_1_2_3_1_True() {
		SameFirstLast myTest = new SameFirstLast();
		int[] nums = { 1, 2, 3, 1 };
		boolean isItTheSame = myTest.isItTheSame(nums);

		Assert.assertTrue(isItTheSame);
	}
	
	@Test
	public void same_first_letter_1_2_1_True() {
		SameFirstLast myTest = new SameFirstLast();
		int[] nums = { 1, 2, 1 };
		boolean isItTheSame = myTest.isItTheSame(nums);

		Assert.assertTrue(isItTheSame);
	}
	
	@Test
	public void same_first_letter_blank_False() {
		SameFirstLast myTest = new SameFirstLast();
		int[] nums = {};
		boolean isItTheSame = myTest.isItTheSame(nums);

		Assert.assertFalse(isItTheSame);
	}
	
	@Test
	public void same_first_letter_0_False() {
		SameFirstLast myTest = new SameFirstLast();
		int[] nums = {0};
		boolean isItTheSame = myTest.isItTheSame(nums);

		Assert.assertTrue(isItTheSame);
	}
	
	@Test
	public void same_first_letter_null_False() {
		SameFirstLast myTest = new SameFirstLast();
		int[] nums = null;
		boolean isItTheSame = myTest.isItTheSame(nums);

		Assert.assertFalse(isItTheSame);
	}
}
