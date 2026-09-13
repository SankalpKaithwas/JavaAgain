package com.section5;

public class IsDoubleNumberSameExcersie6 {

	public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
		boolean isSame = false;
		long numOneRound = (long) (numberOne * 1000);
		long numTwoRound = (long) (numberTwo * 1000);

		if (numOneRound == numTwoRound) {
			isSame = true;
		}
		return isSame;
	}

}
