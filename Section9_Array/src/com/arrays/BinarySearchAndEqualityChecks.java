package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BinarySearchAndEqualityChecks {

	public static void main(String[] args) {
		int[] array = getRandomArray(16);
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);
//		int index = Arrays.binarySearch(array,23);
		System.out.println(Arrays.toString(array));
		System.out.println("---------------------------");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		Object[] array1 = list.toArray();
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println("---------------------------");

		String[] names = { "Json", "Maddie", "Blake", "David" };
		Arrays.sort(names);// binary search works with sorted arrays
		String search = "Maddie";
		System.out.println("Index of Searched item - " + Arrays.binarySearch(names, "Maddie"));
		if (Arrays.binarySearch(names, search) > 0) {
			System.out.println("Array contains " + search);
		} else {
			System.out.println("Array does not contains " + search);
		}
		
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		int[] array3 = array2;
		System.out.println(Arrays.equals(array2, array3));
		int[] array4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.equals(array2, array4));

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
