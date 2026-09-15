package com.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {

		GroceryItem[] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
		groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
		System.out.println(Arrays.toString(groceryArray));

//		ArrayList objectList = new ArrayList(); // by default not using diamond operator and specifying type means its
		// an Object type arrayList
		ArrayList<Object> objectList = new ArrayList<>();
		objectList.add(new GroceryItem("Butter"));
		objectList.add("Yogurt");

		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6)); //specifying which index should have the values
        groceryList.remove(1);
        System.out.println(groceryList);



	}

}
