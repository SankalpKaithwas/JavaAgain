package com.whileloop;

public class Main {

	public static void main(String[] args) {
		int i = 0;
//		while (i <= 5) {
//			System.out.println(i);
//			i++;
//		}

		/** Another way to write while statements */
//		while (true) {
//			if(i > 5) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}

		/** Do while */
		/*
		 * boolean isGreater = false; do { if (i > 5) { break; } System.out.println(i);
		 * i++; isGreater = (i > 5); } while (isGreater);
		 */

		/** Continue statement */
		while (i < 50) {
			i += 5;
			if (i % 15 == 0) {
				continue;
			}
			/**
			 * after if condition, execution continued by skipping all the code below the
			 * "continue statement" except for the case where (i%15 != 0). So we didn't get 15 in
			 * the output.
			 */
			System.out.println(i);
		}

	}

}
