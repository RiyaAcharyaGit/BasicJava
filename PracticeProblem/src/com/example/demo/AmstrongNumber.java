package com.example.demo;

import java.util.Scanner;

public class AmstrongNumber {
	final int x=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number: ");
		        int nextInt = sc.nextInt();
		        int original=nextInt;
		        int sum=0;
		        int power= String.valueOf(nextInt).length();
		        while(nextInt!=0) {
		        	int rem =nextInt % 10;		        	
		        	sum += Math.pow(rem, power);
		        	nextInt=nextInt/10;		        	
		        }
		        if(original==sum) {
		        	System.out.println(" amstrong");
		        }else {
		        	System.out.println("not amstrong");
		        }
		    }
}

		

