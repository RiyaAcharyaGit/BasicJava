import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("please enetr value");
int num = sc.nextInt();
int original= num;
int rev=0;
int rem;
while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num/=10;		
}
if(original==rev)
{
	System.out.println("palindrom");
}else {
	System.out.println("not plaindrom");
}
	}

}
