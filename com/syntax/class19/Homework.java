package com.syntax.class19;

public class Homework {

	int sum(int[] array) { 
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	public static String reversed(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}

		return result;
	}
	
	private static String vowels(String str) {
		str = str.replaceAll("[^aeiouAEIOU]", "");

		return str;
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 11, 4 };

		Task1 obj = new Task1();
		System.out.println(obj.sum(arr));
		
		System.out.println(Task2.reversed("selam"));

		System.out.println(Homework.vowels("iPhone watch"));
	}
}
