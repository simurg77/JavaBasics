package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		// Write a program to find largest of
		// three double values using if-else..if and logical operators provided by a
		// user (numbers must be distinct)

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		double num1 = scan.nextDouble();
		
		System.out.println("Enter the second number");
		double num2 = scan.nextDouble();
		
		System.out.println("Enter third number");
		double num3 = scan.nextDouble();

		double largest;

		// First way
		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		System.out.println("The largest number is " + largest);

		
//		// Second Way (Little bit short)
		
//		if (num1 > num2 && num1 > num3) {
//			largest = num1;
//		} else if (num2 > num3) {
//			largest = num2;
//		} else {
//			largest = num3;
//		}
//		System.out.println("The largest number is " + largest);
//		
		
		
		// Third way but not common
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("The largest number is " + num1);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println("The largest number is " + num2);
//		} else {
//			System.out.println("The largest number is " + num3);
//		}
//		
		
	}

}
