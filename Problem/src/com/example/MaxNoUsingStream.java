package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxNoUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);
		
		Integer integer = list.stream().max(Comparator.naturalOrder()).get();
		Integer integer2 = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer integer3 = list.stream().max(Integer::compare).get();
		System.out.println(integer);
		System.out.println(integer2);
		System.out.println(integer3);
		// max no using string
		List<String> list1= new ArrayList<>();
		list1.add("fd");
		list1.add("ghd");
		list1.add("hdsj");
		list1.add("hdfkj");
		list1.add("yuiiijk");
		list1.add("dhkk");
		String string = list1.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(string);
		int length = string.length();
		System.out.println(length);
	}

}
