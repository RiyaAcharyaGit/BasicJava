
public class Generics<T> {
	 T value1 ;
T addData( T value)
	{
		this.value1=value;
		return value1;
	}
//	{
//		this.value1=value;
//	}
//	T get()
//	{
//		return value1;
//	}

public  void printarray(T[] array) {

	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	
}
}

