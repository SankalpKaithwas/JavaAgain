package com.arrays.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

	public static void main(String[] args) {
		int[] input = getIntegers();
		System.out.println(Arrays.toString(input));

		int min = findMin(input);
		System.out.println(min);

	}

	public static int[] getIntegers() {
		int[] numbers = {};
		System.out.println("Enter any number of Numbers separated by ',' : ");
		try (Scanner scanner = new Scanner(System.in)) {
			String[] number = scanner.nextLine().split(",");
			int[] num = new int[number.length];
			for (int i = 0; i < number.length; i++) {
				num[i] = Integer.parseInt(number[i].trim());
			}
			numbers = num;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return numbers;
	}

	// without using sort
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int num : array) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	/** Simplest way */
//	public static int findMin(int[] array) {
//		int min = 0;
//		Arrays.sort(array);
//		min = array[0];
//		return min;
//	}

}
