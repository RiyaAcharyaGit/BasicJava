package com.example.demo;
class A{
	public void name() {
		System.out.println("AAAAA");
		
	}

}
class C
{
	public void roll() {
		A a  =  new A()
				{
			public void name() {
				System.out.println("Annonomyous class");
				
			}
				};
		a.name();
	}
}

public class Innerlass extends C {

	public static void main(String[] args) {
		C c  = new C();
		c.roll();	

	}

}
