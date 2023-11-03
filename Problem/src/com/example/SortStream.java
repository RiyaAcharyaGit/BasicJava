package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);
//		list.stream().peek(i->System.out.println("okay test peak"+i)).collect(Collectors.toList());
		list.parallelStream().forEach(i->System.out.println(i));
		
//		list.stream().sorted().forEach(i->System.out.println(i));
		Optional<Integer> reduce = list.stream().reduce((a,b)->(a+b));
		reduce.ifPresent(System.out::println);
//		System.out.println("sortig at dec order");
//		list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
//		System.out.println("sortig use comparele is sort asic of sigle elemet");
//	Collections.sort(list);
//	for(int i : list)
//	{
//		System.out.println(i);
//	}
//
//	}
//	
	}
}
