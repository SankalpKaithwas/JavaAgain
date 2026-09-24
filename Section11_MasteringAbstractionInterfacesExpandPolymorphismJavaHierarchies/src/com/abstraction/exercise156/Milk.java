package com.abstraction.exercise156;

public class Milk extends ProductForSale {

	public Milk(String type, double price, String description) {
		super(type, price, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showDetail() {
		System.out.println("Milk Type - " + type);
		System.out.println("Milk Description - " + description);
		System.out.println("Milk price - " + price);

	}

}
