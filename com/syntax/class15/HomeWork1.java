package com.syntax.class15;

public class HomeWork1 {
	public static void main(String[] args) {
	// How would you reverse a String character by character?

		String original = "We love Java";
		String reverse="";
		
		for(int i=original.length()-1; i>= 0; i--) {
			
			reverse+=original.charAt(i);
		}
		System.out.println(reverse);
	}

}
