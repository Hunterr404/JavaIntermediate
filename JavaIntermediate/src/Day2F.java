import java.util.*;

public class Day2F {

	public static void main(String[] args) {
		String[] crap = {"Hello", "potato","lemmons","youtube","batman"};
		List<String> l1 = Arrays.asList(crap);
		
		Collections.sort(l1);
		System.out.printf("%s\n",l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s\n", l1);
		

	}

}
