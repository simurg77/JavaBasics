package com.syntax.class04;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the amount of loan are you nedeed");

		int loan = scan.nextInt();
		if (loan <= 200000) {
			System.out.println("Your loan is accepted");
		} else {
			System.out.println("Your loan is rejected");
		}
	}

}
