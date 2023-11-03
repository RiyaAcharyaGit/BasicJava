package com.example;

import java.util.Arrays;

import java.util.Comparator;


public class ReverseArray {

	public static void main(String[] args) {
		int ip=0;
		System.out.println(ip);
		// TODO Auto-generated method stub'
		int arr[] = {1,2,3,4,100,6};
		String arr1[]= {"rrr","yyyyyyyyy","sssssssss"};
		int temp=arr[0];
		String temp1= arr1[0];
// reverse array element
		for(int i = arr.length -1;i>=0;i--)
		{
			
			System.out.println(arr[i]);
			
		}
		
//Sorting
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			System.out.println(arr[i]+" sorting of element");
		}
		//Reverse sorting
		System.out.println(Arrays.toString(arr));
		int[] array = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
		Arrays.sort(arr);
		System.out.println("sorting"+array);
		
		  
//find max element 
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
			}
		}
		System.out.println("dfghjkl <>" + temp);
//reverse the string

		for(int j= arr1.length -1;j>=0;j--)
		{
			
			System.out.println(arr1[j]);
			
		}
// find max length of string
		for(int i = 0;i<arr1.length;i++)
		{
			if(arr1[i].length()>temp1.length())
			{
				temp1=arr1[i];
			}
		}
		System.out.println("hdgjslj "+temp1);
  
	//sorting of string
	
	
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
	Arrays.sort(arr1,Comparator.reverseOrder());
	System.out.println(Arrays.toString(arr1));
	

}
}
