package com.example.demo;
class MyException extends Exception{
	public MyException(String  massege) {
		super(massege);
	}
}

public class CustomException {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		try {
			int input = Integer.parseInt(args[0]);
            if (input < 0) {
            	 throw new MyException("dsxrgf");  
            }
//			int i=5/0;
		   
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch(MyException e) {
			//throw new MyException();
//			System.out.println("custom exception");
			System.out.println("this is custom excp"+e.getMessage());
		}

	}

}
