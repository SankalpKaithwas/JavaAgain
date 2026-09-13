package com.composition.handson;

public class HandsOnSmartKitchenMain {

	public static void main(String[] args) {

		SmartKitchen smartKitchen = new SmartKitchen();
		smartKitchen.setKitchenState(true, true, false);
		smartKitchen.doKitchenWork();
		
		
		
//		smartKitchen.getBrewMaster().setHasWorkToDo(true);
//		smartKitchen.getDishWasher().setHasWorkToDo(true);
//		smartKitchen.getIceBox().setHasWorkToDo(true);
//		smartKitchen.getBrewMaster().brewCoffee();
//		smartKitchen.getDishWasher().doDishes();
//		smartKitchen.getIceBox().orderFood();
	}

}
