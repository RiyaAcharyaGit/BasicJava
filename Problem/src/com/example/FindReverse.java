package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindReverse {

	public static void main(String[] args) {
		//List<St> l=Arrays.asList(2,5,9,6,6,4);
		List<String> k = Arrays.asList("Riua","kkkfghjkkkkkk","fjkehf");
		int orElse = k.stream().mapToInt(String :: length).max().orElse(0);
		String string = k.stream().max(Comparator.comparing(String :: length)).get();
        Collections.reverse(k);
        System.out.println(k);
        
		
		//k.stream().map(null)
		System.out.println(orElse);
		System.out.println(string);
		
	}

}

