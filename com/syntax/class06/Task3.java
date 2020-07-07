package com.syntax.class06;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// HomeWork: Using scanner class create calculator. Allow user to enter 2
		// numbers and operator(+,-,*,/). Based on operator provide the result to user.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first number!");
		double num1 = scan.nextDouble();
		
		System.out.println("Please enter your second number!");
		double num2 = scan.nextDouble();
		
		System.out.println("Please enter 1 operator! (+,-,*,/)");
		String op = scan.next();
		
		double result = 0;

		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid entry");
		}
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		}
	}

}
