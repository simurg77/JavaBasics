package com.syntax.class23;

public class SuperClass {
	
	String name = "Kamila";
	
	public void printHello() {
		System.out.println("Hello from parent class");
	}

}

class SubClass extends SuperClass{
	
	String name = "Mina";
	
	public void displayName() {
		//System.out.println(name);	// mina --> if we use like this we can access variable of child class
		System.out.println(this.name);	// Mina--> this keyword always access current variables
		System.out.println(super.name); // Kamila--> super keyword always access variable of parent class
		
	}
	
	public void printHello() {
		System.out.println("Hello from child class");
	}
	
	public void callingParentMethod() {
		printHello(); // calling from same(child) class/Compiler add this.printHello();
		super.printHello(); // calling from parent class
	}
}
