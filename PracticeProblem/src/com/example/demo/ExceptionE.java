package com.example.demo;

public class ExceptionE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(" NOT Caught NullPointerException");
			String str = null;
			 //This will throw a NullPointerException
			int length = str.length();
			} catch (Exception e) {
			 //System.out.println("Caught NullPointerException");
			System.exit(1); // Exiting the program
			} finally {
			System.out.println("Inside finally block");
			}


	}

}
