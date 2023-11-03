
public class User {

	public static void main(String[] args) {
	//	Generics<Integer>useradd=new Generics<>();
		
//		useradd.addData(3);
//		System.out.println(useradd.value1);
		Generics generics=new Generics<>();
		Integer[] arrayint= {10,20,40};
		
		String arrayString[]= {"Riya","yash","sree"};
		
		generics.printarray(arrayString);	
		generics.printarray(arrayint);
	
		
	}

}
