package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	//private String letterGrade;

	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public int getEarnedMarks() {
		return this.earnedMarks;
	}
	
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
		
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}


	
	public String getLetterGrade() {
		
		if ((  earnedMarks * 10 ) >= (possibleMarks * 9) ) {
			
			return "A";
					
		}else if ( (earnedMarks * 10) >= (possibleMarks * 8))  {
			
			return "B";
			
		} else if ( (earnedMarks * 10 ) >= (possibleMarks * 7) ) {
			
			return "C";
			
		} else if  ( (earnedMarks * 10 ) >= (possibleMarks * 6) ) {
			
			return "D";
	
		} else return "F";
		
	
	}
	
	
	

}
