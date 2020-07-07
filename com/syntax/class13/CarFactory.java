package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {
		
		// building an object of car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.speed = 200;
		car1.year = 2010;

		System.out.println("Make of this car is " + car1.make + " and model is " + car1.model + " and it is in "
				+ car1.color + " color ");

		System.out.println("---Accesing methods from Car class using car1---");
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		
		// building an object of car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of this car is " +car2.make);
		
		System.out.println("---Accesing methods from Car class using car1---");
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		
		
		// new Bus(); compiler will give an error
		// because we never created Bus class
		
		// create 2 more objects, assign features and print them
		
		
	}

}
