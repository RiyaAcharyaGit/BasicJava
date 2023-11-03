package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
	public int stRoll;
	public String name;
	


	public Student1(int stRoll, String name) {
		super();
		this.stRoll = stRoll;
		this.name = name;
	}


	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
//		if(stRoll==o.stRoll) {
//			return 0;
//		}
//		else if( stRoll> o.stRoll) {
//			
//			return 1;
//		}else {
//		return -1;
//		}
//	}
		return 0;
	
}	
}

public class Comparetor {

	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();  
		al.add(new Student1(101,"Vijay"));  
		al.add(new Student1(102,"Ajay"));  
		al.add(new Student1(105,"Jai"));  
		// TODO Auto-generated method stub
Collections.sort(al);
		for(Student1 s :al) {
			System.out.println(s.name +""+s.stRoll);
		}		
		

	}

}
