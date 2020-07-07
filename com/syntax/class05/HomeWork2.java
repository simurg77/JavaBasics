package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
// Write a program to find largest
// number among three numbers using nested if provided by a user (numbers must be distinct)
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		double num1 = scan.nextDouble();

		System.out.println("Enter the second number");
		double num2 = scan.nextDouble();

		System.out.println("Enter the third number");
		double num3 = scan.nextDouble();

		double largest;

		if (num1 > num2) {
			// here num1 is already larger than num2
			if (num1 > num3) {
				// num1 is the largest
				largest = num1;
			} else {
				// num1 is larger than num2, but num3 is larger than num1
				largest = num3;
			}
		} else {
			// here num2 is already larger than num1
			if (num2 > num3) {
				// num2 is the largest
				largest = num2;
			} else {
				// num2 is larger then num1
				largest = num3;
			}
		}
		System.out.println("The largest number is "+largest);


	}
}
