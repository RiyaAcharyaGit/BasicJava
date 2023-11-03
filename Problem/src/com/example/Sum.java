package com.example;

import java.util.ArrayList;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);
		int sum = list.stream().mapToInt( e->e).sum();
		System.out.println(sum);
		double orElse2 = list.stream().mapToInt(e->e).average().orElse(0);
		System.out.println(orElse2);

		double orElse = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(orElse);

	}

}
