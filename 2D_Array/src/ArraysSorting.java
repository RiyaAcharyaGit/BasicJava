import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ArraysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,-2,6,3,1};
		arr[0]=0;
		int temp=0;
	for(int i=0;i<arr.length;i++) {
		
		for (int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
	//*************************using one loop*********************
	int min=arr[0];
for(int i=0;i<arr.length;i++) {
	
	if(min>arr[i]) {
		min=arr[i];	
		 temp=arr[i];
		 arr[i]=min;
		 //min=arr[0];
	}	
}
System.out.println("using one loop :");
for (int i = 0; i < arr.length; i++) {
	
    System.out.println(arr[i]);
}
//********************using stream*****************************
      Integer[] asList = Arrays.stream(arr).boxed().toArray(Integer[]::new);
      List<Integer> asList2 = Arrays.asList(asList);
      Collections.sort(asList2);
      Object[] array = asList2.toArray();
      System.out.println(Arrays.toString(array));

        // Collect the sorted stream into a list
      //***********************
	}

}
