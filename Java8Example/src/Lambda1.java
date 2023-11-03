import java.awt.im.spi.InputMethodDescriptor;

@FunctionalInterface
interface A	
{
	public int add(int a,int b);

	
	
}
public class Lambda1
{
	public static void main(String[] args) {  
//		  A c=(a,b)-> (a+b);
//		System.out.println(c.add(70,30));
		A odd=(a,b)->{
		
			if(a%b==0)
			{
				System.out.println("even");
				return a;
			}
			else 
			{
				System.out.println("add");
				return a;
			}
			
		};
	}
	
}