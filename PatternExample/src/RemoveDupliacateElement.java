import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupliacateElement {
	public static void main(String[] args) {
        String a = "Umbralla";
	 Set<Character> seenChars = new HashSet();
     StringBuilder result = new StringBuilder();
     for (int i = 0; i < a.length(); i++) {
         char currentChar = a.charAt(i);
         
         if (!seenChars.contains(currentChar)) {
             result.append(currentChar);
             seenChars.add(currentChar);
         }
         
     }
     System.out.println("Result: " + result);
	}
}


