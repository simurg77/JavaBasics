package com.syntax.class08;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
//		Write a program that reads a range of integers (start and end point),
//		provided by a user and then from that range prints the sum of the even and odd integers.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");
		int start = scan.nextInt();

		System.out.println("Please enter a number");
		int end = scan.nextInt();

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = start; i < end; i++) {
			if (i % 2 == 0) {
				sumEven += i;

			} else {
				sumOdd += i;
			}
		}
		
		System.out.println("Sum of the even numbers = " + sumEven);
		System.out.println("Sum of the odd numbers = " + sumOdd);
	}

}
