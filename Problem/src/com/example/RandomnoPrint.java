package com.example;


import java.util.Random;

public class RandomnoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		random.ints().limit(18).forEach(System.out::println);
				
		

	}

}
