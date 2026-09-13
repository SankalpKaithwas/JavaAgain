package com.staticvsinstance;

public class Dog {
	private static String name;

//	public Dog(String name) {
//		this.name = name; // here we will get  warning to access in static way (Dog.name = name;)
//	}

	public Dog(String name) {
		Dog.name = name; // Accessing in static way gives no warnings
	}
	
	public void printName() {
        System.out.println("name = " + name);
    }

}
