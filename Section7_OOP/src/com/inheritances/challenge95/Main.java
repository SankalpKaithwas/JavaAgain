package com.inheritances.challenge95;

public class Main {

	public static void main(String[] args) {
		Employee emma = new Employee("Emma", "02/10/1995", "25-5-2016");
		System.out.println(emma);
		System.out.println(emma.getAge());
		System.out.println(emma.collectPay());
		
		
		Employee jacob = new Employee("Jacob", "02/10/1991", "25-5-2019");
		System.out.println(jacob);
		System.out.println("Age = " + jacob.getAge());
		System.out.println(jacob.collectPay());
		
		
		SalariedEmployee jean = new SalariedEmployee("Jean", "02/10/1990", "25-5-2011", 35000);
		System.out.println(jean);
		System.out.println("Age = " + jean.getAge());
		System.out.println(jean.collectPay());		
		jean.retire();
		System.out.println("Jeans  Pension paycheck = " +  jean.collectPay());
		
		
		HourlyEmployee paige = new HourlyEmployee("paige", "02/01/1990", "25-5-2011", 30);
		System.out.println(paige);
		System.out.println(paige.collectPay());
		System.out.println(paige.getDoublePay());

	}

}
