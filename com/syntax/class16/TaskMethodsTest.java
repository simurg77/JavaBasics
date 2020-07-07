package com.syntax.class16;

public class TaskMethodsTest {

	public static void main(String[] args) {
		
		TaskMethods obj = new TaskMethods();
		
		System.out.println("---- larger number -------");
		
		obj.larger(10, 11);
		
		System.out.println("---- even or odd number -------");
		
		obj.evenOdd(100);
		
		System.out.println("---- palindrome -------");
		
		obj.palindrome("level");
		
		System.out.println("---- country -------");
		
		obj.sayHello("USA");
		
		obj.sayHello("Egypt");
		
		
	}

}
