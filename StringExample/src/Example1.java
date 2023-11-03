//@get char  in given index
public class Example1 {
	//== loctaion check bcz its a opretor and dot equals is a method so it check locn as well as hashcode
//if hashcode of two obj is saame the obj also same but if obj samne doesnot mean hascode same
	//
	 static public void main(String[] args) {
		
 
		String a= "STRING";
		a="abc";
		System.out.println(a);
		String obj=new String("STRING");
		String ac= new StringBuilder("STRING").toString();
		System.out.println(a==obj);
//		System.out.println(a==ac);
//		System.out.println(obj==ac);
		System.out.println(a.equals(obj));
//		System.out.println(a.equals(ac));
//		System.out.println(obj.equals(ac));
//		System.out.println(a.hashCode());
//		System.out.println(obj.hashCode());
//		System.out.println(ac.hashCode());
//		System.out.println(a.charAt(2));
				
	}

}
