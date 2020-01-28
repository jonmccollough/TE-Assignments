package com.techelevator.farm;

public class Cow extends FarmAnimal implements Singable, Flyable {

	//Chicken and Cow are classes that extend from FarmAnimal 
	// - which FarmAnimal already implements the Singable Interface
	
	public Cow() {
		super("Cow", "mooooooooOOOOOOOooooo!");
	}
	
//	public String sing() {
//		return "I'm a " + name + "I sing: "+ sound;
//	}

	@Override
	public String doYouBelieve(int probabilityOfFlight) {
		if (probabilityOfFlight > 100 ) {
			return "MoooOOOOooovvvvveeeee OVER Farm Birds!";
		}
		return "Eat moar chiken";
	}

}