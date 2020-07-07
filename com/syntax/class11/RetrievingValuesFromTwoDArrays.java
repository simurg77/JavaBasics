package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {

	public static void main(String[] args) {
		// Put the months for each season in one row

		String[][] months = { 
				{ "December", "January", "February" }, 
				{ "March", "April", "May" },
				{ "June", "July", "August" }, 
				{ "September", "October", "December" } 
				};

		int rows = months.length; // how many arrays/rows are inside?
		System.out.println(rows + " rows");

		int winterLength = months[0].length; // how many elements/columns are in row with index 0?
		System.out.println(winterLength + " months in row with index 0");
		
		int lastRowSize = months[rows - 1].length;
	//  int lastRowSize = months[months.length-1].length;   ---------------> second way
		System.out.println(lastRowSize + " months in last row index");

		System.out.println();
		// Nested loops are married (joke) to 2D Arrays
		for (int row = 0; row < months.length; row++) { // iterating over rows

			for (int col = 0; col < months[row].length; col++) { // iterating over columns
				System.out.print(months[row][col] + " ");
			}

			System.out.println();

		}
	}

}
