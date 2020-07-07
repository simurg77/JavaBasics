package com.syntax.class07;

public class Homework1 {
	public static void main(String[] args) {

//		1. Print numbers from 1 to 100 in 1 line with space

		int a = 1;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		System.out.println("----------------------");

		
		int b = 1;
		do {
			System.out.print(b + " ");
			b++;
		} while (b <= 100);
		
		
		System.out.println();
		System.out.println("----------------------");

	
		for (int c = 1; c <= 100; c++) {
			System.out.print(c + " ");
		}
	}

}
