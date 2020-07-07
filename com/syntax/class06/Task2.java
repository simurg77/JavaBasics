package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
//		Allow user to enter grade and then provide 
//		explanation: A -Excellent, B - Good, C Average, D - Bad, 
//		any other grade > Not Acceptable. At the 
//		end your program should print which grade was 
//		entered by a user with explanation.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your grade!");
		String grade = scan.nextLine();
		String exp;

		switch (grade) {
		case "A":
			exp = "Excelent";
			break;
		case "B":
			exp = "Good";
			break;
		case "C":
			exp = "Average";
			break;
		case "D":
			exp = "Bad";
			break;
		default:
			exp = "Not Acceptable";
		}
		System.out.println("Your grade explanation is "+exp);

	}

}
