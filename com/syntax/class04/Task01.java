package com.syntax.class04;

public class Task01 {

	public static void main(String[] args) {
		// Write a program to store a boolean value of whether user has diploma or not.
		// If user has a diploma, you should say congratulations, otherwise program
		// should suggest to get a degree/diploma.
		// Then if user has a degree program should check a gpa score.
		// If gpa score is higher or equals to 3.5 → output should say "You are eligible
		// for scholarship",
		// otherwise → "You should have studied harder" .

		boolean isDiploma = true;

		if (isDiploma) {
			System.out.println("Congratulations");
			double gpa = 3.4;
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should stadied harder");
			}
		} else {
			System.out.println("You should get a degree");
		}

	}
}
