package com.whileloop;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		int start = 5;
		int end = 20;
		int countOfEven = 0;
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		while (start <= end) {			
			if (isEvenNumber(start)) {
				even.add(start);
				countOfEven += 1;
			} else {
				odd.add(start);
			}
			start++;
			if (countOfEven == 5) {
				break;
			}
		}

		System.out.println("Even numbers: " + even.size()+" Are - " + even);
		System.out.println("Odd numbers: " + odd.size()+" Are - " + odd);

	}

	public static boolean isEvenNumber(int number) {

		boolean isEven = false;
		if (number % 2 == 0) {
			isEven = true;
		}
		return isEven;
	}

}
