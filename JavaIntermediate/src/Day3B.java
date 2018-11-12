import java.util.*;

public class Day3B {

	public static void main(String[] args) {
		
		String[] things = {"Apple", "Guava","Orange","Apple","Banana"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
	}

}
