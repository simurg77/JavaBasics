package com.syntax.class09;

public class Task1And2 {

	public static void main(String[] args) {
		
		System.out.println("-------Task 1-------");
//		1.Print the following pattern:
//		54321
//		54321
//		54321
//		54321
//		
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("-------Task 2-------");
//		2.Print the following pattern:
//		55555
//		44444
//		33333
//		22222
//		11111

		for (int i = 5; i >= 1; i--) {

			for (int j = 5; j >= 1; j--) {

				System.out.print(i + " ");
			}

			System.out.println();
		}

		
		

	}

}
