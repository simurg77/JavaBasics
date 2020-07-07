package com.syntax.class17;

public class Task {
	// Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com

	String createEmail(String name, String lastName, String eMail) {
		
		// 1st way
		//String emailAdres = (name + lastName + "@" + eMail + ".com").toLowerCase();
		// 2nd way
		String email = name + lastName + "@" + eMail + ".com";
		
		return email.toLowerCase();
	}

	// Write a method to return whether given number is prime or not?

	boolean isPrime(int a) {
		boolean prime = true;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				prime = false;
			}
		}
		return prime;
	}

	
}
