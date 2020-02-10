package com.techelevator.farm;

public class Cow extends FarmAnimal implements Flyable {
	
	private int numberOfFullStomachs = 0;

	public Cow() {
		super("Cow", "moooooOOOOOoooooo!");
	}

	public String doYouBelieve(int probabilityOfFlight) {
		if (probabilityOfFlight > 100 ) {
			return "MooooOOOOOOvvveeee OVER Farm Birds!";
		}
		return "You're still a cow and are still really boring.";
	}

	@Override
	public String eat(int howMuchFood) {
		
		//TODO: figure out how many stomaches cow have
		
		if ( howMuchFood > 0 ) {
			numberOfFullStomachs = 2;
		}
		
		return "Moo. I could totally grind that faster or at a different time of day when school is not in session.";
	}

}