package com.abstraction.exercise156;

import java.util.ArrayList;

public class Store {

	private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

	public static void main(String[] args) {

		storeProducts.add(new Milk("Skimmed", 40, "No fat milk"));
		storeProducts.add(new Milk("Full Cream", 30, "Regular Milk"));
		storeProducts.add(new Milk("Skimmed Pasturised", 50, "Pasturised"));
		storeProducts.add(new Milk("Cows Skimmed Pasturised", 70, "Pasturised"));
		storeProducts.add(new Milk("Cows Full Cream", 60, "Regular Milk"));
		storeProducts.add(new Milk("Cows Skimmed", 50, "No fat milk"));
		listProducts();

		System.out.println("\nOrder 1");
		var order1 = new ArrayList<OrderItem>();
		addItem(order1, 1, 2);
		addItem(order1, 0, 1);
		printOrder(order1);

		System.out.println("\nOrder 2");
		var order2 = new ArrayList<OrderItem>();
		addItem(order2, 3, 5);
		addItem(order2, 0, 1);
		addItem(order2, 2, 1);
		printOrder(order2);
	}

	public static void addItem(ArrayList<OrderItem> orderItem, int orderIndex, int quantity) {
		orderItem.add(new OrderItem(storeProducts.get(orderIndex), quantity));
	}

	public static void listProducts() {
		for (var item : storeProducts) {
			System.out.println("-".repeat(20));
			item.showDetail();
		}
	}

	public static void printOrder(ArrayList<OrderItem> order) {
		double salesValue = 0;

		for (var item : order) {
			item.getProductForSale().printPricedItem(item.getQuantity());
			salesValue += item.getProductForSale().getSalePrice(item.getQuantity());
		}

		System.out.println("Sales Total value: " + salesValue);
	}

}
