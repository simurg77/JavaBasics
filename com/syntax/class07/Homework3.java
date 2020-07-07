package com.syntax.class07;

public class Homework3 {
	public static void main(String[] args) {
//		Print even numbers from 20 to 1 (2 ways)


		System.out.println("----------while first way-------------");

		int a = 20;
		while (a >= 1) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a--;
		}

		System.out.println("----------while second way-------------");

		int b = 20;
		while (b >= 1) {
			System.out.println(b);
			b -= 2;
		}

		System.out.println("----------do while first way-------------");

		int c = 20;
		do {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c--;
		} while (c >= 1);

		System.out.println("----------do while second way-------------");

		int d = 20;
		do {
			System.out.println(d);
			d -= 2;
		} while (d >= 1);
		
		System.out.println("----------for first way-------------");
		
		for(int y=20; y>=1; y-=2) {
			if(y%2==0) {
				System.out.println(y);
			}
		}
		
		System.out.println("----------for second way-------------");
		
		for(int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
	}

}
