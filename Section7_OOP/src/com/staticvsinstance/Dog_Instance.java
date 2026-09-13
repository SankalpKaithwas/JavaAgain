package com.staticvsinstance;

public class Dog_Instance {

	private String name; // not declaring as static but as a REGULAR INSTANCE VARIABLE

	public Dog_Instance(String name) {
		this.name = name; // No warning
	}

//public Dog_Instance(String name) {
//	Dog.name = name; // Accessing in static way gives warnings
//}

	public void printName() {
		System.out.println("name = " + name);
	}
}
