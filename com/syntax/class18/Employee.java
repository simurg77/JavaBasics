package com.syntax.class18;

public class Employee {
//	Create three  variables  eID , salary and set the CEO to “Sumair” 
//	Create two objects of the class Employee 
//	Set the value of eID, salary for each of the objects
//	Print out the eID , salary and  CEO for each of the objects

	int eID;
	int salary;
	
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.eID = 3456;
		obj1.salary = 5000;
		
		System.out.println("Ceo is "+Employee.CEO+ " first employee ID is "+obj1.eID+" and employee salary is "+obj1.salary);
		
		
		Employee obj2 = new Employee();
		obj2.eID = 4567;
		obj2.salary = 4000;
		
		System.out.println("Ceo is "+Employee.CEO+ " second employee ID is "+obj2.eID+" and employee salary is "+obj2.salary);
	}
	
	
}
