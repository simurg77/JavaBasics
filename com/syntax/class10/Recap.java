package com.syntax.class10;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		// print cols
		int rows = 3;
		int cols = 5;
		
		for(int i= 1; i <= rows; i++) {
			
			for(int j = 1; j <= cols; j++) {
				
				System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		// print rows
		int rows1 = 3;
		int cols1 = 5;

		for (int i = 1; i <= rows1; i++) {

			for (int j = 1; j <= cols1; j++) {

				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		// There are 4 floors
		// Room numbers go from 1.1, 1.2, ...... 1.7
		int floor = 4;
		int room = 7;

		for (int i = 1; i <= floor; i++) {
			// We just moved to a new floor
			System.out.println("Floor # "+ i + "------>");
			// If I want, I can read rows from a Scanner
			// We are iterating the rooms
			for (int j = 1; j <= room; j++) {

				System.out.print(i +  "." + j +" ");
			}
			/// The stairs to the next floor
			System.out.println();
		}
		System.out.println("---------------------");
		// If I want, I can read rows from a Scanner
		// Task : 
		// Ask the user how many floors does your hotel have?
		// Have many rooms in each floor.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		
		System.out.println("How many rooms in each floor?");
		int rooms = scan.nextInt();
		
		for(int i =1; i <= floors; i++) {
			// We  just moved to new floor
			System.out.println("Floor #" + i + "--->");
			
			// We are iterating the rooms
			for(int j = 1; j <= rooms; j++) {
				System.out.print(i + "." + j + " ");
			}
			
			// The stairs to the next floor
			System.out.println();
		}
		
	
		
	}

}
