package com.exception;

import java.io.IOException;

public class exampleOfException {

		
		    public void  methodWithExceptions()  {
		        // Code that may throw a checked exception
		        throw new NullPointerException("This is a checked exception.");

		        // Code that may throw an unchecked exception
		      //  throw new NullPointerException("This is an unchecked exception.");
		    }
		}
class c extends exampleOfException{
	public void m1() throws IOException{
		throw new IOException("jdhfj");
	}
	
}
	

