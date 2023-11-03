package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElemet {

	public static void main(String[] args) {
	
		List<String> list1= new ArrayList<>();
		list1.add("fd");
		list1.add("ghd");
		list1.add("hdsj");
		list1.add("hdfkj");
		list1.add("yuiiijk");
		list1.add("ghd");
		System.out.println(list1);
		Set<String> collect = list1.stream().collect(Collectors.toSet());
		System.out.println(collect);
		Map<String, Long> collect2 = list1.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));
		System.out.println(collect2);
		collect2.forEach((k,v)->{
			if(v>1)
			{
				System.out.println(k+" "+ v);
			}
		});
		Collections.reverse(list1);
	}

}
