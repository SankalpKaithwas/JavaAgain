package com.list.arraylist.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListChallenge138 {

	public static void main(String[] args) {
		List<String> listOfItems = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			boolean flag = true;
			while (flag) {
				System.out.print("""
						Available Actions: 
						0 - to shutdown 
						1 - to add item(s) to list (comma delimited list) 
						2 - to remove any item(s) (comma delimited list) 
						Enter a number for which action you want to do:""");
				String input = scanner.nextLine();
				switch (input) {
				case "0" -> {
					System.out.println("Exited");
					flag = false;
				}
				case "1" -> addItems(listOfItems, scanner);
				case "2" -> removeItems(listOfItems, scanner);
				default -> System.out.println("Invalid option. Please enter 0, 1, or 2.\\n");
				}
			}
		}
		
		
//		geminiMethod();
	}

	public static void removeItems(List<String> listOfItems, Scanner scanner) {
		System.out.println("Enter all items separated by \",\" ");
		String item = scanner.nextLine();
		String[] values = item.split("\\s*,\\s*");
		listOfItems.removeAll(List.of(values));
		listOfItems.sort(Comparator.naturalOrder());
		System.out.println(listOfItems);
	}

	public static void addItems(List<String> listOfItems, Scanner scanner) {
		System.out.println("Enter all items separated by \",\" ");
		String[] item = scanner.nextLine().split(",");
//					String[] values = item.split("\\s*,\\s*"); // can do this, then no need of line 33
//					String[] values = item.split(",");
		for (String val : item) {
			String trimmed = val.trim();
			if (!listOfItems.contains(trimmed)) {
				listOfItems.add(trimmed);
			}
		}
		listOfItems.sort(Comparator.naturalOrder());
		System.out.println(listOfItems);
	}

	/** Gemini method */
	public static void geminiMethod() {

		// TreeSet automatically prevents duplicates and maintains natural alphabetical
		// order
		Set<String> items = new TreeSet<>();

		try (Scanner scanner = new Scanner(System.in)) {
			boolean running = true;
			while (running) {
				System.out.print("""
						Available Actions:
						0 - to shutdown
						1 - to add item(s) to list (comma delimited list)
						2 - to remove any item(s) (comma delimited list)
						Enter a number for which action you want to do:\s""");

				String choice = scanner.nextLine().strip();

				switch (choice) {
				case "0" -> {
					System.out.println("Exited");
					running = false;
				}
				case "1" -> {
					System.out.println("Enter all items separated by \",\" ");
					String[] values = scanner.nextLine().strip().split("\\s*,\\s*");
					items.addAll(Arrays.asList(values));
					System.out.println(items);
				}
				case "2" -> {
					System.out.println("Enter all items separated by \",\" ");
					String[] values = scanner.nextLine().strip().split("\\s*,\\s*");
					items.removeAll(Arrays.asList(values));
					System.out.println(items);
				}
				default -> System.out.println("Invalid option. Please enter 0, 1, or 2.\n");
				}
			}
		}

	}

}
