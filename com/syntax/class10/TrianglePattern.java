package com.syntax.class10;

public class TrianglePattern {
	public static void main(String[] args) {

		// Let us print the following triangle
		// $$$$$
		// $$$$
		// $$$
		// $$
		// $

		for (int r = 5; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {

				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println("---------------->");
		// Let us print the following triangle
		// $
		// $$
		// $$$
		// $$$$
		// $$$$$
		
		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {

				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println("---------------->");
		/*  $
		 *  $$
		 *  $$$
		 *  $$$$
		 *  $$$$$
		 */
		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {

				System.out.print("$");
			}

			System.out.println();
		}
		System.out.println("------------------");
		/*  $$$$$
		 *  $$$$
		 *  $$$
		 *  $$
		 *  $
		 */
		
		for (int r = 5; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {

				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println("------------------");
		/* 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */
		
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("------------------");
		/* 54321
		 * 4321
		 * 321
		 * 21
		 * 1
		 */
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}

}
