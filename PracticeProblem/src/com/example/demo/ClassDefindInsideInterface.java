package com.example.demo;

public interface ClassDefindInsideInterface {
	class MyNestedClass {
	    int x = 10;

	    public void doSomething() {
	      System.out.println("Hello from MyNestedClass");
	    }
	  }
	}

	 class MyClass implements ClassDefindInsideInterface {
		  MyNestedClass myNestedClass = new MyNestedClass();
	  public static void main(String[] args) {
		
	    MyClass myClass = new MyClass();
	    myClass.myNestedClass.doSomething();
	  }
	}

