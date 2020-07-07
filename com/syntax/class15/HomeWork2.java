package com.syntax.class15;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
	// How would you reverse a String word by word?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter any sentence");
		String original= scan.nextLine();
		String[] reverse= original.split(" ");
		
		for(int i=reverse.length-1; i>=0; i--) {
			System.out.print(reverse[i]+" ");
		}
		
	}

}
