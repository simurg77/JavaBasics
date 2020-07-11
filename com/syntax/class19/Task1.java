package com.syntax.class19;

public class Task1 {

//	Create a method that will accept an array as parameters and 
//	will return a sum of all elements from that array. 
//	Method should be visibly only within same package and accessible by the 
//	creating an instance of the class.

	int sum(int[] array) { // should be protected or default
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 11, 4 };

		Task1 obj = new Task1();
		System.out.println(obj.sum(arr));

	}
}
