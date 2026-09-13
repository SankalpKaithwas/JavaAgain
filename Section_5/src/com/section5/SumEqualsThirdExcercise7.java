package com.section5;

public class SumEqualsThirdExcercise7 {
	public static boolean hasEqualSum(int numOne, int numTwo, int numThree){
        boolean isSumEqual = false;
        if((numOne + numTwo) == numThree){
            isSumEqual = true;
        } 
        return isSumEqual;
    }
}
