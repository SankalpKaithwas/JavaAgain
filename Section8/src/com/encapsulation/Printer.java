package com.encapsulation;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		super();
		this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0) ? -1 : tonerLevel;
		this.duplex = duplex;
	}

	public int addToner(int tonerAmout) {
		if (tonerLevel >= 0 || tonerLevel <= 100) {
			tonerLevel += tonerAmout;
			if (tonerLevel > 100 || tonerLevel < 0) {
				tonerLevel = -1;
			}
		}
		return tonerLevel;
	}

	public int printPages(int pages) {
		int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
		pagesPrinted += jobPages;
		return jobPages;

	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	/** My implementation but its not correct */
//	public int addToner(int tonerAmout) {
//		if (tonerLevel >= 0 || tonerLevel <= 100) {
//			tonerLevel += tonerAmout;
//			if (tonerLevel > 100) {
//				tonerLevel = -1;
//			} else if (tonerLevel < 0) {
//				tonerLevel = 0;
//			}
//		}
//		System.out.println("Toner Level: = " + tonerLevel + "%");
//		return tonerLevel;
//	}
//
//	public int printPages(int pages) {
//		int pagesToPrint = 0;
//		if (tonerLevel <= 0) {
//			System.out.println(
//					"Toner level is too low for the Print. Please add Toner! Toner Level = " + tonerLevel + "%");
//		} else {
//			if (duplex) {
//				System.out.println("Its a duplex printer");
//				pagesToPrint = pages * 2;// 200
////				pagesPrinted = (pagesToPrint > tonerLevel) ? (pagesToPrint - tonerLevel * 2)
////						: (pagesToPrint < tonerLevel) ? tonerLevel / 2 : pages;
//				pagesPrinted = (pagesToPrint > tonerLevel) ? (pagesToPrint - tonerLevel * 2)
//						: (pagesToPrint < tonerLevel) ? tonerLevel / 2 : pages;
//				tonerLevel -= pagesPrinted;
//				System.out.println("Printed " + pagesPrinted + " Number of pages. Considering Duplex");
//				if (tonerLevel < 0) {
//					tonerLevel = 0;
//					System.out.println("Cannot Print More as Toner Level is low.");
//				}
//				System.out.println("Remaining Toner Level: = " + tonerLevel);
//			} else {
//				pagesPrinted = pages;
//				System.out.println("Printer is printing " + pagesPrinted + " pages.");
//				tonerLevel -= pagesPrinted / 2; // if toner 1 == we can print 2 pages
//				if (tonerLevel < 0) {
//					tonerLevel = 0;
//					System.out.println("Cannot Print More as Toner Level is low.");
//				}
//				System.out.println("Remaining Toner Level: = " + tonerLevel);
//			}
//		}
//		return pagesPrinted;
//
//	}

}
