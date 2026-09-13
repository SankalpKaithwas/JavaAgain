package com.exercises.constructors;

public class Customer {

	/** Constructor Chaining */
	
	private String name;
	private int creditLimit;
	private String emailAddress;

	// 1. Constructor for all three fields (assigns directly to instance fields)
	public Customer(String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	// 2. No-args constructor that calls another constructor(3rd) with literal
	// default values
	public Customer() {
		this("Json", "Json@Eamil.com");
	}

	// 3. Constructor with name and email parameters (chains to the 3-arg
	// constructor)
	public Customer(String name, String emailAddress) {
		this(name, 10022, emailAddress);
	}

	public String getName() {
		return name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
