package com.syntax.class20;

public class Flower {
	
	String type;
	
//  if you are not going to create a constructor -- Compiler create 1 for you
//	Flower() { default, non argument
//		
//	}
	
//	Flower() {
//		System.out.println("I am pointless constructor");
//	}
	
	// if you create a Constructor then compiler WILL NOT CREATE any other constructor for you
	private Flower(String flowerType){
		type=flowerType;
	}
	
	public void display() {
		System.out.println(type);
	}
	
	
	public static void main(String[] args) {
		
//		Flower flower = new Flower();  CE: since we do NOT have non argument constructor
//		System.out.println(flower.type);
		
		Flower flower2=new Flower("Tulip");
		
		System.out.println(flower2.type);
		
		flower2.display();
		
		
	}

}
