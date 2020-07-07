package com.syntax.class11;

public class Task3 {
	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country.(using if or switch)

		String[] countries = { "France", "Spain", "Russia", "Brazil", "Japan" };

		String capital = null;

		for (String country : countries) {

			if (country.equals("France")) {
				capital = "Paris";
			} else if (country.equals("Spain")) {
				capital = "Madrid";
			} else if (country.equals("Russia")) {
				capital = "Moscov";
			} else if (country.equals("Brazil")) {
				capital = "Brasilla";
			} else if (country.equals("Japan")) {
				capital = "Tokyo";
			} else {
				System.out.println("The country " + country + " is not in my list.");
			}

			System.out.println("The capital of " + country + " is " + capital);
		}

		for (int i = 0; i < countries.length; i++) {

			switch (countries[i]) {
			case "France":
				System.out.println("Paris");
				break;
			case "Spain":
				System.out.println("Madrid");
				break;
			case "Russia":
				System.out.println("Moscov");
				break;
			case "Brazil":
				System.out.println("Brasilla");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
			default:
				System.out.println("It is not in my list.");

			}
		}

	}

}
