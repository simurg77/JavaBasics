package com.syntax.class12;

public class Homework1 {
	public static void main(String[] args) {

		// Write a program to swap 2 numbers without a temporary variable?

		int a = 20;
		int b = 30;

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("after swapping value of a: "+a);
		System.out.println("after swapping value of b: "+b);
	}

}
