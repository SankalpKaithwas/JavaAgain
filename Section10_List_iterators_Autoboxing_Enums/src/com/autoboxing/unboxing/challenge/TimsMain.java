package com.autoboxing.unboxing.challenge;

public class TimsMain {

	public static void main(String[] args) {
		TimsCustomer max = new TimsCustomer("Max", 2000);
		System.out.println(max);
		
		TimsBank bank = new TimsBank("IDFC");
		bank.addCustomer("Mark", 9000.0);		
		System.out.println(bank);
		bank.addTransaction("Mark", 10000);
		bank.addTransaction("Mark", 200);
		bank.addTransaction("Mark", 500);
		bank.addTransaction("Mark", 15);		
		bank.printStatement("Mark");
		
		bank.addCustomer("Ben", 34);
		bank.addTransaction("Ben", 15);		
		bank.printStatement("Ben");
	}

}
