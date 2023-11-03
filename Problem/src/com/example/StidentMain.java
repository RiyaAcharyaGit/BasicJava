package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StidentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "rr");
		Student student2 = new Student(2, "rr");
		Student student3 = new Student(3, "pp");
		List<Student> list= new ArrayList<>();
		list.add(student3);
		list.add(student2);
		list.add(student);
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(k->k.getName(),Collectors.counting()));
		collect.forEach((key,v)->{
			if(v>1)
			{
				System.out.println(key+" times "+v);
			}
		});

	}

}
