package com.syntax.class18;

public class Students {

	String studentName;
	int studentId;
	
	static int numberOfStudent =20;
	
	
	public static void main(String[] args) {
		
		Students obj1 = new Students();
		obj1.studentName ="Tony";
		obj1.studentId = 17;
		numberOfStudent++;
		
		Students obj2 = new Students();
		obj2.studentId = 11;
		obj2.studentName ="Marry";
		numberOfStudent+=2;
		
		Students obj3 = new Students();
		obj3.studentName ="Ali";
		obj3.studentId = 14;
		numberOfStudent+=5;
		
		System.out.println("Number of students "+numberOfStudent);
		
	}
}
