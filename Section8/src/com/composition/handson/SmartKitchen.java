package com.composition.handson;

public class SmartKitchen {

	private Refrigerator iceBox;
	private CoffeMaker brewMaster;
	private DishWasher dishWasher;

	public SmartKitchen() {
		iceBox = new Refrigerator();
		brewMaster = new CoffeMaker();
		dishWasher = new DishWasher();
	}

	public Refrigerator getIceBox() {
		return iceBox;
	}

	public CoffeMaker getBrewMaster() {
		return brewMaster;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}

	public void setKitchenState(boolean iceBoxFlag, boolean coffeeFlage, boolean dishWasherFlag) {
		iceBox.setHasWorkToDo(iceBoxFlag);
		brewMaster.setHasWorkToDo(coffeeFlage);
		dishWasher.setHasWorkToDo(dishWasherFlag);
	}

	public void doKitchenWork() {
		iceBox.orderFood();
		dishWasher.doDishes();
		brewMaster.brewCoffee();
	}

}
