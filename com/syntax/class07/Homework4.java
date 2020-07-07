package com.syntax.class07;

public class Homework4 {
	public static void main(String[] args) {
//		Print odd numbers between 20 and 50 (2 ways)
	
		
		System.out.println("--------while first way-----------");

		int i = 20;
		while (i < 50) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}

		System.out.println("--------while second way-----------");

		int x = 21;
		while (x < 50) {
			System.out.println(x);
			x += 2;
		}

		System.out.println("--------do while first way-----------");

		int a = 21;
		do {
			System.out.println(a);
			a += 2;
		} while (a <= 50);

		System.out.println("--------do while second way-----------");

		int b = 20;
		do {
			if (b % 2 == 1) {
				System.out.println(b);
			}
			b++;
		} while (b < 50);

		
		System.out.println("--------for first way-----------");

		for (int c = 21; c <= 50; c += 2) {
			System.out.println(c);
		}

		System.out.println("--------for second way-----------");
		
		for (int c = 20; c <= 50; c++) {
			if (c % 2 != 0) {
				System.out.println(c);
			}
		}

	}

}
