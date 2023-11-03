package com.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Riya","Achaya","Rahul","xoxo");
		
		Iterator<String> next = list.iterator();
		
	while(next.hasNext())
		{
			System.out.println(next.next());
            
		}
	
	
		


	}

}
