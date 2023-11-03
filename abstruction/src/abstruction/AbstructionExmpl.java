package abstruction;

//hinding the internal details from the external only provide the req data
//used for security purpose
//to achive the abstruction
//we extends abstract class and create method give it body and after that we create obj of non abtruct type clss
//it did not provide 100% astraction
//MULTIPLE IHERITACE IS NOT POSSIBLE
//IT CAN EXTENDS ONLY ONE CLASS
//IT is faster tha innetrface
public class AbstructionExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goat goat=new Goat();
			goat.eat();
			goat.animal();
			
		
	
	}
}
abstract class Animal {
	public abstract void animal();
	
	public void eat()
	{
	
		System.out.println("eat meat");
	}
	public abstract void foo();
}
	class Goat extends Animal{
		@Override
		public void eat()
		{
		
			System.out.println("eat meat");
		}
		public void animal()
		{
			System.out.println("zzz");
		}
		@Override
		public void foo() {
			// TODO Auto-generated method stub
			
		}
	}
	


	


