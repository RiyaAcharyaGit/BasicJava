
public class ReverseStrig {

	public static void main(String[] args) {
		String abc= "RIYA";
		String rev="";
		for(int i=abc.length()-1;i>=0;i--)
		{
			char charAt = abc.charAt(i);
			rev=rev+charAt;
		}
		System.out.println(rev);
	
		
	
		

	}

}
