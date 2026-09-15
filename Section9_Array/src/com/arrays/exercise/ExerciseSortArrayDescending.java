package com.arrays.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciseSortArrayDescending {

	public static void main(String[] args) {
		int[] input = getIntegers(5);
		printArray(input);
		Arrays.sort(input);
		int[] sorted = sortIntegers(input);
		System.out.println(Arrays.toString(sorted));
	}

	public static int[] getIntegers(int arraySize) {
		System.out.printf("Enter %d Number: ", arraySize);
		int[] array = new int[arraySize];
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i < arraySize; i++) {
				int num = Integer.parseInt(input.nextLine());
				array[i] = num;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Element %d contents %d %n", i, array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = array.length - 1; i >= 0; i--) {
			list.add(array[i]);
		}
		int[] decreasingOrderArray = list.stream().mapToInt(Integer::intValue).toArray();

		return decreasingOrderArray;
	}

}
