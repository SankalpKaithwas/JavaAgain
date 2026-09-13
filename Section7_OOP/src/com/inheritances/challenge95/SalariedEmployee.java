package com.inheritances.challenge95;

public class SalariedEmployee extends Employee {

	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(String name, String birthDate, String hiredDate, double annualSalary) {
		super(name, birthDate, hiredDate);
		this.annualSalary = annualSalary;
	}

	public void retire(boolean isRetired) {
		this.isRetired = isRetired;
	}

	public double collectPay() {

		double paychek = annualSalary / 26;
		double adjustedPay = (isRetired) ? 0.9 * paychek : paychek;
		return adjustedPay;
	}

	public void retire() {
		terminate("12/11/2025");
		isRetired = true;
	}

}
