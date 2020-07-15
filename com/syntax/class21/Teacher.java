package com.syntax.class21;

public class Teacher {
	
	String name, lastName, lesson, subject;
	int age;
	
	public void teachWell() {
		System.out.println("All teachers know well their "+subject);
	}
	
	public void knowWell() {
		System.out.println("All teachers teach well their "+lesson);
	}
	
	public void love() {
		System.out.println("All teachers love their students");
	}
	
	public void displayInfo() {
		System.out.println(age +" years old "+subject+
				" teacher "+name+" "+lastName+" has good experience");
	}

}
