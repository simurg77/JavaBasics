package com.syntax.class24;

public class Bank {

	double money, fee;
	
	Bank(double money){
		this.money=money;
	}

	void chargeFee() {
		if (money < 1000) {
			fee = money * 0.01;
		} else {
			fee = 0;
		}
	}

}
