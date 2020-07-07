package com.syntax.class15;

public class HW3 {
	public static void main(String[] args) {
		
	/*
	 * Create a String and print it in reverse order (Sunday → yadnuS).
	 */
		String day = "Sunday";
		String newDay = "";
		
		for(int i= day.length()-1; i>= 0; i--) {
			
			newDay+=day.charAt(i);
		}
		System.out.println(newDay);
		
	}

}
