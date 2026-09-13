package com.exercises.constructors;

public class Cylinder extends Circle {

	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height < 0 ? 0 : height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
//        double area = super.getArea();  // both this and super calls are correct
//		double area = this.getArea();
		double area = getArea(); // But because all the methods of Circle are inherited by Cylinder we can just
									// call the method directly
		return height * area;
	}

}
