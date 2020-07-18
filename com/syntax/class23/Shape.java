package com.syntax.class23;

public class Shape {
	
	double radius;
	public Shape(double radius) {
		this.radius=radius;
		
	}
	
}

class Circile extends Shape {
	
	public Circile(double radius) {
		super(radius);
		
	}
	
	public double display () {
		
		double result;
		result = 3.14*radius*radius;
		return result;
	}
	
}


 