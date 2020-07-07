package com.syntax.class04;

public class MoreNestedIf {
	public static void main(String[] args) {
		// Let's have a date of month and a day of week
		// If it is Friday ---> We are going to watch a movie
		// if date is 13 ---> Watch a scary movie
		// if date is not 13 ---> Watch a comedy
		// If it is not Friday --> We are going to study JAVA

		boolean isFriday = true;
		int date = 7;

		if (isFriday) {
			System.out.println("We are going to watch a movie");
			if (date == 13) {
				System.out.println("Watch a scary movie");
			} else {
				System.out.println("Watch a comedy");
			}
		} else {
			System.out.println("We are going to study JAVA");
		}

	}

}
