package com.car;

public class Car {

	private String make;
	private String model;
	private String colour;
	private int doors;
	private boolean isConvertible;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isConvertible() {
		return isConvertible;
	}

	public void setConvertible(boolean isConvertible) {
		this.isConvertible = isConvertible;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", colour=" + colour + ", doors=" + doors + ", isConvertible="
				+ isConvertible + "]";
	}
	
	

}
