package com.example;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class SumElemetStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(1);
		list.add(30);
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		 int sum = list.stream().mapToInt(Integer::intValue ).sum();
		System.out.println(sum);
		List<Integer> collect = list.stream().map(i-> i*i*i).filter(i-> i>50).collect(Collectors.toList());
		System.out.println(collect);
 
	}

}
