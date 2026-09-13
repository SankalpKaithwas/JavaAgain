package com.switchstatement;

public class UseOfCharInSwitch {

	public static void main(String[] args) {
		char alpha = 'F';
		switch (alpha) {
		case 'A':
			System.out.println("Able");
			break;
		case 'B':
			System.out.println("Baker");
			break;
		case 'C':
			System.out.println("Chalie");
			break;
		case 'D':
			System.out.println("Dog");
			break;
		case 'E':
			System.out.println("Easy");
			break;
		default:
			System.out.println("Not Found");
		}

	}

}
