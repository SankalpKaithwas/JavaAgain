package com.list.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAndArrayList {

	public static void main(String[] args) {
		String[] originalArray = new String[] { "First", "Second", "Third" };
		var originalList = Arrays.asList(originalArray);

		originalList.set(0, "one");
//		originalList.add(0, "4"); // will give error as it is FIXED SIZE as it is 
		// derived from an Array and Arrays are not resizeable
		System.out.println("list: " + originalList);
		System.out.println("array: " + Arrays.toString(originalArray));

		originalList.sort(Comparator.naturalOrder());
		System.out.println("array: " + Arrays.toString(originalArray));

//	        originalList.add("fourth"); // will give error as it is FIXED SIZE as it is derived from an Array and Arrays are not resizeable
		// originalList looks like a list but has limitations
		
		List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday"); // fixed size list
		
		System.out.println(newList);

	}

}
