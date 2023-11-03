package com.example;

import java.lang.reflect.Array;

import com.example.A.InnerClass;
import com.example.A.InnerInterface;
import com.example.A.Student;
import com.example.B.InsideInterface;
import com.example.B.NestedInterface;
interface B{
	class InsideInterface{
		void abc() {
			System.out.println("Inside Interfaec B");
		}
	}
	interface NestedInterface{
		default void abcd() {
			System.out.println("Inside Interfaec B");
		}
	}
}
class A{
	static void method()
	{
		System.out.println("static called");
	}
	void ab() {
		System.out.println("Non static called");
	}
	static class Student{
		void roll() {
			System.out.println("Static inner class roll no is : 29");
		}
	}
	class InnerClass{
		void roll() {
			System.out.println("Non Static inner class roll no is : 21");
		}
	}
	interface InnerInterface{
		default void roll() {
			System.out.println("Inside interface roll no is : 21");
		}
	}	
}
//for static method we dont have to create obj to calld any static method but for non static method
//but for non static method to called in static method we have to create object 

public class StaticEx{
	//InsideInterface insideInterfaceClass= new InsideInterface();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=null;
		A a1= new A();
		a1.method();
 Student student = new A.Student();
InnerClass innerClass = a1. new InnerClass();

A.InnerInterface innerInterface = new A.InnerInterface() { 
	
@Override

	public void roll() {
		System.out.println("Inside interface roll no is : 21");
}
};
innerInterface.roll();

InsideInterface insideInterface = new B.InsideInterface();
insideInterface.abc();
NestedInterface nestedInterface = new B.NestedInterface() {
	@Override
	public void abcd() {
		System.out.println("Inside Interfaec B");
	}
};
nestedInterface.abcd();

//		A.method();
//		String s = null;
//		s.length();
//		

	}

}
