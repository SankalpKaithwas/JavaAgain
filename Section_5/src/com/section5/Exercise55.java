package com.section5;

public class Exercise55 {

	public static double convertInchesToCentimeters(int heightInInches) {
		return heightInInches * 2.54;
	}

	public static double convertToCentimeters(int heightInFeet, int heightInInches) {

		int covertToInch = heightInFeet * 12;
		covertToInch += heightInInches;
		return convertInchesToCentimeters(covertToInch);
	}

}
