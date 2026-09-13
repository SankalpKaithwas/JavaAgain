package com.section5;

import java.util.List;

public class HasTeen {
	public static boolean hasTeen (int num1, int num2, int num3){
	    List<Integer> numb = List.of(13, 14, 15, 16, 17, 18, 19);
			 if(numb.contains(num1) || numb.contains(num2)|| numb.contains(num3)){
			     return true;
			 } else return false;
	    }
	
	 public static boolean hasTeenOther (int num1, int num2, int num3){
		    boolean isTeen = false;
		        if(isTeen(num1) || isTeen(num2) || isTeen(num3)){
		            isTeen = true;
		        }
		        return isTeen;
		    }
		    public static boolean isTeen(int age){
		        if(age >= 13 && age <= 19){
		            return true;
		        }
		        return false;
		    }
}
