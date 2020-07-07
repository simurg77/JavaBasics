package com.syntax.class15;

public class HomeWork4 {

	public static void main(String[] args) {
		// How would you swap 2 strings without a temporary variable?

		String str1 = "I like spring";
		String str2 = "I don't like winter ";

		str1 = str1.concat(str2);

		str2 = str1.substring(0, str1.length() - str2.length());

		str1 = str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);

//		int size1 = str1.length();
//		int size2 = str2.length();
//
//		str1 = str1.concat(str2);     // str1 = str1+str2;    ahmet+can = ahmetcan -- 8
//		
//		size1 = str1.length();
//
//		str2 = str1.substring(0, size1 - size2);   // str2 = str1-str2     ahmetcan-can = ahmet ----5
//		
//		size2 = str2.length();
//		
//		str1 = str1.substring(size2);					  // str1 = str1-str2     ahmetcan-ahmet = can
//		

	}

}
