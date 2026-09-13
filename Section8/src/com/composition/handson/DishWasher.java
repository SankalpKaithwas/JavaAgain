package com.composition.handson;

public class DishWasher {
	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void doDishes() {
		if (hasWorkToDo) {
			System.out.println("Washing the dishes");
			hasWorkToDo = false;
		}
	}
}
