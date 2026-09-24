package com.autoboxing.unboxing.challenge;

import java.util.ArrayList;

public class AutoboxingChallenge147Runner {

	public static void main(String[] args) {
		Bank bank = new Bank("HDFC");
		ArrayList<Double> trans = new ArrayList<>();
		for (double i = 1; i < 5.0; i++) {
			trans.add(1000 * i);
		}

		Customer customer = new Customer("Jason", trans);
		System.out.println(customer);
		bank.addCustomer(customer);
		Customer emma = new Customer("Emma", trans);
		bank.addCustomer(emma);
		System.out.println(emma);
		bank.addTransaction(emma, 8000.0);
		System.out.println(emma);
		System.out.println(bank);
	}

}
