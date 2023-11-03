package com.example;
class Ab{
//	public String ready() {
//		System.out.println("from class a");
//		return null;
//	}
//}
//class B extends Ab{
//	public String ready() {
//		System.out.println("from class b");
//		return null;
//	}
//}
//public class ExampleForTheory {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		B b =new B();
//		String ready = b.ready();
//		System.out.println(ready);
//
//	}
	int i=10;
	static class  B{
		static void cro()
		{
			System.out.println("sttaic inner class");
		}
	}
	public static void main(String[] args) {
		
//		Ab a =new Ab();
		
	Ab.B.cro();
	
		
	}

}
