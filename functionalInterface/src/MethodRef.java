//static method ref
//containing class::static method name
interface StaticInterface
{
void say();

}
public class MethodRef
{
	public static void sayble()
	{
		System.out.println("static method ref");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
StaticInterface obj= MethodRef::sayble;
obj.say();

	}

}
