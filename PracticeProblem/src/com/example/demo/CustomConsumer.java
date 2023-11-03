package com.example.demo;

import java.util.function.Consumer;

public class CustomConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("this is custom consumer");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> custom =new CustomConsumer();
		custom.accept("hello");
		System.out.println("okay custom");

	}

	

}
