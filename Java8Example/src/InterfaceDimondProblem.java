
public class InterfaceDimondProblem {



	    public static void main(String[] args) {
	        Bird bird = new Bird();
	        bird.fly();
	    }
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String num="riya";
//		char ch;
//		String rev="";
//		for(int i=0;i<num.length();i++)
//		{
//			ch=num.charAt(i);
//			rev=ch+rev;		
//		}
//		System.out.println("reverse word is :"+rev);
//
//	}
	interface Swimming {
	    void fly();
	}

	interface Flying {
	    void fly();
	}

	class Bird implements Swimming, Flying {

	    private Swimming swimming;
	    private Flying flying;

	    public Bird() {
	        this.swimming = new SwimmingImpl();
	        this.flying = new FlyingImpl();
	    }

	    public void fly() {
	        this.swimming.fly();
	    }
	}

	class SwimmingImpl implements Swimming {

	    @Override
	    public void fly() {
	        System.out.println("I am swimming");
	    }
	}

	class FlyingImpl implements Flying {

	    @Override
	    public void fly() {
	        System.out.println("I am flying");
	    }
	}

	


