package com.example;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello"); // Creates a new string object
		String str2 = "Hello"; // String literal, already exists in the pool

		String internedStr1 = str1.intern(); // Puts str1 into the pool if not already there
		String internedStr2 = str2.intern(); // Returns the existing reference from the pool

		System.out.println(internedStr1 == str2); // true, they share the same reference
		System.out.println(str1==str2.intern());

	}

}
