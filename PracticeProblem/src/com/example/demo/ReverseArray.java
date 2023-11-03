package com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
	int arr[]= {8,5,1,0};
	System.out.println(arr.length);
	Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
	List<Integer> asList = Arrays.asList(array);	
	Collections.reverse(asList);
	Object[] array2 = asList.toArray();
	System.out.println(Arrays.toString(array2));
	
	for(int i=0;i<arr.length/2;i++) {
		int temp= arr[i];
		arr[i]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
	}
	System.out.println(Arrays.toString(arr));
	}

}
