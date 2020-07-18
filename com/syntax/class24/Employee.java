package com.syntax.class24;

public class Employee {
	
	double salary;
	
	void getPaid() { // overridden method 
		System.out.println("Employee gets paid salary = "+salary);
	}
	
}

class Contractor extends Employee{
	
	double hourylRate;
	
	void getPaid() {// overriding method
		System.out.println("Contractor gets paid hourly rate = "+hourylRate);
	}
}

class FulltimeEmployee extends Employee{
	
}
