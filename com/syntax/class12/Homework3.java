package com.syntax.class12;

public class Homework3 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int[] numbers= new int[10];
		
		int num1=0;
		int num2=1;
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=num1;
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			
		}
		for(int number:numbers) {
			System.out.println(number);
		}

	}

}
