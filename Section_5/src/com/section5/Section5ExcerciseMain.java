package com.section5;

public class Section5ExcerciseMain {

	public static void main(String[] args) {

		int position = calculateHighScorePosition(-50);
		System.out.println(displayHighScorePosition("Jean", position));

		position = calculateHighScorePosition(150);
		System.out.println(displayHighScorePosition("Sean", position));

		System.out.println(1024 % 1024);

		// Exercise 6
		System.out.println(
				"Numbers are equal = " + IsDoubleNumberSameExcersie6.areEqualByThreeDecimalPlaces(1.7324, 1.73356));

		// Exercise 7
		System.out.println(HasTeen.hasTeen(13, 4, 7));
		
		// Exercise55
		System.out.println(Exercise55.convertInchesToCentimeters(68));
		System.out.println(Exercise55.convertToCentimeters(5, 8));

		// Exercise 56
		System.out.println(Exercise56.getDurationString(3945));
		System.out.println(Exercise56.getDurationString(65, 45));
		System.out.println(Exercise56.getDurationString(0, 0));
		System.out.println(Exercise56.getDurationString(-1));
		
		System.out.println(Exercise56.getDurationString(34));
		System.out.println(Exercise56.getDurationString(0));
		System.out.println(Exercise56.getDurationString(-65, 45));
	}

	public static String displayHighScorePosition(String playersName, int position) {

		return playersName + " Managed to get into position '" + position + "' on the high Score List.";
	}

	public static int calculateHighScorePosition(int playerScore) {

		int pScore = 4;

		if (playerScore >= 1000) {
			pScore = 1;
		} else if (playerScore >= 500) {
			pScore = 2;
		} else if (playerScore >= 100) {
			pScore = 3;
		}

		return pScore;
	}

}
