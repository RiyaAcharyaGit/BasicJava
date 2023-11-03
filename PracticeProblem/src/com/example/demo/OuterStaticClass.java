package com.example.demo;

public class OuterStaticClass {
	   private static int outerData = 10;

	    public static class InnerClass {
	        private int innerData = 20;

	        public void printData() {
	            System.out.println("Outer data: " + outerData);
	            System.out.println("Inner data: " + innerData);
	        }
	    }
	    public static void main(String[] args) {
	    	
	    }
}
