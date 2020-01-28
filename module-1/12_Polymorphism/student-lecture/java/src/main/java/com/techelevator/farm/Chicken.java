package com.techelevator.farm;

public class Chicken extends FarmAnimal implements Singable {

	//Chicken and Cow are classes that extend from FarmAnimal 
	// - which FarmAnimal already implements the Singable Interface
	
	public Chicken() {
		super("Chicken", "cluck!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}