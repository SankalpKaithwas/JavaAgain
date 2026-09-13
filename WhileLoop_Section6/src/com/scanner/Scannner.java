package com.scanner;

import java.util.Scanner;

public class Scannner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name:");
		try {
			String name = scanner.nextLine();
			System.out.println(name.toString());
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			scanner.close();
		}

	}

}
