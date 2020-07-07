package com.syntax.class13;

public class Car {

	// define car features in a from of variables  
	// we use noun when we create class
	String make;
	String model;
	String color;
	int year;
	int speed;
	
	
	
	public static void main(String[] args) {

		System.out.println("Hello, I am code from main method");

		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Camry";
		c1.color = "Yellow";
		c1.year = 2020;
		c1.speed = 200;

		// calling method drive
		c1.drive();
		// calling method transportPeople
		c1.transportPeople();
		// calling method stop
		c1.stop();
		// calling method stop
		c1.reverse();
		
		

	}

	// define behavior in a from methods 
	// We use verb when we create method
	// We can NOT create a method inside other method, don't put those methods in the main method

	void drive() {
		System.out.println(make + " can drive");
	}

	void reverse() {
		System.out.println(make+" can reverse");
	}

	void transportPeople() {
		System.out.println(make+" can transport people");
	}

	void stop() {
		System.out.println(make+" will stop when break press");
		System.out.println(make+" stop");
	}
}
