package com.syntax.class24;

public class CreditCard {
//	Create a class CreditCard and define variable balance and interest. 
//  Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.
	
	double balance, interest;
	
	CreditCard(double balance){
		this.balance=balance;
	}
	
	void calculateInterest() {
		
		if(balance<1000) {
			interest=2.5;
		}else {
			interest=1.5;
		}
		System.out.println(interest);
	}

}

class Visa extends CreditCard{
	
	Visa(double balance){
		super(balance);
	}
}

class AX extends CreditCard{
	
	AX(double balance){
		super(balance);
	}
	
	@Override
	void calculateInterest() {
		
		if(balance<2000) {
			interest=2.2;
		}else {
			interest=1.2;
		}
		System.out.println(interest);
	}
}




