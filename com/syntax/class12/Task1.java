package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * create a 2D that will food of different kinds
		 * and retrive all values from that array using 2 different loops
		 * 
		 */
		
		String[][] foods = {
				{"Lahmacun", "Pide", "Kebab", "Doner"},
				{"Taco","Tostada"},
				{"Pizza", "Wings","Hamburger"}
		};
		
		for(int i=0; i <foods.length; i++) {
			
			for(int j=0; j<foods[i].length; j++) {
				
				System.out.print(foods[i][j]+" ");
			}
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		for(String[] row:foods) {
			
			for(String food:row) {
				
				System.out.print(food+" ");
			}
		}

	}

}
