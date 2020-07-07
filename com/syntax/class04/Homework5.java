package com.syntax.class04;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter how many years did you work?");
		int year = scan.nextInt();
		
		if (year >= 5) {
			System.out.println("You are eligible the bonus");
			System.out.println("Please enter your annual salary");
			int salary = scan.nextInt();
			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligible the bonus");
		}
	}

}
