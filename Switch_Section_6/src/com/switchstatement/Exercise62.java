package com.switchstatement;

public class Exercise62 {

	public static void main(String[] args) {
		printDayOfWeek(3);
		printfWeekDay(6);
	}

	public static void printDayOfWeek(int day) {

		switch (day) {
		case 0 -> System.out.println("Sunday");
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("WEd");
		case 4 -> System.out.println("Thur");
		case 5 -> System.out.println("Frid");
		case 6 -> System.out.println("Sat");
		default -> throw new IllegalArgumentException("Unexpected value of day: " + day);
		}
		// OR Other way
		String days = null;
		switch (day) {
		case 0 -> days ="Sunday";
		case 1 -> days ="Monday";
		case 2 -> days ="Tuesday";
		case 3 -> days ="WEd";
		case 4 -> days ="Thur";
		case 5 -> days ="Frid";
		case 6 -> days ="Sat";
		default -> throw new IllegalArgumentException("Unexpected value of day: " + day);
		}
		System.out.println("Day of week is: " + days);
		
		// OR another way
		String dayOfWeek = switch (day) {
		case 0 -> {yield "Sunday";}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "WEd";
		case 4 -> "Thur";
		case 5 -> "Frid";
		case 6 -> "Sat";
		default -> throw new IllegalArgumentException("Unexpected value of day: " + day);
		};
		System.out.println(dayOfWeek);
	}

	public static void printfWeekDay(int day) {

		if (day == 0) {
			System.out.println("Sunday");
		} else if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("WEd");
		} else if (day == 4) {
			System.out.println("Thur");
		} else if (day == 5) {
			System.out.println("Frid");
		} else if (day == 6) {
			System.out.println("Sat"); 
		} else System.out.println("Unexpected value of day: " + day);

	}

}
