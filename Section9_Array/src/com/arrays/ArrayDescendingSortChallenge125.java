package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayDescendingSortChallenge125 {

	public static void main(String[] args) {

		/** Tim imple */
		int[] unsortedArray = getRandomArray(5);
		System.out.println(Arrays.toString(unsortedArray));

		int[] sortedArray = sortIntegers(new int[] { 7, 30, 35 });
		System.out.println(Arrays.toString(sortedArray));
		/** Tim imple Ends */

		/** My imple */
		int[] number = getRandomArray(10);
		System.out.println("Unsorted Array: " + Arrays.toString(number));
		Arrays.sort(number);
		System.out.println("Sorted Array: " + Arrays.toString(number));
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = number.length - 1; i >= 0; i--) {
			list.add(number[i]);
		}
		
//		Object[] decreasingOrderArray = list.toArray(); // this will return Object type array
		int[] decreasingOrderArray = list.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(decreasingOrderArray));
		
		// Or a method - 		
		System.out.println(Arrays.toString(getArrayFromList(list)));
		/** My imple ends */
	}

	/** My imple */
	public static int[] getRandomArray(int length) {
		int[] array = new int[length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(1, 19);
//			array[i] = random.nextInt(-91, 19);  // works for -ive values to +ive  values
		}
		return array;
	}

	/** Tim imple - Maybe needs to like this if don't wanna use list */

	private static int[] sortIntegers(int[] array) {

		System.out.println(Arrays.toString(array));
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) { // 1,2,3,4,5,6
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
					System.out.println("----->" + Arrays.toString(sortedArray));
				}
			}
			System.out.println("-->" + Arrays.toString(sortedArray));
		}

		return sortedArray;
	}

	/** My method */
//	public static int[] getArrayFromList(List list) {   // if we pass just List then we will get casting error
	public static int[] getArrayFromList(List<Integer> list) {
		int[] decreasingOrderArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			decreasingOrderArray[i] = list.get(i);
		}
		return decreasingOrderArray;
	}

}
