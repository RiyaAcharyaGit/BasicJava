package com.example.demo;
interface I1 {
	  default void doSomething() {
	    System.out.println("I1");
	  }
	}

	interface I2 {
	  default void doSomething() {
	    System.out.println("I2");
	  }
	}

	class C implements I1, I2 {
	  @Override
	  public void doSomething() {
		  I1.super.doSomething();
	    // This will print "I1" because C does not override doSomething()
	    System.out.println("I1");
	  }
	}
public class ambiguity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
