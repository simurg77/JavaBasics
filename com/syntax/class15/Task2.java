package com.syntax.class15;

public class Task2 {
	public static void main(String[] args) {
//	Create a String that should be combination of letters, numbers and special characters. 
//	Find out how many alpha characters are there in the String.
		
		// one of the interview question
		String str = "klmsaj3k399346yjn62290#66%*hshsk@a";

		int strSize = str.replaceAll("[^A-Za-z]", "").length();
		
		System.out.println(strSize);

	}

}
