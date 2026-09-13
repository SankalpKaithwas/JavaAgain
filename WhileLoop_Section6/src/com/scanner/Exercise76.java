package com.scanner;

import java.util.Scanner;

public class Exercise76 {

	public static void main(String[] args) {

//		try (Scanner scanner = new Scanner(System.in)) {
//			int countOfNumber = 1;
//			int sumOfNumber = 0;
//			while (countOfNumber <= 5) {
//				System.out.println("Enter " + countOfNumber + " Number");
//				try {
//					int number = Integer.parseInt(scanner.nextLine());
//					countOfNumber++;
//					sumOfNumber += number;
//				} catch (NumberFormatException e) {
//					System.out.println("Invalid Number");
//				}
//			}
//			System.out.println("Sum of entered number is: " + sumOfNumber);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		SumOfNumber_MyMethod();

	}

	/** Dont use  int number = scanner.nextInt();*/
	public static void SumOfNumber_MyMethod() {
		try (Scanner scanner = new Scanner(System.in)) {
			int countOfNumber = 1;
			double sumOfNumber = 0;
			do {
				System.out.println("Enter " + countOfNumber + " Number");
				try {
//					int number = scanner.nextInt();   /* Dont Use - This results in exception if input is 'char' */
//					int number = Integer.parseInt(scanner.nextLine());
					double number = Double.parseDouble(scanner.nextLine());
//					if (number < 0) {
//						System.out.println("Invalid Number");
//						continue;
//					}
					countOfNumber += 1;
					sumOfNumber += number;
				} catch (NumberFormatException e) {
					System.out.println("Invalid Number");
				}
			} while (countOfNumber <= 5);
			System.out.println("Sum of entered number is: " + sumOfNumber);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
