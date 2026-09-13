package com.inheritance;

public class Dog extends Animal {

	private String earShape;
	private String tailShape;

	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}
	/** We can pass values using enhanced if else as done above */

	/**
	 * We can create constructor using constructor chaining like below -> 
	 * Below constructor is calling the 4 args constructor with some default values
	 */
	public Dog(String type, double weight) {
		this(type, weight, "Perky", "Fluffy");
	}

//	public Dog() {   // Commented for default values constructor - super("Asiatic Lion", "Biggest", 300)
//		super();
//	}

	/**
	 * If we do like this then we don't need not have no args constructor otherwise
	 * default passed values will not be use
	 */
	// Do Above OR we can pass default values too in the super i.e. for Animal
	public Dog() {
		super("Pomeranian", "Small", 80);
	}

	@Override
	public String toString() {
		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape+ "]";
	}
	
//	@Override
//	public String toString() {
//		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString() + "]";
//	}
	/**
	 * super.toString() can be used to call super classes toString(). There are
	 * options available during Refactor
	 */

	public void makeNoise() {
		if(type == "wolf") {
			System.out.println("Wolf Howls");
		}
		bark();
		System.out.println();
	}

	@Override
	public void move(String speed) {
		super.move(speed);
		System.out.println("We just overrided the Animal class \"move\" method");
		if(speed == "slow") {
			walk();
		}else {
			bark();
			run();
		}
	}
	
	private void bark() {
		System.out.print("Dog barks Woof Woof. ");
	}
	
	private void run() {
		System.out.print("Dog is running. ");
	}
	
	private void walk() {
		System.out.print("Dog is walking. ");
	}
	
	
}
