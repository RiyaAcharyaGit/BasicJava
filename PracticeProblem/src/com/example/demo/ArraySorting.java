package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class ArraySorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,2,1,0,85,-8};
	//******sorting in reverse order
		 Arrays.sort(arr);
		for(int i= 0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;	
		}
		 System.out.println(Arrays.toString(arr));
//***********2nd way reverse order sortiong	
		 Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		 System.out.println();
	        List<Integer> list = Arrays.asList(integerArray);
//		List<int[]> asList = Arrays.asList(arr);
	//Arrays.sort(arr);
	Collections.sort(list, Collections.reverseOrder());
	Object[] array = list.toArray();
	System.out.println(""+Arrays.toString(array));
	//*************find min of an array
	OptionalInt min = Arrays.stream(arr).min();
	int orElse = min.orElse(0);
	System.out.println(""+orElse);
	//****find max value of an array
	int max = Arrays.stream(arr).max().orElse(0);
	System.out.println(""+max);
	
	
	


	}

}
