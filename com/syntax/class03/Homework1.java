package com.syntax.class03;

public class Homework1 {

	public static void main(String[] args) {
		// 1. Declare variable and increase by 100 using shorthand operator
		int num1 = 50;
		num1 += 100;
		System.out.println(num1);

		// 2. Declare variable and decrease by 67 using shorthand operator
		int num2 = 75;
		num2 -= 67;
		System.out.println(num2);

		// 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using
		// shorthand operator
		// each person should get an equal piece of cake
		int cakePiece1 = 11;
		cakePiece1 /= 4;
		System.out.println(cakePiece1);

		// 4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		// Using shorthand operator found out how many pieces of cake left after it was
		// distributed equally among 7 people
		int cakePiece2 = 25;
		cakePiece2 %= 7;
		System.out.println(cakePiece2);

	}

}
