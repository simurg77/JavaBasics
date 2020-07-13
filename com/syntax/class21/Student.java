package com.syntax.class21;

public class Student {
//	Write a Student class that have instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method.
	
	String name;
	String adress;
	
	
	Student(String name, String adress){
		this.name=name;
		this.adress=adress;
		
	}
	
	void displayInfo() {
		System.out.println("Student name is "+name+" and adress is "+adress);
		
	}
	
	public static void main(String[] args) {
		
		Student obj =new Student("Ali", "111 Helen st");
		
		obj.displayInfo();
		
	}
}
