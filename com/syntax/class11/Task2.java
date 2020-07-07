package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of integers and print all elements in an array

		int[] numbers = { 3, 5, 11, 6, -10, 35 };
		
		System.out.println("---1st Way--for loop---");
		
		for(int i =0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		System.out.println("---2nd Way--advanced loop---");
		
		for( int number : numbers) {
			System.out.print(number + " ");
		}
		
		// Create an array of integers and calculate the sum of all elements in an array
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("---1st Way--for loop---");
		
		int total =0;
		
		for(int i =0; i < numbers.length; i++) {
			total +=numbers[i];
			
		}
		System.out.println("The total of numbers: "+total);
		
		
		System.out.println();
		System.out.println("---2nd Way--advanced loop---");
		
		int sum =0;
		 
		for(int number:numbers) {
			sum+=number;
			
		 }
		System.out.println("The total of numbers: "+sum);
		
		
	}

}
