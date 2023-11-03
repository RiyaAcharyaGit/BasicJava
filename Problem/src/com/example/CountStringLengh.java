package com.example;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class CountStringLengh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1= new ArrayList<>();
		list1.add("fd");
		list1.add("ghd");
		list1.add("hdsj");
		list1.add("hdfkj");
		list1.add("yuiiijk");
		list1.add("dhkk");
		List<String> collect = list1.stream().filter(i-> i.length()>3 ).collect(Collectors.toList());
		long count = list1.stream().filter(i-> i.length()>3 ).count();
		System.out.println(collect);
		System.out.println(count);
		
	}

}
