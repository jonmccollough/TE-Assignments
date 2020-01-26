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
		currentFloor = 1;
		numberOfFloors = totalNumberOfFloors;
		doorOpen = false;
	}
	
	//Methods
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if(doorOpen == false) {
			if(desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
			currentFloor = desiredFloor;
			}
		}
	}
	
	public void goDown(int desiredFloor) {
		if(doorOpen == false) {
			if(desiredFloor > 0 && desiredFloor < currentFloor) {
				currentFloor = desiredFloor;
			}
		}
		
	}
	
	
	
	
	
}
