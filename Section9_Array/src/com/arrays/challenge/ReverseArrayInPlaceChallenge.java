package com.arrays.challenge;

import java.util.Arrays;
import java.util.Random;

public class ReverseArrayInPlaceChallenge {

	public static void main(String[] args) {

//		reverseArray();
		int[] numbers = getRandomArray(13);
		int[] reversedCopy = reverseCopy(numbers);
		System.out.println("Input array " + Arrays.toString(numbers));
		System.out.println("reversedCopy " + Arrays.toString(reversedCopy));

	}

	// My imple
	public static void reverseArray() {
//		int[] numbers = new int[] { 199, 4, 5, 6, 8, 1, 4, 67, 9, 45 };
		int[] numbers = getRandomArray(13);
		System.out.println(Arrays.toString(numbers));
		int[] reverse = new int[numbers.length];
		for (int i = numbers.length - 1; i >= 0; i--) {
			reverse[numbers.length - i - 1] = numbers[i];
		}
		System.out.println(Arrays.toString(reverse));
	}

	public static int[] getRandomArray(int length) {
		int[] array = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(1, 19);
//			array[i] = random.nextInt(-91, 19);  // works for -ive values to +ive  values
		}
		return array;
	}

	/** Below are Tim's methods */
	private static void reverse(int[] array) {

		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;

		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
			System.out.println("--> " + Arrays.toString(array));
		}
	}

	private static int[] reverseCopy(int[] array) {

		int[] reversedArray = new int[array.length];
		int maxIndex = array.length - 1;
		for (int el : array) {
			reversedArray[maxIndex--] = el;
		}

		return reversedArray;
	}

}
