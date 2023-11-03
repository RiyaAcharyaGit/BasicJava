class Main{
    int a=80;
    static int b=90;
    static void app()
    {
     System.out.println("static block");
    }
     void dev()
    {
        System.out.println("non static block");
    }
     static class abc
     {
    	 public static void innerDemo(){
    	 System.out.println("non static block");
     
    	 System.out.println(Main.b);
     }
}
    
}

class Example 

{
    
	public static void main(String[] args) {
	    
Main obj=new Main();
obj.app();
obj.dev();
//	
Main.abc.innerDemo();
	}

	
}



