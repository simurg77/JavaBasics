package com.syntax.class10;

public class ArrayAnotherWay {
	public static void main(String[] args) {
		
		// we created an array and stored the initial values
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday"};
		
		// Let us print the element with index 3
		System.out.println(weekdays[3]);
		System.out.println("----------------------");
		
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		
		System.out.println("----------------------");
		// we can not add elements to the array
		// weekdays[5] = "Saturday";  // runtime error
		
		// Ad more
		
		// 1st way
		double[] balances = {10000, 23.75, 5540.75 };
		System.out.println("total money is " + (balances[0] + balances[1] + balances[2]));
		
		System.out.println("----------------------");
		// 2nd way
		double total1 = balances[0] + balances[1] + balances[2];
		System.out.println("total is: "+total1);
		
		System.out.println("----------------------");
		// 2nd way with int
		int total2 = (int) balances[0] + (int) balances[1] + (int)  balances[2];
		System.out.println("total is: "+total2);
		
		System.out.println("----------------------");
		// 2nd way with int --->correct way
		int total3 = (int) (balances[0] + balances[1] +  balances[2]);
		System.out.println("total is: "+total3);
		
		
		// Don't ever create an array with 0 elements
		// Because you cannot add elements later
		
//		int[] numbers1 = new int[0];
//		
//		int[] numbers2 = {};
//		numbers2[0] = 5;
//		System.out.println(numbers2[0]);
		
		
		
		
		
		
		
		
		
	}

}
