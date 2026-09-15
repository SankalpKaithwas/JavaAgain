package com.arrays;

import java.util.Arrays;

public class ArrayRunner {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		numbers[6] = 7;
		double[] num = new double[5];
		num[4] = 4.9;

		System.out.println(numbers[6] + " and " + num[4]);

		double[] num2 = new double[] { 1, 2, 3, 4, 5 };// array initializer
		int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // anonymous array
		System.out.println(num2[3]);
		System.out.println(numbers1[3]);
		System.out.println(numbers1.length);
		System.out.println(numbers1[numbers1.length - 1]);

		for (int numb : numbers1) {
			System.out.print(numb);
			System.out.println();
		}
		System.out.println("----------------------------");
		int[] loopArray = new int[10];
		for (int i = 0; i < 10; i++) {
			loopArray[i] = i + 2;
		}
		for (int numb : loopArray) {
			System.out.println(numb);
		}

		System.out.println("LoopArray => " + Arrays.toString(loopArray));

		Object object = loopArray;
		if (object instanceof int[]) {
			System.out.println("object is an array");
		}

		// we can assign any type using Object but it is not a good practice.
		/** An array can be treated like any other object instance in Java */
		Object[] objArray = new Object[4];
		objArray[0] = "String";
		objArray[1] = 1;
		objArray[2] = new StringBuilder("String Builder");
		objArray[3] = Arrays.toString(num2);
		System.out.println("Object Array with any type - " + Arrays.toString(objArray));
		for (Object numb : objArray) {
			System.out.println(numb);
		}
	}

}
