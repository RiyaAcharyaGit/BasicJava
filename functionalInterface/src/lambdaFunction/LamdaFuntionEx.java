package lambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//(int a->{system.out.println(a);});

public class LamdaFuntionEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,5,6,8,9,14);
		//list.forEach(x-> {System.out.println(x);});
		
		//enhance forEach loop
		for(Integer e:list)
		{
			System.out.println(e);
			
		}
		
	list.forEach(e->{if(e%2==0)System.out.println(e);});

	
	}

}
