package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorEx {

	public static void main(String[] args) {
		
        List<String> strings = new ArrayList<>();
        
        strings.add("apple");
        strings.add("banna");
        strings.add("graps");
        
        String collect = strings.stream().collect(Collectors.joining(","));
        System.out.println(collect);
       

    }

}
