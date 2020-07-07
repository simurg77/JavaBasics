package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies ---> you are healthy
		// otherwise:
		// if peanut allergy : Don't eat peanut
		// Lactose allergy: Don't drink milk
		// bee allergy: Don't mess with bees
		// seafood allergy: Don't eat fish

		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = true;
		boolean bee = true;

		if (!allergies) {
			System.out.println("You are healty");
		} else {
			if (peanut) {
				System.out.println("Don't eat peanut");
			}
			if (lactose) {
				System.out.println("Don't eat drink");
			}
			if (bee) {
				System.out.println("Don't mess with bees");
			}
		}

	}

}
