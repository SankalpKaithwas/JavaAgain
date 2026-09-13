package com.prime;

import java.util.ArrayList;
import java.util.List;

public class Sum3And5 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		List<Integer> list = new ArrayList<>();
//		for (int i = 1; i <= 1000; i++) {
		for (int i = 1; count < 5 && i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				list.add(i);
				sum += i;
				count++;
			}
		}

		System.out.println("The number that can be divided by 3 and 5 are : " + list.toString());
		System.out.println(
				"Total number that can be divided by 3 and 5 are : " + list.size() + ". Or using count = " + count);
		System.out.println("Sum of number that can be divided by 3 and 5 is : " + sum);

	}

}
