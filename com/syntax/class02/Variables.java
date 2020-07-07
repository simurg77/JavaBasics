package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		String name = "Ihsan";
		String lastName = "Ozcan";
		char grade = 'A';
		String city = "Pittsburgh";
		String state = "PA";
		int phoneNumber = 412232454;

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		// b
		// Change student’s city, state, phone number and grade. And print those updated
		// values.

		grade = 'B';
		city = "Clevland";
		state = "Ohio";
		phoneNumber = 312646484;

		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		// Task :
		// 1.My name is __ and my last name is ___ .
		// 2.I live in city of __ state __ and my phone number is ___ !

		System.out.println("My name is " + name + " my last name is " + lastName + '.');
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber + '!');

	}

}
