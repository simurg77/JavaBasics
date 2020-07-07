package com.syntax.class16;

public class TaskMethods {

	////Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void larger(int a, int b) {
		
		if(a > b) {
			System.out.println(a+" is larger tahan "+b);
		}else if(b > a) {
			System.out.println(b+" is larger than "+a);
		}else {
			System.out.println(a+" is equals to "+b);
		}
	}
	
	// Create a method that will take a number and prints whether the number is even or odd.
	
	void evenOdd(int c) {
		
		if(c % 2 ==0) {
			System.out.println("The number "+c+" is even ");
		}else {
			System.out.println("The number "+c+" is odd ");
		}
	}
	
	// Create a method that will print whether given String is palindrome or not.
	
	void palindrome(String word) {
		String reverse = "";
		
		for(int i=word.length()-1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println(word+" is palindrome ");
		}else {
			System.out.println(word+" is NOT palindrome");
		}
		
	}
	
	// Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	void sayHello(String country) {
		
		country = country.toLowerCase();
		
		switch (country) {
		case "usa":
			System.out.println("Hello");
			break;
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;
		
		}
		
		
		
		
		
	}
	

}
