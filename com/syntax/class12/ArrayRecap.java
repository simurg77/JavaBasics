package com.syntax.class12;

public class ArrayRecap {

	public static void main(String[] args) {

		String[] colors = new String[3];
		colors[0] = "blue";
		colors[1] = "yellow";
		colors[2] = "red";

		System.out.println(colors.length);

		for (int i = 0; i < colors.length; i++) {
			// System.out.println(colors[b]);  --> 1st way we can print the value like this
			String color = colors[i];   // --> 2nd way we can store the value and print the variable
			System.out.println(color);  
		}

	}

	
	
}
