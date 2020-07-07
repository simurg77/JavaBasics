package com.syntax.class09;

public class Task2And4 {

	public static void main(String[] args) {
		System.out.println("--------------------");
//		3.Print the following pattern:
//		*
//		**
//		***
//		****
//		*****

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("----------------------");
//		4. Print the following pattern:
//			55555
//			4444
//			333
//			22
//			1

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
			
		}
		
		
		System.out.println("--------------------");
//		5. Print the following pattern:
//		5
//		44
//		333
//		2222
//		11111

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------");
//		6.Print the following pattern:
//		*****
//		****
//		***
//		**
//		*

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}


	}

}
