package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(50);
		list.add(3);
		list.add(100);
		list.add(8);
		list.add(15);
		list.add(12);

     
        List<Integer> newList = new ArrayList<>();
        for (Integer number : list) {
            if (String.valueOf(number).startsWith("1")) {
                newList.add(number);
            }
        }
        System.out.println(newList);
        
        //****************************************
        String name = "Riyaaa";
        String reverseString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseString += name.charAt(i);
        }
        System.out.println("The reversed string is: " + reverseString);



        int duplicateCount = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    duplicateCount++;
          
                    System.out.println(name.charAt(i) + "  is  :" +duplicateCount);
                }
            }
        }
        //*****************************************
        

       
	}

}
