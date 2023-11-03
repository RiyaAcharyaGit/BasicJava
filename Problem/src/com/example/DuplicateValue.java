package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateValue {

	public static void main(String[] args) {
		List<String>list= new ArrayList<>();
		list.add("aa");
		list.add("kk");
		list.add("aac");
		list.add("pp");
		list.add("pp");
		System.out.println(list);
		Set<String> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);
		//frequency count only the given value 
		//groupingby() strong the object by some prop in map
		int frequency = Collections.frequency(list, "aa");
		System.out.println(frequency);
		Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));
		System.out.println(collect2);
		collect2.forEach((k,v)->{
			if(v>1)
			{
				System.out.println(k+" "+ v);
			}
		});
	}

}
