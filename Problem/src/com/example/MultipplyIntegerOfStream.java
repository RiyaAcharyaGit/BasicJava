package com.example;

import java.util.ArrayList;
import java.util.List;

public class MultipplyIntegerOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);
		System.out.println(list);
	    list.stream().map(i->i*3).forEach(System.out::println);
		

	}

}
