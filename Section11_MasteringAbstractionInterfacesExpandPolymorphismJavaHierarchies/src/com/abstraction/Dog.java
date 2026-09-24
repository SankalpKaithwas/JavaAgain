package com.abstraction;

public class Dog extends Mammal {
	/**
	 * Here we extended Mammal as it(Mammal) already extends Animal so, Animal is
	 * automatically extended.
	 */

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
	}

	@Override
	public void move(String speed) {
		if (speed.equals("slow")) {
//			System.out.println(type + " walking");
			System.out.println(getExplicitType() + " walking");
		} else {
//			System.out.println(type + " running");
			System.out.println(getExplicitType() + " running");
		}

	}

	@Override
	public void makeNoise() {
		if (type == "Wolf") {
			System.out.print("Howling! ");
		} else {
			System.out.print("Woof! ");
		}

	}

	@Override
	public void shedHair() {
		System.out.println(getExplicitType() + " shed hair all the time");
	}

}
