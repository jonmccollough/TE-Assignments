package com.techelevator;

public class FruitTree {
	
	//Data Members
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	//private int startingPiecesOfFruit;
	
	public String  getTypeOfFruit() {
		return this.typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft() {
		return this.piecesOfFruitLeft;
	}
	
	//Constructor
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	//Method
	public boolean pickFruit(int numberOfPiecesToRemove){
		if (numberOfPiecesToRemove <= piecesOfFruitLeft) {
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
			
		} else return false;
		
	}
	

}
