package com.techelevator.farm;

public class FarmAnimal {
	
	//FarmAnimal is a class that implements from Interface Singable
	
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
		return "I'm a " + name + " and I sing like this.";
	}
	
	public boolean tuneSinger() {
		return false;
	}
	
	

}