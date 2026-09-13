package com.inheritances.challenge95;

import java.time.LocalDate;

public class Worker {

	private String name;
	private String birthDate;
	protected String endDate;

	public Worker() {

	}

	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		int year = LocalDate.now().getYear();
		return (year - Integer.parseInt(birthDate.substring(6)));
	}

	public double collectPay() {
		return 0;
	}

	public void terminate(String endDate) {
		this.endDate = endDate;

	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}

}
