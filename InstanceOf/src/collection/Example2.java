package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(2, 78);//addAll posn wise value insert 
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.equals(null));
		System.out.println(list.contains(2));
		int a=list.indexOf(78);
		System.out.println(a);
		Stream<Integer> stream = list.stream();
		
		System.out.println(list.stream());
		
		

	}

}
