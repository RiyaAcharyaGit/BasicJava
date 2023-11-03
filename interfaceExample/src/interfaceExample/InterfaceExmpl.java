package interfaceExample;
//interface useed to achive the abstrction
//interface method is public abstrat final
//interface attribute by default public static final
//used to achive the multiple inheritance
 interface Animal{
	public void eat();
	default void f()
	{
		System.out.println("ppp");
	}
	static void a()
	{
		System.out.println("oooo");
	}
}
class Tiger implements Animal{
	public void eat()
	{
	 System.out.println("tiger eat meat");
	}
	static void a()
	{
		System.out.println("ooouuo");
	}
}

public class InterfaceExmpl {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal ani=new Animal() ;
			
		
		
		Tiger obj=new Tiger();
		obj.eat();
		obj.f();
		obj.a();

	}

}
