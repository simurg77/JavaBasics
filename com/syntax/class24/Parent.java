package com.syntax.class24;

public class Parent {
	
	private void hello() { // private method do not participate in inheritance --> we cannot override it
		System.out.println("Hello from parent class");
	}
	
	protected static void hi() {
		System.out.println("Hi from parent class");
	}

}

class Child extends Parent{
	
	// creating own method private method inside child class so --> We cannot override private methods
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	//@Override  We cannot override static methods
	public static void hi() {
		System.out.println("Hi from the child class");
	}
}
