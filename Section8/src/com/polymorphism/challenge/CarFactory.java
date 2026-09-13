package com.polymorphism.challenge;

public class CarFactory {

	public static Car getCar(String type) {

		return switch (type.toUpperCase().charAt(0)) {
		case 'G' -> new GasPoweredCar(type);
		case 'H' -> new Hybrid(type);
		case 'E' -> new ElectricCar(type);
		default -> new Car(type);
		};
		// above is example of Factory methods
		// not implemented
	}
}
