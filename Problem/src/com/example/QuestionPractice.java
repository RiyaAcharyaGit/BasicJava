package com.example;

public class QuestionPractice {

	public static void main(String[] args) {
		String input = "umbrella";
		 char[] value = input.toCharArray();
		 int count=0;
		 for(int i=0;i<value.length;i++) {
			 for(int j=i+1;j<value.length;j++) {
				 if(value[i]==value[j]) {
					 count++;
				 }
			 }
		 }
		 System.out.println("number of duplicate char "+count);
	}

}
