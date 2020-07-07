package com.syntax.class12;

public class Homework2 {

	public static void main(String[] args) {
		// 	Write a java program to check whether a given number is prime or not?
		
	
		int number = 9;
		
		boolean isPrime=true;
		
		for(int i=2; i < number; i++) {
			if(number % i ==0 ) {
				isPrime=false;	
			}
			
		}
		if(isPrime) {
			System.out.println(number+ " is prime");
		}else {
			System.out.println(number+ " is not prime");
		}
	}

}
