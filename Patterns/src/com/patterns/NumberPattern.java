package com.patterns;

public class NumberPattern {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 8; i++) {
		    n = n * 10 + 9;
		    System.out.printf("%8d%n", n);
		}
	}

}
