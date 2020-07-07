
package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {
		
		String[][] animals = {
				
				{"cat", "dog", "bird", "hamster"}, // first array or 1st row
				{"tiger", "children", "bear"}     // second array or 2nd row
		};
		
		int howManyArrays = animals.length;  // how many rows
		System.out.println(howManyArrays);
		
		int elementsFrom0Array=animals[0].length; // how many columns in 2 row
		System.out.println(elementsFrom0Array);
		
		int elementsFrom1Array=animals[1].length;
		System.out.println(elementsFrom1Array);
		
		String element = animals[1][1];
		System.out.println(element);
		
		System.out.println("-----------------------");
		
		// how to gets all elements from 2D array
		
		for(int r = 0; r < animals.length; r++) { // loops over rows or 
			
			for(int c= 0; c < animals[r].length; c++){
				
				// System.out.println(animals[r][c]);  // 1st way
				String animal = animals[r][c];
				System.out.print(animal+" ");
			}
			System.out.println();
		}
			
			System.out.println("-------USING ENHANCED FOR LOOPS--------");
			
			for(String[] array:animals) {
				
				for(String animal:array) {
					
					System.out.print(animal+" ");
				}
				System.out.println();
			}
			System.out.println("----------------");
			
		}
		
	}


