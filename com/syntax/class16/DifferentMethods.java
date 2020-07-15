package com.syntax.class16;

public class DifferentMethods {
	
	// lets create method that says hello 10 times
	
	  void sayHello(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
	}

	// create that will any word any number of times
	
	void printAnyWord(String word, int times) {
		
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	// create a method that will accept boolean value
	// and prints, if passed value is true --> go cook otherwise go study
	
	void isHungry(boolean areYouHungry) {
		
		if(areYouHungry) {
			System.out.println("Please cook for yourself");
		}else {
			System.out.println("Go ahead and study");	
		}
		
	}
	
	
}
