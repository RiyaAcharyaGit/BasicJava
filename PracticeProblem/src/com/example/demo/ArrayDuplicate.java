package com.example.demo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int arr[]= {8,2,1,0,2,5};
	Arrays.stream(arr).distinct().forEach(System.out::println);
	//*************sum
	int sum = Arrays.stream(arr).sum();
	System.out.println(sum);
	}

}
