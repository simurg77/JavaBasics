package com.syntax.class18;

public class Cat {
	
	// instance variables
	String name, color;
	int age;
	
	//static variables
	static int paws =6;
	static boolean mustache=true;
	static boolean tail=true;
	
	
	void displayCat() {
		System.out.println("Name of the cat is "+name
				+" and this cat is "+color
				+" and it is "+age+" years old");
	}
	
	
	void displayCommonFeatures() {
		System.out.println(name+" has "+paws+" paws and "
	+" tail = "+tail +" and mustache = "+mustache  );
	}
}
