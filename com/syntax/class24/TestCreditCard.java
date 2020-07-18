package com.syntax.class24;

public class TestCreditCard {
	public static void main(String[] args) {
		
		CreditCard cd = new CreditCard(900);
		cd.calculateInterest();
		
		Visa vs= new Visa(3000);
		vs.calculateInterest();
		
		
		AX ax = new AX(2500);
		ax.calculateInterest();
		
		
				
		
	}

}
