package multipleInheritance;
//multiple inheritance doesnot support in class you cant exteds more than one class from another class this is called dimond problem
//in inheritance support multiple inheritance
// if any method is protected next  this method will be  private
// String is immutable and we can not chnage its value 

interface  Animal{
	public void eat();
}
interface Bird{
	
	public void eatB();
	
	
}
@FunctionalInterface
interface B extends Animal
{
	
}
abstract class D
{
	public void sleep()
	{
		System.out.println("2 sec");
	}
}
//class alwys fast extends then implements alwys true
class A extends D implements Animal,Bird {
	
	@Override
	public void eat ()
	{
		System.out.println("eat inscet");
	}
	@Override
	public void eatB ()
	{
		System.out.println("eat inscet B");
	}
	

}

public class multipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		
		a.eat();
		a.eatB();
		a.sleep();

	}

}
