package com.record;

public class Main {

	public static void main(String[] args) {
		LPAStudent student = new LPAStudent("101", "Lisa", "10-11-1994", "Math Is Fun");
		System.out.println(student);
		System.out.println(student.id());
	}

}
