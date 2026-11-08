package com.nestedclasses.domain;

import java.util.Comparator;

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

	private String sortType;

	public EmployeeComparator() {
		this("name");
	}

	public EmployeeComparator(String sortType) {
		this.sortType = sortType;
	}

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
//		if (sortType.equalsIgnoreCase("yearStarted")) {
//			return o1.yearStarted - o2.yearStarted;
//		}
//
//		return o1.name.compareTo(o2.name);
	}

}
