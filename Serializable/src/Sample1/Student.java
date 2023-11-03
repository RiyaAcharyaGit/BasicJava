package Sample1;

//import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	public String name;
	public int roll;
	
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}


	public static void main(String[] args) {
		Student s1=new Student("kkk",9);
		 try
		 {
			  FileOutputStream fout=new FileOutputStream("txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);
			  //for deserealized
			  out.writeObject(s1);    
			  out.flush();
			  out.close();
			  System.out.println("success");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}

}
