package com.example.demo;
 class SingletonClass1 {
    private static volatile SingletonClass instance=null;

    private SingletonClass1() {
        // Private constructor to prevent instantiation
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        // Get the Singleton instance
        SingletonClass singleton = SingletonClass1.getInstance();

        // Use the Singleton instance
        singleton.doSomething();
    }

	private void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("singleton class");
		
	}
}


//public class SingletonClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}


