package interfaceExample;

interface Inter{
	String start();
	 default String getName() {
		    return "Animal";
		  }
		
}
class Car implements Inter{

	@Override
	public String start() {
		// TODO Auto-generated method stub
		
		System.out.println("this is implementation of Intra interface");
		return null;
		
	}
	
	
}
public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal ani=new Animal() ;
		//making a referance of that interface
		Inter tnternal=new Car();
		String name = tnternal.getName();
		System.out.println(name+"");
		tnternal.start();
		
		
//		Inter Inter=new Inter() {
//			
//		};
		
		
//	System.out.println(""+Inter.getName());

	}
}

