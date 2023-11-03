import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("please eneter the number ");
		int number = sc.nextInt();
		boolean flag=false;
		int i =2;
		while(i<=number/2) {
			if(number%i==0) {
				flag=true;				
				break;
		}
			++i;
		}
			if(!flag) {
				System.out.println(" Prime");
			}else {
				System.out.println("Not Prime");
			}
		
		

	}

}
