package com.syntax.class21;

public class USA {
	
	public static String counrty;
	public String state;
	public String capital;
	
	public USA(String state, String capital) {
		
		this.state=state;
		this.capital=capital;
		
	}
	
	 void displayState() {
		System.out.println("State is ="+state);
	}
	 
	 void displayCapital() {
		 System.out.println("capital is ="+capital);
	 }
	 
	 void displayInfo() {
//		 System.out.println("State is ="+state);
//		 System.out.println("capital is ="+capital);
		 displayState();  // this.displayState(); Compiler adds this to refer to instance method
		 //this.displayState();
		 displayCapital(); // this.displayCapital(); Compiler adds this to refer to instance method
		 //this.displayCapital();
	 }

}
