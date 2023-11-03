package com.callable;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Demo implements Callable<Integer>
{
	int i;
	Demo(int k)
	{
		this.i=k;
	}
	

	@Override
	public Integer call() throws Exception {
		int fact = 1;
		for(int j=i;j>1;j--)
		{
			fact*=fact*j;
		}
		return fact;
	}
}

public class User {

	public static void main(String[] args) {
		User obj=new User();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		
	
	}

}