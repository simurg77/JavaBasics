package com.syntax.class04;

public class IfHomeWork3 {
//	3. Interview Question: Write a Java Program to check whether number is Even or Odd.

	public static void main(String[] args) {
		int num = 7;
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
		
		int num3=67;
		int remainder = num3%2;
		
		if(remainder ==0) {
			System.out.println(num3 + "is even!");
		}else {
			System.out.println(num3 + " is odd!");
		}
			
	}

}
