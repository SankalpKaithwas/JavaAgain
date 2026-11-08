package com.experiments;

public class Main {

	public static void main(String[] args) {

		Animal[] animals = { new Dog(), new Cat() };
		// Can have classes as an array item.
		/**
		 * This way we don't have to create cat and dog object w times. Animal is the
		 * only 1 we need
		 */
		for (Animal animal : animals) {
			animal.voice();
		}

	}

}
