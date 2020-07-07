package com.syntax.class04;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card? Please answer as True or False");
		boolean haveCard =scan.nextBoolean();
	
		if (!haveCard) {
			System.out.println("We can give you a creditcard");
		} else {
			System.out.println("What is the balance on the card");
			int balance = scan.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off immediately");
			} else {
				System.out.println("You can spend more");
			}
		}

	}
}
