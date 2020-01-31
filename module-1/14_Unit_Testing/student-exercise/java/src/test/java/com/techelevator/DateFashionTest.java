package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
	
	@Test
	public void date_fashion_test_you_5_date_10_results_in_2 (){
		DateFashion testFashion = new DateFashion();
		int youAndDate = testFashion.getATable(5, 10);
		Assert.assertEquals(2, youAndDate);
	}
	
	@Test
	public void date_fashion_test_you_5_date_2_results_in_0 (){
		DateFashion testFashion = new DateFashion();
		int youAndDate = testFashion.getATable(5, 2);
		Assert.assertEquals(0, youAndDate);
	}
	
	@Test
	public void date_fashion_test_you_5_date_5_results_in_1 (){
		DateFashion testFashion = new DateFashion();
		int youAndDate = testFashion.getATable(5, 5);
		Assert.assertEquals(1, youAndDate);
	}
	
	@Test
	public void date_fashion_test_you_1_date_1_results_in_0 (){
		DateFashion testFashion = new DateFashion();
		int youAndDate = testFashion.getATable(1, 1);
		Assert.assertEquals(0, youAndDate);
	}
	
	@Test
	public void date_fashion_test_you_8_date_8_results_in_2 (){
		DateFashion testFashion = new DateFashion();
		int youAndDate = testFashion.getATable(8, 8);
		Assert.assertEquals(2, youAndDate);
	}
}
