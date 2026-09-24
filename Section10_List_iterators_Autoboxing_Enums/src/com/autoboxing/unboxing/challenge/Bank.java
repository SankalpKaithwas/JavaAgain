package com.autoboxing.unboxing.challenge;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Customer> customers;

	public Bank(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public boolean addCustomer(Customer customer) {

		if (!customers.contains(customer)) {
			customers.add(customer);
			return true;
		} else {
			return true; // already exists
		}
	}

	public void addTransaction(Customer customer, double transaction) {
		if (customers.contains(customer)) {
			customer.getTransactions().add(transaction);
		} else {
			System.out.println("Customer " + name + " doesn't exists.");
		}
	}

	public void printStatement(Customer customer) {
		if (customers.contains(customer)) {
			System.out.println(customer);
		} else {
			System.out.println("Customer " + name + " doesn't exists.");
		}
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", customers=" + customers + "]";
	}

}
