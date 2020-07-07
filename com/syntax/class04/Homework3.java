package com.syntax.class04;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your city");
		String city = scan.nextLine();

		System.out.println("Please enter the temrature as a Fahrenheit");
		double temp = scan.nextDouble();

		// Deduct 32, then multiply by 5, then divide by 9
		temp = (temp - 32) * 5 / 9;
		System.out.println("The temperature is the city " + city + " is " + temp);

	}

}
