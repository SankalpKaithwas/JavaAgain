package com.whileloop;

public class DigitSum {

	public static void main(String[] args) {
		System.out.println("Sum of Digits is: " + sumDigits(1234));
	}

	public static int sumDigits(int number) {
		int sum = 0;
		if (number < 0) {
			sum = -1;
		}
		while (number > 0) {
			int rem = number % 10;// 12345
			sum += rem;
			number = number / 10;
		}

		return sum;
	}
}
