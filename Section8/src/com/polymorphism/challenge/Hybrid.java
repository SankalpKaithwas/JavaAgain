package com.polymorphism.challenge;

public class Hybrid extends Car {

	private double avgKmPerLitre;
	private int cylinders;
	private int batterySize;

	public Hybrid(String description) {
		super(description);
	}

	public Hybrid(String description, double avgKmPerLitre, int cylinders, int batterySize) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
		this.batterySize = batterySize;
	}
	
	
	@Override
	public void startEngine() {
		System.out.printf("Hybrid %d cylinders are fired up.%n", cylinders);
		System.out.printf("Electric Cars %d kwh battery is Ready For Drive.%n", batterySize);
	}

	

	@Override
	protected void runEngine() {
		System.out.printf("Gas usage exceeds the average: %.2f %n", avgKmPerLitre);
	}

}
