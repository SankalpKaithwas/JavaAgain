package com.sysout;

public class SysoutClass {

	public static void main(String[] args) {
		System.out.println("Hello There! Welocme back");
		int x = 0;
		System.out.println(x);

		boolean isAlien = false;
		if (isAlien != true) {
			System.out.println("Alien");
		} else {
			System.out.println("No No No");
		}

		if (x == 1) {
			System.out.println("True");
		}
		boolean isTrue = false;
		if (isTrue == true) {
			System.out.println("Yes");
		}
		if (!isTrue) {
			System.out.println("No");
		}
		
		/*Ternary Operator */
		isTrue = true;
		if (isTrue ? true: false) {
			System.out.println("Ternary Operator");
		}
		boolean test = true;
		boolean result = test == true ? true : false;
		System.out.println("Result is " + result);
		
		
		double firstValue = 3.00d;
		double secondValue = 80d;
		double calculate = (firstValue + secondValue) * 100d;
		System.out.println(calculate);
		double remainder = calculate % 40.00d;
		System.out.println("Remainder: " + remainder);

		boolean isRemainderZero = (remainder == 0) ? true : false;
		System.out.println("Remainder is " + isRemainderZero);

		if (!isRemainderZero) {
			System.out.println("Got some remainder");
		}
		
		
		
		
		
		
		
	}

}
