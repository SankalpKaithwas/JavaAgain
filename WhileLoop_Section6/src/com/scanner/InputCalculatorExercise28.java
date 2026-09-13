package com.scanner;

import java.util.Scanner;

public class InputCalculatorExercise28 {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		long avg = 0;
		int count = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter a number: ");
				String input = scanner.nextLine();
				try {
					double num = Double.parseDouble(input);
					count++;
					sum += num;
					avg = Math.round(sum / count);
				} catch (NumberFormatException e) {
					System.out.println("SUM = " + sum + " AVG = " + avg);
					break;
				}

			}
		} catch (Exception e) {
			throw e;
		}
	}

}
