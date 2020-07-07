package com.syntax.class02;

public class HomeWork2 {
	public static void main(String[] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values.
		// Your program should say. "The _______ of 2 numbers ___ and ___ is equal to
		// _____"

		String sSum = "addition";
		String sSub = "subtruction";
		String sDiv = "division";
		String sMult = "multiplication";

		double num1 = 5.5;
		double num2 = 7.7;

		double sum = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;

		System.out.println("The " + sSum + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The " + sSub + " of 2 numbers " + num1 + " and " + num2 + " is egual to " + sub);
		System.out.println("The " + sMult + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		System.out.println("The " + sDiv + " of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);

		System.out.println("................................");

		// Write a program to find the square of the number 3.9.
		// You program should say "The square of the ____ is ____ "
		double num3 = 3.9;
		double num3Square = num3 * num3;
		System.out.println("The square of the " + num3 + " is " + num3Square);

		System.out.println("................................");

		// Write a program to print the area and perimeter of a rectangle with width = 5
		// and height = 8.
		// Your program should say. "The perimeter of a rectangle with
		// width ___ and height ____ is equal to _____ and the area is __"
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and area is " + area);

	}

}
