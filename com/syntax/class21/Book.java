package com.syntax.class21;

public class Book {
//	Write program as a Book class that will have  
//	instance variables and 2 Constructors. 
//	While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed
	
	String bookName, bookAuthor;
	int bookPrice;
	
	public Book(){
		System.out.println("You should buy this book!");
	}
	
	public Book(String bookName, String bookAuthor, int bookPrice) {
		this();
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookPrice=bookPrice;
	}
	
	public void display() {
		System.out.println("You should buy and read "+bookName+" written by "+bookAuthor+" even though it's "+bookPrice+" is too high.");
	}
	
	public static void main(String[] args) {
		Book obj = new Book("Homo Sapiens", "Noah Harari", 50);
		obj.display();
		
	}
	
}