import java.util.Scanner;

public class AmstrongNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("plaser enter number");
		int num = sc.nextInt();
		int originalNum=num;
		int sum=0;
		int length = String.valueOf(num).length();
		while(num!=0) {
			int rem= num%10;
			sum += Math.pow(rem, length);
			num=num/10;
		}
		if(originalNum==sum) {
			System.out.println("Amstrong no");
		}else {
			System.out.println("not amstrong");
		}
	}

}
