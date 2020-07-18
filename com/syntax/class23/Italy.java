package com.syntax.class23;

class Country {
	
	String name;
	
	Country(String name){
		this.name=name;
	}
}

public class Italy extends Country {
	
	String food;
	
	Italy(String name, String food){
		super(name);
		this.food=food;
	}
	
	public void displayInfo() {
		System.out.println("I visit "+name+" to eat "+food);
	}
	
	public static void main(String[] args) {
		
		Italy obj = new Italy("Italy", "Pasta");
		obj.displayInfo();
	}

}


