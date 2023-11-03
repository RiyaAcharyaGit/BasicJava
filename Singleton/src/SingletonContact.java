
public class SingletonContact {
	private static SingletonContact contact=null;
	private SingletonContact()
	{
		
	}
	public static SingletonContact getInstance()
	
	{
		if(contact==null)
		{
			contact =new SingletonContact();
		}
		return contact;
	}
	public void getContactDetails()
	{
		System.out.println("contact");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonContact obj1=SingletonContact.getInstance()
;
		System.out.println(obj1.toString());
		SingletonContact obj2=SingletonContact.getInstance();
		System.out.println(obj2);
	}

}
