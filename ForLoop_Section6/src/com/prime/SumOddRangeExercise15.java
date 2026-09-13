package com.prime;

public class SumOddRangeExercise15 {

	public static void main(String[] args) {
		System.out.println(sumOdd(1, 12));
	}

	public static boolean isOdd(int number) {
		if (number > 0) {
			if (number == 1 || number % 2 != 0) {
				return true;
			} else {
				return false;

			}
		} else
			return false;
	}

	public static int sumOdd(int start, int end) {
		int sum = 0;
		if ((start > 0 && end > 0) && (start <= end)) {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum += i;
				}
			}
		} else {
			sum = -1;
		}
		return sum;
	}

}
