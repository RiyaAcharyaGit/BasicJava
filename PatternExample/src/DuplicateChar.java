
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="Umbralla";
a.concat("abv");
String ex=a.concat("abv");
System.out.println(ex);
int count=0;
for(int i = 0;i<a.length();i++)
{
	for(int j=i+1;j<a.length();j++) {
		char charAt = a.charAt(i);
		char charAt2 = a.charAt(j);
		if(charAt==charAt2)
		{
			System.out.println(charAt2);
		}
		count++;
		
	}
}

	}

}
