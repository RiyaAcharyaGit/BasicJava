
public class Generics2<K,V>{
	K key;
	V value;
	
	
	 Generics2 (K key,V value)
	{
		this.key=key;
		this.value=value;
	
		
	}
	public void addData()
	{
		System.out.println(key);
		System.out.println(value);
	}
	
	
		

}

