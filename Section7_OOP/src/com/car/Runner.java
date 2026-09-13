package com.car;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColour("Blue");
		car.setModel("Explorer");
		car.setMake("Ford");
		car.setConvertible(true);
		car.setDoors(4);
		
		System.out.println("Make: " + car.getMake() + ", Model: " + car.getModel() + ", Colour: " + car.getColour()
		+ ", IsConvertible: " + car.isConvertible() + ", Doors: " + car.getDoors());
		
		System.out.println(car.toString());

	}

//	private static void getCarDetails() {
//		System.out.println("Make: " + car.getMake() + ", Model: " + car.getModel() + ", Colour: " + car.getColour()
//				+ ", IsConvertible: " + car.isConvertible() + ", Doors: " + car.getDoors());
//	}

}
