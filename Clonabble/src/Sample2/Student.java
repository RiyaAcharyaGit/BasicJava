package Sample2;

public class Student implements Cloneable {
	int roll_no;
	String name;
	public Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	 	public static void main(String[] args) throws CloneNotSupportedException
 {  
		
		Student s = new Student(101, "tyi");  
	
		try {  
		Student s1 = (Student) s.clone();  
		System.out.println(s1.name);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	

