package com.example.demo;
class Student{
	

	private final int age;
	private final String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
			
}

public class ImMutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student(1,"abc");
		
		System.out.println(s.getName());

	}

}
