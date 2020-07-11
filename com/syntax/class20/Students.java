package com.syntax.class20;

public class Students {
//	Write a java program of Class Students that takes students name and 3 subject grades. 
//	Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name.

	String stName;
	int mathGrade, scienceGrade, historyGrade;

	int avarage() {
		int result = (mathGrade + scienceGrade + historyGrade) / 3;

		return result;

	}

	Students(String name, int mGrade, int sGrade, int hGrade) {
		stName = name;
		mathGrade = mGrade;
		scienceGrade = sGrade;
		historyGrade = hGrade;
	}

	void displayInfo() {
		System.out.println(" Avarage of " + stName + " = " + avarage());
	}

}
