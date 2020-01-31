package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

	@Test
	public void test_animal() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		String resultOfAnimalName = testAnimal.getHerd("dog");
		boolean animalNameTrueFalse = resultOfAnimalName.contains("Pack");
		Assert.assertTrue(animalNameTrueFalse);
	}

	@Test
	public void get_herd_test_giraffe_returns_tower() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		String resultOfAnimalName = testAnimal.getHerd("giraffe");
		boolean animalNameTrueFalse = resultOfAnimalName.contains("Tower");
		Assert.assertTrue(animalNameTrueFalse);
	}

	@Test
	public void get_herd_test_blank_returns_unknown() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		String resultOfAnimalName = testAnimal.getHerd("");
		boolean animalNameTrueFalse = resultOfAnimalName.contains("unknown");
		Assert.assertTrue(animalNameTrueFalse);
	}
	
	@Test
	public void get_herd_test_walrus_returns_unknown() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		String resultOfAnimalName = testAnimal.getHerd("walrus");
		boolean animalNameTrueFalse = resultOfAnimalName.contains("unknown");
		Assert.assertTrue(animalNameTrueFalse);
	}
	
	@Test
	public void get_herd_test_rhino_capital_r_returns_crash() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		Assert.assertEquals("Crash", testAnimal.getHerd("Rhino"));	
	}
	
	@Test
	public void get_herd_test_rhino_lowercase_r_returns_crash() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		Assert.assertEquals("Crash", testAnimal.getHerd("rhino"));	
	}
	
	@Test
	public void get_herd_test_elephants_returns_unknown() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		Assert.assertEquals("unknown", testAnimal.getHerd("elephants"));	
	}
	
	@Test
	public void get_herd_test_null_lowercase_r_returns_blank() {
		AnimalGroupName testAnimal = new AnimalGroupName();
		Assert.assertEquals("unknown", testAnimal.getHerd(null));	
	}
	
}











