package com.inheritances.challenge95;

public class HourlyEmployee extends Employee {

	private double hourlyPayRate;

	public HourlyEmployee(String name, String birthDate, String hiredDate, double hourlyPayRate) {
		super(name, birthDate, hiredDate);
		this.hourlyPayRate = hourlyPayRate;
	}

	public double getDoublePay() {
		return (2 * collectPay());
	}
	
	public double collectPay() {
		return 40 * hourlyPayRate;
	}

}
