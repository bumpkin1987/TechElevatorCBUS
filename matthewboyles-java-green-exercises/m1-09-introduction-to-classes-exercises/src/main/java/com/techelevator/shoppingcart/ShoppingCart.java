package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.0;
	
	
	public double getAveragePricePerItem() {
		if (totalNumberOfItems != 0 ) {
			return totalAmountOwed / totalNumberOfItems;
		}
		else {
			return 0;
		}
				
	}
	public void addItems(int numberOfItems, double pricePerItem) {
		this.totalNumberOfItems = totalNumberOfItems + numberOfItems;
		this.totalAmountOwed = (pricePerItem * numberOfItems) + totalAmountOwed;
		
	}
	public void empty() {
		this.totalAmountOwed = 0.0;
		this.totalNumberOfItems = 0;
	}
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	

}
