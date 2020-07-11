package com.syntax.class20;

public class StudentsTest {
	public static void main(String[] args) {
		
		Students student1=new Students("Ali", 90, 86, 87);
		
		Students student2=new Students("Ahmet", 80, 81, 97); 
		
		Students student3=new Students("Tony", 78, 69, 97); 
		
		Students student4=new Students("Mary", 94, 88, 77); 
		
		Students student5=new Students("Liz", 70, 96, 89); 
			
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		student5.displayInfo();
		
	}

}
