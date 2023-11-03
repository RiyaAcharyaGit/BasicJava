package com.example.demo;
// immutable class or object is called when er can not change its satate or value once its created.
//class member should be private
//only getter method 
//no setter method
final class  Main{
	private int roll;
	private String name;
	public Main(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	
	
}
public class CustomImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main=new Main(8, "riya ");
		String name = main.getName();
System.out.println(name);
	}

}
