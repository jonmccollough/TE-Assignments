package com.techelevator;

public class Television {

	
	//Method Members
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	
	public boolean isOn() {
		return isOn = true;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	//Constructor
	public Television() {
		isOn = false;
		currentChannel = 3;
		currentVolume = 2;
	} 	
	
	//Methods
	
	public void turnOff() {
		isOn = false;
	}
	
	
	public void turnOn() {
			isOn = true;
			currentChannel = 3;
			currentVolume = 2;
	}
	
    public void changeChannel(int newChannel) {
    	if( currentChannel >= 3 && newChannel <= 18) {
    		currentChannel = newChannel;
    	}
    }
    
    public void channelUp() {
    	if (isOn) {
    	currentChannel = currentChannel +1;
    	if(currentChannel > 18) {
    		currentChannel = 3;
    	}
    	} ;
    }
    
    public void channelDown() {
    	if (isOn) {
    	currentChannel = currentChannel - 1;
    	if(currentChannel < 3) {
    		currentChannel = 18;
    	}
    	}
    }
    
    public void raiseVolume() {
    	if (isOn) {
    	currentVolume = currentVolume + 1;
    	if(currentVolume > 10) {
    		currentVolume = 10;}
    	}
    }
    
    public void lowerVolume() {
    	if(isOn) {
    	currentVolume = currentVolume - 1;
    	if(currentVolume < 0) {
    		currentVolume = 0;}
    	}
    }
	
    
}
