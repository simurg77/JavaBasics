package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.

		Scanner scan = new Scanner(System.in);

		System.out.println("Which country do you live?");
		String country = scan.nextLine();
		String language;

		switch (country) {
		case "Spain":
			language = "Spanish";
			break;
		case "France":
			language = "French";
			break;
		case "Germany":
			language = "German";
			break;
		case "Austuralia":
		case "Canada":
			language = "English";
			break;
		default:
			language = "Unknown";
		}
		System.out.println("Your language is " + language);
	}

}
