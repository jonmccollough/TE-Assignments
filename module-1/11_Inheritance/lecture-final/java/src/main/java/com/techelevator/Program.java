package com.techelevator;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		boolean keepAskingForBids = true;

		Auction myAuction = new BuyoutAuction("Garbage Can", 100);
		
		System.out.println(myAuction.getItemForSale());
		
		int bidCounter = 0;
		while (bidCounter < 5 && myAuction.isOpen()) {
			System.out.print("Please enter your name: ");
			String bidderName = userInput.nextLine();
			
	
			System.out.print("Please enter your bid amount: ");
			String strBidAmount = userInput.nextLine();
			int bidAmount = Integer.parseInt(strBidAmount);
			
			Bid nextBid = new Bid(bidderName,bidAmount);
			
			myAuction.placeBid(nextBid);
			
			
			System.out.println(nextBid);
			
			System.out.println("High " + myAuction.getHighBid());
			
			System.out.println("All Bids " + myAuction.getAllBids());
			
			bidCounter++;
		}
		
		System.out.println("Congratuations, " + myAuction.getHighBid().getBidder());

	}

}
