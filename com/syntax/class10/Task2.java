package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
//		2.Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).

		String[] names = new String[3];

		names[0] = "Mustafa";
		names[1] = "Kemal";
		names[2] = "Pasa";

		System.out.println(names.length);

		System.out.println("-----------------------");

		String[] name = { "Mustafa", "Kemal", "Pasa" };

		System.out.println(names[0] + " " + names[1] + " " + names[2]);

		// 1st way
		String[] names1 = new String[2];

		names1[0] = "Ihsan";
		names1[1] = "Ozcan";

		System.out.println(names1[0] + " " + names1[1]);

		System.out.println("-------2nd way---------");

		// 2nd way
		String[] name1 = { "ihsan", "Ozcan" };

		System.out.print(name1[0] + " " + name1[1]);

	}

}
