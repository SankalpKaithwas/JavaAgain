package com.polymorphism.challenge;

public class Car {

	private String description;

	public Car(String description) {
		super();
		this.description = description;
	}

	public void startEngine() {
		System.out.println("Engine started.");
	}

	public void drive() {
		System.out.println("Car is in Drive mode and driving. type is " + getClass().getSimpleName());
		runEngine();
	}

	protected void runEngine() {
		System.out.println("Car Engine Running.");
	}
}
