package com.practise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddOneToLastElementOfArray {

	public static void main(String[] args) {

		// Write a program to add 1 to Array, MEANING adding 1 to the last element of
		// the int array.

		/** 1 - get the last element and set the last element after incrementing by 1 */
		int[] array = { 0, 2, 30, 4, 50 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		list.set(list.size() - 1, list.get(list.size() - 1) + 1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// OR
		array[array.length-1] = array[array.length-1] + 1;
		System.out.println(Arrays.toString(array));

		/** More ways in old java workspace */
	}
}
