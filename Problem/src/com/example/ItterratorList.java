package com.example;

import java.util.Arrays;
import java.util.List;

public class ItterratorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,8,80);
		int index=0;
		for(int res:list) {
			System.out.println(res + "value is :"+ index);
			index++;
		}
		// list.forEach((res,index)-> System.out.println(index +"value "+list));
	}

}
