package com.syntax.class14;

public class StringDifference {
	public static void main(String[] args) {

		String name = "Madeeha"; // ----> literal way, most popular..

		String name1 = new String("Madeeha");
		// name1 = "Madeeha";

		System.out.println(name);
		System.out.println(name1);

		if (name.equals(name1)) {
			System.out.println("String are equal using equals method");

		}

		if (name == name1) {
			System.out.println("String are equal using == operator");
			// ----> this should not be work
			// don't use this way
		}
		
		String name2 = "Madeeha";    // ---> Dosen't work
		
		if(name1 == name2) {
			System.out.println("2 Strings are equal");
		}
		
		

	}

}
