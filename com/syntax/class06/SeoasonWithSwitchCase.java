package com.syntax.class06;

import java.util.Scanner;

public class SeoasonWithSwitchCase {

	public static void main(String[] args) {
//		Write a program for user to enter his/hers birth month. Based on the month define the season.
//		Example: if user is born in June, July or August → season ="Summer".
//		At the end of the program we should see output as "You were born ______".

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your bith month!");
		String month = scan.nextLine();
		String season;

		switch (month) {
		case "December":
		case "January":
		case "Feruary":
			season = "Winter";
			break;
		case "March":
		case "April":
		case "May":
			season = "Spring";
			break;
		case "June":
		case "July":
		case "August":
			season = "Summer";
			break;
		case "September":
		case "October":
		case "November":
			season = "Fall";
			break;
		default:
			season = "Unknown";
		}
		if(season.equals("Unknown")) {
			System.out.println("Invalid entry!");
		}else {
		System.out.println("You were born in " + season);
		}
	}

}
