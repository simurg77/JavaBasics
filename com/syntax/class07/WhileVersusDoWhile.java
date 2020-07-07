
package com.syntax.class07;

public class WhileVersusDoWhile {
	public static void main(String[] args) {
		// print hello 5 times
//
		int x = 1;
		while (x <= 5) { // checks before going into the loop
			System.out.println("Hello");
			x++;
		}

		System.out.println("---------Using a Do While loop----------");

		int y = 1;
		do {
			System.out.println("Hello");
			y++;
		} while (y <= 5); // checks after going into the loop

//		
//		int z = 11;
//		while (z <= 5) { // checks before going into the loop
//			System.out.println("Hello");
//			z++;
//		}
//
//		System.out.println("---------Using a Do While loop----------");
//
//		int f = 11;
//		do {
//			System.out.println("Hello");
//			f++;
//		} while (f <= 3); // checks after going into the loop
//		
		
		
	}

}
