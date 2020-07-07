package com.syntax.class08;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		// We are playing a lottery game and the lucky number is 17; We want to keep
		// asking the user to enter any numbers from 1-20; until he guesses the lucky
		// number --> In that case we print "Congrats, you won!"
		// You can try to solve it with do-while or while, whichever is the best
		// choice...

		Scanner scan = new Scanner(System.in);

		int lucky1 = 17;
		int guess1;
		
		System.out.println("------------FIRST WAY----------");
		 
		//if I use while loop, I have to ask two times
		
		System.out.println("Please enter a number 1-20:");
		guess1 = scan.nextInt();

		while (guess1 != lucky1) {
			System.out.println("Please enter a number 1-20:");
			guess1 = scan.nextInt();
		}
		System.out.println("Congrats, you won!");
		
		System.out.println("--------------------------------");
		System.out.println("------------SECOND WAY----------");
		
		// if I use do while loop, I have to ask only one time
		
		int lucky2 = 17;
		int guess2;
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			guess2 = scan.nextInt();

		} while (lucky2 != guess2);

		System.out.println("Congrats, you won!");

	}

}
