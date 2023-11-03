//overRiding or ruTime polymorphism
//tight coupling
class A
{
	public void eat()
	{
		System.out.println("eat");
	}
}
class B extends A
{
	public void eat()
	{
		System.out.println("Run time poly");
	}
}
public class RunTimepoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.eat();
				

	}

}
