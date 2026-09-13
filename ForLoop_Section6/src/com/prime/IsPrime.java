package com.prime;

public class IsPrime {

	public static void main(String[] args) {

		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
		System.out.println(isPrime(19));
		System.out.println(isPrime(31));
		System.out.println("isPrimee()");
		System.out.println(isPrimee(3));
		System.out.println(isPrimee(37));
		System.out.println(isPrimee(32));
		/** Prime number counter */

		System.out.println("There are " + primeNumberCounter(32) + " Prime numbers");
	}

	public static boolean isPrime(int number) {

		if (number == 2) {
			return true;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*** Another way is to divide by 2 for half iterations */
	public static boolean isPrimee(int number) {

		if (number == 2) {
			return true;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int primeNumberCounter(int number) {
		int count = 0;
		if (number == 2) {
			count += 1;
		}
		for (int i = 2; i <= number / 2; i++) {
//			for (int i = 2; count!=3 && i <= number / 2; i++) {
//			if (count == 3) {
//				break;
//			}
			if (number % i != 0) {
				count++;
			}

		}
		return count;
	}
}
