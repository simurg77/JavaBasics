package com.syntax.class10;

public class ArrayLenght {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[3] = "Kamila";
		names[1] = "Elshan";
		names[4] = "Yuriy";
		
		
		System.out.println(names[4]);
		System.out.println(names[0]);
		System.out.println(names[3]);
		
		
		
		int size = names.length;
		System.out.println("The length of the array is:" + size);
		
		
		String[] group1 = new String[5];

		group1[3] = "Kamila";
		group1[1] = "Elshan";
		group1[4] = "Yuriy";

		System.out.println(group1[0]);
		System.out.println(group1[1]);

		int arrLength = group1.length;
		System.out.println("The length of the array is:" + arrLength);

		System.out.println("=====================");

		String[] group2 = { "Ali", "Ksenia", "Olga", "Castro" };
		System.out.println("The size of group 2 is: " + group2.length);

		// HW create an array of 4 integers and see the default values.
		
		int[] numbers = new int[4];
		
		System.out.println(numbers[3]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
