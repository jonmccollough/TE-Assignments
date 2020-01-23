package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	public int getTotalNumberOfItems() {
		return this.totalNumberOfItems;
	}
	
	public double getTotalAmountOwed() {
		return this.totalAmountOwed;
	}
	
	//Methods
	
	public double getAveragePricePerItem() {
		
		
		
		if(totalAmountOwed == 0.0 && totalNumberOfItems == 0.0) {
			
			return 0;
			
		} else {
			
		return totalAmountOwed / totalNumberOfItems;
		
		} 
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		
		totalNumberOfItems += numberOfItems;
		
		totalAmountOwed += (pricePerItem * numberOfItems);
		
	}
	
	public void empty() {
		
		totalNumberOfItems = 0;
		totalAmountOwed= 0.00;
		
	}
	
	
}
