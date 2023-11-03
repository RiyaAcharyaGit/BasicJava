import java.util.Arrays;

public class MaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,-8,5,6};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("the max no is :"+max);
		//*********************************************************
		int orElse = Arrays.stream(arr).max().orElse(max);
		System.out.println(""+orElse);
	}
	

}
                                                                                                       