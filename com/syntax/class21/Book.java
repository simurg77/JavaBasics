package com.syntax.class21;

public class Book {
//	Write program as a Book class that will have  
//	instance variables and 2 Constructors. 
//	While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed
	
	String bookName;
	String bookKind;
	String bookWriter;
	int bookPrice;
	
	
	
	Book(String bookName, int bookPrice){
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		
	}
	
	public Book(String bookKind, String bookWriter) {
		this.bookKind= bookKind;
		this.bookWriter= bookWriter;
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
