package com.techelevator.farm;

public final class Cat extends FarmAnimal {
	
	private boolean letOwnerSleep = false;

	public Cat(String name, String sound) {
		super(name, sound);
	
	}

	@Override
	public String eat(int howMuchFood) {
		if (howMuchFood > 500) {
			letOwnerSleep = true;
		}
		return "thanks, I'll wake you up at 4:30 AM for more food.";

	}

	public boolean letOwnerSleep() {
		return letOwnerSleep;
	}
	
	

}
