package com.syntax.class19;

public class IPhone {

	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;

	String model;
	int memory;
	double price;
	String color;

	static void displayInfo() { // --> static works only with static
		System.out.println("iPhone belongs to brand " + brand + " and it is has OS as " + OS
				+ " and all iPhones have touchscreen= " + touchScreen);
	}

//	static void displayDetails() { --> STATIC METHODS CANNOT ACCESS INSTANCE / NON STATIC MEMBERS / VARIABLES
//	System.out.println("We build iPhone " + model + " with memory = " + memory + " in " + color
//			+ " color for price =$" + price);
//}

	// can instance method / non static method access static members?
	void displayDetails() { // --> instance works with static and non static
		System.out.println("We build iPhone " + model + " with memory = " + memory + " in " + color
				+ " color for price= $" + price);
	}

}
