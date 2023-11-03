package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StartingWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(50);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);
        list.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
        Long collect = list.stream().collect(Collectors.counting());
        System.out.println("total count "+collect);
        Integer integer = list.stream().findFirst().get();
        System.out.println(integer);
      Integer integer2 = list.stream().max(Integer::compare).get();
      System.out.println(integer2);
	}

}
