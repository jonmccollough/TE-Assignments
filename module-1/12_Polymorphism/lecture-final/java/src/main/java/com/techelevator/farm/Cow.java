package com.techelevator.farm;

public class Cow extends FarmAnimal implements Flyable {

	public Cow() {
		super("Cow", "moooooOOOOOoooooo!");
	}

	public String doYouBelieve(int probabilityOfFlight) {
		if (probabilityOfFlight > 100 ) {
			return "MooooOOOOOOvvveeee OVER Farm Birds!";
		}
		return "You're still a cow and are still really boring.";
	}

}