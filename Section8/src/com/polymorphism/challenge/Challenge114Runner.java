package com.polymorphism.challenge;

public class Challenge114Runner {

	public static void main(String[] args) {
//		Car car = new Car("Audi");
//		runRace(car);
//
//		Car lambo = new GasPoweredCar("Lamborgini", 5, 9);
//		runRace(lambo);
//
//		Car tesla = new ElectricCar("Model x", 500, 75);
//		runRace(tesla);
//
//		Car hybrid = new Hybrid("Ferrari SF", 16, 8, 8);
//		runRace(hybrid);
		
		CarFactory factory = new CarFactory();
		Car car = factory.getCar("E");
		car.startEngine();
		car.drive();
		
		
		
	}

	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}

}
