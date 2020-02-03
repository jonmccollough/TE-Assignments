package com.techelevator.farm;

public class FarmAnimal implements Singable{
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

	public String sing() {
		return "I'm a " + name + " and I sing like this: " + sound;
	}

	public boolean tuneSinger() {
		return true;
	}

}