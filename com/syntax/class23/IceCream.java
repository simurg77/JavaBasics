package com.syntax.class23;

public class IceCream {
	String flavor, brand, color;
	
	public IceCream(String flavor, String brand, String color ) {
		this.flavor=flavor;
		this.brand=brand;
		this.color=color;
	}
	void info() {
		System.out.println("I like "+flavor+" ice cream of "+
				brand+" I prefer "+color+" one.");
	}
	
}

class Gelato extends IceCream{
	int number;
	
	public Gelato(String flavor, String brand, String color, int number) {
		super(flavor, brand, color);
		this.number=number;
	}
	
	void info() {
		System.out.println("I like "+flavor+" ice cream of "+
						brand+" I prefer "+color+" one and I usually eat "+number);
	}
}

class Sorbeto extends IceCream{
	double price;
	
	public Sorbeto(String flavor, String brand, String color, double price) {
		//this.price=price; --> CE
		super(flavor, brand, color); // call to parent class constructor must be a first line
		this.price=price;
	}
	
//	public Sorbeto(double price) {
//		super(); CE: In the child class super() always call the parent class
//					 but there is no non argument constructor in the parent class
//		this.price=price;
//	}
	
	void info() {
		System.out.println("I like "+flavor+" ice cream of "+
						brand+" I prefer "+color+" one and I pay "+price);
	}
		
}

class miniSorbeto extends Sorbeto{
	
	int calories;
	
	public miniSorbeto(String flavor, String brand, String color, double price, int calories) {
		super(flavor, brand, color, price);
		this.calories=calories;
	}
	
	void info() {
		System.out.println("I like "+flavor+" ice cream of "+
						brand+" I prefer "+color+" one and I pay "+price+" then I got "+calories+" calories");
	}
	
	
}
