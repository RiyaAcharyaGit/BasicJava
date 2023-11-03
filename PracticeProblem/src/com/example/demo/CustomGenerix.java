package com.example.demo;
class Genericss<T>{
	private T id;
	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
public class CustomGenerix {
	public static void main(String[] args) {
		Genericss<String> gen= new Genericss();
		gen.setId("34");
		System.out.println(gen.getId());
		Genericss<Integer> gen1= new Genericss();
		gen1.setId(5);
		System.out.println(gen1.getId());
         
	}
	
}
