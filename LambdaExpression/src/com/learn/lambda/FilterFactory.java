package com.learn.lambda;

import java.util.function.Predicate;

public class FilterFactory {

	// Returns a Predicate lambda based on configured thresholds
	public static Predicate<Employee> salaryBetween(double min, double max) {
		return emp -> emp.salary() >= min && emp.salary() <= max;
	}
}