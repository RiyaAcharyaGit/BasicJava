package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamItterate {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	List<String> list = new ArrayList<String>();
	list.add("aaa");
	list.add("ac");
	list.add("aammkk");
	list.add("aaarrruuu");
//		list.stream().forEach(System.out::println);
		Iterator<String> hasNext = list.iterator();
		while (hasNext.hasNext()) {
			// System.out.println(hasNext.next());

			int length = hasNext.next().length();
			System.out.println(length);

			if (length < 5) {
				hasNext.remove();
			}
			}
			// hasNext.forEachRemaining(System.out::println);
			System.out.println(list);

		
//		  List<Integer> numbers = new ArrayList<Integer>();
//		    numbers.add(12);
//		    numbers.add(8);
//		    numbers.add(2);
//		    numbers.add(23);
//		    Iterator<Integer> it = numbers.iterator();
//		    while(it.hasNext()) {
//		      Integer i = it.next();
//		      if(i < 10) {
//		        it.remove();
//		      }
//		    }
//		    System.out.println(numbers);
//		
//		
//		

	
	}

}
