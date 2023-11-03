package com.example.demo;

public class StaticMethodCalled {
	public void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public static void staticMethod() {
    	StaticMethodCalled obj = new StaticMethodCalled();
        obj.nonStaticMethod();
    }

    public static void main(String[] args) {
        staticMethod();
    }

	

}
