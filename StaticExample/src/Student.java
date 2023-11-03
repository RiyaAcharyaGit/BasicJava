 class Students{
	 int rollNo;
	 String name;
	 static String collage;
	
	public Students(int rollNo, String name) {
		//super();
		this.rollNo = rollNo;
		this.name = name;
	}
 }
 interface Kids{
	 void run();
	
	
	 
	 
	
}
// class Boys implements Kids
// {

 //we can not override static method
	 //we cannot make constructor static
	 //we can not make abstruct method static because static method depends on class not obj
//	 @Override
// 
//	 static void run()
//	 
//	 {
//		 
//	 }
 abstract class Kid
 {
	 static int number=11
			 ;
	static String loc="kol";
	static void test()
	{
		System.out.println("In abstract class we can creatwe static variable and method");
	}
 }
 
public class Student extends Kid {

	public static void main(String[] args) {
//		Students  obj= new Students(1,"Riya");
//		obj.collage="Techno";
//		obj.collage="BBIT";
//		System.out.println(obj.collage);
		Kid.test();
	
		
		

	}

}
