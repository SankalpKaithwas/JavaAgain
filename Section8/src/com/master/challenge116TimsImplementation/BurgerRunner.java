package com.master.challenge116TimsImplementation;

public class BurgerRunner {

	public static void main(String[] args) {
//		Items item = new Items("Drink", "coke", 2.50);
//		item.printItem();
//		item.setSize("LARGE");
//		item.printItem();
	
//		Items avacado = new Items("Topping", "avacado", 1.50);
//		avacado.printItem();
		
//		Burger burger = new Burger("REGULAR", 4.00);
//		burger.addToppings("Bacon", "Cheese", "mayo");
//		burger.printItem();
		
//		MealOrder regularMeal = new MealOrder();
//      regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//      regularMeal.setDrinkSize("LARGE");
//      regularMeal.printItemizedList();
		
//		 MealOrder secondMeal = new MealOrder("turkey", "7-up",
//	                "chili");
//	        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//	        secondMeal.setDrinkSize("SMALL");
//	        secondMeal.printItemizedList();
		
		 MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
	                "chili");
	        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
	                "CHEESE", "MAYO");
	        deluxeMeal.setDrinkSize("SMALL");
	        deluxeMeal.printItemizedList();
	}

}
