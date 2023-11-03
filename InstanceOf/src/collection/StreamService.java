package collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamService {

	public static void main(String[] args) {
		List<StreamEx> streamEx = new ArrayList<>();
		StreamEx emp1 = new StreamEx(1, "Riya");
		StreamEx emp2 = new StreamEx(0, "diya");
		StreamEx emp3 = new StreamEx(0, "aNIS");
		StreamEx emp4 = new StreamEx(625, "Asha");
		streamEx.add(emp1);
		streamEx.add(emp2);
		streamEx.add(emp3);
		streamEx.add(emp4);
		//sorted() not applicale for oject thats why we use compararotr/comparale
		// toList is used to collect the stream into a new list

//		System.out.println(streamEx);

		// Collections.sort(streamEx,new StramEmpid());

		Collections.sort(streamEx, (o1, o2) -> o1.compareTo(o2));
//            for(StreamEx s:streamEx)
//            
//            	System.out.println(s.getEmpid()+" " +s.getEmpNo());
		System.out.println(streamEx);
		List<String> collect = streamEx.stream().map(i->i.getEmpNo()).collect(Collectors.toList());
		System.out.println(collect);
	
	}

	
}
