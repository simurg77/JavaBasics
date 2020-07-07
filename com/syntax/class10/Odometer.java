package com.syntax.class10;

public class Odometer {

	public static void main(String[] args) {
		// We bought a new car
		// It starts with 0000 mileage and it increases
		// It goes 0001, 0002, 0003, ..... 9999
		// Hint : There are 4 inner loops..

	
		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				for (int x = 0; x <= 9; x++) {

					for (int y = 0; y <= 9; y++) {

						System.out.println(i + "" + j + "" + x + "" + y);

					}
				}
			}
		}

	}

}
