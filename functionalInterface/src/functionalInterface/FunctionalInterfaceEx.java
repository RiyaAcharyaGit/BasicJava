package functionalInterface;
//fuctional iterface  having one abtruct method for hindig the external details
//we use funtional interface to use lambda funtion and method ref to reduce boiler plate code
//Fuctioal itercae we ca add default metthod  ad static method with body
//If  new astract method is add with interface then all classs whih are implemnting interface
//will error
//if we add astract method the there will no error
@FunctionalInterface
interface Function{
	public void msg(String message);
	// public void msg1(String message);
	public default void name() {
		System.out.println("Riya");
	}
	public static void name1() {
	System.out.println("Riya");
	}
	
}
class Work implements Function{
	public void msg(String message)
	{
	
		System.out.println(message);
	
	}
}
public class FunctionalInterfaceEx {

	public static void main(String[] args) {

		Work obj=new Work();
		obj.msg("zzz");
		obj.name();

	}

}
