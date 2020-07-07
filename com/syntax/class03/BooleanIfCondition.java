package com.syntax.class03;

public class BooleanIfCondition {
	public static void main(String[] args) {

		boolean flag = false;
		if (flag) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		System.out.println(flag);

		// if you want to check if flag == false
		// ! (exclamation mark will (reserve the condition) / (the opposite of the
		// condition)
		if (!flag) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

	}

}
