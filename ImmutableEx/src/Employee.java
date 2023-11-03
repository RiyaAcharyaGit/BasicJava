// class as final so it cannot be extended
//all class members should be private so they cannot be accessed outside of class
//shouldn't contain any setter methods to change the value of class members
//the getter method should return the copy of class members
//class members are only initialized using constructor
 final class Main{
	private final int empNo;
	private final String empName;
	
	public Main(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Main obj=new Main(22,"Krisna");
          String Name=obj.getEmpName();
         System.out.println(Name);
         
	}
}
