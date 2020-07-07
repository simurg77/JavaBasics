package com.syntax.class11;

public class Largest {

	public static void main(String[] args) {
		// Find the largest number in array

		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };

		int largest = numbers[0];
		// ---- advanced loop
		for (int num : numbers) {				               
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);
		
		System.out.println("--for negative numbers--");
		
		int[] numbers1 = { -23, -56, -73, -16, -80, -70, -39 };

		int largest1 = numbers1[0];
		// ---- advanced loop
		for (int num1 : numbers1) {				                  
			if (num1 > largest1) {
				largest1 = num1;
			}
		}
		System.out.println(largest1);
		
		System.out.println("--2nd way------");
		
		int[] numbers2 = { 23, -56, -73, 16, 80, -70, -39 };
		//for loop
		int largest2=numbers2[0];
		
		for(int i=0; i<numbers2.length; i++) {
			if(numbers2[i]> largest2) {
				largest2=numbers2[i];
				
			}
		}
		System.out.println(largest2);
		
		
		
		
		
		
		
		
		
		
	}
	
}
