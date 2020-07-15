package com.syntax.class20;

public class HomeWork {
	// Write a program that will have 4 different access levels of constructors and
	// create 3 objects of this class: 1 - inside same class; 2 - from outside the
	// class; 3 - from different class inside different package and observe result.
	
	public HomeWork(int a) {
		System.out.println("This is a public constructor");
		
	}
	
	protected HomeWork(String str){
		System.out.println("This is a protected constructor");
		
	}
	
	private HomeWork(boolean b) {
		System.out.println("This is a private constructor");
		
	}
	
	HomeWork() {
		System.out.println("This is a default constructor");
		
	}
	
	public static void main(String[] args) {
		
		HomeWork obj1 = new HomeWork(true);
		
	}
}
