package com.syntax.class06;

public class CompareNumbersNestedIf {

	public static void main(String[] args) {
		// Write a program to find largest
		// number among three numbers using nested if provided by a user
		// (numbers must be distinct)

		double a = 1;
		double b = 4;
		double c = 3;
		double largest;

		if (a > b) {
			if (a > c) {
				largest = a;
			} else {
				largest = c;
			}
		} else {
			if (b > c) {
				largest = b;
			} else {
				largest = c;
			}
		}
		System.out.println("The largest number is " + largest);
	}
}
