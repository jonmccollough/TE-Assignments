package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.farm.Cat;

import org.junit.Assert;

public class CatTest {
	
	@Before
	public void setup() {
		System.out.println("before each test: setup");
	}
	
	@After
	public void teardown() {
		System.out.println("after each test: teardown");
	}
	
	@Test
	public void cat_eat_method_returns_correct_string () {
		Cat myTestCat = new Cat("Sylvester","sufferin' succotash!");
		
		String resultOfEat = myTestCat.eat(0);
		
		Assert.assertEquals("thanks, I'll wake you up at 4:30 AM for more food.", resultOfEat);
		
	}
	
	@Test
	public void cat_eat_sets_letOnwerSleep_to_false_when_fed_lte_500 () {
		Cat myTestCat = new Cat("Sylvester","sufferin' succotash!");
		
		String resultOfEat = myTestCat.eat(400);
		boolean letOwnerSleepActual = myTestCat.letOwnerSleep();
		
		Assert.assertFalse("Let owner sleep should be false since less than or equal to 500", letOwnerSleepActual);
		
		
	}
	
	@Test
	public void cat_eat_sets_letOnwerSleep_to_true_when_fed_gt_500 () {
		Cat myTestCat = new Cat("Sylvester","sufferin' succotash!");
		
		String resultOfEat = myTestCat.eat(501);
		boolean letOwnerSleepActual = myTestCat.letOwnerSleep();
		
		Assert.assertTrue("Let owner sleep should be true since greater than 500", letOwnerSleepActual);
			
	}
	

}
