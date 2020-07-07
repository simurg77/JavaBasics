package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {

//		3.Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using elements of array: “Saturday is Java coding Day”.

		// 1st way
		String[] words = new String[5];

		words[0] = "Java";
		words[1] = "is";
		words[2] = "Saturday";
		words[3] = "day";
		words[4] = "coding";

		System.out.println(words[2] + " " + words[1] + " " + words[0] + " " + words[4] + " " + words[3]);

		// 2nd way
		String[] words1 = { "Java", "is", "Saturday", "day", "coding" };

		System.out.println(words[2] + " " + words[1] + " " + words[0] + " " + words[4] + " " + words[3]);

	}

}
