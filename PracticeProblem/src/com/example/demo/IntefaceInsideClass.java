package com.example.demo;

public class IntefaceInsideClass {
	

		   interface myInterface {
		      void demo();
		   }
		   class Inner implements myInterface {
		      public void demo() {
		         System.out.println("Interface Inside a class");
		      }
		   }
		   public static void main(String args[]) {
		      Inner obj = new IntefaceInsideClass().new Inner();
		      obj.demo();
		   }
		}

