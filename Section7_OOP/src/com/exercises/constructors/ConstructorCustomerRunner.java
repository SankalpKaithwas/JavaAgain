package com.exercises.constructors;

public class ConstructorCustomerRunner {

	public static void main(String[] args) {
		Customer customer = new Customer("Emma", 111110, "Emma@email.com");
		
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmailAddress());
		
		Customer customerTwo = new Customer("Dolly", "Dollysemail@email.com");
		System.out.println(customerTwo.getCreditLimit());
		System.out.println(customerTwo.getName());
		
		Customer customerThree = new Customer();
		System.out.println(customerThree.getCreditLimit());
		System.out.println(customerThree.getName());
		System.out.println(customerThree.getEmailAddress());
		
		
	}

}
