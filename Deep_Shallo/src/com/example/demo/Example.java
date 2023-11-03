package com.example.demo;

public class Example {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Address address=new Address("andal","india");
		Copy copy=new Copy(2,"riya",address);
		
		Copy obj1= (Copy) copy.clone();
				System.out.println(obj1.toString());
		System.out.println(copy.toString());
		obj1.address.place="delhi";
		System.out.println(obj1.toString());
		System.out.println(copy.toString());


	}

}

