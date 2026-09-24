package com.autoboxing.unboxing.challenge;

import java.util.ArrayList;

public class TimsBank {

	private String name;
	private ArrayList<TimsCustomer> customers = new ArrayList<>(5000);

	public TimsBank(String name) {
		this.name = name;
	}

	public TimsCustomer getCustomer(String customerName) {
		for (TimsCustomer customer : customers) {
			if (customer.name().equalsIgnoreCase(customerName)) {
				return customer;
			}
		}
		System.out.println("Customer (" + customerName + ") doesn't exists.");
		return null;
	}

	public void addCustomer(String customerName, double inialDeposite) {

		if (getCustomer(customerName) == null) {
			TimsCustomer customer = new TimsCustomer(customerName, inialDeposite);
			customers.add(customer);
			System.out.println("Customer (" + customerName + ") Added Succesfully. Welcome to " + name + " bank.");
		} else {
			System.out.println("Customer " + customerName + " Already exists.");
		}
	}

	public void addTransaction(String customerName, double transaction) {
		TimsCustomer customer = getCustomer(customerName);
		if (customer != null) {
			customer.transcations().add(transaction);
		} else {
			System.out.println("Customer (" + customerName + ") doesn't exists.");
		}
	}

	public void printStatement(String customerName) {
		TimsCustomer customer = getCustomer(customerName);
		if (customer == null) {
			return;
		} else {
			System.out.println("Customer Name: " + customerName + " .");
			System.out.println("Transactions :-> ");
			for (double cust : customer.transcations()) {
				System.out.println(cust);
			}
		}
	}

	@Override
	public String toString() {
		return "TimsBank [name=" + name + ", customers=" + customers + "]";
	}

}
