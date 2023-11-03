class Exam
{
	public void foo()
	{
		System.out.println("out");
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Exam obj=new Exam();
       obj.foo();
	}

}
