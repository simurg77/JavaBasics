package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {
	public static void main(String[] args) {
		// Write a program to find largest of
		// three double values using
		// if-else..if and logical operators provided
		// by a user (numbers must be distinct)
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		double a = scan.nextDouble();

		System.out.println("Enter the second number");
		double b = scan.nextDouble();

		System.out.println("Enter third number");
		double c = scan.nextDouble();

		double largest;

//		if (a > b && a > c) {
//			largest = a;
//		} else if (b > a && b > c) {
//			largest = b;
//		} else {
//			largest = c;
//		}
//		System.out.println("The largest number is " + largest);

		System.out.println("----------------------------");

		if (a > b && a > c) {
			largest = a;
		} else if (b > c) {
			largest = b;
		} else {
			largest = c;
		}

		System.out.println("The largest number is " + largest);

	}

}
