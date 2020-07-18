package com.syntax.class23;

public class ConstructorOverloading {
	// Constructor overloading --> How to use constructor with the same name in the same class
		
	public ConstructorOverloading() {
		System.out.println("Non argument constructor");
	}
	
	//1. by changing number of parameters
	public ConstructorOverloading(String str) {
		
	}
	
	ConstructorOverloading(String str, String str1){
		
	}
	
	//2. by chancing type of parameters
	ConstructorOverloading(int num){
		
	}

}
