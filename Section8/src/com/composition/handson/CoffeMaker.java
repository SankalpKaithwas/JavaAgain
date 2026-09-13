package com.composition.handson;

public class CoffeMaker {
	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void brewCoffee() {
		if (hasWorkToDo) {
			System.out.println("Coffee is brewing.");
			hasWorkToDo = false;
		}

	}

}
