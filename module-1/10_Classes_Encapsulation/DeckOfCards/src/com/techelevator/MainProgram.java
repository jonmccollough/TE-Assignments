package com.techelevator;

public class MainProgram {

	public static void main(String[] args) {
		
		Card aceOfSpades = new Card("Spades","A");
		
		System.out.println(aceOfSpades);
		aceOfSpades.flip();
		System.out.println(aceOfSpades);
		
		Deck deckOfCards = new Deck();
		System.out.println(deckOfCards);
		
	}

}
