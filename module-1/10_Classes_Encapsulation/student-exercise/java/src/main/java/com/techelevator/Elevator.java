package com.techelevator;

public class Elevator {

	//Method Members
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	//Constructor
	public Elevator(int totalNumberOfFloors) {
		totalNumberOfFloors = numberOfFloors;
	}
	
	//Methods
	
	void openDoor() {
		doorOpen = true;
	}
	
	void closeDoor() {
		doorOpen = false;
	}
	
	void goUp(int desiredFloor) {
		if(doorOpen = false) {
			currentFloor = currentFloor + desiredFloor;
		}
	}
	
	void goDown(int desiredFloor) {
		currentFloor = currentFloor - desiredFloor;
	}
	
	
	
	
	
}
