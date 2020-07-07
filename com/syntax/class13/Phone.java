package com.syntax.class13;

public class Phone {
//	Create a Class “Phone”. Create 3 Objects of it: 
//	iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String brand;
	String model;
	String color;
	String price;
	int year;
	
	
	public static void main(String[] args) {
		System.out.println("-------- phone 1 -----------------");
		Phone p1 = new Phone();
		p1.brand = "iPhone";
		p1.model = "RX10";
		p1.color = "Black";
		p1.price = "$999";
		p1.year = 2019;
		
		System.out.println( "Brand of this phone is "+p1.brand+ " and model is "+p1.model+ 
				". It is in "+p1.color+" color. It's on the market since "+p1.year+" and the price is "+p1.price+".");
		
		p1.connect();
		p1.record();
		p1.play();
		p1.text();
		
		System.out.println("-------- phone 2 -----------------");
		Phone p2 = new Phone();
		p2.brand = "Android";
		p2.model = "Note5";
		p2.color = "White";
		p2.price = "$599";
		p2.year = 2018;
		
		System.out.println( "Brand of this phone is "+p2.brand+ " and model is "+p2.model+ 
				". It is in "+p2.color+" color. It's on the market since "+p2.year+" and the price is "+p2.price+".");
		
		p2.connect();
		p2.record();
		p2.play();
		p2.text();
		
		System.out.println("-------- phone 3 -----------------");
		Phone p3 = new Phone();
		p3.brand = "Nokia";
		p3.model = "CX10";
		p3.color = "Red";
		p3.price = "$499";
		p3.year = 2017;
		
		System.out.println( "Brand of this phone is "+p3.brand+ " and model is "+p3.model+ 
				". It is in "+p3.color+" color. It's on the market since "+p3.year+" and the price is "+p3.price+".");
		
		p3.connect();
		p3.record();
		p3.play();
		p3.text();
		
	}
	
	void connect() {
		System.out.println(brand + " can voice call.");
		System.out.println(brand + " can video call.");	
	}
	
	void text() {
		System.out.println(brand + " can send messages.");
		System.out.println(brand + " can send voice messages.");	
	}
	
	void play() {
		System.out.println(brand + " can play video.");
		System.out.println(brand + " can play games.");	
	}
	
	void record() {
		System.out.println(brand + " can record voice.");
		System.out.println(brand + " can record video.");
	}
}
