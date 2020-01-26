package com.techelevator;

public class Airplane {
	
	//Data Members
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	
	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}

	//Constructor
	public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	//Methods
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		
		if (forFirstClass ){			
			if (totalNumberOfSeats <= totalFirstClassSeats - bookedFirstClassSeats) {
				bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
				return true;
			} 
		} else if (!forFirstClass){
		 	if (totalNumberOfSeats <= totalCoachSeats - bookedCoachSeats) {
		 		bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
		 		return true;
		 	}
		 } return false;
	
	} 
}








