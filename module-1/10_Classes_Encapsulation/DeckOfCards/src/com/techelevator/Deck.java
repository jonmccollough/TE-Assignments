package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private String typeOfDeck = "straight out of the box";
	
	private List<Card> listOfCards = new ArrayList<Card>();
	
	public Deck() {
		
		String[] suits = { "Clubs","Diamonds","Spades","Hearts" };
		String[] names = {"K","Q","J","2","3","4","5","6","7","8","9","10","A"};
		for ( String suit : suits ) {
			for ( String name : names ) {
				Card newCard = new Card(suit, name);
				listOfCards.add(newCard);
			}
		}
		
	}
	
	public void flip() {
		for ( Card currentCard : listOfCards )
		{
			currentCard.flip();
		}
	}
	
	@Override
	public String toString() {
		this.flip();
		String deckString = "Deck [listOfCards" + listOfCards + "]";
		this.flip();
		return deckString;
	}
	
}
