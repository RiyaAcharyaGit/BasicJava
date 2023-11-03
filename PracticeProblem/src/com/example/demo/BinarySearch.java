package com.example.demo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {2,55,-1,5};
		int arr[]= {-1,2,5,55};
		int key = 5;
		 int binarySearch = Arrays.binarySearch(arr, key);
		 System.out.println(" <>"+binarySearch);

	}

}
