package com.syntax.class23;

public class IceCreamTest {
	public static void main(String[] args) {
		
		IceCream c1= new IceCream("banana", "KLM", "orange");
		c1.info();
		
		Gelato g1 = new Gelato("Strawberry", "BR", "pink", 1);
		g1.info();
		
		Gelato g2 = new Gelato("mint", "magnum", "green", 2);
		g2.info();
		
		Sorbeto s1 = new Sorbeto("vanilia", "Algida", "black", 2.5);
		s1.info();
		
		miniSorbeto ms1 = new miniSorbeto("cherry", "GRS", "brownn", 3.99, 14);
		ms1.info();
		
	
	}

}
