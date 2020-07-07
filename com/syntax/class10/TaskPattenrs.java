package com.syntax.class10;

public class TaskPattenrs {

	public static void main(String[] args) {
		/*
		 * Please following pattern 
		 * 55555 
		 * 4444 
		 * 333 
		 * 22 
		 * 1
		 */

		System.out.println("------------------");

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println("------------------");
		/*
		 * Please following pattern 
		 * 1
		 * 22 
		 * 333 
		 * 4444 
		 * 55555
		 */

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println("------------------");
		/*
		 * Please following pattern 
		 * 54321 
		 * 4321 
		 * 321 
		 * 21 
		 * 1
		 */
		
		for (int i = 5; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j+" ");
			}
			System.out.println();
		}

		System.out.println("------------------");
		
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		/*
		 * This is extra 
		 * 1 
		 * 21 
		 * 321 
		 * 4321 
		 * 54321 
		 * 4321 
		 * 321 
		 * 21 
		 * 1
		 */
		System.out.println("------------------");

		for (int i = 1; i <= 4; i++) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j+" ");
			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if(i==1 || i==4 || j==1 || j==4) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		

	}

}
