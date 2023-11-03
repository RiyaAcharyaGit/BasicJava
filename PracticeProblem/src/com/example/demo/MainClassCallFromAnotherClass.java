package com.example.demo;

public class MainClassCallFromAnotherClass {
    public static void main(String[] args) {
        System.out.println("Inside the main method of MainClass");
       double i=10.2;
       int k=(int)i;
       double j=(double)k;
       System.out.println(j);
       String str=" ";
   	String st= null;
   	System.out.println(str==st);
           System.out.println(str.equals(st));
           System.out.println(str.hashCode());
 //          System.out.println(st.hashCode());
       
    }
}

 class AnotherClass {
    public static void main(String[] args) {
        System.out.println("Inside the main method of AnotherClass");

        // Call the main method of MainClass
        MainClassCallFromAnotherClass.main(args);
    }
}

