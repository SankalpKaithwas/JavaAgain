package com.abstraction.exercise156;

public abstract class ProductForSale {

	protected String type;
	protected double price;
	protected String description;

	public ProductForSale(String type, double price, String description) {
		super();
		this.type = type;
		this.price = price;
		this.description = description;
	}

	public double getSalePrice(double quantity) {
		return (quantity * price);
	}

	public void printPricedItem(int quantity) {
		System.out.println(type + " - " + description + " - " + price + " quantity - " + quantity );
	}

	public abstract void showDetail();
}
