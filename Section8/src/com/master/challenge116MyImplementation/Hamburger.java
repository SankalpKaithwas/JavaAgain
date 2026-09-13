package com.master.challenge116MyImplementation;

public class Hamburger {

	private String type;
	private int basePrice;
	private int toppings = 1; // maximum ould be 3

	public Hamburger(String type, int price) {
		this.type = type;
		this.basePrice = price;
	}

	// types capsicum, Mushrooms, Olives
	public void addExtraToppings(String type) {
		while (toppings < 4) {
			switch (type) {
			case "capsicum":
				System.out.println("Capsicum added");
				basePrice += 5;
			case "Mushrooms":
				System.out.println("Mushrooms added");
				basePrice += 10;
			case "Olives":
				System.out.println("Olives added");
				basePrice += 15;
			default:
				System.out.println("Onions added");
			}
			toppings++;
		}
	}
	
	public void orderDeluxBurger() {
		addExtraToppings(type);
		basePrice=25;
	}
	

}
