//constructor method ref
class A
{

 A(String  msg)
{
	System.out.println(msg);
	
}
}
interface Msg
{
	public void call(String msg);
}
	
public class MethodRef3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Msg msg=A::new;
		msg.call("ggh");
}
}
