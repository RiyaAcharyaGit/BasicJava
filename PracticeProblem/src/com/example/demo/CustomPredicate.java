package com.example.demo;

import java.util.function.Predicate;

public class CustomPredicate  implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> custom=new CustomPredicate();
		boolean test = custom.test(8);
		System.out.println(test+" -this is custom predicate");

	}
	

	
}
