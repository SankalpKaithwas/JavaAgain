package com.allaboutstrings;

public class AllAboutStrings {

	public static void main(String[] args) {
		printInformation("Blend");
		printInformation("");
		printInformation("\t       \n");
		
		String butter = "Butter on Bread";
		
		System.out.printf("Index of 'o' = %d %n", butter.indexOf('o'));
		System.out.printf("Index of 'a' = %d %n", butter.indexOf('a')).println();
		System.out.printf("Index of 'b' = %d %n", butter.lastIndexOf('B',13));
		System.out.printf("Last Index of 'e' = %d %n", butter.lastIndexOf('e'));
		System.out.printf("Last Index of 'e' = %d %n", butter.lastIndexOf('e',13));
		
		String butterNew = butter.toLowerCase();
		String butterOne = butter;
		System.out.println("Equals method = "  + butter.equals(butterNew));
		
		System.out.println("contentEquals method = "  + butter.contentEquals(butterOne));
		System.out.println("contentEquals method = "  + butter.contentEquals("Butter on Bread"));
	}

	public static void printInformation(String string) {
		int length = string.length();			
		System.out.printf("Length of string = %d%n", length);
				
		if(string.isEmpty()) {
			System.out.println("String is Empty");
			return; // if we dont use return we will get exception thrown
		}
		if (string.isBlank()) {
			System.out.println("String is Blank");
		}
		System.out.printf("First char of string = %c %n", string.charAt(0));
		System.out.printf("Last char of string = %c %n",string.charAt(length - 1));
	}

}
