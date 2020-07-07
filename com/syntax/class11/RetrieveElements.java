package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------");

		for (char element : grades) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("-------------------------------");

		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };

		// Print all the fruits with for loops
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}

		// Print all the fruits with advanced loops
		System.out.println();
		System.out.println("--------------------------------");

		for (String element : fruits) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("--------------------");

		// Print your favorite foods with for loop
		for (int i = 0; i < fruits.length; i++) {
			
			if(fruits[i].equals("Orange")) {
				
				System.out.println(fruits[i]+" is my favorite fruit");
			}
		}
		
		System.out.println();
		System.out.println("--------------------");

		for(String fruit:fruits) {
			
			if(fruit.equals("Banana")) {
				
				System.out.println(fruit+ " is my favorite fruit");
			}
		}
		
	}
}
