package com.polymorphism.challenge;

public class GasPoweredCar extends Car {

	private double avgKmPerLitre;
	private int cylinders = 6;

	public GasPoweredCar(String description) {
		super(description);
	}

	public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		System.out.println("'Ignition'. Car is ready to balst off. Cylinders working = " + cylinders);
	}

	

	@Override
	protected void runEngine() {
		System.out.printf("Gas usage exceeds the average: %.2f %n", avgKmPerLitre);
	}

}
