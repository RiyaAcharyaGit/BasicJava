
public class Stringimmutale {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//in string pool they located same memory location(stack-string pool)
 String a= "ABC";
 String b="ABC";
 String c="xya";
 //string is immutale so we cant change the obj 
 //how? when we create string obj like above it internally create String a=new String("ABC") 
 //create new obj in string pool in immutable class by default public anf final so you can not change this obj
 //if you want to create same then only in string poll it take diif memory loctation
	}

}
