package com.example.demo;

public class OuterClass {
	
	    private static int staticVar = 10;
	    private int instanceVar = 20;

	    // Static inner class
	    public static class StaticInnerClass {
	        public void display() {
	            System.out.println("Static var: " + staticVar);
	         
	        }
	    }

	    // Non-static inner class
	    public class InnerClass {
	        public void display1() {
	            System.out.println("Instance var: " + instanceVar);
	            System.out.println("Static var: " + staticVar);
	        }
	    }

	    public static void main(String[] args) {
	        // Creating an instance of static inner class
	        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
	        staticInner.display(); // Output: Static var: 10

	        // Creating an instance of non-static inner class
	        OuterClass outer = new OuterClass();
	        OuterClass.InnerClass inner = outer.new InnerClass();
	        inner.display1(); // Output: Instance var: 20 Static var: 10
	      
	    }
	}


