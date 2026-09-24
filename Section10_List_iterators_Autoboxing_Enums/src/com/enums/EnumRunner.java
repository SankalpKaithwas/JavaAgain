package com.enums;

import java.util.Random;

public class EnumRunner {

	public static void main(String[] args) {

		DayOfWeek week = DayOfWeek.WED;
		System.out.println(week);

		for (int i = 0; i < 10; i++) {
			week = getRandomDay();
//			System.out.println("Ordinal: " + week.ordinal() + " Name is " + week.name());
//			if (week == DayOfWeek.WED) {
//				System.out.println("Its Wednesday!");
//			}
			switchDayOfTheWeek(week);
		}

		for (Toppings topping : Toppings.values()) {
			System.out.println(topping.name() + " : " + topping.getPrice());
		}

	}

	public static DayOfWeek getRandomDay() {
		int randomInteger = new Random().nextInt(7);
		var allDays = DayOfWeek.values();
		return allDays[randomInteger];
	}

	public static void switchDayOfTheWeek(DayOfWeek weekDay) {
		int weekDayOrdinal = weekDay.ordinal() + 1;
		switch (weekDay) {
		case WED -> System.out.println("Wednesday is Day " + weekDayOrdinal);
		case FRI -> System.out.println("Friday is Day " + weekDayOrdinal);
		case SUN -> System.out.println("Sunday is Day " + weekDayOrdinal);
		default -> System.out.println(
				weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "Day is Day " + weekDayOrdinal);
		}
	}
}
