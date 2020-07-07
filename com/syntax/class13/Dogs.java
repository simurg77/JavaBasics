package com.syntax.class13;

public class Dogs {

//	Create a Dog Class and create 3 different objects of it: 
//  Husky, Bulldog, Labrador  with specific  attributes and behaviors.

	String name;
	String origin;
	String color;
	int weight;
	int height;

	void bark() {
		System.out.println(name + " doesn't bark unless it needs to.");

	}

	void play() {
		System.out.println(name + " loves to play games.");
	}

	void run() {
		System.out.println(name + " can run too very fast. ");
	}
	
	public static void main(String[] args) {

		Dogs d1 = new Dogs();
		d1.name = "Husky";
		d1.origin = "Serbian";
		d1.color = "White";
		d1.weight = 55;
		d1.height = 22;

		System.out.println("The "+d1.origin+" breed " +d1.name+" is a medium-sized dog. "
				+ "It's weight "+d1.weight+" lb and height is "+d1.height+" inc.");
		System.out.println("--------------------------------   ");
		
		Dogs d2 = new Dogs();
		d2.name = "Bulldog";
		d2.color = "Black";
		d2.origin = "British";
		d2.weight = 52;
		d2.height = 16;
		System.out.println("The "+d2.origin+" breed " +d2.name+" is a medium-sized dog. "
				+ "It's weight "+d2.weight+" lb and height is "+d2.height+" inc.");
		System.out.println("--------------------------------   ");
		
		Dogs d3 = new Dogs();
		d3.name = "Labrador";
		d3.color = "Golden";
		d3.origin = "Canadaian";
		d3.weight = 35;
		d3.height = 22;
		System.out.println("The "+d3.origin+" breed " +d3.name+" is a medium-sized dog. "
				+ "It's weight "+d3.weight+" lb and height is "+d3.height+" inc.");
		System.out.println("--------------------------------   ");
		
		d1.bark();
		d1.play();
		d1.run();
		
		System.out.println("----------------------");
		d2.run();
		d2.play();
		d2.bark();
		
		System.out.println("----------------------");
		d3.play();
		d3.bark();
		d3.run();
		
		
	}
	
	
}
