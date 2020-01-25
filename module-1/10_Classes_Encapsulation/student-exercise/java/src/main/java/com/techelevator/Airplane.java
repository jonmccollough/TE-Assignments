package com.techelevator;

public class Airplane {
	
	//Data Members
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int availableCoachSeats;
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
		availableFirstClassSeats = ( totalFirstClassSeats - bookedFirstClassSeats);
		return availableFirstClassSeats;
	}
	
	public int getAvailableCoachSeats() {
		availableCoachSeats = ( totalCoachSeats - bookedCoachSeats);
		return availableCoachSeats;
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
			
				if (totalNumberOfSeats >= availableFirstClassSeats) {
				
					totalFirstClassSeats = totalFirstClassSeats - totalNumberOfSeats;
					bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
					
					return true;
			
				} 
			
			//else return false;
			
				}
			
		else if (!forFirstClass){
			
		 	if (totalNumberOfSeats >= availableCoachSeats) {
			
		 			totalCoachSeats = totalCoachSeats - totalNumberOfSeats;
		 			bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
		 			return true;
		 		}
		 		
		 		//else return false;
		 		
		 	}
		return forFirstClass;
		
		
		
	} 
	
	
	
	

}
