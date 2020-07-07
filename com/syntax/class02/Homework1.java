package com.syntax.class02;

public class Homework1 {
	// Create a Java Program (class) and name it PracticeVariables.
	// create variables for all 8 primitive Data Types (byte, short, int, long,
	// float, double, char, boolean).
	// i want you to print out each variable
	// on a separate line and test its number range (capacity).

	public static void main(String[] args) {
		byte maria = 78; // from -128 to +127
		short malika = 10; // -32768 to 32767

		// variable declaration
		int umarZahid; // -2,147,483,648 to 2,147,483,647
		// assign a value to the variable
		umarZahid = 3;
		// re-assign another value to the variable
		umarZahid = 57;

		// variable declaration and assign in one step
		int ummarZahid = 2359;

		long tatiana = 42526626278L;

		double raman = 3.4;
		float olga = 7.57f;

		char bulat = '$';
		char kamila1 = 'm';
		char kamila2 = 'M'; // value in kamila1 is not the same with value in kamila2
		char metin = ' ';

		boolean ksenia = true;

		System.out.println(maria);
		// sout + ctrl + space
		// syso + ctrl + space
		// sysout + ctrl + space

		System.out.println(malika);
		System.out.println(umarZahid);
		System.out.println(tatiana);
		System.out.println(raman);
		System.out.println(olga);
		System.out.println(bulat);
		System.out.println(kamila1);
		System.out.println(ksenia);

		int murod123zhon = 2938;
		System.out.println(murod123zhon);
		murod123zhon = 45;
		System.out.println(murod123zhon);

		// declaring multiple variable in one line
		// they should be of the same data type(int)
		int murod1 = 3, murod2 = 70, murod3;

	}

}
