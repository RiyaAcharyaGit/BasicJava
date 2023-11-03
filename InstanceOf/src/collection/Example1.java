package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list= Arrays.asList("riya","diya","kiya",null);
		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
//		System.out.println(iterator.next());
//		iterator.forEachRemaining(i->System.out.println(i));
//		list.forEach(k->System.out.println(k));
      //  iterator.remove(); //  thorow an exception unsupportedoperationException
        while(iterator.hasNext())
        {
        	iterator.next()
;        	//iterator.remove();
        	System.out.println(iterator.next());
        }
        
	}

}
