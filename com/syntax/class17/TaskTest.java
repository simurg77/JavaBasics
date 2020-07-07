package com.syntax.class17;

public class TaskTest {

	public static void main(String[] args) {
		
		Task obj = new Task();
		
		String email = obj.createEmail("IhSan", "oZcaN", "hotmail");
		
		
		System.out.println(email);
		
		System.out.println("----------------------");
		
		boolean prime = obj.isPrime(23);
		
		if(prime) {
			System.out.println("This number is prime number");
		}else {
			System.out.println("This number is NOT prime number");
		}
		
		
		
		System.out.println("----------------------");
		Student student = new Student();
		
		char grade = student.getGrade(91);
		 
		 System.out.println(grade);
		 
		 
		
		

	}

}
