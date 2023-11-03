@FunctionalInterface
interface Food{
	public void dog();
	public static void eat()
	{
		System.out.println("dog eat meat");
	}
}
public class MethodRef2 {

	public void tiger()
	{
		System.out.println("Tiger eeat meat");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRef2 methodRef=new MethodRef2();
		Food food=methodRef::tiger;
		food.dog();

	}

}
