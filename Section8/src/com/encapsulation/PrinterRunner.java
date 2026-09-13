package com.encapsulation;

public class PrinterRunner {

	public static void main(String[] args) {
//		Printer printer = new Printer(50, true);
		Printer printer = new Printer(50, false);
		System.out.println("Initial page count " + printer.getPagesPrinted());
		System.out.println("Pages Printed " + printer.printPages(5));
		System.out.println("After print page count " + printer.getPagesPrinted());
		
		System.out.println("Initial page count " + printer.getPagesPrinted());
		System.out.println("Pages Printed " + printer.printPages(10));
		System.out.println("After print page count " + printer.getPagesPrinted());
		
		/** My implementation below */
//		Printer printer = new Printer(100, true);
//		printer.addToner(3);
//		printer.printPages(100);
//		printer.printPages(88);
//		printer.addToner(3);
//		printer.printPages(100);
//		System.out.println("-------------------------");
//		Printer printer2 = new Printer(13, false);
//		printer2.addToner(55);
//		printer2.printPages(50);
//		printer2.addToner(3);
//		printer2.printPages(100);
	}

}
