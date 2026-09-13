package com.switchstatement;

public class Switch {

	public static void main(String[] args) {

		int switchValue = 2;

		// Default switch cases
		switch (switchValue) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Two");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + switchValue);
		}

//		Enhanced Switch statements
		switch (switchValue) {
		case 1 -> System.out.println("One");
		case 2 -> System.out.println("Two");
		case 3, 4, 5 -> {
			System.out.println("Three");
			System.out.println("Four");
			System.out.println("Five");
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + switchValue);
		}

		String month = "OCTOBER";
		System.out.println(month + " is in the " + getQuarter(month) + " quarter");

	}

	public static String getQuarter(String month) {
		/** This method is returning a string thats why we have started switch with return (return switch*/
		return switch (month) {
		case "JANUARY", "FEBRUARY", "MARCH" -> {
			yield "1st";
		}
		case "APRIL", "MAY", "JUNE" -> "2nd";
		case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
		case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
		default -> {
			String badResponse = month + " is bad";
			yield badResponse;
			/**
			 * yield is used as a "return" keyword (return needs to be used outside a CODE
			 * BLOCK in a switch expression), but yield is used if some calculations are
			 * required for switch statements as it can be inside a code block to return
			 * something within switch statement block. yield "MUST BE USED" inside a code
			 * block{yield something}
			 */
		}
		};
	}

}
