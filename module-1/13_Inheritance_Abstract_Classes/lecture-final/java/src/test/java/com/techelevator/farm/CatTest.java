package com.techelevator.farm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.farm.Cat;

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
	public void cat_eat_method_returns_correct_string_when_fed_less_than_500() {
		Cat myTestCat = new Cat("Silvester", "sufferin' succotash!");
		
		String resultOfEat = myTestCat.eat(0);
		
		
		
	}
	
	
	@Test
	public void cat_eats_sets_letOwnerSleep_to_false_when_fed_gt_500 () {
	Cat myTestCat = new Cat("Silvester", "sufferin' succotash!");
	
	String resultOfEat = myTestCat.eat(501);
	boolean letOwnerSleepActual = myTestCat.letOwnerSleep();
	
	Assert.assertTrue("Let owner sleep should be true since greater than 500", letOwnerSleepActual);
	}
}





