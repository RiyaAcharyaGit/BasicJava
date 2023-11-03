
// Super class is hidde from child class that is called method hidig;
class A
{
	public static void name() {
		System.out.println("super class");
		
	}
}
class C extends A
{

	
	public static void name() {
		System.out.println("child class");
		
	}
}
public class MethodHinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.name();
		
	}

}
