package com.scanner;

import java.util.Scanner;

public class MinAndMax_Exercise77 {

	public static void main(String[] args) {

		int loopCount = 0;
		double min = 0;
		double max = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter a number to find Min and Max Or a Character to quit: ");
				String num = scanner.nextLine();
				double number = Double.parseDouble(num);

				if (loopCount == 0 || number < min) {
					min = number;
				}

				if (loopCount == 0 || number > max) {
					max = number;
				}
				loopCount++;
			}
		} catch (Exception e) {
			System.out.println("Quiting. Game Over.");
		}

		if (loopCount > 0) {
			System.out.println("Min: " + min + " and Max: " + max);
		} else {
			System.out.println("No valid data entered by the user");
		}
	}

}
