package com.autoboxing.unboxing.challenge;

import java.util.ArrayList;

public record TimsCustomer(String name, ArrayList<Double> transcations) {

	public TimsCustomer(String name, double initialDeposit) {
		this(name.toUpperCase(), new ArrayList<Double>(500));
		transcations.add(initialDeposit);
	}
}
