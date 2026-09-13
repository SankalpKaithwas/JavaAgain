package com.inheritances.challenge95;

public class Employee extends Worker {

	private long employeeId;
	private String hiredDate;
	private static int employeeNumber = 1;

	public Employee(String name, String birthDate, String hiredDate) {
		super(name, birthDate);
		this.employeeId = Employee.employeeNumber++;
		this.hiredDate = hiredDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", hiredDate=" + hiredDate + ", toString() = {" + super.toString()
				+ "}]";
	}

}
