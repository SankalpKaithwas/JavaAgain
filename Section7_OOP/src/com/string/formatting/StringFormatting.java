package com.string.formatting;

public class StringFormatting {

	public static void main(String[] args) {
		String bulletIt = "Print a Bulleted List:\n" + "\t\u2022 First Point\n" + "\t\t\u2022 Sub Point";

		System.out.println(bulletIt);

		String textBlock = """

				Print a Bulleted List:
				    \u2022 First Point
				        \u2022 Sub Point""";

		System.out.println(textBlock);

		int age = 35;
		System.out.printf("Your age is %d%n", age);

		int yearOfBirth = 2023 - age;
		System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
		System.out.printf("Your age is %.2f%n", (float) age);

		for (int i = 1; i <= 100000; i *= 10) {
			System.out.printf("Printing %6d %n", i);
			/**
			 * %6 means the string will take 6 width or 6 text positions(space). SO for only
			 * "1" - 5 blank spaces will be added as its taking only 1 space(text position),
			 * for "100" - 3 blank spaces will be added and so on as required. So "100000"
			 * will take full 6 width so no spaces will be added
			 */
		}

		String formattedString = String.format("Your age is %d", age);
		System.out.println(formattedString);

		formattedString = "Your age is %d".formatted(age);
		System.out.println(formattedString);



	}

}
