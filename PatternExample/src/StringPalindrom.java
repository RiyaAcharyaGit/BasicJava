
public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="RiR";
		String rev="";
		int length = num.length();
		for(int i = length-1;i>=0;i--)
		{
			rev=rev + num.charAt(i);
		}
		if(num.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(" the string is palindrom");
		}else {
			System.out.println("String Not Palindrom");
		}

	}

}
