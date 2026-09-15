package com.arrays;

public class ArrayVarArgs {

	public static void main(String[] args) {
		System.out.println("Hello World again");

		String[] splitStrings = "Hello World again".split(" ");
		printText(splitStrings);

		System.out.println("_".repeat(20));
		printText("Hello");

		System.out.println("_".repeat(20));
		printText("Hello", "World", "again");

		System.out.println("_".repeat(20));
		printText();

		String[] sArray = { "first", "second", "third", "fourth", "fifth" };
		System.out.println(String.join(",", sArray));
	}

	/** Variable args - String... */
	private static void printText(String... textList) {

		for (String t : textList) {
			System.out.println(t);
		}
	}
	
	// var args must be last in a method
//	private static void printText(String name, String... textList) {
//
//		for (String t : textList) {
//			System.out.println(t);
//		}
//	}

}
