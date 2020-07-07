package com.syntax.class15;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
	// How would you check if String is palindrome or not?
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word");
		String original = scan.nextLine();
		String reverse = "";
		
		for(int i= original.length()-1; i>=0; i--) {
			
			reverse+=original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("String variable "+original+" is palindrome!");
		}else {
			System.out.println("String variable "+original+" is NOT palindrome!");
		}
		

	}

}
