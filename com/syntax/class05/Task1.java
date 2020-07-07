package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
//		Prompt the user to enter person heights in inches. Person should be classified as one of the following:
//			• short (under 60 inch)
//			• medium(between 60 -72 inch)
//			• tall (over 72 inch)
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your heights in inches?");
		int heigths = scan.nextInt();

		if (heigths < 60) {
			System.out.println("You are short");
		} else if (heigths >= 60 && heigths <= 72) {
			System.out.println("You are medium");
		} else {
			System.out.println("You are tall");
		}

	}

}
