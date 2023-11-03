import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

//its return true if the object of an instance is find in class or subclass
class B
{
	public void eat()
	{
		System.out.println("eat");
	}
}
public class InstanceOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B obj=new B();
      HashSet<Integer>set=new HashSet<Integer>();
 set.add(null);
      set.add(1);
      System.out.println(set);
//      TreeSet<Integer>se=new TreeSet<Integer>();
//      se.add(null);
//      set.add(1);
   //   System.out.println(se);
      Map<String, Integer> map= new HashMap<>()
;
      map.put(null, 1);
      map.put(null, 2);
      map.put(null, 3);
      System.out.println(map);
      
      System.out.println(obj instanceof B);
	Iterable<Integer>d=new Iterable<Integer>() {
		
		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
	};

}
}
