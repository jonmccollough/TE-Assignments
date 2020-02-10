package com.techelevator;

public class Card {
	
	private String name;
	private String suit;
	private boolean faceUp = false;
	
	public Card(String suit, String name) {
		this.suit = suit;
		this.name = name;
	}
	
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
	
	@Override
	public String toString() {
		if (faceUp) {
			return suit + " " + name;
		}
		return "####";
	}
	
	public String getSuitColor() {
		if ( suit.equals("Clubs") || suit.equals("Spades") ) {
			return "Black";
		}
		else return "Red";
		
	}

	public String getName() {
		return name;
	}

	public String getSuit() {
		return suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}	
	
}
