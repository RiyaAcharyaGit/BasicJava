import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class MinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,-8,5,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("the min no is "+min);
		
//*********************************************************
		OptionalInt min2 = Arrays.stream(arr).min();
		int orElse = min2.orElse(0);
		System.out.println("teh min no using stream "+orElse);
	}

}
