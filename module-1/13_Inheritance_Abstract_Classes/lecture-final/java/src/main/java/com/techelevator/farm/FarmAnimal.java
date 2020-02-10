package com.techelevator.farm;

public abstract class FarmAnimal implements Singable{
	private String name;
	private String sound;
	private boolean isSleeping = false;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public final String getSound() {
		if (isSleeping ) {
			return "Whhhirrrzzzzzz";
		}
		return sound;
	}
	
	public boolean isSleeping() {
		return isSleeping;
	}
	
	public void sleep() {
		isSleeping = true;
	}
	
	public void wakeUp() {
		isSleeping = false;
	}

	public String sing() {
		return "I'm a " + name + " and I sing like this: " + sound;
	}

	public boolean tuneSinger() {
		return true;
	}
	
	public abstract String eat(int howMuchFood);

}