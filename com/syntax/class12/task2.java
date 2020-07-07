package com.syntax.class12;

public class task2 {

	public static void main(String[] args) {
		// Create 2D array of int and calculate sum of all even numbers
		
		int[][] numbers = {
				{10, 23, 56, 47},
				{33, 668, 89},
				{1,9,0}
		};
		
		int total=0;
		
		for(int[] array : numbers) {
			
			for(int number : array) {
				
				if(number % 2==0) {
					total+=number;
				}
			}
			
		}
		System.out.println("The sum of all even numbers: "+total);
		
		System.out.println("---------");
		
		// calculate sum of all odd numbers
		int sum= 0;
		
		for(int i =0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				
				int num = numbers[i][j];
				if(num % 2 != 0) {
					sum+=num;
					
				}
			}
		}
		
		System.out.println("The sum of all odd numbers: "+sum);
	}

}
