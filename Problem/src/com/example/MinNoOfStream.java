package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MinNoOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);
		System.out.println(list);
	 Integer integer = list.stream()
         .min(Integer:: compare).get();  
	 Integer integer2 = list.stream().min(Comparator.naturalOrder()).get();
	 System.out.println(integer2);
	 //list.stream().
	System.out.println(integer);
	//MIn no of string
	List<String> list1= new ArrayList<>();
	list1.add("fd");
	list1.add("ghd");
	list1.add("hdsj");
	list1.add("hdfkj");
	list1.add("yuiii");
	list1.add("dhkk");

	System.out.println(list1);
	String string = list1.stream().min(Comparator.comparing(String::length)).get();
System.out.println(string);
//Reverse String
 String  string2 = "waesrdxfcgbhjkml";
 char[] charArray = string2.toCharArray();
 String  string3 ="";
 for(int i=charArray.length-1; i>=0;i--)
 {
	 
	 string3+=charArray[i];
	 
 }
 System.out.println(string3);
	}

}
