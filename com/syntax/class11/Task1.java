package com.syntax.class11;

public class Task1 {
	public static void main(String[] args) {

		// Create an array of cars and store 6 elements into it.
		// Print all values from the array.

		String[] vehicle = { "Kia", "Hyundai", "Subaru", "Mazda", "Nissan", "Honda", "Toyota" };
		
		System.out.println(vehicle.length);
		
		int size = vehicle.length;
		
		System.out.println(size);
		
		System.out.println(vehicle[1]);
		
		for(int i =0; i<vehicle.length; i++) {
			System.out.print(vehicle[i]+" ");
			
		}
		System.out.println();
		System.out.println("--------------");
		
		for(String crs:vehicle) {
			System.out.println(crs);
		}
		
		System.out.println("-------------------------");
		
		String[] cars = { "Toyota", "Honda", "Nissan", "Mazda", "Kia" };

		System.out.println("-------1st Way----------");

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		System.out.println("-------2nd Way----------");

		for (String car : cars) {
			System.out.println(car);
		}

	}

}
