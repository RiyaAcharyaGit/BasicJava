import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

public class UsingStream {
	//toset is also use to remove duplicate elemet ad distict keyword also
	//frequency is used for count how much it will repeted
	

	public static void main(String[] args) {
	 List<Integer>list=Arrays.asList(2,6,8,1,2,6,0);
	 Set<Integer> collect = list.stream().collect(Collectors.toSet());
	 System.out.println(collect);
	 List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
	 System.out.println(collect2);
	// collect2.forEach(System.out::println);
	int frequency = Collections.frequency(list, 6);
	System.out.println(frequency);
	

	}

}
