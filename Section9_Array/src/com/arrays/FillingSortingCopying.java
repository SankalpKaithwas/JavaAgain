package com.arrays;

import java.util.Arrays;
import java.util.Random;

public class FillingSortingCopying {

	public static void main(String[] args) {
		int[] array = getRandomArray(16);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		int[] array1 = new int[10];
		System.out.println(Arrays.toString(array1));
		Arrays.fill(array1, 9); // fill all indexes with 9
		System.out.println(Arrays.toString(array1));
		
		int[] array2 = getRandomArray(16);
		System.out.println(Arrays.toString(array2));
		int[] array3 = Arrays.copyOf(array2, array2.length);
		System.out.println(Arrays.toString(array3));
		
		Arrays.sort(array3);
		System.out.println(Arrays.toString(array3));

	}

	public static int[] getRandomArray(int length) {
		Random random = new Random();
		int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			numbers[i] = random.nextInt(1, 20);
		}

		return numbers;
	}

}
