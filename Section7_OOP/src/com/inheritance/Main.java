package com.inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Lion", "Big", 200);		
		doSomeStuff(animal, "Roar");
		System.out.println("****************");
		Dog dog = new Dog();
		doSomeStuff(dog, "Laugh"); // we can pass dog as its type is animal
		System.out.println("****************");
		Dog yorkie = new Dog("Yorkie", 16);
		doSomeStuff(yorkie, "Bark");
		System.out.println("****************");
		Dog shephard = new Dog("Shephard", 36, "Straight", "Curly");
		doSomeStuff(shephard, "Wag the tail");
		
		Dog wolf = new Dog("Wolf", 380);
		doSomeStuff(wolf, "Eating");
		
		
	}
	
	public static  void doSomeStuff(Animal animal,String stuff) {
		animal.makeNoise();
		animal.move("Very fast");
		animal.move("slow");
		System.out.println();
		System.out.println(animal + " is " +  stuff);
	}

}
