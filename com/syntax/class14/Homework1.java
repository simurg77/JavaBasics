package com.syntax.class14;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
// HW continue asking user for username & password until all requirement are
// met and credentials are created

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter username");
		String username = scan.nextLine();
		System.out.println("Please enter password");
		String password = scan.nextLine();

		
		if (username.isEmpty() || password.isEmpty()) {

			System.out.println("Username and Password cannot be empty");
		} else {

			if (password.length() >= 8) {

				if (!password.contains(username)) {
					System.out.println("Please confirm your password");
					String confirm = scan.nextLine();

					if (password.equals(confirm)) {
						System.out.println("Your username and password has been created");

					} else {
						System.out.println("Passwords do not match");
					}
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}
		}

	}

}
